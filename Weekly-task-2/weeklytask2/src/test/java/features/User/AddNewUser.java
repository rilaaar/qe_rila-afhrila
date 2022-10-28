package features.User;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.*;

public class AddNewUser {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlAddNewUser(){
        url = "https://fakestoreapi.com/users";
    }
    public JSONObject setBodyAddNewUser(){
        body.put("email", "John@gmail.com");
        body.put("username",  "johnd");
        body.put("password", "m38rmF$");
        body.put("name");
        body.put("address");
        body.put("phone", "1-570-236-7033");
        return null;
    }
    public void requestAddNewUser(){
        given().header("content-type","application/json")
                .body(body.toJSONString())
                .when().post(url);
    }
}
