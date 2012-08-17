package edu.fsu.cs.mobile.slidingdrawerconfig;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.EditText;

public class OrientationActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}