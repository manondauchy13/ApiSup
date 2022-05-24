package fr.logkey.apisup.SendNotificationPack

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface APIService {
    @Headers(
        "Content-Type:application/json",
        "Authorization:key=AAAAK8lm4HM:APA91bEW2ZHMGOZzOi14RKUUDXhuGWDWyiJ2D3J-cJDHiOLd_7GB3ary8MwRjSwEuwCgC_sEgEagVx5rOalohpO2fCfvOQ0jon7YRhXSP7GSZiUGURyestCCg_JMGszUVFse0GmNd2IQ" // Your server key refer to video for finding your server key
    )
    @POST("fcm/send")
    open fun sendNotifcation(@Body body: NotificationSender?): Call<MyResponse?>?
}
