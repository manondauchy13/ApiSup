package fr.logkey.apisup.SendNotificationPack



class NotificationSender(val data: Data?, val to:String){
    constructor():this(null,""){}
}