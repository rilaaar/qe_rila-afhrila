package features.Cart;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetASingleCart {
        private String url;
        private JSONObject body = new JSONObject();

        public void setUrlGetSingleCart(){
            url = "https://fakestoreapi.com/carts/5";
        }
        public void requestGetSingleCart(){
            given().when().get(url);
        }
}
