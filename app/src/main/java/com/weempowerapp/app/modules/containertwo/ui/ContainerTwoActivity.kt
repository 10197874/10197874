package com.weempowerapp.app.modules.containertwo.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.weempowerapp.app.R
import com.weempowerapp.app.appcomponents.base.BaseActivity
import com.weempowerapp.app.databinding.ActivityContainerTwoBinding
import com.weempowerapp.app.modules.containertwo.`data`.viewmodel.ContainerTwoVM
import kotlin.String
import kotlin.Unit

class ContainerTwoActivity :
    BaseActivity<ActivityContainerTwoBinding>(R.layout.activity_container_two) {
  private val viewModel: ContainerTwoVM by viewModels<ContainerTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.containerTwoVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      // TODO please, add your navigation code here
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "CONTAINER_TWO_ACTIVITY"

    }
  }
