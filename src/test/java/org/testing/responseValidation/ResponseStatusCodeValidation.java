package org.testing.responseValidation;

import io.restassured.response.Response;

public class ResponseStatusCodeValidation {

    public static void responseStatusCode(Response res, int expectedStatusCode){

        if(res.statusCode()== expectedStatusCode){
            System.out.println("Status code is matched");
        }
        else{
            System.out.println("Status code is not matched");
        }


    }
}
