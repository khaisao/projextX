package com.example.baseproject.ui.dish

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.baseproject.R
import com.example.baseproject.databinding.FragmentDishBinding
import com.example.baseproject.model.DishChosen
import com.example.baseproject.navigation.FeatureNavigation
import com.example.baseproject.shareData.CurrentFragment
import com.example.baseproject.shareData.ShareViewModel
import com.example.core.base.fragment.BaseFragment
import com.example.core.utils.setOnSafeClickListener
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DishFragment :
    BaseFragment<FragmentDishBinding, DishViewModel>(R.layout.fragment_dish){

    @Inject
    lateinit var appNavigation: FeatureNavigation

    private val viewModel: DishViewModel by viewModels()

    private val shareViewmodel: ShareViewModel by activityViewModels()

    override fun getVM() = viewModel

    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)
        setUpCurrentDish()
        requireActivity().onBackPressedDispatcher.addCallback(
            this,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    shareViewmodel.addDish(getAllDishInput())
                    appNavigation.navigateUp()
                    shareViewmodel.setCurrentFragment(CurrentFragment.RestaurantFragment)
                }
            })
    }

    private fun setUpCurrentDish() {
        val listCurrentDish = shareViewmodel.getCurrentDish()
        if (listCurrentDish.isEmpty()) {
            addDishView()
        } else {
            listCurrentDish.forEach {
                addDishView(it)
            }
        }
    }

    override fun setOnClick() {
        super.setOnClick()
        binding.tvPrevious.setOnSafeClickListener {
            shareViewmodel.addDish(getAllDishInput())
            appNavigation.navigateUp()
            shareViewmodel.setCurrentFragment(CurrentFragment.RestaurantFragment)
        }

        binding.tvNext.setOnSafeClickListener {
            shareViewmodel.addDish(getAllDishInput())
            appNavigation.openReviewScreen()
            shareViewmodel.setCurrentFragment(CurrentFragment.ReviewFragment)
        }

        binding.ivAddDish.setOnSafeClickListener {
            shareViewmodel.addDish(getAllDishInput())
            addDishView()
        }

    }

    private fun getAllDishInput(): MutableList<DishChosen> {
        val listDish = mutableListOf<DishChosen>()
        for (i in 0 until binding.llListDish.childCount) {
            val childView: View = binding.llListDish.getChildAt(i)
            if (childView is DishItemView) {
                val item: DishChosen = childView.getCurrentDishChosen()
                listDish.add(item)
            }
        }
        return listDish
    }

    private fun addDishView(dishChosen: DishChosen? = null) {
        val dishItemView = DishItemView(requireContext())
        dishItemView.setListDish(shareViewmodel.getAllListDishAvailable())
        dishItemView.context = requireContext()
        if (dishChosen != null) {
            dishItemView.setCurrentDish(dishChosen)
        }
        binding.llListDish.addView(dishItemView)
    }
}