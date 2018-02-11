package thinkapps.com.virtualcloset.View.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import thinkapps.com.virtualcloset.R;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @AfterViews
    protected void afterViews() {
    }
}
