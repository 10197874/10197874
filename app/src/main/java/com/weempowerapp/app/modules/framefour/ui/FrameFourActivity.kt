package com.weempowerapp.app.modules.framefour.ui

import android.net.Uri
import androidx.activity.viewModels
import com.weempowerapp.app.R
import com.weempowerapp.app.appcomponents.base.BaseActivity
import com.weempowerapp.app.databinding.ActivityFrameFourBinding
import com.weempowerapp.app.modules.framefour.`data`.model.ImageSliderViewhierarchyModel
import com.weempowerapp.app.modules.framefour.`data`.viewmodel.FrameFourVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class FrameFourActivity : BaseActivity<ActivityFrameFourBinding>(R.layout.activity_frame_four) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.weempowerapp.app/drawable/img_12138371_151307")


  private val imageSliderViewhierarchyItems: ArrayList<ImageSliderViewhierarchyModel> =
      arrayListOf(ImageSliderViewhierarchyModel(imageImage =
  imageUri.toString()),ImageSliderViewhierarchyModel(imageImage = imageUri.toString()))


  private val viewModel: FrameFourVM by viewModels<FrameFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val viewhierarchyAdapter = ViewhierarchyAdapter(imageSliderViewhierarchyItems,true)
    binding.imageSliderViewhierarchy.adapter = viewhierarchyAdapter
    binding.imageSliderViewhierarchy.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorUserOne.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorUserOne.updateIndicatorCounts(binding.imageSliderViewhierarchy.indicatorCount)
    binding.frameFourVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderViewhierarchy.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderViewhierarchy.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME_FOUR_ACTIVITY"

  }
}
