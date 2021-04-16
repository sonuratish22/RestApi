package org.testing.testSteps;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Properties;

import static io.restassured.RestAssured.*;

public class HTTPMethods {
    Properties pr;

    public HTTPMethods(Properties pr){
        this.pr=pr;
    }

    public  Response postMethod(String body, String URI_Key){
        Response response= given().contentType(ContentType.XML)
                .body(body)
                .when()
                .post(pr.getProperty(URI_Key));
        return response;


    }
    public  Response getMethod(String URI_Key, String endPoint){
        String uri= pr.getProperty(URI_Key)+ "/"+ endPoint;
        Response response= given().contentType(ContentType.JSON)
                .when()
                .get(uri);
        return response;


    }
}
