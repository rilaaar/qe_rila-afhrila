package features.Product;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class GetAllProduct {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlGetAllProduct(){
        url = "https://fakestoreapi.com/products";
    }
    public void requestGetAllProduct(){
        given().when().get(url);
    }
    public void validateStatusCode200(){
        then().statusCode(200);
    }

}
