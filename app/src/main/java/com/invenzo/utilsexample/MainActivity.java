package com.invenzo.utilsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.invenzo.utils.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.showToast(this,"Success");
        Utils.showAlertDialog(this,"This is a sample title","Sample Description");

    }
}
