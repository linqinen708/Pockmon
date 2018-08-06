package com.linqinen708.pockmon.fragment.remarks.adapter

import android.content.Context
import com.linqinen.library.adapter.BasicBindingAdapter
import com.linqinen708.pockmon.R
import com.linqinen708.pockmon.databinding.LayoutAdapterRemarksBinding
import com.linqinen708.pockmon.fragment.remarks.bean.RemarkBean

/**
 * Created by Ian on 2018/6/18.
 */
class RemarksAdapter(context: Context?) : BasicBindingAdapter<RemarkBean, LayoutAdapterRemarksBinding>(context) {



    override fun getLayoutResId(viewType: Int): Int {
        return R.layout.layout_adapter_remarks
    }

    override fun onBindItem(binding: LayoutAdapterRemarksBinding?, bean: RemarkBean?) {
        binding?.bean = bean
    }

}