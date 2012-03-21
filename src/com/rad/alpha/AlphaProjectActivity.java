package com.rad.alpha;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class AlphaProjectActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Toast.makeText(this, "Toasty toast", Toast.LENGTH_LONG).show();
    }
}