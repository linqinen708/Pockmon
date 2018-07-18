package com.linqinen708.pockmon

import android.content.res.Resources
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.linqinen.library.adapter.MyFragmentPagerAdapter
import com.linqinen.library.utils.LogT
import com.linqinen708.pockmon.constant.MyConstants
import com.linqinen708.pockmon.externalbiography.ExternalBiographyFragment
import com.linqinen708.pockmon.offline.OfflineFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ExternalBiographyFragment.OnFragmentInteractionListener, OfflineFragment.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var displayCalendar: String? = null

//    private var mBean:PockmonBean = PockmonBean()

//    private var mList: ArrayList<PockmonBean>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mList = getDBHelper().queryData()

        if (MyConstants.DP == 0) {
            MyConstants.DP = Resources.getSystem().displayMetrics.densityDpi / 160
            LogT.i("MyConstants.DP:"+MyConstants.DP)

        }

        initViewPager()
    }

    fun initViewPager(){
        val myFragmentPagerAdapter = MyFragmentPagerAdapter(supportFragmentManager)
        myFragmentPagerAdapter.addFragment(ExternalBiographyFragment.newInstance(), "外传")
        myFragmentPagerAdapter.addFragment(OfflineFragment.newInstance(), "单机版")
        mViewPager.adapter = myFragmentPagerAdapter
        mTabLayout.setupWithViewPager(mViewPager)
    }

//
}
