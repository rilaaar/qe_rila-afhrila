package features.Auth;
import org.json.simple.JSONObject;

import java.util.LinkedList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class Login {
    private String url;
    private JSONObject body = new JSONObject();
    List<JSONObject> data = new LinkedList<>();


    public void setBodyData(String email, String password) {
        List<Integer> category = new LinkedList<>();
        body.put("email", email);
        body.put("password", password);
        data.add(body);
    }

    public void setUrlLogin(){
        url = "https://alta-shop.herokuapp.com/api/auth/login";
    }
    public JSONObject setBodyEmailAndPassword() {
        List<Integer> category = new LinkedList<>();
        body.put("email", "");
        body.put("password", "");
        return body;
    }

    public void requestLogin(){
        given().header("content-type","application/json")
                .body(body)
                .when().post(url);
    }

    public void validateStatusCode200(){
        then().statusCode(200);
    }
    public void validateStatusCode400(){
        then().statusCode(400);
    }
}
