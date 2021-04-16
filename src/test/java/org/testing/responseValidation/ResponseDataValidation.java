package org.testing.responseValidation;

import io.restassured.response.Response;

public class ResponseDataValidation {

    public static void responseData(Response response, String expectedData, String jsonPath){
       // String actualData= response.jsonPath().getString(jsonPath);
        if(response.jsonPath().get(jsonPath).equals(expectedData)){
            System.out.println("Data is matched");
        }
        else {
            System.out.println("Data is not matched");
        }
    }
}
