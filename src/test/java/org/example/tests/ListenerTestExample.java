package org.example.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.example.listeners.MyTestListener.class)
public class ListenerTestExample {
    @Test(description = "test 1 description")
    void test1() {
        System.out.println("test 1");
    }

    @Test
    void test2() {
        System.out.println("test 2");
    }
}
