package com.example.qthjen.informationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Button   bt;
    private EditText etName;
    private EditText etEmail;
    private EditText etSdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findIdView();

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mName  = etName.getText().toString();
                String mEmail = etEmail.getText().toString();
                String mSdt   = etSdt.getText().toString();

                String tvName = getResources().getString(R.string.tvName); // truyền key trong string vào
                String tvEmail = getResources().getString(R.string.tvEmail);
                String tvSdt = getResources().getString(R.string.tvSdt);

                tv.setText(tvName + ": " + mName + "\n" + tvEmail + ": " + mEmail + "\n" + tvSdt +": " + mSdt);
            }
        });

    }

    private void findIdView() {

        tv      = (TextView) findViewById(R.id.tv);
        bt      = (Button)   findViewById(R.id.bt);
        etName  = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etSdt   = (EditText) findViewById(R.id.etSdt);

    }
}
