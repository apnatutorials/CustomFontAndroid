package com.apnatutorials.customfontinandroid;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface font = Typeface.createFromAsset(getAssets(), "KaushanScriptRegular.otf");
        TextView tvCustomFontDemo = (TextView) findViewById(R.id.tvCustomFontDemo);
        tvCustomFontDemo.setTypeface(font);
    }
}
