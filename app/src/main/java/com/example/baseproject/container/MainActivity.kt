package com.example.baseproject.container

import android.os.Bundle
import com.example.baseproject.R
import com.example.baseproject.databinding.ActivityMainBinding
import com.example.core.base.activity.BaseActivityNotRequireViewModel
import com.example.core.base.dialog.ConfirmDialogListener
import com.example.core.pref.RxPreferences
import com.example.core.utils.NetworkConnectionManager
import com.example.core.utils.toast
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivityNotRequireViewModel<ActivityMainBinding>(), ConfirmDialogListener {

    @Inject
    lateinit var networkConnectionManager: NetworkConnectionManager

    @Inject
    lateinit var rxPreferences: RxPreferences

    override val layoutId = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
        networkConnectionManager.stopListenNetworkState()
    }

    override fun onClickOk(type: Int?) {
    }

    override fun onClickCancel(type: Int?) {
    }

}