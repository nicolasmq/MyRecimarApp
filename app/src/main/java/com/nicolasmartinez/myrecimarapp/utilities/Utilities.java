package com.nicolasmartinez.myrecimarapp.utilities;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Utilities {

    public static FloatingActionButton fab;
    public static BottomNavigationView bottomNavigationView;

    public static final String TABLA_CLIENTE = "clientes";
    public static final String CAMPO_ID = "id";
    public static final String CAMPO_NOMBRE = "nombre";
    public static final String CAMPO_DIRECCION = "direccion";
    public static final String CAMPO_TELEFONO = "telefono";
    public static final String CAMPO_EMAIL = "email";

    public static final String TABLA_COMENTARIO = "comentarios";
    public static final String CAMPO_ID_COMENTARIO = "id";
    public static final String CAMPO_COMENTARIO_CLIENTE = "cliente";
    public static final String CAMPO_COMENTARIO = "comentario";
    public static final String CAMPO_ESTADO = "estado";

    public static final String CREAR_TABLA_CLIENTES =
            "CREATE TABLE " +TABLA_CLIENTE+ "("+CAMPO_ID+" TEXT, "+CAMPO_NOMBRE+" TEXT, "
            +CAMPO_DIRECCION+" TEXT, "+CAMPO_TELEFONO+" TEXT, "+CAMPO_EMAIL+ " TEXT)";

    public static final String CREAR_TABLA_COMENTARIOS =
            "CREATE TABLE " +TABLA_COMENTARIO+ "("+CAMPO_ID_COMENTARIO+" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "+CAMPO_COMENTARIO_CLIENTE+" TEXT NOT NULL, "+CAMPO_COMENTARIO+" TEXT NOT NULL, "
                    +CAMPO_ESTADO+" TEXT DEFAULT 'ingresado')";

    public static String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();
        return sdf.format(d);
    }
}
