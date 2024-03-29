package com.example.olar.wallpaper.App;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class AppDelegate extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name("wallpaper.realm")
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }
}
