package example

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger
import com.amazonaws.services.lambda.runtime.RequestHandler

class LambdaFunctionHandler implements RequestHandler {

    def handleRequest(input, Context context) {
        LambdaLogger logger = context.logger
        logger.log("received : ${input}")
        return input
    }
}
