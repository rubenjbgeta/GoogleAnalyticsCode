package rubenj.google.analytics.analyticsbaseexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    private Button buttonEvent;

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
    protected void onResume() {
        super.onResume();

        //TODO: Track screen access
    }

    private void doEvent() {
        //TODO: Track event
    }

}
