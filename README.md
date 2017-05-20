# groovy-lambda

A barebones Groovy lambda function

## Step 0 - Dependencies

- Ensure gradle is installed. GVM works well: [gvm](http://gvmtool.net/)

1. `curl -s get.gvmtool.net | bash`
2. `gvm install gradle`

## Step 1 - Code

- Clone the project and create a new package in src/groovy or adjust the src/groovy/example class to your liking

## Step 2 - Build

- `gradle build`
- Ensure you have a zip in build/distributions/

## Step 3 - Deploy

- Login or create an account to access your [AWS Console](https://console.aws.amazon.com/)
- Click the [Lambda](https://console.aws.amazon.com/lambda/home) link
- Click the "Create a Lambda Function" button
- Fill in the name, description, select Java 8 as the runtime
- Browse to the zip file created in Step 2 by clicking on the upload button
- The handler should be in the form `package.class::handler`
- Create and/or select an execution role, i.e. `basic_lambda_execution`
- Click the "Create Lambda" button

## Step 4 - Test

- Browse to the edit/test screen
- Enter input based off the handler
- Click the invoke button and verify that you get the response that you expect
