package com.plcoding.jetpackcomposepokedex.data.remote.resources

import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite
)