package com.linqinen708.pockmon.adapter

import android.content.Context
import com.linqinen.library.adapter.BasicBindingAdapter
import com.linqinen708.pockmon.R
import com.linqinen708.pockmon.bean.PockmonBean
import com.linqinen708.pockmon.constant.MyConstants
import com.linqinen708.pockmon.databinding.LayoutAdapterPockmonBinding

/**
 * Created by Ian on 2018/6/18.
 */
class PockmonAdapter(context: Context?) : BasicBindingAdapter<PockmonBean, LayoutAdapterPockmonBinding>(context) {


    override fun getLayoutResId(viewType: Int): Int {
        return R.layout.layout_adapter_pockmon
    }




    override fun onBindItem(binding: LayoutAdapterPockmonBinding, item: PockmonBean) {

        binding.bean = item

        when {
            item.quality!!.contains(MyConstants.QUALITY_WHITE) -> setTextColor(binding,R.color.grey_8A8A8A)
            item.quality!!.contains(MyConstants.QUALITY_GREEN) -> setTextColor(binding,R.color.green_00cc66)
            item.quality!!.contains(MyConstants.QUALITY_BLUE) -> setTextColor(binding,R.color.blue_0093ff)
            item.quality!!.contains(MyConstants.QUALITY_PURPLE) -> setTextColor(binding,R.color.purple_cc7903db)
            item.quality!!.contains(MyConstants.QUALITY_YELLOW) -> setTextColor(binding,R.color.yellow_ebc708)
        }
    }

    private fun setTextColor(binding: LayoutAdapterPockmonBinding, colorId:Int){
        binding.name.setTextColor(context.getColor(colorId))
        binding.quality.setTextColor(context.getColor(colorId))
        binding.star.setTextColor(context.getColor(colorId))
        binding.level.setTextColor(context.getColor(colorId))
        binding.strength.setTextColor(context.getColor(colorId))
        binding.defense.setTextColor(context.getColor(colorId))
        binding.speed.setTextColor(context.getColor(colorId))
        binding.hp.setTextColor(context.getColor(colorId))
        binding.mp.setTextColor(context.getColor(colorId))
        binding.gender.setTextColor(context.getColor(colorId))
        binding.ps.setTextColor(context.getColor(colorId))
        binding.generation.setTextColor(context.getColor(colorId))
    }

}