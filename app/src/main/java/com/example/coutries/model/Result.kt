package com.example.coutries.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import javax.annotation.Generated


@Generated("jsonschema2pojo")
class Result {
    @SerializedName("code")
    @Expose
    var code: Int? = null

    @SerializedName("result")
    @Expose
    var result: List<CountryModel>? = null

    @SerializedName("extra")
    @Expose
    var extra: List<Any>? = null
}

