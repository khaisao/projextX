package com.example.baseproject.ui.restaurent

import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.baseproject.R
import com.example.baseproject.databinding.FragmentMedalBinding
import com.example.baseproject.databinding.FragmentRestaurantBinding
import com.example.baseproject.navigation.FeatureNavigation
import com.example.baseproject.shareData.CurrentFragment
import com.example.baseproject.shareData.ShareViewModel
import com.example.core.base.fragment.BaseFragment
import com.example.core.utils.setOnSafeClickListener
import com.example.core.utils.toastMessage
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class RestaurantFragment :
    BaseFragment<FragmentRestaurantBinding, RestaurantViewModel>(R.layout.fragment_restaurant) {

    @Inject
    lateinit var appNavigation: FeatureNavigation

    private val viewModel: RestaurantViewModel by viewModels()

    private val shareViewmodel: ShareViewModel by activityViewModels()

    private var currentRestaurant: String? = null

    override fun getVM() = viewModel

    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)
        currentRestaurant = shareViewmodel.getCurrentRestaurant()
        setUpSpinner()

        requireActivity().onBackPressedDispatcher.addCallback(
            this,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    appNavigation.navigateUp()
                    shareViewmodel.setCurrentFragment(CurrentFragment.MedalFragment)
                }
            })
    }

    private fun setUpSpinner() {
        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_dropdown_item,
            shareViewmodel.getAllRestaurantName()
        )

        binding.spinnerMedal.adapter = adapter
        binding.spinnerMedal.setSelection(
            shareViewmodel.getAllRestaurantName().indexOf(shareViewmodel.getCurrentRestaurant())
        )

        binding.spinnerMedal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: android.view.View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                shareViewmodel.setCurrentRestaurant(selectedItem)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }
    }

    override fun setOnClick() {
        super.setOnClick()
        binding.tvPrevious.setOnSafeClickListener {
            appNavigation.navigateUp()
            shareViewmodel.setCurrentFragment(CurrentFragment.MedalFragment)
        }

        binding.tvNext.setOnSafeClickListener {
            if (currentRestaurant != null && currentRestaurant != shareViewmodel.getCurrentRestaurant()) {
                shareViewmodel.addDish(emptyList())
            }
            appNavigation.openDishScreen()
            shareViewmodel.setCurrentFragment(CurrentFragment.DishFragment)
        }
    }

}