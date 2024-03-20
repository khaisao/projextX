package com.example.baseproject.shareData

import android.content.Context
import com.example.baseproject.model.Dish
import com.example.baseproject.model.DishChosen
import com.example.baseproject.model.DishItem
import com.example.core.base.BaseViewModel
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Locale
import javax.inject.Inject

@HiltViewModel
class ShareViewModel @Inject constructor() : BaseViewModel() {

    private val _currentFragment = MutableStateFlow(CurrentFragment.MedalFragment)
    val currentFragment: StateFlow<CurrentFragment> = _currentFragment

    fun setCurrentFragment(nameCurrentFragment: CurrentFragment) {
        _currentFragment.value = nameCurrentFragment
    }

    private var listDish = mutableListOf<DishItem>()

    fun loadDishesFromJson(context: Context, fileName: String) {
        val inputStream = context.assets.open(fileName)
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        val stringBuilder = StringBuilder()
        var line: String? = bufferedReader.readLine()
        while (line != null) {
            stringBuilder.append(line)
            line = bufferedReader.readLine()
        }
        inputStream.close()
        val json = stringBuilder.toString()
        val dish = Gson().fromJson(json, Dish::class.java)
        listDish.addAll(dish.dishes)
    }

    fun getAllMedal(): List<String> {
        return listDish.flatMap { it.availableMeals }
            .map { it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() } }
            .toSet()
            .toList()
    }

    private var medalSelected: String? = null

    fun setCurrentMedal(restaurantName: String) {
        medalSelected = restaurantName
    }

    fun getCurrentMedal(): String? {
        return medalSelected
    }

    fun getAllRestaurantName(): List<String> {

        if (medalSelected == null) {
            return listDish.map { it.restaurant }.toSet().toList()
        } else {
            val listRestaurantName = mutableSetOf<String>()
            for (item in listDish) {
                if (item.availableMeals.contains(medalSelected!!.lowercase(Locale.ROOT))) {
                    listRestaurantName.add(item.restaurant)
                }
            }
            return listRestaurantName.toList()
        }
    }

    private var restaurantSelected: String? = null

    fun setCurrentRestaurant(restaurantName: String) {
        restaurantSelected = restaurantName
    }

    fun getCurrentRestaurant(): String? {
        return restaurantSelected
    }


    private var currentNoOfPeopleMedal: Int = 1

    fun setCurrentNoOfPeopleMedal(no: Int) {
        currentNoOfPeopleMedal = no
    }

    fun getCurrentNoOfPeopleMedal(): Int {
        return currentNoOfPeopleMedal
    }

    fun getAllListDishAvailable(): List<String> {
        return if (medalSelected != null && restaurantSelected != null) {
            val listDishAvailable = mutableSetOf<String>()
            for (item in listDish) {
                if (item.availableMeals.contains(medalSelected!!.lowercase(Locale.ROOT)) && item.restaurant == restaurantSelected) {
                    listDishAvailable.add(item.name)
                }
            }
            listDishAvailable.toList()
        } else {
            emptyList()
        }
    }

    private var currentListDish = mutableListOf<DishChosen>()

    fun addDish(dish: List<DishChosen>) {
        currentListDish.clear()
        currentListDish.addAll(dish)
    }

    fun deleteDish(dish: DishChosen) {
        currentListDish.removeAll { it.dishName == dish.dishName }
    }

    fun getCurrentDish(): MutableList<DishChosen> {
        return currentListDish
    }

}

enum class CurrentFragment {
    MedalFragment, RestaurantFragment, DishFragment, ReviewFragment
}
