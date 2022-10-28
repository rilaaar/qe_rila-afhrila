package features.Login;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class LoginProject {
    private String url;
    private  JSONObject body = new JSONObject();

    public void setUrlLogin(){
        url = "https://fakestoreapi.com/auth/login";
    }

    public JSONObject setBodyValidUsernameValidPassword(){
        body.put("username", "mor_2314");
        body.put("password",  "83r5^_");
        return null;
    }
    public void requestLogin(){
        given().header("content-type","application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public JSONObject setBodyValidUsernameInvalidPassword(){
        body.put("username", "mor_2314");
        body.put("password",  "aaaaa");
        return null;
    }
    public void validateStatusCode200(){
        then().statusCode(200);
    }
    public JSONObject setBodyInvalidUsernameValidPassword(){
        body.put("username", "aaaa");
        body.put("password",  "83r5^_");
        return null;
    }
    public JSONObject setBodyNullUsernameNullPassword(){
        body.put("username", " ");
        body.put("password",  " ");
        return null;
    }
    public void validateStatusCode401(){
        then().statusCode(401);
    }

}
