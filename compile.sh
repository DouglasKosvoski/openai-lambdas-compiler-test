#!/usr/bin/bash

available_compilers() {
    echo "Available compilers: openjdk, oraclejdk, graalvm"
}

# Check if a compiler argument is provided
check_compiler_argument() {
    if [ $# -eq 0 ]; then
        echo "Usage: $0 <compiler>"
        available_compilers
        exit 1
    fi
}

# Set the compiler based on the argument
set_compiler() {
    # Set the compiler based on the argument
    if [ "$1" == "openjdk" ]; then
        compiler_active=$openjdk
    elif [ "$1" == "oraclejdk" ]; then
        compiler_active=$oraclejdk
    elif [ "$1" == "graalvm" ]; then
        compiler_active=$graalvm
    else
        echo "Invalid compiler specified."
        available_compilers
        exit 1
    fi
}

display_summary() {
    # Inform that the compilation has finished
    printf "\nCompilation finished at: %s\n" "$(date)"
    printf "Total time taken: ${YELLOW}%d seconds.${RESET}\n" "$DURATION"

    # Display summary of results
    printf "\n${YELLOW}Summary of Compilation Results:${RESET}\n"
    printf "Total files: %d\n" "$FILE_COUNT"
    printf "${GREEN}Successfully compiled: %d${RESET}\n" "$SUCCESS_COUNT"
    printf "${RED}Failed compilations: %d${RESET}\n" "$FAILURE_COUNT"

    # Calculate and display percentage of failed compilations
    if [ "$FILE_COUNT" -gt 0 ]; then
        FAILURE_PERCENTAGE=$(awk "BEGIN {printf \"%.2f\", ($FAILURE_COUNT * 100) / $FILE_COUNT}")
        printf "Failure percentage: ${RED}%.2f%%${RESET}\n" "$FAILURE_PERCENTAGE"
    else
        printf "${YELLOW}No files to compile.${RESET}\n"
    fi

    # Print the selected compiler
    printf "\nCompiled with: "
    echo "$compiler_active"
}

compile() {
    # Inform that the compilation is starting
    printf "\nCompilation started at: %s\n\n" "$(date)"

    # Find all .java files
    JAVA_FILES=$(find ./responses -name '*.java')

    # If no files are found, exit the script
    if [ -z "$JAVA_FILES" ]; then
        printf "${YELLOW}No Java files found.${RESET}\n"
        exit 1
    fi

    # Count and display the number of files found
    FILE_COUNT=$(echo "$JAVA_FILES" | wc -l)
    printf "${GREEN}Found %d Java file(s). ${RESET}\n" "$FILE_COUNT"

    # Initialize counters
    SUCCESS_COUNT=0
    FAILURE_COUNT=0

    # Create directories if they don't exist
    mkdir -p ./temp
    mkdir -p ./target

    TOTAL_FILES=$(echo "$JAVA_FILES" | wc -w)  # Count the total number of files
    INDEX=1  # Initialize the index counter

    # Copy and rename each .java file to Main.java in the temp folder
    for FILE in $JAVA_FILES; do
        FILENAME=$(basename "$FILE")  # Get the file name without the path
        TEMP_FILE="./temp/Main.java"   # Define the temporary file path
        OUT_FILE="./target/Main.class"  # Define the output file path

        # Copy and rename the file, overwriting if it exists
        cp "$FILE" "$TEMP_FILE"
        if [ $? -ne 0 ]; then
            INDEX=$((INDEX + 1))
            continue
        fi

        # Compile the copied Main.java file
        # printf "\nCompiling %s...\n" "$TEMP_FILE"
        if $compiler_active -d ./target "$TEMP_FILE" >/dev/null 2>&1; then
            printf "${reset}[%d/%d] ${GREEN}[ OK ] ${YELLOW} %s \n${RESET}" "$INDEX" "$TOTAL_FILES" "$FILENAME"
            SUCCESS_COUNT=$((SUCCESS_COUNT + 1))
        else
            printf "${reset}[%d/%d] ${RED}[ FAIL ] ${YELLOW} %s\n${RESET}" "$INDEX" "$TOTAL_FILES" "$FILENAME"
            FAILURE_COUNT=$((FAILURE_COUNT + 1))
        fi

        INDEX=$((INDEX + 1))  # Increment the index for the next iteration
    done
}

# Define color codes
define_colors() {
    RED='\033[0;31m'      # Red
    GREEN='\033[0;32m'    # Green
    YELLOW='\033[1;33m'   # Yellow
    RESET='\033[0m'       # Reset to default color
}

main() {
    # Compilers Path
    openjdk=/usr/lib/jvm/java-1.21.0-openjdk-amd64/bin/javac
    oraclejdk=/usr/lib/jvm/jdk-23.0.1-oracle-x64/bin/javac
    graalvm=/usr/lib/jvm/graalvm-jdk-23.0.1/bin/javac

    # Clear the terminal
    clear;

    define_colors

    # Check if a compiler argument is provided
    check_compiler_argument "$@"

    # Set the compiler based on the argument
    set_compiler "$1"


    # Start timer
    START_TIME=$(date +%s)

    compile

    # End timer
    END_TIME=$(date +%s)
    DURATION=$((END_TIME - START_TIME))

    display_summary
}

main "$@"