package com.traveloka.cucumber.utils;

public enum TestScenarios {

    T1("Mengakses web traveloka"),
    T2("Search Car Rental"),
    T3("Continue search car rental");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
