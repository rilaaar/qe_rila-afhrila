package features.Product;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class DeleteProduct {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlDelProduct(){
        url = "https://alta-shop.herokuapp.com/api/products/0";
    }
    public void requestDelProductToken(){
        given().when().get(url);
    }
    public void requestDelProduct(){
        given().when().get(url);
    }
    public void validateStatusCode404(){
        then().statusCode(404);
    }
}
