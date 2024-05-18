package com.weempowerapp.app.modules.framefour.`data`.model

import com.weempowerapp.app.R
import com.weempowerapp.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderViewhierarchyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSometechjournal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_https_www_fac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTechgiant: String? = MyApp.getInstance().resources.getString(R.string.msg_donation_of_pads)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3hago: String? = MyApp.getInstance().resources.getString(R.string.lbl_3h_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageImage: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageIconbuttonthree: String? = ""

)
