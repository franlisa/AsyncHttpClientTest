package com.example.xuejiao.asynchttptest;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by xuejiao on 15/10/10.
 */
public class TwittterRestClient {
    private  static  final  String  BASE_URL  = "https://api.twitter.com/1/";
    private  static AsyncHttpClient client = new AsyncHttpClient();
    public static  void get(String url, RequestParams params, AsyncHttpResponseHandler handler){
        client.get(getAbsoulteUrl(url),params,handler);
    }
    public  static  void post(String url,RequestParams params,AsyncHttpResponseHandler handler){
        client.post(getAbsoulteUrl(url),params,handler);
    }
    private  static String getAbsoulteUrl(String relativeUrl){
        return  BASE_URL + relativeUrl;
    }

}
