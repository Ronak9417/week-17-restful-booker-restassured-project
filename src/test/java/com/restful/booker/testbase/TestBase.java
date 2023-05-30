package com.restful.booker.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created By Ronak Patel
 */
public class TestBase {
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    }
}
