package com.alptazecicek.marsrealestate

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alptazecicek.marsrealestate.databinding.FragmentHomeBinding
import com.alptazecicek.marsrealestate.databinding.FragmentMenuBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MenuFragment : Fragment() {

    private lateinit var fragmentMenuBinding: FragmentMenuBinding
    private var estatelist = ArrayList<EstateModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentMenuBinding = FragmentMenuBinding.inflate(layoutInflater)
        return fragmentMenuBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(context, 2)
        fragmentMenuBinding.recyclerView.layoutManager = layoutManager

        getList()

    }

    fun getList() {
        MarsApi.retrofitService.getProperties().enqueue(object : Callback<List<EstateModel>> {
            override fun onResponse(
                call: Call<List<EstateModel>>,
                response: Response<List<EstateModel>>
            ) {
                response.body()?.let { responseList ->
                    estatelist = ArrayList(responseList)
                    val estateAdapter = EstateAdapter(ArrayList(responseList))
                }
            }

            override fun onFailure(call: Call<List<EstateModel>>, t: Throwable) {
                Log.e("failure", t.message.toString())
            }
        })
    }
}