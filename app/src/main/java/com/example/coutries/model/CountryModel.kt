package com.example.coutries.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import javax.annotation.Generated


@Generated("jsonschema2pojo")
class CountryModel {
    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("code")
    @Expose
    var code: String? = null

    @SerializedName("states")
    @Expose
    var states: Any? = null

    @SerializedName("region")
    @Expose
    var region: String? = null
}