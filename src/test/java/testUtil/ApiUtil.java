package testUtil;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ApiUtil {
	
	public static String getOtp(String userEmail){
		String URI = "https://api.kamolini.com/api/v1/email/"+userEmail;
		
		return doGet(null,URI).body().asString();
	}
	
	public void createAccount(String firstName, String mName, String lName, String email, String phone) {
		String URI = "";
		RequestSpecification requestSpecification = given();
		
		requestSpecification = requestSpecification.header("Content-Type","application/json");
		requestSpecification = requestSpecification.header("Content-Type","application/json");
		
		String body = "{\r\n"
				+ "    \"id\": 1,\r\n"
				+ "    \"firstName\": \""+firstName+"\",\r\n"
				+ "    \"middleName\": \""+mName+"\",\r\n"
				+ "    \"lastName\": \""+lName+"\",\r\n"
				+ "    \"email\": \""+email+"\",\r\n"
				+ "    \"phone\": "+phone+"\r\n"
				+ "  }";
		
		
		doPut(requestSpecification, URI, body);
	}
	
	
	
	
	public static Response doGet(RequestSpecification requestSpecification, String uri) {
		RequestSpecification specification = given();
		specification = specification.spec(requestSpecification);
		return specification.get(uri);
	}
	
	public static Response doPost(RequestSpecification requestSpecification, String uri, String body) {
		RequestSpecification specification = given();
		specification = specification.spec(requestSpecification);
		specification = specification.body(body);
		return specification.post(uri);
	}
	
	public static Response doPut(RequestSpecification requestSpecification, String uri, String body) {
		RequestSpecification specification = given();
		specification = specification.spec(requestSpecification);
		specification = specification.body(body);
		return specification.put(uri);
	}

}
