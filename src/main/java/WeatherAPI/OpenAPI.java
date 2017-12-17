package WeatherAPI;

import UrlHelpers.UrlHelper;
import UrlHelpers.UrlParams;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * Created by StasMaster on 17.12.17.
 */
public class OpenAPI {

    private String appId;
    private String urlApi = "http://api.openweathermap.org/data/2.5/weather";


    public OpenAPI(String appID) {
        this.appId = appID;
    }


    public City getCity(String cityName) throws Exception {
        UrlParams urlParams = new UrlParams();
        urlParams.put("APPID", appId);
        urlParams.put("q", cityName);
        String response = UrlHelper.makeGet(urlApi, urlParams);
        System.out.println(response);

        JsonObject jobj = new Gson().fromJson(response, JsonObject.class);

        double temp = jobj.getAsJsonObject("main").get("temp").getAsDouble();

        String descr = jobj.getAsJsonArray("weather").get(0).getAsJsonObject().get("description").toString();

        String time = jobj.getAsJsonPrimitive("dt").getAsString();
        String name = jobj.getAsJsonPrimitive("name").getAsString();
        return new City(name, temp, descr, time);

    }



}
