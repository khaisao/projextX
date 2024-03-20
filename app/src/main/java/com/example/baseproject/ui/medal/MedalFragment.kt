package com.example.baseproject.ui.medal

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.baseproject.R
import com.example.baseproject.databinding.FragmentMedalBinding
import com.example.baseproject.navigation.FeatureNavigation
import com.example.baseproject.shareData.CurrentFragment
import com.example.baseproject.shareData.ShareViewModel
import com.example.core.base.fragment.BaseFragment
import com.example.core.utils.setOnSafeClickListener
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MedalFragment :
    BaseFragment<FragmentMedalBinding, MedalViewModel>(R.layout.fragment_medal) {

    private val viewModel: MedalViewModel by viewModels()

    private val shareViewmodel: ShareViewModel by activityViewModels()

    @Inject
    lateinit var appNavigation: FeatureNavigation

    override fun getVM() = viewModel

    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)
        binding.edtChooseNumberPeople.text = shareViewmodel.getCurrentNoOfPeopleMedal().toString()
        setUpSpinner()
    }

    private fun setUpSpinner() {
        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_dropdown_item,
            shareViewmodel.getAllMedal()
        )

        binding.spinnerMedal.adapter = adapter

        binding.spinnerMedal.setSelection(
            shareViewmodel.getAllMedal().indexOf(shareViewmodel.getCurrentMedal())
        )
        binding.spinnerMedal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: android.view.View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                shareViewmodel.setCurrentMedal(selectedItem)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }
    }

    override fun setOnClick() {
        super.setOnClick()
        binding.tvNext.setOnSafeClickListener {
            shareViewmodel.setCurrentFragment(CurrentFragment.RestaurantFragment)
            appNavigation.openRestaurantScreen()
        }

        binding.ivIncrease.setOnClickListener {
            shareViewmodel.setCurrentNoOfPeopleMedal(shareViewmodel.getCurrentNoOfPeopleMedal() + 1)
            binding.edtChooseNumberPeople.text =
                shareViewmodel.getCurrentNoOfPeopleMedal().toString()
        }

        binding.ivDecrease.setOnClickListener {
            if (shareViewmodel.getCurrentNoOfPeopleMedal() == 1) {
                return@setOnClickListener
            }
            shareViewmodel.setCurrentNoOfPeopleMedal(shareViewmodel.getCurrentNoOfPeopleMedal() - 1)
            binding.edtChooseNumberPeople.text =
                shareViewmodel.getCurrentNoOfPeopleMedal().toString()
        }
    }
}