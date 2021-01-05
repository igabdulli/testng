package org.example.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample2 {
    @BeforeClass
    public void setUp2() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = {"fast"})
    public void aFastTest2() {
        System.out.println("Fast test2");
    }

    @Test(groups = {"slow"})
    public void aSlowTest2() {
        System.out.println("Slow test2");
    }
}
