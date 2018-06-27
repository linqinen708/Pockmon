package com.linqinen708.pockmon.adapter

import android.content.Context
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


    val QUALITY_GREEN:String = "绿"
    val QUALITY_BLUE:String = "蓝"
    val QUALITY_PURPLE:String = "紫"
    val QUALITY_YELLOW:String = "金"

    override fun onBindItem(binding: LayoutAdapterPockmonBinding, item: PockmonBean) {

        binding.bean = item

        if(item.name!!.contains(QUALITY_GREEN)){

        binding.name.setTextColor(context.getColor(R.color.green_00cc66))
        }else if(item.name!!.contains(QUALITY_BLUE)){
        binding.name.setTextColor(context.getColor(R.color.blue_0093ff))

        }else if(item.name!!.contains(QUALITY_PURPLE)){
            binding.name.setTextColor(context.getColor(R.color.purple_cc7903db))

        }else if(item.name!!.contains(QUALITY_YELLOW)){
            binding.name.setTextColor(context.getColor(R.color.yellow_CDD513))

        }
//        binding.level.text = item.level.toString()
//        binding.quality.text = item.quality
//        binding.strength.text = item.strength.toString()
//        binding.defense.text = item.defense.toString()
//        binding.speed.text = item.speed.toString()
//        binding.hp.text = item.hp.toString()
//        binding.mp.text = item.mp.toString()
    }

}