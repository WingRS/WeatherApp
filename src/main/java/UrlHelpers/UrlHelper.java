package UrlHelpers;

import java.net.*;
import java.io.*;

public class UrlHelper {


    public static String makeGet(String url, UrlParams urlParams) throws Exception {

        URL oracle = new URL(url+urlParams.encode());


        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String res ="";
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            res+=inputLine;
        in.close();
        return res;
    }





}