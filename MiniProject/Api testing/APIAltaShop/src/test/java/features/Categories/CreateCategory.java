package features.Categories;

import org.json.simple.JSONObject;

import java.util.LinkedList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class CreateCategory {
    private String url;
    private JSONObject body = new JSONObject();
    List<JSONObject> data = new LinkedList<>();

    public void setUrlCreateCategory(){
        url = "https://alta-shop.herokuapp.com/api/categories";
    }
    public void setBodyData(String namecategory, String descriptioncategory) {
        List<Integer> category = new LinkedList<>();
        body.put("name", namecategory);
        body.put("description", descriptioncategory);
        data.add(body);
    }
    public void requestCreateCategory(){
        given().header("content-type","application/json")
                .body(body)
                .when().post(url);
    }
    public void validateStatusCode500(){
        then().statusCode(500);
    }
}
