package com.example.dragon.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Administrador extends SQLiteOpenHelper{

    private static final int VERSION = 1;
    private static final String NOMBRE_DATABASE = "registros";

    public Administrador(@Nullable Context context) {
        super(context, NOMBRE_DATABASE, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE USUARIOS (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT," +
                "apellido INTEGER," +
                "correo TEXTE," +
                "clave TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
