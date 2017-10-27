package org.lds.skobblercrashexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_map);

        final SkobblerMapFragment skobblerMapFragment = SkobblerMapFragment.newInstance();

        android.app.FragmentManager fm = getFragmentManager();
        fm.beginTransaction()
          .add(R.id.frame_container, skobblerMapFragment)
          .commitAllowingStateLoss();

        Button goButton = (Button) findViewById(R.id.go_button);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void goToSecondActivity() {
        SecondActivity.start(this);
    }

    public static void start(Activity activity) {
        Intent intent = new Intent(activity, MapActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }
}
