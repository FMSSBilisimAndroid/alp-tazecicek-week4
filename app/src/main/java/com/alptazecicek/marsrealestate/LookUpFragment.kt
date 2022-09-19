package com.alptazecicek.marsrealestate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alptazecicek.marsrealestate.databinding.FragmentLookUpBinding


class LookUpFragment : Fragment() {

    private lateinit var fragmentLookUpBinding: FragmentLookUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentLookUpBinding = FragmentLookUpBinding.inflate(layoutInflater)
        return fragmentLookUpBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //
    }

}