package com.weempowerapp.app.modules.sendfeedbacksthree.ui

import androidx.activity.viewModels
import com.weempowerapp.app.R
import com.weempowerapp.app.appcomponents.base.BaseActivity
import com.weempowerapp.app.databinding.ActivitySendFeedbacksThreeBinding
import com.weempowerapp.app.modules.sendfeedbacksthree.`data`.viewmodel.SendFeedbacksThreeVM
import kotlin.String
import kotlin.Unit

class SendFeedbacksThreeActivity :
    BaseActivity<ActivitySendFeedbacksThreeBinding>(R.layout.activity_send_feedbacks_three) {
  private val viewModel: SendFeedbacksThreeVM by viewModels<SendFeedbacksThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sendFeedbacksThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEND_FEEDBACKS_THREE_ACTIVITY"

  }
}
