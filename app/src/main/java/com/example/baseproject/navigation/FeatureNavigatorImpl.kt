package com.example.baseproject.navigation

import android.os.Bundle
import com.example.baseproject.R
import com.example.core.navigationComponent.BaseNavigatorImpl
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class FeatureNavigatorImpl @Inject constructor() : BaseNavigatorImpl(),
    FeatureNavigation {

    override fun openRestaurantScreen(bundle: Bundle?) {
        openScreen(R.id.action_to_restaurantFragment, bundle)
    }

    override fun openDishScreen(bundle: Bundle?) {
        openScreen(R.id.action_restaurantFragment_to_dishFragment, bundle)
    }

    override fun openReviewScreen(bundle: Bundle?) {
        openScreen(R.id.action_dishFragment_to_reviewFragment, bundle)
    }

}