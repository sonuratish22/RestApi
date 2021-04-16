package org.testing.utilities;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class jsonFileRead {

    public static  String bodyDataRead(String path) throws FileNotFoundException {

        File bodyFilePath= new File(path);
        FileReader fileReader= new FileReader(bodyFilePath);
        JSONTokener jsonTokener= new JSONTokener(fileReader);
        JSONObject jsonObject= new JSONObject(jsonTokener);
        return jsonObject.toString();


    }

}
