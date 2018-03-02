package com.example.android.cookies;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView eaten = findViewById(R.id.android_cookie_image_view);
        eaten.setImageResource(R.drawable.after_cookie);

        TextView full = findViewById(R.id.status_text_view);
        full.setText("I'm so full");
        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
}