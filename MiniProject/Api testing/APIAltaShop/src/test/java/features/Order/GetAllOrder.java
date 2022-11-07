package features.Order;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetAllOrder {
    private String url, token;
    private JSONObject body = new JSONObject();

    public void setUrlGetAllOrder(){
        url = "https://alta-shop.herokuapp.com/api/orders";
        token = " Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.qWDOcd2UDoTGumbak_fRlZZtf-H7va3sH2a339KGiKU";
    }
    public void requestGetAllOrderToken(){
        given().header("Authorization", token)
                .when().get(url);
    }
    public void requestGetAllOrder(){
        given().when().get(url);
    }
    public void validateStatusCode401(){
        then().statusCode(401);
    }
}
