package com.linqinen708.pockmon

import android.content.res.Resources
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.linqinen.library.utils.LogT
import com.linqinen708.pockmon.adapter.PockmonAdapter
import com.linqinen708.pockmon.bean.PockmonBean
import com.linqinen708.pockmon.constant.MyConstants
import kotlinx.android.synthetic.main.activity_main.*
import java.text.Collator
import java.util.*

class MainActivity : AppCompatActivity() {

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

        initRecyclerView()
        initData()
        initSpinner()
    }


    private var pockmonAdapter: PockmonAdapter? = null

    fun initRecyclerView() {
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        pockmonAdapter = PockmonAdapter(this)
        mRecyclerView.adapter = pockmonAdapter

    }

    fun initData() {
        pockmonAdapter?.items?.add(PockmonBean(85, "皮卡丘", 21, 4, "紫", "27", "21", "32", 81, 87))
//        pockmonAdapter?.items?.add(PockmonBean(90, "皮凯丘", 1, "金", "20", "13", "19", 44, 51))
        pockmonAdapter?.items?.add(PockmonBean(95, "超梦", 48, "紫", "56", "42", "43", 270, 164))
        pockmonAdapter?.items?.add(PockmonBean(97, "无梦", 75, "金", "92", "63", "77", 299, 258))
        pockmonAdapter?.items?.add(PockmonBean(100, "无梦", 10, "绿", "24", "16", "21", 62, 73))
        pockmonAdapter?.items?.add(PockmonBean(101, "无梦", 21, "绿", "32", "22", "28", 93, 97))
        pockmonAdapter?.items?.add(PockmonBean(102, "无梦", 30, "绿", "39", "27", "35", 117, 117))
        pockmonAdapter?.items?.add(PockmonBean(103, "无梦", 30, "蓝", "42", "29", "38", 128, 125))
        pockmonAdapter?.items?.add(PockmonBean(104, "无梦", 60, "蓝", "68", "48", "62", 227, 200))
        pockmonAdapter?.items?.add(PockmonBean(120, "炼狱龙", 31, "白", "36", "28", "24", 113, 104))
        pockmonAdapter?.items?.add(PockmonBean(121, "炼狱龙", 31, "绿", "39", "31", "27", 124, 112))
        pockmonAdapter?.items?.add(PockmonBean(122, "炼狱龙", 40, "绿", "47", "37", "31", 152, 132))
        pockmonAdapter?.items?.add(PockmonBean(130, "嘎啦嘎啦", 48, "紫", "39", "37", "45", 127, 127))
        pockmonAdapter?.items?.add(PockmonBean(131, "嘎啦嘎啦", 87, "绿", "67", "47", "55", 287, 212))
        pockmonAdapter?.items?.add(PockmonBean(140, "杀手蝎", 110, "金", "130", "95", "123", 425, 300))
        pockmonAdapter?.items?.add(PockmonBean(200, "格林姆斯", 26, "紫", "26", "15", "23", 119, 89))
        pockmonAdapter?.items?.add(PockmonBean(201, "格林姆斯", 24, "蓝", "21", "18", "21", 69, 76))
        pockmonAdapter?.items?.add(PockmonBean(210, "尤尼库", 28, "蓝", "23", "16", "26", 96, 87))
        pockmonAdapter?.items?.add(PockmonBean(215, "尤尼库斯", 35, 4, "紫", "34", "28", "41", 121, 121))
        pockmonAdapter?.items?.add(PockmonBean(220, "比比鸟", 46, 2,"变异绿", "44", "31", "55", 144, 153))
        pockmonAdapter?.items?.add(PockmonBean(221, "比雕", 46, 3,"变异绿", "47", "35", "58", 155, 160))
        pockmonAdapter?.items?.add(PockmonBean(222, "比雕", 55, 3,"变异绿", "53", "39", "66", 181, 182))
        pockmonAdapter?.items?.add(PockmonBean(230, "炫彩比雕", 40, 4,"紫", "43", "36", "53", 178, 113))
        pockmonAdapter?.items?.add(PockmonBean(231, "炫彩比雕", 55, 4,"变异绿", "57", "42", "69", 187, 190))
        pockmonAdapter?.items?.add(PockmonBean(232, "炫彩比雕", 55, 4,"变异蓝", "63", "47", "76", 206, 205))
//        pockmonAdapter?.items?.add(PockmonBean(240, "杰特", 1, "蓝", "11", "9", "11", 26, 41))
//        pockmonAdapter?.items?.add(PockmonBean(245, "达克莱", 1, "金", "20+1", "12", "13", 36, 69))
        pockmonAdapter?.items?.add(PockmonBean(250, "裂空龙", 55, "紫", "58", "50", "51", 219, 166))
        pockmonAdapter?.items?.add(PockmonBean(260, "凤王", 27, 5,"紫", "40", "30", "33", 121, 119))
        pockmonAdapter?.items?.add(PockmonBean(300, "向日花怪", 30, "蓝", "25 + 3", "23 + 3", "23", 116, 96))
        pockmonAdapter?.items?.add(PockmonBean(310, "口呆花", 36, "绿", "27 + 6", "21 + 3", "27", 107, 99))
        pockmonAdapter?.items?.add(PockmonBean(320, "冥想花", 27, "变异绿", "29", "25", "27", 121, 90))
        pockmonAdapter?.items?.add(PockmonBean(321, "冥想花", 44, "变异绿", "38", "34", "35", 174, 120))
        pockmonAdapter?.items?.add(PockmonBean(322, "冥想花", 56, 3,"变异绿", "45", "40", "42", 216, 141))
        pockmonAdapter?.items?.add(PockmonBean(325, "妙蛙种子", 13, "绿", "15", "12", "16", 62, 58))
        pockmonAdapter?.items?.add(PockmonBean(326, "妙蛙草", 13, 3, "绿", "16", "14", "14", 71, 61))
        pockmonAdapter?.items?.add(PockmonBean(327, "妙蛙草", 34, 3, "绿", "28", "23", "24", 136, 100))
        pockmonAdapter?.items?.add(PockmonBean(328, "妙蛙花", 34, 4, "绿", "33", "26", "24", 156, 106))
        pockmonAdapter?.items?.add(PockmonBean(329, "妙蛙花", 34, 4, "绿", "33", "26", "24", 156, 106))
        pockmonAdapter?.items?.add(PockmonBean(330, "妙蛙花", 34, 4, "蓝", "36", "28", "26", 170, 113))
        pockmonAdapter?.items?.add(PockmonBean(331, "妙蛙花", 70, 4, "蓝", "63", "48", "45", 316, 194))
        pockmonAdapter?.items?.add(PockmonBean(332, "妙蛙花", 89, 4, "蓝", "77", "58", "54", 394, 237))
        pockmonAdapter?.items?.add(PockmonBean(333, "妙蛙花", 45, "紫", "40", "33", "33", 178, 114))
        pockmonAdapter?.items?.add(PockmonBean(335, "妙蛙花树", 94, "紫", "84", "77", "50", 535, 248))
        pockmonAdapter?.items?.add(PockmonBean(340, "夜精灵", 52, "紫", "45", "34", "49", 206, 149))
        pockmonAdapter?.items?.add(PockmonBean(350, "月桂叶", 49, "绿", "47", "31", "34", 193, 109))
        pockmonAdapter?.items?.add(PockmonBean(358, "始祖大树", 66, "金", "75", "61", "48", 323, 203))
        pockmonAdapter?.items?.add(PockmonBean(359, "始祖树苗", 40, "绿", "20", "21", "30", 126, 108))
        pockmonAdapter?.items?.add(PockmonBean(360, "始祖大树", 40, "绿", "39", "34", "25", 182, 135))
        pockmonAdapter?.items?.add(PockmonBean(361, "始祖大树", 56, "绿", "48", "43", "31", 239, 171))
        pockmonAdapter?.items?.add(PockmonBean(362, "始祖大树", 62, "绿", "52", "46", "34", 260, 185))
        pockmonAdapter?.items?.add(PockmonBean(363, "始祖大树", 62, "蓝", "58", "52", "38", 289, 201))
        pockmonAdapter?.items?.add(PockmonBean(364, "始祖大树", 70, "蓝", "63", "57", "42", 321, 222))
        pockmonAdapter?.items?.add(PockmonBean(365, "始祖大树", 94,5, "蓝", "80", "73", "53", 422, 287))
        pockmonAdapter?.items?.add(PockmonBean(370, "大菊花", 52, "紫", "44+6", "43", "41", 219, 145))
        pockmonAdapter?.items?.add(PockmonBean(380, "根性草", 44, 2,"绿", "31", "23", "32", 117, 109))
        pockmonAdapter?.items?.add(PockmonBean(400, "钢铁龙", 26, "紫", "39", "33", "21", 133, 82))
        pockmonAdapter?.items?.add(PockmonBean(401, "钢铁龙", 33, "变异绿", "45", "34", "26", 148, 96))
        pockmonAdapter?.items?.add(PockmonBean(402, "钢铁龙", 39, "变异绿", "50", "38", "29", 168, 106))
        pockmonAdapter?.items?.add(PockmonBean(403, "钢铁龙", 50, "变异绿", "59", "45", "34", 205, 126))
        pockmonAdapter?.items?.add(PockmonBean(404, "钢铁龙", 50, "变异蓝", "65", "49", "38", 227, 137))
        pockmonAdapter?.items?.add(PockmonBean(405, "钢铁龙", 60, "变异蓝", "78", "59", "46", 282, 164))
        pockmonAdapter?.items?.add(PockmonBean(406, "钢铁龙", 86, 5,"变异蓝", "99", "74", "58", 370, 209))
        pockmonAdapter?.items?.add(PockmonBean(407, "钢铁龙", 86, 5,"变异紫", "109", "83", "65", 410, 229))
//        pockmonAdapter?.items?.add(PockmonBean(410, "金狮王", 1, "金", "15", "14", "14", 41, 45))
        pockmonAdapter?.items?.add(PockmonBean(415, "美库西露", 1, "金", "20", "12+1", "13", 41, 57))
//        pockmonAdapter?.items?.add(PockmonBean(417, "斯蒂姆", 1, "金", "18", "19", "10", 46, 44))
        pockmonAdapter?.items?.add(PockmonBean(420, "黄金箱", 42, "变异绿", "42=37+5", "37", "40", 133, 118))
        pockmonAdapter?.items?.add(PockmonBean(430, "巨金怪", 41, "紫", "35", "36", "32", 166, 118))
        pockmonAdapter?.items?.add(PockmonBean(431, "合金怪", 41, "紫", "43", "32", "32", 186, 131))
        pockmonAdapter?.items?.add(PockmonBean(441, "索拉卡斯", 94, "金", "99", "82", "93", 462, 282))
        pockmonAdapter?.items?.add(PockmonBean(450, "大钢蛇", 53, 3,"变异绿", "45", "47", "47", 180, 123))
        pockmonAdapter?.items?.add(PockmonBean(451, "大钢蛇", 92, 3,"蓝", "57+8", "63", "59", 284, 192))
        pockmonAdapter?.items?.add(PockmonBean(460, "铁蚁", 59, 2,"蓝", "46", "39", "43", 182, 168))
        pockmonAdapter?.items?.add(PockmonBean(500, "急冻鸟", 58, "变异绿", "59", "53", "60", 238, 168))
        pockmonAdapter?.items?.add(PockmonBean(501, "急冻鸟", 76, "变异绿", "72", "66", "74", 305, 210))
        pockmonAdapter?.items?.add(PockmonBean(509, "暴鲤龙", 7, "变异绿", "19", "15", "15", 56, 58))
        pockmonAdapter?.items?.add(PockmonBean(510, "暴鲤龙", 16, "变异绿", "26", "20", "20", 82, 75))
        pockmonAdapter?.items?.add(PockmonBean(511, "暴鲤龙", 25, "变异绿", "32", "26", "24", 107, 92))
        pockmonAdapter?.items?.add(PockmonBean(512, "暴鲤龙", 37, 3,"变异绿", "40", "32", "30", 107, 92))
        pockmonAdapter?.items?.add(PockmonBean(520, "鲤鱼王", 25, "金", "21", "19", "20", 76, 78))
        pockmonAdapter?.items?.add(PockmonBean(521, "暴鲤龙", 25, "金", "33", "26", "24", 118, 102))
        pockmonAdapter?.items?.add(PockmonBean(522, "暴鲤龙", 31, "金", "37", "30", "28", 139, 116))
        pockmonAdapter?.items?.add(PockmonBean(523, "暴鲤龙", 40, "金", "45", "36", "33", 171, 138))
        pockmonAdapter?.items?.add(PockmonBean(524, "暴鲤龙", 48, "金", "51", "41", "38", 201, 156))
        pockmonAdapter?.items?.add(PockmonBean(525, "暴鲤龙", 55, 3,"金", "57", "45", "42", 226, 174))
        pockmonAdapter?.items?.add(PockmonBean(526, "暴鲤龙", 61,3, "金", "61", "49", "45", 246, 188))
        pockmonAdapter?.items?.add(PockmonBean(529, "红暴鲤龙", 66, "蓝", "59", "50", "53", 354, 217))
        pockmonAdapter?.items?.add(PockmonBean(540, "暴鲤龙", 77, 3,"绿", "64", "46", "44", 238, 190))
        pockmonAdapter?.items?.add(PockmonBean(541, "暴鲤龙", 77, 3,"蓝", "71", "53", "50", 266, 210))
//        pockmonAdapter?.items?.add(PockmonBean(550, "盖拉乌", 1, "变异金", "21+5", "13", "11", 47, 44))
        pockmonAdapter?.items?.add(PockmonBean(560, "巨炮龟", 94, "紫", "90+13", "77", "50+15", 374, 294))
        pockmonAdapter?.items?.add(PockmonBean(570, "吼鲸王", 66, "紫", "72", "62", "33", 294, 225))
        pockmonAdapter?.items?.add(PockmonBean(580, "吉洛洛", 21, 2,"绿", "20", "17", "19", 92, 68))
        pockmonAdapter?.items?.add(PockmonBean(590, "吉洛洛", 45, 2,"变异绿", "33", "38", "39", 158, 118))
        pockmonAdapter?.items?.add(PockmonBean(591, "吉洛洛", 58, 2,"变异绿", "39", "46", "48", 195, 143))
        pockmonAdapter?.items?.add(PockmonBean(600, "吼吼鲸", 55, 2,"绿", "39", "30", "37", 164, 127))
        pockmonAdapter?.items?.add(PockmonBean(610, "米露", 22, 2,"变异绿", "24", "24", "26+7", 78, 78))
        pockmonAdapter?.items?.add(PockmonBean(611, "加拉露", 22, 3,"变异绿", "28", "28", "26+7", 96, 78))
        pockmonAdapter?.items?.add(PockmonBean(620, "快泳蛙", 84, 3,"白", "57", "47", "57", 234, 218))
        pockmonAdapter?.items?.add(PockmonBean(621, "快泳蛙", 84, 3,"绿", "64", "54", "64", 259, 240))
        pockmonAdapter?.items?.add(PockmonBean(622, "快泳蛙", 84, 3,"蓝", "72", "61", "72", 285, 262))
//            getDBHelper().insertData(timeDifference01)
//        LogT.i("" + mList.toString())
    }

    fun initSpinner() {


//        val mList = ArrayList<Int>()
//        val mList = pockmonAdapter?.items?.toArray()

        val array: Array<String> = arrayOf("默认", "等级", "种类")

//        for (i in pockmonAdapter?.items?.indices!!){
//            mList.add(pockmonAdapter?.items?.get(i)?.level!!)
//        }


        //android.R.layout.simple_spinner_item为系统默认样式
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array)

        /*默认的的spinner控件下拉框会遮罩spinner本身，所以设置偏移量*/
        mSpinner.dropDownVerticalOffset = 35 * MyConstants.DP;

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        mSpinner.adapter = adapter

        mSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>, view: View, position: Int, l: Long) {

                LogT.i("position:" + position)
                when {
                    position == 1 -> Collections.sort(pockmonAdapter?.items)
                    position == 2 -> {
                        /**java中的中文排序逻辑*/
                        val coll = Collator.getInstance(Locale.CHINESE)
                        Collections.sort<PockmonBean>(pockmonAdapter?.items, coll)
                    }

                }
            }

            override fun onNothingSelected(adapterView: AdapterView<*>) {

            }
        }
    }
}
