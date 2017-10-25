package rubenj.google.analytics.analyticsbaseexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends ParentActivity {

    private Button buttonEvent;

    private final static String SCREEN_NAME = "First";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        buttonEvent = (Button) findViewById(R.id.buttonEvent);

        buttonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doEvent();
            }
        });
    }

    @Override
    public String getScreenNameForAnalytics() {
        return SCREEN_NAME;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void doEvent() {
        EventsAnalyticsUtils.trackBtnEventExample(this);
    }

}
