package com.example.capstone.retrofit

import com.example.capstone.*
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface IRetrofit {

    @POST("/restaurants")
    fun showRestaurants(@Body resAddress: resAddress):Call<RestaurantList>

    @POST("/restaurant/name")
    fun searchRestaurants(@Body resName: resName):Call<RestaurantList>

    @POST("/user/waiting/insert")
    fun addWaiting(@Body addWaiting: AddWaiting):Call<AddWaiting>

    @POST("/restaurant/reviews")
    fun showRestaurantReview(@Body ResID: ResID):Call<RestaurantReviewList>

    @POST("/review")
    fun writeReview(@Body writeReview: WriteReview):Call<WriteReview>

    @Multipart
    @POST("/upload/review/image")
    fun sendImage(@Part imageFile : MultipartBody.Part, @Part("RevIdx") RevIdx: String, ):Call<String>
}
