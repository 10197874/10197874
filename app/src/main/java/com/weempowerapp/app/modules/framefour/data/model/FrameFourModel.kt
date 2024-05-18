package com.weempowerapp.app.modules.framefour.`data`.model

import com.weempowerapp.app.R
import com.weempowerapp.app.appcomponents.di.MyApp
import kotlin.String

data class FrameFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHighlights: String? = MyApp.getInstance().resources.getString(R.string.lbl_highlights)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFinreportco: String? = MyApp.getInstance().resources.getString(R.string.msg_https_www_fac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStockmarket: String? =
      MyApp.getInstance().resources.getString(R.string.msg_at_mbilwi_secondary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt2hago: String? = MyApp.getInstance().resources.getString(R.string.lbl_2h_ago)

)
