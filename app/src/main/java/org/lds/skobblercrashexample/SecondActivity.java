package org.lds.skobblercrashexample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public void onBackPressed() {

        MapActivity.start(this);

        finish();
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, SecondActivity.class);
        context.startActivity(intent);
    }
}
