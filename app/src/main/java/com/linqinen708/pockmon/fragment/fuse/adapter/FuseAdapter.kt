package com.linqinen708.pockmon.fragment.fuse.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import com.linqinen.library.adapter.BasicBindingAdapter
import com.linqinen708.pockmon.R
import com.linqinen708.pockmon.databinding.LayoutAdapterFuseBinding
import com.linqinen708.pockmon.fragment.fuse.bean.FuseBean

/**
 * Created by Ian on 2018/6/18.
 */
class FuseAdapter(context: Context?) : BasicBindingAdapter<FuseBean, LayoutAdapterFuseBinding>(context) {



    override fun getLayoutResId(viewType: Int): Int {
        return R.layout.layout_adapter_fuse
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)

        holder.itemView.findViewById<TextView>(R.id.id).text = (position+1).toString()+"."

        if (position % 2 == 0){
            holder.itemView.setBackgroundColor(context.getColor(R.color.grey_ECE6E6))
        }else{
            holder.itemView.setBackgroundColor(context.getColor(R.color.white_ffffff))
        }

    }

    override fun onBindItem(binding: LayoutAdapterFuseBinding?, bean: FuseBean?) {
        binding?.bean = bean

    }

}