package com.joeymccoy.todolist;

/**
 * Created by Dell on 11/9/2015.
 */
import android.app.Application;
import com.parse.Parse;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "3fEGc93Zj6vaS8fIlv8v3InimTKmQf71zeBHbCSh", "2lw7gvS8Wj2UzpEaGzOp3I4zRMKrPZ25F3vK9Awr"); // Your Application ID and Client Key are defined elsewhere
    }
}
