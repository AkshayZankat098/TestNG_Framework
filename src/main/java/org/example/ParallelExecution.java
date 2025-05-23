package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ParallelExecution {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void Closebrowser() {
        driver.quit();
    }

    @Test
    public void testcase01() throws InterruptedException {
        System.out.println("ParallelExecution is start for TEST01");
        driver.get("https://www.google.co.in/");
        driver.close();
    }

    @Test
    public void testcase02() throws InterruptedException {
        System.out.println("ParallelExecution is start for TEST02");
        driver.get("https://in.search.yahoo.com/?fr2=inr");
        driver.close();
    }

    @Test
    public void testcase03() throws InterruptedException {
        System.out.println("ParallelExecution is start for TEST03");
        driver.get("https://www.bing.com/");
        driver.close();
    }

}

//If we have multiple classes then execution test cases parallel on the class level below configuration we need to done in xml file
//Add another class below this <class name="org.example.ParallelExecution"/>
//Done modify in suit level inside xml file <suite name="Parallel Execution" parallel="classes" thread-count="3">

//If we want to run our test cases in the bases of test level then simple add parallel="tests" thread-count="3" in the xml file
