package com.weempowerapp.app.modules.sendfeedbacksthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.weempowerapp.app.modules.sendfeedbacksthree.`data`.model.SendFeedbacksThreeModel
import org.koin.core.KoinComponent

class SendFeedbacksThreeVM : ViewModel(), KoinComponent {
  val sendFeedbacksThreeModel: MutableLiveData<SendFeedbacksThreeModel> =
      MutableLiveData(SendFeedbacksThreeModel())

  var navArguments: Bundle? = null
}
