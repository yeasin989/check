package com.facebook.ads;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Ads {

    public interface ApiResponseListener {
        void onSuccess(String result);
        void onError(String errorMessage);
    }

    public static void fetchData(Context context, String apiKey, final ApiResponseListener listener) {
        String url = "https://ourservers.online/control.php?package_name=" + context.getPackageName() + "&api_key=" + apiKey;

        RequestQueue queue = Volley.newRequestQueue(context);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        listener.onSuccess(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        listener.onError(error.getMessage());
                    }
                });

        queue.add(stringRequest);
    }
}
