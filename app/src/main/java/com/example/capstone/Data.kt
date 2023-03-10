package com.example.capstone

import android.net.Uri
import com.google.android.gms.maps.model.LatLng
import java.io.Serializable

data class Review(
    val image:Int,
    val comment:String,
    val date:String,
    val score:Long,
    val keyword1:String,
    val keyword2:String,
    val keyword3:String,
    val userName:String
): Serializable

data class MyReview(
    val image:Int,
    val comment:String,
    val date:String,
    val score:Long,
    val keyword1:String,
    val keyword2:String,
    val keyword3:String,
    val restaurant:String
): Serializable

data class Restaurant(
    val restaurantImg: Int,
    val rating: Double,
    val commentNumber: Int,
    val name: String,
    val waiting: Int
)

data class RestaurantList(
    val restaurantImg: Int,
    val rating: Double,
    val commentNumber: Int,
    val name: String,
    val waiting: Int,
    val keyword1: String,
    val keyword2: String,
    val keyword3: String
    )

data class Place(
    val name: String,
    val latLng: LatLng,
    val address: LatLng,
    val rating: Float
)
