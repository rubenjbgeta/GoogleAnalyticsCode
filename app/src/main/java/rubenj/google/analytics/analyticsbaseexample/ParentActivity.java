package rubenj.google.analytics.analyticsbaseexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by rjimeneb on 25/10/17.
 */

public abstract class ParentActivity  extends AppCompatActivity {

    public abstract String getScreenNameForAnalytics();

    public final static String ACCESS_TO = "Acceso_a_";

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //Track screen access
        mFirebaseAnalytics.setCurrentScreen(this, getScreenNameForAnalytics(), null);

        mFirebaseAnalytics.logEvent(ACCESS_TO + getScreenNameForAnalytics(), null);
    }
}
