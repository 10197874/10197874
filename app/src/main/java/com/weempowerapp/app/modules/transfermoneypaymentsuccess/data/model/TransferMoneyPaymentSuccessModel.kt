package com.weempowerapp.app.modules.transfermoneypaymentsuccess.`data`.model

import com.weempowerapp.app.R
import com.weempowerapp.app.appcomponents.di.MyApp
import kotlin.String

data class TransferMoneyPaymentSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccessfully: String? =
      MyApp.getInstance().resources.getString(R.string.msg_successfully_transferred)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecipient: String? = MyApp.getInstance().resources.getString(R.string.lbl_recipient)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtElizabeth: String? = MyApp.getInstance().resources.getString(R.string.msg_arnold_ferdinand)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt9296170714: String? = MyApp.getInstance().resources.getString(R.string.lbl_27_68_56_56893)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoutransferred: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_you_transferred)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtR1500zero: String? = MyApp.getInstance().resources.getString(R.string.lbl_r1500_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt241275123412: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2412_7512_3412_3456)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransaction: String? = MyApp.getInstance().resources.getString(R.string.lbl_transaction)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_34525)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt12302108twentyt: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_12_30_21_08_24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNote: String? = MyApp.getInstance().resources.getString(R.string.lbl_note)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThanksfor: String? = MyApp.getInstance().resources.getString(R.string.msg_i_have_a_feeling)

)
