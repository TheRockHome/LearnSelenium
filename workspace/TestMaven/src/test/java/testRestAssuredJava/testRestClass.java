package testRestAssuredJava;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class testRestClass implements utilDataRestAssured{

	@Test
	public void testRestRequest() {
		
		RestAssured.baseURI = testURL ;
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.request(Method.GET, testCity);
		 String responseBody = response.getBody().asString();
		 int statusCode = response.getStatusCode();
		 System.out.println(statusCode);
		 System.out.println("Response Body is =>  " + responseBody);
		 Assert.assertEquals(statusCode, 400) ;
	}

}
