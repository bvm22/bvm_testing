package test.java.tests;

import test.java.utils.ReadConfigUtil;


public class MainTest {

    public static void main(String[] args) {
        System.out.println(ReadConfigUtil.getValueFromConfig("chromedriver"));
        System.out.println(ReadConfigUtil.getValueFromConfig("login"));
        System.out.println(ReadConfigUtil.getValueFromConfig("password"));
    }
}
