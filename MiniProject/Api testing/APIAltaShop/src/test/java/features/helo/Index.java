package features.helo;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class Index {
    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlIndex(){
        url = "https://alta-shop.herokuapp.com/api/hello";
    }
    public void requestIndexToken(){
        given().when().get(url);
    }
    public void requestIndex(){
        given().when().get(url);
    }
}
