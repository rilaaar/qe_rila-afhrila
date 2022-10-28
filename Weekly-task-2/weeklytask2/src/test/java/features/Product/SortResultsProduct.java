package features.Product;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class SortResultsProduct {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlSortProduct(){
        url = "https://fakestoreapi.com/products?sort=desc";
    }
    public void requestSortProduct(){
        given().when().get(url);
    }
}
