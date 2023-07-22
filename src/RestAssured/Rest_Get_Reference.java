package RestAssured;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class Rest_Get_Reference {

	public static void main(String[] args) {
		// Declare the base URL
		RestAssured.baseURI = "https://reqres.in/";

		// Declare the given, when and then methods
		// String responseBody = given().header("Content-Type","application/json").
		// when().get("api/users?page=2").then().log().all().extract().response().asString();
		String responseBody = given().header("Content-Type", "application/json").when().get("api/users?page=2").then()
				.extract().response().asPrettyString();
		System.out.println(responseBody);

	}

}
