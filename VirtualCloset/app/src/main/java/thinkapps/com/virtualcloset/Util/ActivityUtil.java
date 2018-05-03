package thinkapps.com.virtualcloset.Util;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lunid on 11/02/2018.
 */

public class ActivityUtil {

    @SuppressLint("CommitTransaction")
    public static void switchFragment(Fragment fragment, int resIdContainer, AppCompatActivity context) {
        context.getSupportFragmentManager()
                .beginTransaction()
                .replace(resIdContainer, fragment)
                .addToBackStack("")
                .commit();
        context.getSupportFragmentManager().executePendingTransactions();
    }
}
