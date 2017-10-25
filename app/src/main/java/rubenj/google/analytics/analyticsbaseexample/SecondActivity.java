package rubenj.google.analytics.analyticsbaseexample;

import android.os.Bundle;

public class SecondActivity extends ParentActivity {

    private final static String SCREEN_NAME = "Second";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public String getScreenNameForAnalytics() {
        return SCREEN_NAME;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
