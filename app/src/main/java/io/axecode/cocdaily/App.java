package io.axecode.cocdaily;

import android.app.Application;
import android.content.Context;

public class App extends Application {

    private static final String DB_NAME = "gank.db";
    public static Context sContext;

    @Override public void onCreate() {
        super.onCreate();
        sContext = this;
    }

    @Override public void onTerminate() {
        super.onTerminate();
    }
}
