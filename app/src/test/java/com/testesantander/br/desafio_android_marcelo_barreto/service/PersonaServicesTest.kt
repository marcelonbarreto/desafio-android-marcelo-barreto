package com.testesantander.br.desafio_android_marcelo_barreto.service


import com.testesantander.br.desafio_android_marcelo_barreto.BuildConfig.*
import com.testesantander.br.desafio_android_marcelo_barreto.network.RetrofitInstance
import org.junit.Assert
import org.junit.Before
import org.junit.ComparisonFailure
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class PersonaServicesTest {

    private val urlChater = "http://gateway.marvel.com/v1/public/characters?ts=1109262701&apikey=8dbfd5d0479d2b7075883080e9de26d4&hash=6aa87f0f86e7d638dc56fc23ece836d7"
    private val urlComics = "http://gateway.marvel.com/v1/public/characters/10077/comics?ts=1109262701&apikey=8dbfd5d0479d2b7075883080e9de26d4&hash=6aa87f0f86e7d638dc56fc23ece836d7"
    private lateinit var  personaServices: PersonaServices


    @Before
    fun setup() {
        personaServices = RetrofitInstance.retrofitInstance?.create(PersonaServices::class.java)!!
    }

    @Test
    fun validaUrlRequestTest() {
        var call = personaServices?.getAllPersonagens(TS, PUBLIC_KEY, MD5)
        Assert.assertEquals(urlChater, call?.request()?.url().toString())
    }
    @Test
    fun validaUrlRequestHQTest() {
        val personaServices = RetrofitInstance.retrofitInstance?.create(PersonaServices::class.java)
        var call = personaServices?.getAllHQ(10077, TS, PUBLIC_KEY, MD5)
        Assert.assertEquals(urlComics, call?.request()?.url().toString())
    }

    @Test (expected = ComparisonFailure::class)
    fun validaUrlRequestErrorHQTest() {
        val personaServices = RetrofitInstance.retrofitInstance?.create(PersonaServices::class.java)
        var call = personaServices?.getAllHQ(1, TS, PUBLIC_KEY, MD5)
        Assert.assertEquals(urlComics, call?.request()?.url().toString())
    }
}