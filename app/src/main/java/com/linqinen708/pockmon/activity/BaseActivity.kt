package com.linqinen708.pockmon.activity

import com.linqinen.library.activity.LinBaseActivity
import com.linqinen708.pockmon.sqlite.PockmonDBHelper

/**
 * Created by 林 on 2018/5/22.
 */
abstract class BaseActivity : LinBaseActivity() {

    private var mPockmonDBHelper: PockmonDBHelper? = null

    protected fun  getDBHelper(): PockmonDBHelper {
        if (mPockmonDBHelper == null) {
            mPockmonDBHelper = PockmonDBHelper(this)
        }
        return mPockmonDBHelper as PockmonDBHelper
    }

    override fun onDestroy() {
        super.onDestroy()
        mPockmonDBHelper?.closeSQLiteDatabase()

    }
}