package org.example;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    // Corrected DataProvider method
    @DataProvider(name = "loginData")
    public Object[][] getData() {

        Object[][] data = {{"Akshay1@gmail.com", "abc"}, {"Akshay2@gmail.com", "def"}};
        return data;
    }

    // Test method that uses the data from DataProvider
    @Test(dataProvider = "loginData")
    public void testLogin(String email, String password) {

        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}


//Also we can create DataProvider method in other class & then used in this class with the help of below syntax
//@Test(dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
//dataProviderClass = LoginDataProvider.class : This tells TestNG that the DataProvider method loginData is located in the LoginDataProvider class.
//dataProvider = "loginData" : This specifies the name of the DataProvider method to use, which is "loginData".