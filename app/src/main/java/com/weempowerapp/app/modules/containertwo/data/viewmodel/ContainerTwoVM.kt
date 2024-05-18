package com.weempowerapp.app.modules.containertwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.weempowerapp.app.modules.containertwo.`data`.model.ContainerTwoModel
import org.koin.core.KoinComponent

class ContainerTwoVM : ViewModel(), KoinComponent {
  val containerTwoModel: MutableLiveData<ContainerTwoModel> = MutableLiveData(ContainerTwoModel())

  var navArguments: Bundle? = null
}
