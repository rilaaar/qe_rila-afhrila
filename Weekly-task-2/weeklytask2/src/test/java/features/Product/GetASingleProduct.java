package features.Product;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class GetASingleProduct {
        private String url;
        private JSONObject body = new JSONObject();

        public void setUrlGetSingleProduct(){
            url = "https://fakestoreapi.com/products/1";
        }
        public void requestGetSingleProduct(){
            given().when().get(url);
        }
}
