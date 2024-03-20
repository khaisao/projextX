package com.example.baseproject.ui.review

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.baseproject.R
import com.example.baseproject.databinding.FragmentDishBinding
import com.example.baseproject.databinding.FragmentReviewBinding
import com.example.baseproject.navigation.FeatureNavigation
import com.example.baseproject.shareData.CurrentFragment
import com.example.baseproject.shareData.ShareViewModel
import com.example.core.base.fragment.BaseFragment
import com.example.core.utils.setOnSafeClickListener
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ReviewFragment :
    BaseFragment<FragmentReviewBinding, ReviewViewModel>(R.layout.fragment_review) {

    @Inject
    lateinit var appNavigation: FeatureNavigation

    private val viewModel: ReviewViewModel by viewModels()

    private val shareViewmodel: ShareViewModel by activityViewModels()

    override fun getVM() = viewModel

    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)

        binding.tvMedal.text = shareViewmodel.getCurrentMedal()

        binding.tvNoOfPeople.text = shareViewmodel.getCurrentNoOfPeopleMedal().toString()

        binding.tvRestaurant.text = shareViewmodel.getCurrentRestaurant()

        val textDish = shareViewmodel.getCurrentDish().joinToString("\n") { "${it.dishName} - ${it.noOfPeople}" }
        binding.tvDish.text = textDish

        requireActivity().onBackPressedDispatcher.addCallback(
            this,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    appNavigation.navigateUp()
                    shareViewmodel.setCurrentFragment(CurrentFragment.DishFragment)
                }
            })
    }

    override fun setOnClick() {
        super.setOnClick()
        binding.tvPrevious.setOnSafeClickListener {
            appNavigation.navigateUp()
            shareViewmodel.setCurrentFragment(CurrentFragment.DishFragment)
        }

    }

}