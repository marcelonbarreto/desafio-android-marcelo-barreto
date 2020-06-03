package com.testesantander.br.desafio_android_marcelo_barreto.controller

import android.util.Log
import androidx.annotation.NonNull
import com.testesantander.br.desafio_android_marcelo_barreto.BuildConfig.*
import com.testesantander.br.desafio_android_marcelo_barreto.model.Personagem
import com.testesantander.br.desafio_android_marcelo_barreto.network.RetrofitInstance
import com.testesantander.br.desafio_android_marcelo_barreto.service.PersonaServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PersonaController  {

    fun getPersonas() {

        val personaServices = RetrofitInstance.retrofitInstance?.create(PersonaServices::class.java)
        val call = personaServices?.getAllPersonagens(TS, PUBLIC_KEY, MD5)


        call?.enqueue(object : Callback<Personagem> {
            override fun onResponse(@NonNull call: Call<Personagem>, @NonNull response: Response<Personagem>) {
                if (response.isSuccessful) {
                    val personas = response.body()
                    val personaResult = personas?.data?.personagemResult

                } else {
                    Log.e("#NotSucces", "Response : " + response.message())
                }
            }

            override fun onFailure(@NonNull call: Call<Personagem>, @NonNull t: Throwable) {
                Log.e("#Error", "OnFailure :" + t.message)

            }
        })

    }
}