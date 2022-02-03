package com.example.retrofitpost

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register_screen.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RegisterScreen  : AppCompatActivity() {

    val EMAIL_REGEX = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})";


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)



        but_save_reg.setOnClickListener{
            singup(name_reg.text.toString(),email_reg.text.toString(),pass_reg.text.toString())
        }


    }
    fun singup(name : String , email: String , passward : String){
   val retrofit =Retrofit.Builder()
       .baseUrl(URL)
       .addConverterFactory(GsonConverterFactory.create())
       .build()
        val api : ServiceAPI = retrofit.create(ServiceAPI::class.java)
        //function at serviceapi
        val call = api.register(name , email ,passward)
        call.enqueue(object :Callback<RegisterData>{
            override fun onResponse(call: Call<RegisterData>, response: Response<RegisterData>) {
          Toast.makeText(this@RegisterScreen ,response.toString(),Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(call: Call<RegisterData>, t: Throwable) {
                Toast.makeText(this@RegisterScreen ,"غير قادر علي الاتصال بالسيرفر",Toast.LENGTH_SHORT).show()

            }

        })
    }
}