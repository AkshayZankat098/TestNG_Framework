package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Screenshot {

        // Base URL
        private static final String BASE_URL = "http://191.168.11.30/cosec/api.svc/v2/user";


        // Test POST Request
        @Test
        public void testCreatePost() {
            String requestBody = "{ \"title\": \"Test Post\", \"body\": \"This is a test\", \"userId\": 1 }";

            Response response = given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .when()
                    .post(BASE_URL + "/posts")
                    .then()
                    .statusCode(201)
                    .extract()
                    .response();

            // Validate response
            Assert.assertNotNull(response);
            Assert.assertEquals(response.jsonPath().getString("title"), "Test Post");
            System.out.println("POST Response: " + response.asPrettyString());
        }
}

