package features.Cart;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class AddNewCart {
    private String url;
    private  JSONObject body = new JSONObject();

    public void setUrlAddNewCart(){
        url = "hhttps://fakestoreapi.com/carts";
    }

    public JSONObject setBodyAddNewCart(){
        body.put("userId", "5");
        body.put("date",  "2020-02-03");
        body.put("products");
        return null;
    }
    public void requestAddNewCart(){
        given().header("content-type","application/json")
                .body(body.toJSONString())
                .when().post(url);
    }
}
