package com.linqinen708.pockmon.base

import android.os.Bundle
import android.support.v4.app.Fragment

/**
 * Created by Ian on 2018/7/18.
 */
abstract class BaseFragment : Fragment() {

//    protected var mContext: Context? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        mContext = activity
    }
}