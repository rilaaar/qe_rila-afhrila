package features.Product;

import org.json.simple.JSONObject;

import java.util.LinkedList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class NewProduct {
    private String url, token;
    private JSONObject body = new JSONObject();
    List<JSONObject> data = new LinkedList<>();

    public void setUrlNewProduct(){
        url = "https://alta-shop.herokuapp.com/api/products";
        token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.qWDOcd2UDoTGumbak_fRlZZtf-H7va3sH2a339KGiKU";
    }
    public void setBodyData(String nameproduct, String descriptionproduct, Integer priceproduct, Integer categoriesproduct) {
        List<Integer> category = new LinkedList<>();
        body.put("name", nameproduct);
        body.put("description", descriptionproduct);
        body.put("price", priceproduct);
        category.add(categoriesproduct);
        body.put("categories", category);
        data.add(body);
    }
    public void requestNewProduct(){
        given().header("Authorization", token)
                .header("content-type","application/json")
                .body(body)
                .when().post(url);
    }
    public void validateStatusCode500(){
        then().statusCode(500);
    }
}
