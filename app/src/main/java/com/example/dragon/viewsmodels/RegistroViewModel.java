package com.example.dragon.viewsmodels;

import android.text.TextUtils;
import android.util.Patterns;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import com.example.dragon.models.Registro;

public class RegistroViewModel extends BaseObservable{
    public Registro registro;

    private String successMessage = "Logi n successful";
    private String errorMessage = "Email or Password is not valid";



}
