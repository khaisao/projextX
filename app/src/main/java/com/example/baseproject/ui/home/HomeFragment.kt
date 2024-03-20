package com.example.baseproject.ui.home

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.baseproject.R
import com.example.baseproject.databinding.FragmentHomeBinding
import com.example.baseproject.navigation.FeatureNavigation
import com.example.baseproject.shareData.CurrentFragment
import com.example.baseproject.shareData.ShareViewModel
import com.example.core.base.fragment.BaseFragment
import com.example.core.utils.collectFlowOnView
import com.example.core.utils.setOnSafeClickListener
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home) {

    @Inject
    lateinit var appNavigation: FeatureNavigation

    private val viewModel: HomeViewModel by viewModels()

    private val shareViewmodel: ShareViewModel by activityViewModels()

    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)
        val navHostFragment = childFragmentManager
            .findFragmentById(R.id.nav_host_container) as NavHostFragment
        appNavigation.bind(navHostFragment.navController)

        shareViewmodel.loadDishesFromJson(requireContext(), "dishes.json")

    }

    override fun bindingStateView() {
        super.bindingStateView()
        shareViewmodel.currentFragment.collectFlowOnView(viewLifecycleOwner) {
            when (it) {
                CurrentFragment.MedalFragment -> setupUITextViewSelected(binding.tvStep1)
                CurrentFragment.RestaurantFragment -> setupUITextViewSelected(binding.tvStep2)
                CurrentFragment.DishFragment -> setupUITextViewSelected(binding.tvStep3)
                CurrentFragment.ReviewFragment -> setupUITextViewSelected(binding.tvStep4)
            }
        }
    }

    private fun setupUITextViewSelected(textView: TextView) {
        binding.tvStep1.setBackgroundResource(R.drawable.bg_number_oder)
        binding.tvStep2.setBackgroundResource(R.drawable.bg_number_oder)
        binding.tvStep3.setBackgroundResource(R.drawable.bg_number_oder)
        binding.tvStep4.setBackgroundResource(R.drawable.bg_number_oder)
        binding.tvStep1.setTextColor(Color.BLACK)
        binding.tvStep2.setTextColor(Color.BLACK)
        binding.tvStep3.setTextColor(Color.BLACK)
        binding.tvStep4.setTextColor(Color.BLACK)
        textView.setBackgroundResource(R.drawable.bg_btn_next)
        textView.setTextColor(Color.WHITE)
    }

    override fun getVM() = viewModel

}