package com.testesantander.br.desafio_android_marcelo_barreto.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Thumbnail : Serializable {


    @SerializedName("path")
    var patch: String = ""
    @SerializedName("extension")
    var extension: String = ""
}