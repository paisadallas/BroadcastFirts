package com.john.broadcastfirts

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BroadcastPlane: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
       StringBuilder().apply {
           append("Action :${intent.action}\n").toString().also {log ->
               Log.d("MYBROADCAST",log)
               Toast.makeText(context,log,Toast.LENGTH_SHORT).show()
           }
       }

    }
}