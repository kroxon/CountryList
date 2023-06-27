package com.example.coutries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coutries.adapters.CountryAdapter
import com.example.coutries.model.CountryModel
import com.example.coutries.model.Result
import com.example.coutries.service.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    var countries: ArrayList<CountryModel>? = null
    var countryAdapter: CountryAdapter? = null
    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GetCountries()

    }

    fun GetCountries(): ArrayList<CountryModel>? {
        val instance = RetrofitInstance()
        val getCountryDataService = instance.getService()
        val call = getCountryDataService!!.getResult()

        call!!.enqueue(object : Callback<Result?> {
            override fun onResponse(call: Call<Result?>, response: Response<Result?>) {
                val result = response.body();

                if (result != null && result.result != null){
                    countries = result.result as ArrayList<CountryModel>?

//                    for (c in countries!!){
//                        Log.i("TAG", c.name.toString())
//                    }
                    ViewData()
                }
            }
            override fun onFailure(call: Call<Result?>, t: Throwable) {

            }
        })

        return countries;
    }

    private fun ViewData() {
        recyclerView = findViewById(R.id.recyclerView)
        countryAdapter = CountryAdapter(countries!!)
        val layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = countryAdapter

    }
}