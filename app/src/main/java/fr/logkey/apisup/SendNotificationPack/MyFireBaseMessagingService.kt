package fr.logkey.apisup.SendNotificationPack

import android.app.NotificationManager
import android.content.Context
import android.util.Log
import androidx.annotation.NonNull
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFireBaseMessagingService: FirebaseMessagingService(){
    private lateinit var title:String;
    private lateinit var message:String;
    override fun onMessageReceived(@NonNull remoteMessage: RemoteMessage){
        super.onMessageReceived(remoteMessage)
        title = remoteMessage.getData().get("Title").toString()
        message = remoteMessage.getData().get("Message").toString()
        val builder = NotificationCompat.Builder(applicationContext)
            .setSmallIcon(android.R.drawable.stat_sys_download)
            .setContentTitle(title)
            .setContentText(message)
        val manager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(0, builder.build())
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)

        sendTokenToService(token)
    }
    private fun sendTokenToService(token: String){

        Log.d("??", "send to service  $token")

    }

}