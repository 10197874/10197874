package com.weempowerapp.app.modules.containerthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.weempowerapp.app.modules.containerthree.`data`.model.ContainerThreeModel
import org.koin.core.KoinComponent

class ContainerThreeVM : ViewModel(), KoinComponent {
  val containerThreeModel: MutableLiveData<ContainerThreeModel> =
      MutableLiveData(ContainerThreeModel())

  var navArguments: Bundle? = null
}
