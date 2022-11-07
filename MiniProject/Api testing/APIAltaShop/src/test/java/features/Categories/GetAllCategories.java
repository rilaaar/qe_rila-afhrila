package features.Categories;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetAllCategories {
    private String url, token;
    private JSONObject body = new JSONObject();

    public void setUrlGetAllCategories(){
        url = "https://alta-shop.herokuapp.com/api/categories";
        token = " Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.qWDOcd2UDoTGumbak_fRlZZtf-H7va3sH2a339KGiKU";
    }
    public void requestGetAllCategoriesToken(){
        given().header("Authorization", token)
                .when().get(url);
    }
    public void requestGetAllCategories(){
        given().when().get(url);
    }
}
