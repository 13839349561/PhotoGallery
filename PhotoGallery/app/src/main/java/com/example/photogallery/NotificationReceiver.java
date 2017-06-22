package com.example.photogallery;

import android.app.Activity;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;

/**
 * Created by 邢仁琦 on 2017/6/19.
 */

public class NotificationReceiver extends BroadcastReceiver {

    private static final String TAG = "NotificationReceiver";

    @Override
    public void onReceive(Context c, Intent i){
        Log.i(TAG,"received result :" + getResultCode());
        if(getResultCode() != Activity.RESULT_OK){
            return;
        }

        int requestCode = i.getIntExtra(PollService.REQUES_CODE,0);
        Notification notification = (Notification)
                i.getParcelableExtra(PollService.NOTIFICATIION);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(c);
        notificationManager.notify(requestCode,notification);
    }
}
