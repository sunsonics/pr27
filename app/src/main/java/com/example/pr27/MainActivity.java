package com.example.pr27;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create an instance of your custom view (Draw2D)
        Draw2D draw2D = new Draw2D(this);

        // Set the custom view as the content view
        setContentView(draw2D);
    }
}