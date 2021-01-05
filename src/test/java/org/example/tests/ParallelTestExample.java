package org.example.tests;

import org.testng.annotations.Test;

public class ParallelTestExample {
    @Test
    void test1() {
        System.out.println("test 1");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
    }

    @Test
    void test2() {
        System.out.println("test 2");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
    }

    @Test
    void test3() {
        System.out.println("test 3");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
    }

    @Test
    void test4() {
        System.out.println("test 4");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
    }

    @Test
    void test5() {
        System.out.println("test 5");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
    }

    @Test
    void test6() {
        System.out.println("test 6");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
    }
}
