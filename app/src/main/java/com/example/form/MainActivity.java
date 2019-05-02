package com.example.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etlastname,etfirstname,etpassword,etconfirm_password,etemail,etusername;
    Button bRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirstname =(EditText)findViewById(R.id.etfirstname);
        etlastname=(EditText)findViewById(R.id.etlastname);
        etusername=(EditText)findViewById(R.id.etusername);
        etemail=(EditText)findViewById(R.id.etemail);
        etpassword=(EditText)findViewById(R.id.etpassword);
        etconfirm_password=(EditText)findViewById(R.id.etcomfirmpassword);
        bRegister=(Button)findViewById(R.id.brejister);

        bRegister.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.brejister:
                startActivity(new Intent(this, LoginForm.class));

                break;
        }
    }
}
