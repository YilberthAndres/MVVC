package com.example.dragon.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import android.view.View;
import android.widget.Toast;
import com.example.dragon.databinding.ActivityLoginBinding;
import com.example.dragon.viewsmodels.LoginViewModel;
import com.example.dragon.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding activity = DataBindingUtil.setContentView(this, R.layout.activity_login);
        activity.setViewModel(new LoginViewModel());
        activity.executePendingBindings();
    }

    // any change in toastMessage attribute
    // defined on the Button with bind prefix
    // invokes this method
    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}