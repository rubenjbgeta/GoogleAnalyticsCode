package rubenj.google.analytics.analyticsbaseexample;

import android.content.Context;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by rjimeneb on 25/10/17.
 */

public class EventsAnalyticsUtils {

    public static void trackBtnGoToFirstActivity(Context context){
        FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(context);
        mFirebaseAnalytics.logEvent("Btn_Go_First_Activity", null);
    }

    public static void trackBtnGoToSecondActivity(Context context){
        FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(context);
        mFirebaseAnalytics.logEvent("Btn_Go_Second_Activity", null);
    }

    public static void trackBtnEventExample(Context context){
        FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(context);
        mFirebaseAnalytics.logEvent("Btn_Event_Example", null);
    }
}
