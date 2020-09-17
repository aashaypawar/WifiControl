package com.example.app

import android.net.wifi.WifiManager
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.wifiSwitch)
        val textView = findViewById<TextView>(R.id.tv)

        val wifi = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager

        btn.setOnClickListener {

            wifi.isWifiEnabled = !wifi.isWifiEnabled

            if(!wifi.isWifiEnabled){
                textView.text = "Wifi is ON"
            }else{
                textView.text = "Wifi is OFF"
            }
        }

    }
}