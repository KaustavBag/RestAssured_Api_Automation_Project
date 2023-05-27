package org.example;


import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        //assertTrue( true );
        RestAssured.baseURI="https://restful-booker.herokuapp.com";
        given().contentType("application/json")
        .when().get("/ping")
        .then().statusCode(201);
    }
}
