package com.example.xuejiao.asynchttptest;

import android.util.Log;

import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

/**
 * Created by xuejiao on 15/10/10.
 */
 public class TwitterRestClientUsage {
   public static void  getPublicTImeLine(){
       TwittterRestClient.get("statuses/public_timeline.json",null,new JsonHttpResponseHandler(){
           @Override
           public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
               super.onSuccess(statusCode, headers, response);
           }

           @Override
           public void onSuccess(int statusCode, Header[] headers, String responseString) {
               super.onSuccess(statusCode, headers, responseString);
           }

           @Override
           public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
//               super.onSuccess(statusCode, headers, response);

               try {
                   JSONObject firstEvent = response.getJSONObject(0);
                   String tweenText = firstEvent.getString("text");
                   Log.e("fxj",tweenText);
               } catch (JSONException e) {
                   e.printStackTrace();
               }


           }
       });
   }
}
