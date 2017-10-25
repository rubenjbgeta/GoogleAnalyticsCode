package rubenj.google.analytics.analyticsbaseexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    private Button buttonToActivity1;
    private Button buttonToActivity2;

    private FirebaseAnalytics mFirebaseAnalytics;

    private final static String SCREEN_NAME = "MainActivity";

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

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //Track screen access
        mFirebaseAnalytics.setCurrentScreen(this, SCREEN_NAME, null);

        mFirebaseAnalytics.logEvent("Acceso_a_"+SCREEN_NAME, null);
    }

    private void goToFirstActivity() {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);

        //TODO: Track event
    }

    private void goToSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

        //TODO: Track event
    }
}
