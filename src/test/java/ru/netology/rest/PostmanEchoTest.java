package ru.netology.rest;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.core.IsEqual.equalTo;


 class
 PostmanEchoTest {
   @Test
           void shouldReturnSendData () {

  given()
  .baseUri("https://postman-echo.com")
  .contentType("text/plain; charset=UTF-8")
  .body("data")
  .when()
  .post("/post")
  .then()
  .statusCode(200)
  .body("data",equalTo ("some data"));


 }

 }


