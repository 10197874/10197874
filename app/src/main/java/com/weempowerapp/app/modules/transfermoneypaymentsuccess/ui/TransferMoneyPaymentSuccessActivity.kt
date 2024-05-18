package com.weempowerapp.app.modules.transfermoneypaymentsuccess.ui

import androidx.activity.viewModels
import com.weempowerapp.app.R
import com.weempowerapp.app.appcomponents.base.BaseActivity
import com.weempowerapp.app.databinding.ActivityTransferMoneyPaymentSuccessBinding
import com.weempowerapp.app.modules.transfermoneypaymentsuccess.`data`.viewmodel.TransferMoneyPaymentSuccessVM
import kotlin.String
import kotlin.Unit

class TransferMoneyPaymentSuccessActivity :
    BaseActivity<ActivityTransferMoneyPaymentSuccessBinding>(R.layout.activity_transfer_money_payment_success)
    {
  private val viewModel: TransferMoneyPaymentSuccessVM by
      viewModels<TransferMoneyPaymentSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.transferMoneyPaymentSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TRANSFER_MONEY_PAYMENT_SUCCESS_ACTIVITY"

  }
}
