package com.example.retrofitpost

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ServiceAPI {


@FormUrlEncoded
 @POST("register")
 @Headers("Accept : application/json")
fun register(
       @Field("name") name :String,
       @Field("email") email :String,
       @Field("passward") passward :String,
) : Call<RegisterData>

 /*
  @GET("/AhmedTawfik32/repo/users")
  suspend fun getAPIUsers():Response<List<User>>

   @GET("/AhmedTawfik32/repo/users/{id}")
    suspend fun getAPIUser(@Path("id")id :Int):Response<User>

    @GET("/AhmedTawfik32/repo/users/")
    suspend fun getAPIUserQuery(@Query("id")id :Int):Response<User>

    @POST("/AhmedTawfik32/repo/users")
    suspend fun addAPIUser(@Body user: User) :Response<User>

    @PUT("/AhmedTawfik32/repo/users/{id}")
    suspend fun updateAPIUser(@Body user: User , @Path("id")id: Int) :Response<User>

    @DELETE("/AhmedTawfik32/repo/users/{id}")
    suspend fun deleteApPIUser(@Path("id") id: Int)

  */
}