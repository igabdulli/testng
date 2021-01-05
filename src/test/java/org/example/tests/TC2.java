package org.example.tests;

import org.testng.annotations.*;

public class TC2 {
    public TC2() {
        System.out.println("constructor TC2");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("TC2 before class");
    }

    @AfterClass
    void afterclass() {
        System.out.println("TC2 after class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("TC2 before method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("TC2 after method");
    }

    @Test
    void test3() {
        System.out.println("TC2 test 3");
    }

    @Test
    void test4() {
        System.out.println("TC2 test 4");
    }
}
