package org.testing.Runner;

import org.testing.testScript.GetRequest;
import org.testing.testScript.PostRequestTC;

import java.io.IOException;

public class RunnerClass {

    public static void main(String[] args) throws IOException {

        PostRequestTC postRequestTC= new PostRequestTC();
        postRequestTC.postRequestTC2();
        GetRequest getRequest= new GetRequest();
        getRequest.getRequestTC1();
    }
}
