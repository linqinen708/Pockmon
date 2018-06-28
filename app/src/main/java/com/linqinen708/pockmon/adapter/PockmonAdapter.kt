package com.linqinen708.pockmon.adapter

import android.content.Context
import android.widget.AutoCompleteTextView
import android.widget.TextView
import com.linqinen708.pockmon.R
import com.linqinen708.pockmon.bean.PockmonBean
import com.linqinen708.pockmon.databinding.LayoutAdapterPockmonBinding

/**
 * Created by Ian on 2018/6/18.
 */
class PockmonAdapter(context: Context?) : BasicBindingAdapter3<PockmonBean, LayoutAdapterPockmonBinding>(context) {


    override fun getLayoutResId(viewType: Int): Int {
        return R.layout.layout_adapter_pockmon
    }


    val QUALITY_GREEN: String = "绿"
    val QUALITY_BLUE: String = "蓝"
    val QUALITY_PURPLE: String = "紫"
    val QUALITY_YELLOW: String = "金"

    override fun onBindItem(binding: LayoutAdapterPockmonBinding, item: PockmonBean) {

        binding.bean = item

        when {
            item.quality!!.contains(QUALITY_GREEN) -> setTextColor(binding,R.color.green_00cc66)
            item.quality!!.contains(QUALITY_BLUE) -> setTextColor(binding,R.color.blue_0093ff)
            item.quality!!.contains(QUALITY_PURPLE) -> setTextColor(binding,R.color.purple_cc7903db)
            item.quality!!.contains(QUALITY_YELLOW) -> setTextColor(binding,R.color.yellow_ebc708)
        }
    }

    private fun setTextColor(binding: LayoutAdapterPockmonBinding, colorId:Int){
        binding.name.setTextColor(context.getColor(colorId))
        binding.quality.setTextColor(context.getColor(colorId))
        binding.level.setTextColor(context.getColor(colorId))
        binding.strength.setTextColor(context.getColor(colorId))
        binding.defense.setTextColor(context.getColor(colorId))
        binding.speed.setTextColor(context.getColor(colorId))
        binding.hp.setTextColor(context.getColor(colorId))
        binding.mp.setTextColor(context.getColor(colorId))
    }

}