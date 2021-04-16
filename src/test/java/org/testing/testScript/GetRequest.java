package org.testing.testScript;

import io.restassured.response.Response;
import org.testing.responseValidation.ResponseDataValidation;
import org.testing.responseValidation.ResponseStatusCodeValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;

public class GetRequest {

    public void getRequestTC1() throws IOException {


        Properties properties= PropertiesFileLoad.propertiesFile();
        HTTPMethods httpMethods= new HTTPMethods(properties);
       Response response=  httpMethods.getMethod("URI_Key", PostRequestTC.id);
       //


        ResponseStatusCodeValidation.responseStatusCode(response,200);
        //ResponseDataValidation.responseData(response,"Jiteen","[1].firstName");
        System.out.println("Get Request Test Case is executed succefully");
        System.out.println(response.asString());


    }
}
