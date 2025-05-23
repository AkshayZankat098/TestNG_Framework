package org.example;

import org.testng.annotations.Test;

public class Grouping {

    @Test(groups = {"Sanity"})
    public void group01(){
        System.out.println("Group sanity 01");
    }

    @Test(groups = {"Sanity"})
    public void group02(){
        System.out.println("Group sanity 02");
    }

    @Test(groups = {"Regression Testing", "Sanity"})
    public void group03(){
        System.out.println("Group sanity 03");
    }
}
