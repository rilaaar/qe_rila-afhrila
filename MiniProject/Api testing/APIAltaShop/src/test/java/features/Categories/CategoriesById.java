package features.Categories;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class CategoriesById {
    private String url, token;
    private JSONObject body = new JSONObject();

    public void setUrlCategoriesById(){
        url = "https://alta-shop.herokuapp.com/api/categories/0";
        token = " Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.qWDOcd2UDoTGumbak_fRlZZtf-H7va3sH2a339KGiKU";
    }
    public void requestCategoriesByIdToken(){
        given().header("Authorization", token)
                .when().get(url);
    }
    public void requestCategoriesById(){
        given().when().get(url);
    }
}
