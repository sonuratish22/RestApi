package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad {

public static Properties propertiesFile() throws IOException {
    File file= new File("C:\\AutomationTesting\\RestApiFramework\\Environment.properties");
    FileInputStream fileInputStream= new FileInputStream(file);
    Properties pr= new Properties();
    pr.load(fileInputStream);
    return pr;
}
}
