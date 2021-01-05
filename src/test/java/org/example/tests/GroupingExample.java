package org.example.tests;

import org.example.dataproviders.DataProvider1;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups = "sanity")
    @Parameters({"key"})
    void test1(String value) {
        System.out.println("test 1" + value);
    }

    @Test(groups = "sanity")
    @Parameters({"key2"})
    void test2(String value) {
        System.out.println("test 2" + value);
    }

    @Test(dataProvider = "testDataProvider", dataProviderClass = DataProvider1.class, groups = "sanity")
    void test21(String browser, String url) {
        System.out.println("test 21" + ", browser: " + browser + ", url: " + url);
    }

    @Test(groups = "regression")
    void test3() {
        System.out.println("test 3");
    }

    @Test(groups = "regression")
    void test4() {
        System.out.println("test 4");
    }

    @Test(groups = "integration")
    void test5() {
        System.out.println("test 5");
    }
}
