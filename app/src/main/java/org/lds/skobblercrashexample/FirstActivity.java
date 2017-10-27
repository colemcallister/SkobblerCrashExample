package org.lds.skobblercrashexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity implements MapsInitializedListener {

    Activity thisActivity;

    Button goButton;
    TextView readyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        thisActivity = this;

        goButton = (Button) findViewById(R.id.go_to_map);
        readyTextView = (TextView) findViewById(R.id.ready_textview);
        goButton.setEnabled(false);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MapActivity.start(thisActivity);
            }
        });

        SkobblerMapService mapService = new SkobblerMapService();
        mapService.init(getApplication(), this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onMapsInitialized(boolean worked) {
        if (worked) {
            goButton.setEnabled(true);
            readyTextView.setText("Map ready");
        }
    }
}
