package features.Product;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class LimitResultsProduct {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlLimitProduct(){
        url = "https://fakestoreapi.com/products?limit=5";
    }
    public void requestLimitProduct(){
        given().when().get(url);
    }
}
