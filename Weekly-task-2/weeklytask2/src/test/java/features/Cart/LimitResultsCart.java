package features.Cart;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class LimitResultsCart {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlLimitCart(){
        url = "https://fakestoreapi.com/carts/5";
    }
    public void requestLimitCart(){
        given().when().get(url);
    }
}
