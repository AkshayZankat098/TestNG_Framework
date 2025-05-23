package org.example;
import org.testng.annotations.Test;

public class Prioritizing {

    @Test(priority = 1)
    public void priority1(){
        System.out.println("Test case01 : Priority1");
    }

    @Test(priority = 2)
    public void priority2(){
        System.out.println("Test case01 : priority2");
    }

    @Test(priority = 3)
    public void priority3(){
        System.out.println("Test case01 : priority3");
    }

    @Test(priority = 4)
    public void priority4(){
        System.out.println("Test case01 : priority4");
    }
}
