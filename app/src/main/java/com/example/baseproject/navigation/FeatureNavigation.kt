package com.example.baseproject.navigation

import android.os.Bundle
import com.example.core.navigationComponent.BaseNavigator

interface FeatureNavigation : BaseNavigator {

    fun openRestaurantScreen(bundle: Bundle? = null)
    fun openDishScreen(bundle: Bundle? = null)
    fun openReviewScreen(bundle: Bundle? = null)
}