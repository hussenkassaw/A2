package com.example.assignmentsecond;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int a;
int pas;
String pass;
TextView ft;
TextView st;
EditText edt;
EditText edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ft= findViewById(R.id.textView);
        st= findViewById(R.id.textView3);

        if (savedInstanceState != null)
        {
            a = savedInstanceState.getInt("score");
            checker();
        }

    }
    public void checker()
    {
        int orientation = this.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            ft.setText(String.valueOf(a));
        } else {
            st.setText(String.valueOf(a));
        }
    }
    public void count(View view) {
        a++;
        ft.setText(String.valueOf(a));
    }

    public void countes(View view) {
        a++;
        st.setText(String.valueOf(a));
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("score", a);
    }

}