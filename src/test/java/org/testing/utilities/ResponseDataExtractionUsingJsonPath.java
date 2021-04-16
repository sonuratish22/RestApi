package org.testing.utilities;

import io.restassured.response.Response;

public class ResponseDataExtractionUsingJsonPath {

    public static String responseExtract(String jsonPath, Response response){
         return response.jsonPath().get(jsonPath);



    }
}
