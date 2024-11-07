import { configDotenv } from "dotenv"
import OpenAI from "openai";

import path from "path";
import fs from "fs";

configDotenv()

const saveResponseToFile = async (response) => {
    const filename = response.id;

    const javaFilePath = `./responses/${filename}.java`;
    const logFilePath = `./logs/${filename}.json`;

    try {
        const content = response.choices[0].message.content;
        const parsedContent = content.replace('```java', '').replace('```', '')
        response.choices[0].message.content = '[...]'

        const logContent = JSON.stringify(response, null, 2)

        fs.writeFileSync(javaFilePath, parsedContent, 'utf-8');
        fs.writeFileSync(logFilePath, logContent, 'utf-8');
        console.log(`\nResponse saved: ${filename}`);
        return true;
    } catch (error) {
        console.error(`\nError saving response to file: ${error.message}`);
        return false;
    }
}

const run = async (generations=0) => {
    const openai = new OpenAI();

    const model = "gpt-4o-mini";

    const instruction = `
        You are an expert Java programmer.
        Your task is to provide accurate and 100% compilable examples of Java lambda expressions.
        Return only the Java code, with no explanations nor comments.
        Include all necessary imports to successfully compile the generated code without issues.
        Ensure that the main class is named Main and includes a valid main method for execution.
        Double check everything before outputting the source code.
        You can be very creative and explore the boundaries of the language to generate the expressions
    `;

    const query = `
        Generate Java lambda expressions of varying sizes that demonstrate various use cases.
        Provide multiple distinct examples that showcase different functionalities and use cases of lambda expressions in Java.
        Ensure that the main class is named Main and all the imports are included.`;

    for (let i = 1; i <= generations; i++) {
        console.log(`Generating: ${i} / ${generations}`);

        const response = await openai.chat.completions.create({
            model: model,
            messages: [
                { role: "system", content: instruction },
                { role: "user", content: query },
            ],
        });

        const ok = await saveResponseToFile(response);
    }
}

const main = async () => {

    const OPENAI_API_KEY = process.env.OPENAI_API_KEY ?? ''

    if (!OPENAI_API_KEY) {
        console.error("Please set the OPENAI_API_KEY environment variable");
        return;
    }

    await run(40);
}


main();