package com.alptazecicek.marsrealestate

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.alptazecicek.marsrealestate.databinding.RealestatesItemBinding

class EstateViewHolder(
    val estateBinding: ViewDataBinding
): RecyclerView.ViewHolder( estateBinding.root) {

    fun onBind(estateModel: EstateModel) {
        val binding = estateBinding as RealestatesItemBinding
        //binding.estateModel = estateModel
        binding.setVariable( BR.estateModel,estateModel )
    }
}