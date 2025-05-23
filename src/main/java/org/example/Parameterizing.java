package org.example;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizing {

    @Test
    @Parameters({"username", "password"})
    public void testLogin(String username, String password) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

    }
}


//The @Parameters annotation is used on the test method to specify the parameters you want to pass to it.
//The parameters themselves are defined in the DataProvider.xml configuration file.
