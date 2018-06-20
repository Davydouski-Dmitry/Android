package com.davydouski.androidpvt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Homework1 extends AppCompatActivity implements View.OnClickListener {

    private TextView tx1;
    private TextView tx2;
    private Button buttonClick;
    private TextView noTx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework1);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getId()== R.id.button4){ //переход с одной активити на другую
                StartActivity.show(Homework1.this, StartActivity.BUTTON_ONE_KEY);
            } else {
                StartActivity.show(Homework1.this, StartActivity.BUTTON_TWO_KEY);
            }
        }
    };

    @Override
    public void onClick(View view) {
        TextView tx1 = (TextView) findViewById(R.id.textView1);
        TextView tx2 = (TextView) findViewById(R.id.textView2);
        TextView noTx = (TextView) findViewById(R.id.noTx);
        Button buttonClick = (Button) findViewById(R.id.button);

        tx1.setOnClickListener(clickListener);
        tx2.setOnClickListener(clickListener);
        buttonClick.setOnClickListener(clickListener);

        noTx.setText(tx1.getText().toString());
        tx1.setText(tx2.getText().toString());
        tx2.setText(noTx.getText().toString());
        noTx.setText("");
    }
}
