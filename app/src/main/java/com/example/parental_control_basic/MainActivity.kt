package com.example.parental_control_basic

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt1: TextView = findViewById(R.id.txt1)
        val txt2: TextView = findViewById(R.id.txt2)
        val btn: Button = findViewById(R.id.btn)
        val con = this.applicationContext
        var i = 0

        btn.setOnClickListener {
            txt1.text = Help().getActiveApps(this)

//            val timer = object: CountDownTimer(10000, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                    // do something
//
//                    txt1.text = "Update: " + i.toString()
////                    Log.d("delayed", "schedule: " + i)
//
//                    i++
//
//                }
//                override fun onFinish() {
//                    // do something
//                }
//            }
//            timer.start()
        }


//        var i = 0;
//        while ( i < 30){
//            Log.d( "tag","\nIn main Act: " +i)
//            i++;
//        }
//        startService(Intent(this, SaveMyAppsService::class.java))


    }

//    @Suppress("DEPRECATION")
//    fun getActiveApps(context: Context): String {
//
//        val pm: PackageManager = context.getPackageManager()
//        var packages: List<ApplicationInfo> = pm.getInstalledApplications(PackageManager.GET_META_DATA);
//
////        var value: String = u.dateStamp (); // basic date stamp
//        var value: String = ""
//        value += "---------------------------------\n";
//        value += "Active Apps\n";
//        value += "=================================\n";
//
//        for (packageInfo in packages) {
//
//            //system apps! get out
//            if ((packageInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
//
//                value += getApplicationLabel(
//                    context,
//                    packageInfo.packageName
//                ) + "\n" + packageInfo.packageName + "\n-----------------------\n";
//
//            }
//        }
//
//        return value;
//    }
}