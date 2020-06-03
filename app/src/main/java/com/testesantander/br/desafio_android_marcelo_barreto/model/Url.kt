package com.testesantander.br.desafio_android_marcelo_barreto.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Url : Serializable{

    @SerializedName("type")
    var type: String = ""
    @SerializedName("url")
    var url: String = ""



}