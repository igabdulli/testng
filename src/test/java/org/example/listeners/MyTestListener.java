package org.example.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class MyTestListener implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("test started");
    }
}
