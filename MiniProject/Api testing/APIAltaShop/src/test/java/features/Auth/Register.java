package features.Auth;

import org.json.simple.JSONObject;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static net.serenitybdd.rest.SerenityRest.given;

public class Register {
    private String url, token;
    private JSONObject body = new JSONObject();
    List<JSONObject> data = new LinkedList<>();

    public void setUrlRegist() {
        url = "https://alta-shop.herokuapp.com/api/auth/register";
        token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.qWDOcd2UDoTGumbak_fRlZZtf-H7va3sH2a339KGiKU";
    }
    public void setBodyData(String newemail, String newpassword, String fullname) {
        List<Integer> category = new LinkedList<>();
        Random rand = new Random();
        newemail = "someone" + rand.nextInt() + "@mail.com";
        body.put("email", newemail);
        body.put("password", newpassword);
        body.put("fullname", fullname);
    }
    public void requestRegist(){
        given().header("Authorization", token)
                .header("content-type","application/json")
                .body(body)
                .when().post(url);
    }
}
