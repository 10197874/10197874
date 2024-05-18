package com.weempowerapp.app.modules.containerthree.ui

import androidx.activity.viewModels
import com.weempowerapp.app.R
import com.weempowerapp.app.appcomponents.base.BaseActivity
import com.weempowerapp.app.databinding.ActivityContainerThreeBinding
import com.weempowerapp.app.modules.containerthree.`data`.viewmodel.ContainerThreeVM
import kotlin.String
import kotlin.Unit

class ContainerThreeActivity :
    BaseActivity<ActivityContainerThreeBinding>(R.layout.activity_container_three) {
  private val viewModel: ContainerThreeVM by viewModels<ContainerThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.containerThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CONTAINER_THREE_ACTIVITY"

  }
}
