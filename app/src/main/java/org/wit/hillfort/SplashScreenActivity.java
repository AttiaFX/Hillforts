package org.wit.hillfort;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import gr.net.maroulis.library.EasySplashScreen;
import org.wit.hillfort.activities.HillfortActivity;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
            .withFullScreen()
            .withTargetActivity(HillfortActivity.class)
            .withSplashTimeOut(3000)
            .withBackgroundColor(Color.parseColor("#FF9800"))
            .withHeaderText("")
            .withFooterText("")
            .withBeforeLogoText("Welcome To The Hillforts Android App")
            .withAfterLogoText("By Shady Attia")
            .withLogo(R.mipmap.ic_launcher_round);

        config.getHeaderTextView().setTextColor(Color.WHITE);

        View easySplashScreen = config.create();
        setContentView(easySplashScreen);

    }
}