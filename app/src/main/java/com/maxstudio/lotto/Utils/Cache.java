package com.maxstudio.lotto.Utils;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class Cache
        extends Application {
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }

}
