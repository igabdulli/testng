package org.example.tests;

import org.testng.annotations.*;

public class TC1 {
    public TC1() {
        System.out.println("constructor TC1");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    void afterclass() {
        System.out.println("after class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("before method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("after method");
    }

    @Test
    void test1() {
        System.out.println("test 1");
    }

    @Test
    void test2() {
        System.out.println("test 2");
    }

    @Test(enabled = false, priority = 1, groups = {"asassa"}, dependsOnMethods = {"test2", "test1"})
    void test200() {
        System.out.println("test 200");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("before test");
    }

    @AfterTest
    void afterTest() {
        System.out.println("after test");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("after suite");
    }

    @BeforeSuite
    void beforeSuite() {
        System.out.println("before suite");
    }
}
