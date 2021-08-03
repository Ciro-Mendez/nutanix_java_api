package com.nutanix.api;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Base64;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;


import javax.net.ssl.*;
import javax.xml.bind.DatatypeConverter;

import io.javalin.Javalin;

/**
 * This class is to run a example how to call Nutanix API
 * @author CiroMendez
 */
public class RestClient {




    OkHttpClient client = new OkHttpClient();
    /**
     * Method to pass no signed certificates for example Labs Clusters
     */
    private static OkHttpClient getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return null;
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient okHttpClient = new OkHttpClient();
            okHttpClient.setSslSocketFactory(sslSocketFactory);
            okHttpClient.setHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            return okHttpClient;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public static void main(String[] args) throws IOException {


        RestClient example = new RestClient();
        //server
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/public");
        }).start(7000);
        app.get("/", ctx -> ctx.result("Hello World!!! Nutanix Demo Ciro"));
         //call to the api
        app.post("/getHosts", ctx -> {
            String result = example.getHost(ctx.formParam("url"),ctx.formParam("user"),ctx.formParam("password"));
            ctx.html(result);
        });


    }

    /**
     * This method calls the API to get the HOSTS
     * @param url The url from the endpoint for example https://<ip>:<port>/api/nutanix/v2.0/hosts/
     * @param user The user for the cluster for example admin
     * @param passwd The password for the cluster
     * @return
     */
    public String getHost(String url,String user,String passwd) {
    String res="";
        try {

            //Encrypt the password
            String plainString = user.concat(":").concat(passwd);
            String passwd64 = Base64.getEncoder().encodeToString(plainString.getBytes());

            OkHttpClient cliente = getUnsafeOkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, "{\"filter\":\"string\",\"kind\":\"vm\",\"sort_order\":\"string\",\"offset\":123,\"length\":123,\"sort_attribute\":\"string\"}");
            Request request = new Request.Builder()
                    .url(url)
                    .addHeader("content-type", "application/json")
                    .addHeader("authorization", "Basic " + passwd64)
                    .build();


            Response response = cliente.newCall(request).execute();
            String jsonString =response.body().string();

            //Giving format to the string
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonElement jsonElement =  new JsonParser().parse(jsonString);

            System.out.println(gson.toJson(jsonElement));
            res ="<textarea style=\"height: 90%; width: 90%;\">"+gson.toJson(jsonElement)+"</textarea>";
            return res;

        } catch (SocketTimeoutException e) {
            System.out.println("####################################");
            System.out.println("ERROR: Probably IP not reachable");
            System.out.println("####################################");
            res ="ERROR: Probably IP not reachable";
        } catch (IllegalArgumentException e) {
            System.out.println("####################################");
            System.out.println("ERROR: unexpected url");
            System.out.println("####################################");
            res ="ERROR: unexpected url";
        }catch (Exception e) {
            e.printStackTrace();
            res = e.getMessage();
        }

    return res;
    }

}



