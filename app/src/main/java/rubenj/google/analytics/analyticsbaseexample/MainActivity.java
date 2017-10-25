package rubenj.google.analytics.analyticsbaseexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ParentActivity {

    private Button buttonToActivity1;
    private Button buttonToActivity2;

    private final static String SCREEN_NAME = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToActivity1 = (Button) findViewById(R.id.buttonToActivity1);
        buttonToActivity2 = (Button) findViewById(R.id.buttonToActivity2);

        buttonToActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFirstActivity();
            }
        });

        buttonToActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity();
            }
        });
    }

    private void goToFirstActivity() {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);

        EventsAnalyticsUtils.trackBtnGoToFirstActivity(this);
    }

    private void goToSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

        EventsAnalyticsUtils.trackBtnGoToSecondActivity(this);
    }

    @Override
    public String getScreenNameForAnalytics() {
        return SCREEN_NAME;
    }
}
