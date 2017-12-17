package UrlHelpers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by StasMaster on 17.12.17.
 */
public class UrlParams {

    private Map<String, String> valuesMap = new HashMap<String, String>();


    public void put(String paramName, String paramValue) {
        valuesMap.put(paramName, paramValue);
    }

    public String encode() {
        String encoded_url = "?";
        Iterator it = valuesMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            encoded_url += pair.getKey() + "=" + pair.getValue() + "&";
            it.remove();
        }
        return encoded_url;
    }

}
