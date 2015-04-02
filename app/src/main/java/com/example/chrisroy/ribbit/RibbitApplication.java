package com.example.chrisroy.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by chrisroy on 29/03/15.
 */
public class RibbitApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "0ZsnXMQSTBO6aQ5AL49WYt4xOymoTxRpEc3cI3wa", "9qH4uJg0muaP9BlD6Q6ovI1DhVsCsobeihrIvbtk");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();

    }
}
