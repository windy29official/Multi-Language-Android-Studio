package com.windypermadi.multilanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RadioButton;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        String languagePref = "ind";
        switch (view.getId()) {
            case R.id.radio_english:
                if (checked)
                    languagePref = "en";
                break;
            case R.id.radio_indonesian:
                if (checked)
                    languagePref = "ind";
                break;
            case R.id.radio_german:
                if (checked)
                    languagePref = "gr";
                break;
        }

        if (!languagePref.isEmpty()) {
            LocaleHelper.setLocale(MainActivity.this, languagePref);
            recreate();
        }
    }
}