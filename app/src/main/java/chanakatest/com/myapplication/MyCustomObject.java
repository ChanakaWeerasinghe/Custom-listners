package chanakatest.com.myapplication;

// Step 2 - This variable represents the listener passed in by the owning object
// The listener must implement the events interface and passes messages up to the parent.

import android.preference.PreferenceActivity;
import android.provider.Contacts;
import android.util.Log;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class MyCustomObject {// Listener defined earlier
    public interface MyCustomObjectListener {
        public void onObjectReady(String title);
        public void onDataLoaded(Response data);
    }

    // Member variable was defined earlier
    private MyCustomObjectListener listener;

    // Assign the listener implementing events interface that will receive the events
    public void setCustomObjectListener(MyCustomObjectListener listener) {
        this.listener = listener;
    }
    // Constructor where listener events are ignored
    public MyCustomObject() {
        // set null or default listener or accept as argument to constructor
        this.listener = null;
        loadDataAsync();
    }

    // ... setter defined here as shown earlier

 void loadDataAsync() {
      AsyncHttpClient client = new AsyncHttpClient();
     client.get("https://api.plos.org/search?q=title:DNA", new AsyncHttpResponseHandler() {

         @Override
         public void onStart() {
             // called before request is started
         }

         @Override
         public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody) {
             Gson gson = new Gson();
             JSONObject arr= null;
             try {
                 arr = new JSONObject(new String(responseBody));
             } catch (JSONException e) {
                 e.printStackTrace();
             }
             Log.d("dsfds", String.valueOf(arr));

             Response m = gson.fromJson(String.valueOf(arr), Response.class);


                // Do some other stuff as needed....
                // Now let's trigger the event
                if (listener != null)
                    listener.onDataLoaded(m); // <---- fire listener here
         }

         @Override
         public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody, Throwable error) {
         }


         @Override
         public void onRetry(int retryNo) {
             // called when request is retried
         }
     });



    }
}
