package com.weempowerapp.app.modules.framefour.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.weempowerapp.app.databinding.SlideritemFrameFour1Binding
import com.weempowerapp.app.modules.framefour.`data`.model.ImageSliderViewhierarchyModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class ViewhierarchyAdapter(
  val dataList: ArrayList<ImageSliderViewhierarchyModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderViewhierarchyModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemFrameFour1Binding) {
      binding.imageSliderViewhierarchyModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemFrameFour1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
