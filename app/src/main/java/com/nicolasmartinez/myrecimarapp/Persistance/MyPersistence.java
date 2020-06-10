package com.nicolasmartinez.myrecimarapp.Persistance;

import com.google.firebase.database.FirebaseDatabase;

public class MyPersistence extends android.app.Application {

    private static FirebaseDatabase firebaseDatabase;

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }

    public static FirebaseDatabase getDatabase() {
        if (firebaseDatabase == null) {
            firebaseDatabase = FirebaseDatabase.getInstance();
            firebaseDatabase.setPersistenceEnabled(true);
        }
        return firebaseDatabase;
    }
}
