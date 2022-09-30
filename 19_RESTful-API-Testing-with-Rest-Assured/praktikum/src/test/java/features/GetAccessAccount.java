package features;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GetAccessAccount {
    private static String username;
    private static String password;

    private static String url;

    public static void setNameAndPassword(){
        username = "ouuu";
        password = "12345";

    }
    public void setUrlAndValidToken(){
        url = "https://demoqa.com/Account/v1/User";
    }

    public JSONObject bodyCreateProject(){
        JSONObject body = new JSONObject();
        body.put("username", "password");
        return body ;
    }

    public static void requestAccount(){
        given().header("url",url)
                .header("Content-Type","application/json");
        given().header(bodyCreateProject().toJSONString());
        when().post(url);
    }

    public static void validateStatusCode(){
        then().statusCode(201);
    }

    public static void validateGetAccount(){
        then().body(equalTo("201 Success"));
    }

}
