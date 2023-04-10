package org.example;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Demo1 {

    // This is also called glucode - means linking the feature file to step definition
    @Given("^\\[JOKE API] Get Random Joke using endpoint$")    // regix for scenario in feature file
    public  void getJoke()
    {
        RestAssured.baseURI = "https://official-joke-api.appspot.com";

        RequestSpecification jokeRequest = RestAssured.given().log().all(); // No headers or query param required

        Response jokeResponse = jokeRequest.get("/random_joke");
        System.out.println(jokeResponse.getStatusCode());
        System.out.println(jokeResponse.getBody());



    }

}