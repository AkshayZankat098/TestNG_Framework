package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

@Listeners(ITestListenerCase.class)
public class listenersclass {

        @Test
        public void OnTestStart(){
            System.out.println("Test case OnTestStart ");
        }

        @Test
        public void OnTestStart02(){
            System.out.println("Test case OnTestStart02 ");
        }


        @Test
        public void OnTestFailure(){
            System.out.println("Test case OnTestFailure ");
            Assert.fail();
        }

        @Test
        public void OnTestSuccess(){
            System.out.println("Test case OnTestSuccess ");
        }

        @Test(dependsOnMethods = {"OnTestFailure"})
        public void OnTestSkipped(){
            System.out.println("Test case OnTestSkipped ");
        }

}
