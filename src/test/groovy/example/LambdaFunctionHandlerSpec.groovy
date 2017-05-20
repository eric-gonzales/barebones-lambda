package example

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger
import spock.lang.Specification

class LambdaFunctionHandlerSpec extends Specification {
    def handler = new LambdaFunctionHandler()

    def "Test handleRequest properly handles requests"() {
        given: "A request input"
        def input = "Hello World"

        and: "A context"
        def context = Mock(Context)
        context.getLogger() >> Mock(LambdaLogger)

        when: "We handle a request to this lambda"
        def response = handler.handleRequest(input, context)

        then: "The response will be equal to the input"
        response == input
    }

}
