package features.Auth;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetUserInformation {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlUserInfo(){
        url = "https://alta-shop.herokuapp.com/api/auth/info";
    }
    public void requestUserInfo(){
        given().when().get(url);
    }
    public void validateStatusCode401(){
        then().statusCode(401);
    }
}
