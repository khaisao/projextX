package com.example.baseproject.ui.dish

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentManager
import com.example.baseproject.R
import com.example.baseproject.databinding.DishItemViewBinding
import com.example.baseproject.model.DishChosen

class DishItemView : ConstraintLayout {
    private var addMedicineViewListener: AddMedicineViewListener? = null
    private var context: Context? = null
    private var fragmentManager: FragmentManager? = null
    private var listDish = mutableListOf<String>()

    fun setListDish(listDish: List<String>) {
        this.listDish.clear()
        this.listDish.addAll(listDish)
    }

    fun setCurrentDish(dishChosen: DishChosen) {
        binding.spinnerDish.setSelection(
            listDish.indexOfFirst { it == dishChosen.dishName }
        )
        binding.edtChooseNumberPeople.text = dishChosen.noOfPeople.toString()
    }

    interface AddMedicineViewListener {
        fun onDeleteMedicineItemView(view: DishItemView?)
    }

    fun setCustomViewListener(listener: AddMedicineViewListener?) {
        addMedicineViewListener = listener
    }

    fun setFragmentManager(fragmentManager: FragmentManager?) {
        this.fragmentManager = fragmentManager
    }

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context)
    }

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(context)
    }


    fun setContext(context: Context) {
        this.context = context
        setUpSpinner(context)
    }

    private lateinit var binding: DishItemViewBinding


    private fun init(context: Context) {
        binding = DishItemViewBinding.inflate(LayoutInflater.from(context), this, true)
        setOnClick()
    }

    private fun setOnClick() {
        binding.ivIncrease.setOnClickListener {
            binding.edtChooseNumberPeople.text =
                (binding.edtChooseNumberPeople.text.toString().toInt() + 1).toString()
        }

        binding.ivDecrease.setOnClickListener {
            if (binding.edtChooseNumberPeople.text.toString().toInt() == 1) {
                return@setOnClickListener
            }
            binding.edtChooseNumberPeople.text =
                (binding.edtChooseNumberPeople.text.toString().toInt() - 1).toString()
        }

    }


    fun getCurrentDishChosen(): DishChosen {
        return DishChosen(
            noOfPeople = binding.edtChooseNumberPeople.text.toString().toInt(),
            dishName = binding.spinnerDish.selectedItem.toString()
        )
    }

    private fun setUpSpinner(context: Context) {
        val adapter = ArrayAdapter(
            context,
            android.R.layout.simple_spinner_dropdown_item,
            listDish
        )

        binding.spinnerDish.adapter = adapter
    }


}
