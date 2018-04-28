package com.android.jj.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);



        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView tv = new TextView(this);
        tv.setTextSize(40);
        tv.setText(name);
        ConstraintLayout layout = (ConstraintLayout)findViewById(R.id.display_content);
        layout.addView(tv);

    }

}
