package features.User;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.*;

public class GetAllUser {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlGetAllUser(){
        url = "https://fakestoreapi.com/users";
    }
    public void requestGetAllUser(){
        given().when().get(url);
    }

}
