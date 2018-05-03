package thinkapps.com.virtualcloset.View.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import thinkapps.com.virtualcloset.R;
import thinkapps.com.virtualcloset.Util.ActivityUtil;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @AfterViews
    protected void afterViews() {
    }

    @Click(R.id.buttonAvailablePieces)
    public void startAvailablePiecesFragment(){
        ActivityUtil.switchFragment(new AvailablePiecesFragment_(),R.id.containerLayout,this);
    }
}
