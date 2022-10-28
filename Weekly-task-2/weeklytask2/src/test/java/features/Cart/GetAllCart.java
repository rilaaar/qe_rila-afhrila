package features.Cart;

import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.given;

public class GetAllCart {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlGetAllCart(){
        url = "https://fakestoreapi.com/carts";
    }
    public void requestGetAllCart(){
        given().when().get(url);
    }
}
