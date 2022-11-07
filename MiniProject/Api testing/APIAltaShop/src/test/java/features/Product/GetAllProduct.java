package features.Product;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetAllProduct {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlGetAllProduct(){
        url = "https://alta-shop.herokuapp.com/api/products";
    }
    public void requestGetAllProductToken(){
        given().when().get(url);
    }
    public void requestGetAllProduct(){
        given().when().get(url);
    }
}
