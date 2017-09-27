package com.example.uberv.dagger2scopes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.uberv.dagger2scopes.di.components.DaggerApplicationComponent;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Controller controller = DaggerApplicationComponent.create().controller();
        Log.d(LOG_TAG, controller.handleRequest("Tim"));
    }
}
