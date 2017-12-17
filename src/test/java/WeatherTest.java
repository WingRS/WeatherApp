/**
 * Created by StasMaster on 17.12.17.
 */

import UrlHelpers.UrlParams;
import WeatherAPI.OpenAPI;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeatherTest {


    @Test
    public void testEncoder() {
        UrlParams urlParams = new UrlParams();
        urlParams.put("sdsd","2");
        urlParams.put("value","1");
        assertEquals("sdsd=2&value=1&", urlParams.encode());
    }

    @Test
    public void testWeather() throws Exception {
        OpenAPI openAPI = new OpenAPI("5496614f4ca95e6dcc0445c1e7f3916d");
        assertEquals("Lviv",openAPI.getCity("Lviv").getName());
    }

}
