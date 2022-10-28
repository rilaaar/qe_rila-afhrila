package features.User;

import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.*;

public class DeleteAUser {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlDeleteUser(){
        url = "https://fakestoreapi.com/users/6";
    }
    public void requestDeleteUser(){
        given().when().get(url);
    }
}
