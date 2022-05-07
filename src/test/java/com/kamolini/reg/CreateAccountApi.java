package com.kamolini.reg;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.abc.util.Util;

import io.restassured.response.Response;
import testUtil.ApiUtil;

public class CreateAccountApi {
	
	@Test
	public void createAccount() {
		String email = Util.getRandomEmail();
		Response response= ApiUtil.createAccount("Kamol", "babu", "Test", email, "6562521212");
		
		System.out.println(response.getBody().asString());

		System.out.println("===================////////////////");
		
		int id = response.getBody().jsonPath().getInt("id");
		String emailFromResponse = response.getBody().jsonPath().getString("email");
				
		Assert.assertNotNull(id);
		Assert.assertEquals(emailFromResponse, email);
		
		System.out.println("id from response - "+id);
		
	}

}
