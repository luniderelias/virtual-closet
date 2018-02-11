package thinkapps.com.virtualcloset.View.Splash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import thinkapps.com.virtualcloset.R;
import thinkapps.com.virtualcloset.View.Home.MainActivity;
import thinkapps.com.virtualcloset.View.Home.MainActivity_;

@EActivity(R.layout.activity_splash_screen)
public class SplashScreen extends AppCompatActivity {

    @AfterViews
    public void afterViews(){
        startActivity(new Intent(this, MainActivity_.class));
    }
}
