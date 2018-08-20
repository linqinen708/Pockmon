package com.linqinen708.pockmon.fragment.carnival

import android.content.Context
import com.linqinen.library.adapter.BasicBindingAdapter
import com.linqinen708.pockmon.R
import com.linqinen708.pockmon.databinding.LayoutAdapterCarnivalBinding

/**
 * Created by Ian on 2018/8/14.
 */
class CarnivalAdapter(context: Context?) : BasicBindingAdapter<CarnivalBean, LayoutAdapterCarnivalBinding>(context){
    override fun getLayoutResId(p0: Int): Int {
       return R.layout.layout_adapter_carnival
    }

    override fun onBindItem(binding: LayoutAdapterCarnivalBinding, bean: CarnivalBean?) {
        binding.bean = bean
    }
}