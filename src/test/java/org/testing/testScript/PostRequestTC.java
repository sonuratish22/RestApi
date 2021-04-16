package org.testing.testScript;

import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.testing.responseValidation.ResponseDataValidation;
import org.testing.responseValidation.ResponseStatusCodeValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JSONVariableReplacement;
import org.testing.utilities.PropertiesFileLoad;
import org.testing.utilities.ResponseDataExtractionUsingJsonPath;
import org.testing.utilities.jsonFileRead;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class PostRequestTC {
    public static String id;
    public void postRequestTC2() throws IOException {

       String body= jsonFileRead.bodyDataRead("./src/test/java/org/testing/payload/body.json");
       Random random= new Random();
       Integer randomValue= random.nextInt();

       body= JSONVariableReplacement.jsonVariable(body,"id",randomValue.toString());
      // body= JSONVariableReplacement.jsonVariable(body,"firstName","shakti");
      // body=  JSONVariableReplacement.jsonVariable(body,"lastName","Kumar");
         // System.out.println(body);

       Properties properties= PropertiesFileLoad.propertiesFile();
       HTTPMethods http= new HTTPMethods(properties);
       Response response= http.postMethod(body, "URI_Key");
        ResponseStatusCodeValidation.responseStatusCode(response,201);


        ResponseDataValidation.responseData(response,"Sonu","firstName");
       // ResponseDataValidation.responseData(response,"SeniorQA",".designation");
        System.out.println(response.asString());

        System.out.println("post Request data is succesfully created");
        id= ResponseDataExtractionUsingJsonPath.responseExtract("id",response);


        /*Properties properties= PropertiesFileLoad.propertiesFile();
        HTTPMethods httpMethods= new HTTPMethods(properties);
        Response response= httpMethods.postMethod(body,"URI_Key");
        System.out.println(response.statusCode());
        System.out.println(response.asString());*/
    }
}
