package com.weempowerapp.app.modules.transfermoneypaymentsuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.weempowerapp.app.modules.transfermoneypaymentsuccess.`data`.model.TransferMoneyPaymentSuccessModel
import org.koin.core.KoinComponent

class TransferMoneyPaymentSuccessVM : ViewModel(), KoinComponent {
  val transferMoneyPaymentSuccessModel: MutableLiveData<TransferMoneyPaymentSuccessModel> =
      MutableLiveData(TransferMoneyPaymentSuccessModel())

  var navArguments: Bundle? = null
}
