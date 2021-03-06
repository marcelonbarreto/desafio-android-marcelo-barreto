package com.testesantander.br.desafio_android_marcelo_barreto.service

import com.testesantander.br.desafio_android_marcelo_barreto.model.HQ
import com.testesantander.br.desafio_android_marcelo_barreto.model.Personagem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PersonaServices {
    @GET("/v1/public/characters")
    fun getAllPersonagens(@Query("ts") ts: String, @Query("apikey")apkey:String, @Query("hash")hash:String): Call<Personagem>

    @GET("/v1/public/characters/{characterId}/comics")
    fun getAllHQ(@Path("characterId")characterId:Int,@Query("ts") ts: String, @Query("apikey")apkey:String, @Query("hash")hash:String): Call<HQ>




}