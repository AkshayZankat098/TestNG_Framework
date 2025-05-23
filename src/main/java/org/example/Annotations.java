package org.example;
import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite
    void Start(){     //Runs once before the execution of all tests in the suite.
        System.out.println("Test Execution : Start");
    }

    @AfterSuite
    void Complete(){   //Runs once after the execution of all tests in the suite.
        System.out.println("Test Execution : End");
    }

    @BeforeClass
    void BeforeClass(){    //Runs once before the first test method in the current class is executed.
        System.out.println("BeforeClass");
    }

    @AfterClass
    void AfterClass(){    //TestNG method or single test case
        System.out.println("AfterClass");
    }

    @BeforeTest
    void BeforeTest(){    //TestNG method or single test case
        System.out.println("BeforeTest");
    }

    @AfterTest
    void AfterTest(){    //TestNG method or single test case
        System.out.println("AfterTest");
    }

    @BeforeMethod
    void Login(){    //TestNG method or single test case
        System.out.println("BeforeMethod Test01 & Test02");
    }

    @AfterMethod
    void Logout(){    //TestNG method or single test case
        System.out.println("AfterMethod Test01 & Test02");
    }

    @Test
    void test01(){
        System.out.println("Test case01");
    }

    @Test
    void test02(){
        System.out.println("Test case02");
    }

}

//TestNG methods : Single test case (Java method) in a class
//TestNG class : An entire java class containing multiple test cases
//TestNG Group : Group of test cases (TestNG methods) from different java classes

//TestNG tests : A collection of multiple classes
//TestNG suite : A collection of multiple TestNG tests


