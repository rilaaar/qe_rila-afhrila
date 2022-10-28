package features.Cart;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class SortResultsCart {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlSortCart(){
        url = "https://fakestoreapi.com/carts?sort=desc";
    }
    public void requestSortCart(){
        given().when().get(url);
    }
}
