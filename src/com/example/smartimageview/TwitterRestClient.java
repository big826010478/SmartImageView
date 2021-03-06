package com.example.smartimageview;
// Static wrapper library around AsyncHttpClient

import android.util.Log;

import com.loopj.android.http.*;

public class TwitterRestClient {
	
	private static final String TweetRestTAG = TwitterRestClient.class.getName();
	
    private static final String BASE_URL = "https://api.twitter.com/1/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
    	Log.d(TweetRestTAG, "Twitter Get");
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }
}