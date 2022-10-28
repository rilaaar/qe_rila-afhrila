package features.Product;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class AddNewProduct {
    private String url;
    private  JSONObject body = new JSONObject();

    public void setUrlAddNewProduct(){
        url = "https://fakestoreapi.com/products";
    }

    public JSONObject setBodyAddNewProduct(){
        body.put("title", "test product");
        body.put("price",  " 13.5");
        body.put("description", "lorem ipsum set");
        body.put("image", "https://i.pravatar.cc");
        body.put("category", "electronic");
        return null;
    }
    public void requestAddNewProduct(){
        given().header("content-type","application/json")
                .body(body.toJSONString())
                .when().post(url);
    }
}
