package com.example.arpan.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_Two extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.priyesh.intent.extra.REPLY";
    private EditText et2;
    private TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("Intentify","oncreate2 success");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__two);
        et2 = (EditText) findViewById(R.id.editText2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText(message);
    }

    public void onclicktwo(View view){

        Intent replyintent = new Intent();
        String rep = et2.getText().toString();
        et2.setText("");
        replyintent.putExtra(EXTRA_REPLY,rep);
        setResult(Activity.RESULT_OK,replyintent);
        finish();

    }

}
