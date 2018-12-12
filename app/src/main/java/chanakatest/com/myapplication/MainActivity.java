package chanakatest.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ...
        // Create the custom object
        MyCustomObject object = new MyCustomObject();
        // Step 4 - Setup the listener for this object
        object.setCustomObjectListener(new MyCustomObject.MyCustomObjectListener() {
            @Override
            public void onObjectReady(String title) {
                // Code to handle object ready
            }

            @Override
            public void onDataLoaded(Response data) {
                Log.d("SomeObdata", String.valueOf(data.getDocs()));
            }
        });
    }
}
