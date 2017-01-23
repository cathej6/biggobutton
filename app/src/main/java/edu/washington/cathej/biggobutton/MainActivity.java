package edu.washington.cathej.biggobutton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.util.Log;

public class MainActivity extends Activity {

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("button", "App launched");
        final Button goButton = (Button) findViewById(R.id.button);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                goButton.setText("You have pressed me " + count + " times!");
                Log.i("button", "Text updated.");
            }
        });

    }


}
