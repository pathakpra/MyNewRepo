package utility;

import org.openqa.selenium.devtools.v116.network.model.Response;

public class RestAssuredLibrary {

	public String getJsonData(io.restassured.response.Response response, String path) {
		String jsonData = response.jsonPath().get(path);
		return jsonData;
		
	}
}
