package com.example.arpan.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.priyesh.intent.extra.MESSAGE";
    private EditText et1;
    private TextView tv1;
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.editText1);
        tv2 = (TextView) findViewById(R.id.textView2);
    }

    public void onclickone(View view){
        Log.d("Intentify","onclickone success");

        String msg= et1.getText().toString();
        et1.setText("");
        Intent intent = new Intent(this,activity_Two.class);
            intent.putExtra(EXTRA_MESSAGE,msg);
            startActivityForResult(intent,1);
        Log.d("Intentify","intent 1 started");
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        Log.d("Intentify","onActivityResult started");
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1){
            if(resultCode==RESULT_OK){
                tv1= (TextView) findViewById(R.id.textView1);
                tv1.setVisibility(View.VISIBLE);
                String rep = data.getStringExtra(activity_Two.EXTRA_REPLY);
                tv2.setText(rep);

            }
        }
    }


}
