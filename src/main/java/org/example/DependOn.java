package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOn {

    @Test
    public static void CarStart(){
        System.out.println("Car is started");
        Assert.fail();
    }

    @Test (dependsOnMethods = {"CarStart"})
    public static void DriveCar(){
        System.out.println("We will drive a car");
    }

    @Test (dependsOnMethods = {"CarStart", "DriveCar"})
    public static void StopCar(){
        System.out.println("Car is Stoped");
    }

    @Test (dependsOnMethods = {"CarStart", "DriveCar", "StopCar"}, alwaysRun = true)
    public static void AlwaysRun(){
        System.out.println("AlwaysRun functioanlity is run successfully");
    }
}
