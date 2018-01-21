package com.example.quinn.rehabit;

/**
 * Created by mattw on 1/21/2018.
 */

import android.app.Notification;
import android.content.Context;

public class Notifications {
    class NotificationHelper  {
        Context context;
        Notification noti = new Notification.Builder(context)
                .setContentTitle("Why waste?")
                .setContentText("Don't forget to check your " + subject)
                .setSmallIcon(R.drawable.new_mail)
                .setLargeIcon(aBitmap)
                .getNotification();
    }
}
