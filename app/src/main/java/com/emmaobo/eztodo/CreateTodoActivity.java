package com.emmaobo.eztodo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * Created by Emmanuel on 12/1/2017.
 */

public class CreateTodoActivity extends FragmentActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_todo);
    }

    public void addTodo(View view)
    {
        //Adds a todo item to the list
    }

    public void removeTodo(View view)
    {
        //Removes the todo item
    }
}
