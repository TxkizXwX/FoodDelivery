package com.example.fooddelivery.Models

class NotificationModel {
    private var image : Int? = null
    private var notification : String = ""

    constructor()
    constructor(image : Int?, notification : String){
        this.image = image
        this.notification = notification
    }

    fun getNotification() : String{
        return notification
    }
    fun getImage() : Int?{
        return image
    }

    fun setNotification(notification : String){
        this.notification = notification
    }
    fun setImage(image : Int?){
        this.image = image
    }
}