package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class MyLambdaHandler  implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        return "Sup: " + input;
    }

}
