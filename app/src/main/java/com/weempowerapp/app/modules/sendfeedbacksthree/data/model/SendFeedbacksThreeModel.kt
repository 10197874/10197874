package com.weempowerapp.app.modules.sendfeedbacksthree.`data`.model

import com.weempowerapp.app.R
import com.weempowerapp.app.appcomponents.di.MyApp
import kotlin.String

data class SendFeedbacksThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRating: String? = MyApp.getInstance().resources.getString(R.string.lbl_rating)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMichael: String? = MyApp.getInstance().resources.getString(R.string.msg_arnold_ferdinand)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfessional: String? = MyApp.getInstance().resources.getString(R.string.lbl_professional)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFriendly: String? = MyApp.getInstance().resources.getString(R.string.lbl_friendly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProficient: String? = MyApp.getInstance().resources.getString(R.string.lbl_proficient)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProactive: String? = MyApp.getInstance().resources.getString(R.string.lbl_proactive)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPromotion: String? = MyApp.getInstance().resources.getString(R.string.lbl_promotion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGift: String? = MyApp.getInstance().resources.getString(R.string.lbl_gift)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCaretoshare: String? =
      MyApp.getInstance().resources.getString(R.string.msg_care_to_share_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etCommentValue: String? = null
)
