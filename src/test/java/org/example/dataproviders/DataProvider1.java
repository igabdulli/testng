package org.example.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProvider1 {

    @DataProvider(name = "testDataProvider")
    public Object[][] getData() {
        Object[][] data = {{"firefox", "url2"}, {"chrome", "url1"}};
        return data;
    }
}
