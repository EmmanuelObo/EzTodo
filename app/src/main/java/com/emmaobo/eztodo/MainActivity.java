package com.emmaobo.eztodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * Created by Emmanuel on 12/1/2017.
 */

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void manageTodoView(View view){
        Intent intent = new Intent(this, ManageTodoActivity.class);
        startActivity(intent);
    }

    public void createTodoView(View view){
        Intent intent = new Intent(this, CreateTodoActivity.class);
        startActivity(intent);
    }
}
