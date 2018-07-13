package com.restclient.test;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class RestClient {

    public String callService1() {

        /* TARGET URL AND JSON */
        //String url = "<<base url>>/ads.restapi/v1/adsRender/pdf";
        //String url = "http://apiv3.iucnredlist.org/api/v3/version";
        //String url = "http://apiv3.iucnredlist.org/api/v3/country/list?token=9bb4facb6d23f48efbf424bb05c0c1ef1cf6f468393bc745d42179ac4aca5fee";
        String url = "http://apiv3.iucnredlist.org/api/v3/species/region/europe/page/0?token=9bb4facb6d23f48efbf424bb05c0c1ef1cf6f468393bc745d42179ac4aca5fee";

        //String json = "<<your json (please find the Example JSON in the content section)>>";

        /* HTTPCLIENT AND HTTPPOST OOBJECT */
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(url);

        /* ADD HEADER INFO */
        request.addHeader("authorization", "Bearer <<token>>");
        request.addHeader("content-type", "application/json");

        /* PROXY CONFIG */
        /*HttpHost target = new HttpHost("proxy", 8080, "http");
        RequestConfig config = RequestConfig.custom().setProxy(target).build();
        request.setConfig(config);*/

        /* JSON AS STRINGENTITY */
        /*StringEntity input = null;
        try {
            input = new StringEntity(json);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        request.setEntity(input);*/

        /* SEND AND RETRIEVE RESPONSE */
        HttpResponse response = null;
        try {
            response = httpClient.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* RESPONSE AS JSON STRING */
        String result = null;
        try {
            result = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String callService2() {

        /* TARGET URL AND JSON */
        //String url = "<<base url>>/ads.restapi/v1/adsRender/pdf";
        //String url = "http://apiv3.iucnredlist.org/api/v3/version";
        //String url = "http://apiv3.iucnredlist.org/api/v3/country/list?token=9bb4facb6d23f48efbf424bb05c0c1ef1cf6f468393bc745d42179ac4aca5fee";
        String url = "https://safebrowsing.googleapis.com/v4/threatMatches:find?key=9bb4facb6d23f48efbf424bb05c0c1ef1cf6f468393bc745d42179ac4aca5fee";

        String json = " {\n" +
                "    \"client\": {\n" +
                "      \"clientId\":      \"yourcompanyname\",\n" +
                "      \"clientVersion\": \"1.5.2\"\n" +
                "    },\n" +
                "    \"threatInfo\": {\n" +
                "      \"threatTypes\":      [\"MALWARE\", \"SOCIAL_ENGINEERING\"],\n" +
                "      \"platformTypes\":    [\"WINDOWS\"],\n" +
                "      \"threatEntryTypes\": [\"URL\"],\n" +
                "      \"threatEntries\": [\n" +
                 "        {\"url\": \"http://apiv3.iucnredlist.org\"}\n" +
                "      ]\n" +
                "    }\n" +
                "  }";

        /* HTTPCLIENT AND HTTPPOST OOBJECT */
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(url);

        /* ADD HEADER INFO */
        request.addHeader("authorization", "Bearer <<token>>");
        request.addHeader("content-type", "application/json");

        /* PROXY CONFIG */
        /*HttpHost target = new HttpHost("proxy", 8080, "http");
        RequestConfig config = RequestConfig.custom().setProxy(target).build();
        request.setConfig(config);*/

        /* JSON AS STRINGENTITY */
        /*StringEntity input = null;
        try {
            input = new StringEntity(json);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        request.setEntity(input);*/

        /* SEND AND RETRIEVE RESPONSE */
        HttpResponse response = null;
        try {
            response = httpClient.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* RESPONSE AS JSON STRING */
        String result = null;
        try {
            result = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String callService() {

        /* TARGET URL AND JSON */
        String url = "https://www.quandl.com/api/v3/datasets/WIKI/AAPL.csv";

        /* HTTPCLIENT AND HTTPPOST OOBJECT */
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);

        /* ADD HEADER INFO */
        request.addHeader("authorization", "Bearer <<token>>");
        request.addHeader("content-type", "application/json");

        /* SEND AND RETRIEVE RESPONSE */
        HttpResponse response = null;
        try {
            response = httpClient.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* RESPONSE AS JSON STRING */
        String result = null;
        try {
            result = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
            System.out.println(response.getStatusLine().getStatusCode());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }





    public static void main(String[] args) {
        RestClient restClient = new RestClient();
        String response = restClient.callService();
        System.out.println(response);
    }
}
