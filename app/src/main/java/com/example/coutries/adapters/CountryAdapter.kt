package com.example.coutries.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.coutries.R
import com.example.coutries.databinding.RecyclerviewItemBinding
import com.example.coutries.model.CountryModel

class CountryAdapter(private val countriesList: ArrayList<CountryModel>) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CountryViewHolder {
        val recyclerviewItemBinding: RecyclerviewItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.recyclerview_item,
            parent,
            false
        )
        return CountryViewHolder(recyclerviewItemBinding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.recyclerviewItemBinding.country = countriesList.get(position)
    }

    override fun getItemCount(): Int {
        return countriesList.size
    }

    // view holder
    inner class CountryViewHolder(recyclerviewItemBinding: RecyclerviewItemBinding) : RecyclerView.ViewHolder(recyclerviewItemBinding.root) {

        val recyclerviewItemBinding: RecyclerviewItemBinding

        init {
            this.recyclerviewItemBinding = recyclerviewItemBinding
        }


    }
}