package com.darwinsys.fridagate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    final String TAG = "FridaGate";
    final static String[] a1 = {"People", "Helping", "People"};
    final static String[] a2 = {"People", "Helping", "Other", "People"};

    /** Yer standard Activity onCreate() */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(v -> {
            Log.d(TAG, "Array comparison yields " + Arrays.equals(a1, a2));
        });
    }

    /** A method that isn't called from anywhere */
    public String unDocumented() {
        return "xyzzy";
    }
}