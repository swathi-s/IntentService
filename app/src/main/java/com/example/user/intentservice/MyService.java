package com.example.user.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by user on 9/1/2016.
 */
public class MyService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     *
     */
    public MyService() {
        super("My Service");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //After completion automatically service stops

        Log.d("IntentService","Intent Service executed(onHandleIntent)");
    }
}
