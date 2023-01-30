package com.example.parental_control_basic;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;

import android.util.Log;

public class Help {
    public String getActiveApps(Context context) {

        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> runningProcesses = am.getRunningAppProcesses();
        StringBuilder value = new StringBuilder();

        for (ActivityManager.RunningAppProcessInfo processInfo : runningProcesses) {
            if (processInfo.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND)
                for (String activeProcess : processInfo.pkgList)
                    value.append("\n").append(activeProcess).append("\n-----------------------\n");
        }

        Log.d("answer", value.toString());
        return value.toString();
//        return "return";
    }

}
