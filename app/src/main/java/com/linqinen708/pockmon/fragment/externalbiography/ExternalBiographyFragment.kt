package com.linqinen708.pockmon.fragment.externalbiography

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.linqinen.library.utils.LogT
import com.linqinen708.pockmon.R
import com.linqinen708.pockmon.adapter.PockmonAdapter
import com.linqinen708.pockmon.base.BaseFragment
import com.linqinen708.pockmon.bean.PockmonBean
import com.linqinen708.pockmon.constant.MyConstants
import kotlinx.android.synthetic.main.fragment_external_biography.*
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ExternalBiographyFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ExternalBiographyFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ExternalBiographyFragment : BaseFragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_external_biography, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        initData()
        initSpinner()

    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ExternalBiographyFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                ExternalBiographyFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }

        @JvmStatic
        fun newInstance() = ExternalBiographyFragment()
    }

    private var pockmonAdapter: PockmonAdapter? = null

    fun initRecyclerView() {
        mRecyclerView.layoutManager = LinearLayoutManager(context)
        pockmonAdapter = PockmonAdapter(context)
        mRecyclerView.adapter = pockmonAdapter

    }

    private fun initData() {

        /**风系*/
        initWindSeries()

        initDarkSeries()

        initFireSeries()

        initPlantSeries()

        initBeastSeries()

        initThunderSeries()

        initWaterSeries()

        initSoilSeries()

        initFlySeries()

        initMetalSeries()
    }

    /**风系*/
    private fun initWindSeries() {
        pockmonAdapter?.items?.add(PockmonBean(10001, "绵绵", "风系", 15, 1, "蓝",
                "12", "8", "9", 108, 68, "血量特别多"))
        pockmonAdapter?.items?.add(PockmonBean(10010, "阿科泰克", "风系", 45, 3, "紫",
                "63+9", "43", "67", 164, 149, "快速连击"))
        pockmonAdapter?.items?.add(PockmonBean(10011, "伊莱艾克", "风系", 45, 5, "紫",
                "74+11", "56", "102", 164, 166, "大风，快速连击"))
        pockmonAdapter?.items?.add(PockmonBean(10011, "伊莱艾克", "风系", 58, 5, "紫",
                "94+14", "71", "129", 209, 197, "大风，快速连击"))
        pockmonAdapter?.items?.add(PockmonBean(10020, "烈米亚", "风系", 1, 3, "绿",
                "1", "1", "1", 23, 71, "大风，快速连击"))
        pockmonAdapter?.items?.add(PockmonBean(10030, "浮游龙", "风系", 61, 4, "绿",
                "61", "54", "62", 280, 230, "大风"))
        pockmonAdapter?.items?.add(PockmonBean(10031, "浮游龙", "风系", 74, 4, "绿",
                "78", "70", "69", 491, 235, "大风"))
        pockmonAdapter?.items?.add(PockmonBean(10032, "浮游龙", "风系", 74, 4, "蓝",
                "87", "79", "76", 534, 258, "大风"))
        pockmonAdapter?.items?.add(PockmonBean(10040, "风灵兔", "风系", 9, 1, "蓝",
                "1", "1", "1", 60, 57, "成长，积蓄"))
    }

    /**暗系*/
    fun initDarkSeries() {
        pockmonAdapter?.items?.add(PockmonBean(11001, "暗灵兔", "暗系", 29, 1, "绿",
                "20", "18", "24", 70, 72, ""))
        pockmonAdapter?.items?.add(PockmonBean(11010, "影绒艾普", "暗系", 15, 2, "绿",
                "18", "17", "13", 93, 74, ""))
        pockmonAdapter?.items?.add(PockmonBean(11011, "影绒艾普", "暗系", 54, 2, "绿",
                "53", "48", "35", 229, 143, ""))
        pockmonAdapter?.items?.add(PockmonBean(11020, "亚密雷欧", "暗系", 51, 4, "蓝",
                "53+7", "59", "58", 263, 141, ""))
        pockmonAdapter?.items?.add(PockmonBean(11020, "亚密雷欧", "暗系", 67, 4, "蓝",
                "69+10", "78", "81", 340, 196, ""))
        pockmonAdapter?.items?.add(PockmonBean(11020, "亚密雷欧", "暗系", 62, 4, "蓝",
                "63+9", "71", "75", 308, 183, ""))
        pockmonAdapter?.items?.add(PockmonBean(11030, "暗影蝎", "暗系", 56, 3, "蓝",
                "88", "56", "55+16", 263, 141, ""))
        pockmonAdapter?.items?.add(PockmonBean(11040, "索罗亚库", "暗系", 31, 3, "蓝",
                "35", "34", "43", 92, 174, ""))
        pockmonAdapter?.items?.add(PockmonBean(11041, "索罗亚库", "暗系", 57, 3, "蓝",
                "60", "59", "72", 159, 249, ""))
        pockmonAdapter?.items?.add(PockmonBean(11050, "杰特", "暗系", 5, 1, "绿",
                "35", "34", "43", 28, 75, 1, "积蓄"))
        pockmonAdapter?.items?.add(PockmonBean(11060, "杰特", "暗系", 5, 1, "绿",
                "35", "34", "43", 28, 71, 0, "忍耐"))
        pockmonAdapter?.items?.add(PockmonBean(11070, "暗黑犬", "暗系", 1, 1, "绿",
                "1", "1", "1", 63, 57, 0, "致命交易，厄运诅咒"))

    }

    /**火系*/
    fun initFireSeries() {
        pockmonAdapter?.items?.add(PockmonBean(12001, "宝宝龙", "火系", 17, 1, "蓝",
                "17", "14", "11+3", 56, 63, "成长，积蓄，撒气"))
        pockmonAdapter?.items?.add(PockmonBean(12002, "宝宝龙", "火系", 30, 1, "蓝",
                "27", "22", "16+4", 79, 73, "成长，积蓄，撒气"))
        pockmonAdapter?.items?.add(PockmonBean(12003, "火蜥龙", "火系", 19, 2, "蓝",
                "25", "19", "14+4", 78, 73, ""))
        pockmonAdapter?.items?.add(PockmonBean(12004, "火蜥龙", "火系", 30, 2, "蓝",
                "36", "27", "19+5", 108, 86, ""))
    }

    /**草系*/
    fun initPlantSeries() {
        pockmonAdapter?.items?.add(PockmonBean(13001, "妙蛙种子", "植物系", 13, 1, "紫",
                "16", "14", "15", 96, 93, "成长"))
        pockmonAdapter?.items?.add(PockmonBean(13002, "妙蛙草", "植物系", 13, 3, "紫",
                "18", "16", "17", 106, 97, "冥想"))
        pockmonAdapter?.items?.add(PockmonBean(13003, "妙蛙草", "植物系", 22, 3, "紫",
                "27", "24", "26", 153, 119, "冥想"))
        pockmonAdapter?.items?.add(PockmonBean(13004, "妙蛙草", "植物系", 30, 3, "紫",
                "36", "27", "29", 108, 86, "冥想"))
        pockmonAdapter?.items?.add(PockmonBean(13004, "妙蛙草", "植物系", 60, 3, "紫",
                "67", "59", "67", 347, 248, "冥想，成长，毒菱"))
        pockmonAdapter?.items?.add(PockmonBean(13010, "青草蛇", "植物系", 1, 1, "蓝",
                "10", "10", "10", 10, 8, "积蓄"))

        pockmonAdapter?.items?.add(PockmonBean(13920, "莲草种子", "植物系", 15, 1, "绿",
                "10", "12", "10", 51, 62, 1, "积蓄，寄生魔芽，毒种子"))
        pockmonAdapter?.items?.add(PockmonBean(13923, "莲草种子", "植物系", 31, 1, "绿",
                "16", "19", "20", 66, 97, 1, "积蓄，寄生魔芽，毒种子"))
        pockmonAdapter?.items?.add(PockmonBean(13924, "根性草", "植物系", 31, 1, "绿",
                "30", "28", "20", 111, 120, 1, "撒气，决胜攻击"))
        pockmonAdapter?.items?.add(PockmonBean(13924, "冥想花", "植物系", 31, 3, "绿",
                "38", "30", "26", 133, 116, 1, "晴天"))
        pockmonAdapter?.items?.add(PockmonBean(13925, "冥想花", "植物系", 60, 3, "绿",
                "68", "54", "41", 239, 159, 1, "晴天"))
        pockmonAdapter?.items?.add(PockmonBean(13925, "冥想花", "植物系", 74, 3, "绿",
                "88", "71", "43", 326, 161, 1, "晴天"))
        pockmonAdapter?.items?.add(PockmonBean(13925, "冥想花", "植物系", 74, 3, "蓝",
                "99", "78", "50", 335, 176, 1, "晴天"))

        pockmonAdapter?.items?.add(PockmonBean(13921, "莲草种子", "植物系", 17, 1, "紫",
                "11", "13", "13", 51, 65, "积蓄，寄生魔芽，毒种子"))
        pockmonAdapter?.items?.add(PockmonBean(13922, "莲草种子", "植物系", 31, 1, "紫",
                "17", "19", "19", 68, 79, "积蓄，寄生魔芽，毒种子"))
        pockmonAdapter?.items?.add(PockmonBean(13925, "根性草", "植物系", 31, 2, "紫",
                "30+1", "23+1", "19", 130, 104, "撒气，决胜攻击"))
        pockmonAdapter?.items?.add(PockmonBean(13930, "冥想花", "植物系", 31, 3, "紫",
                "36+1", "25+1", "23+1", 156, 104, 0, "冥想"))

        pockmonAdapter?.items?.add(PockmonBean(13926, "冥想花", "植物系", 20, 3, "蓝",
                "1", "1", "1", 121, 1, ""))
        pockmonAdapter?.items?.add(PockmonBean(13927, "冥想花", "植物系", 25, 3, "绿",
                "1", "1", "1", 135, 1, ""))
        pockmonAdapter?.items?.add(PockmonBean(13929, "冥想花", "植物系", 33, 3, "蓝",
                "1", "1", "1", 171, 1, ""))

        pockmonAdapter?.items?.add(PockmonBean(13030, "幼里朵", "植物系", 19, 1, "紫（稀有）",
                "14", "15", "20+6", 71, 81, "毒菱"))
        pockmonAdapter?.items?.add(PockmonBean(13031, "里朵叶", "植物系", 19, 2, "紫（稀有）",
                "20", "17", "21+6", 79, 89, "毒菱，再生，寄生魔芽，晴天，神秘草"))
        pockmonAdapter?.items?.add(PockmonBean(13031, "里朵叶", "植物系", 49, 2, "紫（稀有）",
                "48", "40", "50+15", 165, 165, "毒菱，再生，寄生魔芽，晴天，神秘草"))
        pockmonAdapter?.items?.add(PockmonBean(13040, "莲草鼬", "植物系", 1, 1, "蓝",
                "1", "1", "1", 22, 51, ""))
        pockmonAdapter?.items?.add(PockmonBean(13040, "叶尾鼬", "植物系", 29, 2, "绿",
                "22", "25", "25+7",
                137, 111, "撒气"))
        pockmonAdapter?.items?.add(PockmonBean(13040, "叶镰鼬", "植物系", 29, 3, "绿",
                "30", "26", "32+9",
                146, 110, "撒气"))
        pockmonAdapter?.items?.add(PockmonBean(13050, "闻香果", "植物系", 1, 1, "绿",
                "1", "1", "1",
                1, 1, ""))
        pockmonAdapter?.items?.add(PockmonBean(13051, "萝曼果", "植物系", 34, 1, "蓝",
                "1", "1", "1",
                156, 1, ""))
    }

    /**兽系*/
    fun initBeastSeries() {
        pockmonAdapter?.items?.add(PockmonBean(14001, "皮皮芒奇", "兽系", 15, 1, "绿",
                "11", "12", "11", 72, 67, ""))
        pockmonAdapter?.items?.add(PockmonBean(14010, "阿科泰克", "兽系", 37, 3, "紫",
                "53+7", "36", "52", 149, 114, ""))
        pockmonAdapter?.items?.add(PockmonBean(14020, "德德尼", "兽系", 26, 1, "紫",
                "26", "20+3", "23+6", 93, 83, ""))
        pockmonAdapter?.items?.add(PockmonBean(14030, "银希奇", "兽系", 26, 2, "蓝",
                "27", "26", "35", 70, 159, ""))
        pockmonAdapter?.items?.add(PockmonBean(14040, "帝王狮", "兽系", 1, 5, "绿",
                "1", "1", "1", 24, 71, -1, "炎热，决胜攻击"))
    }

    /**雷系*/
    fun initThunderSeries() {
        pockmonAdapter?.items?.add(PockmonBean(15001, "幼雷犬", "雷系", 19, 1, "蓝",
                "17", "11", "17", 81, 72, "成长"))
        pockmonAdapter?.items?.add(PockmonBean(15002, "幼雷犬", "雷系", 21, 1, "蓝",
                "18", "12", "18", 87, 74, "成长"))
        pockmonAdapter?.items?.add(PockmonBean(15003, "幻雷狼", "雷系", 21, 3, "蓝",
                "22", "16", "25", 105, 77, "忍耐，成长"))
        pockmonAdapter?.items?.add(PockmonBean(15004, "幻雷狼", "雷系", 40, 3, "蓝",
                "39", "27", "43", 165, 103, "忍耐，成长"))
        pockmonAdapter?.items?.add(PockmonBean(15010, "凯希", "雷系", 26, 3, "紫",
                "30", "27+4", "40+12", 97, 102, ""))

    }

    /**水系*/
    fun initWaterSeries() {
        pockmonAdapter?.items?.add(PockmonBean(16001, "波企鹅", "水系", 15, 1, "蓝",
                "15", "15", "13", 67, 75, "成长"))
        pockmonAdapter?.items?.add(PockmonBean(16002, "斗企鹅", "水系", 15, 3, "蓝",
                "19", "18", "14", 71, 83, "忍耐，成长"))
        pockmonAdapter?.items?.add(PockmonBean(16003, "斗企鹅", "水系", 22, 3, "蓝",
                "26", "24", "19", 91, 98, "忍耐，成长"))
        pockmonAdapter?.items?.add(PockmonBean(16004, "斗企鹅", "水系", 44, 3, "蓝",
                "48", "43", "33", 153, 149, ""))
        pockmonAdapter?.items?.add(PockmonBean(16005, "首领企鹅", "水系", 44, 4, "蓝",
                "50", "47", "38", 194, 165, ""))
        pockmonAdapter?.items?.add(PockmonBean(16006, "首领企鹅", "水系", 61, 4, "蓝",
                "68", "63", "57", 251, 234, "液态圈，浪潮，海啸，积蓄"))
        pockmonAdapter?.items?.add(PockmonBean(17000, "珀西尼", "水系", 9, 1, "蓝",
                "1", "1", "1", 59, 56, "治愈水"))
    }

    /**土系*/
    fun initSoilSeries() {
        pockmonAdapter?.items?.add(PockmonBean(17000, "岩米亚", "土系", 1, 3, "绿",
                "1", "1", "1", 23, 71, "沙暴，石化反击，撒气"))
        pockmonAdapter?.items?.add(PockmonBean(17001, "小岩熊", "土系", 5, 1, "绿",
                "1", "1", "1", 60, 55, "成长，撒气"))
    }

    /**飞行系*/

    fun initFlySeries() {
        pockmonAdapter?.items?.add(PockmonBean(18000, "格里姆斯", "飞行系", 26, 2, "绿",
                "24", "23", "31", 69, 95, "羽栖，暗影突袭"))
        pockmonAdapter?.items?.add(PockmonBean(18001, "格里芬", "飞行系", 26, 3, "绿",
                "33", "26", "33", 101, 102, "羽栖，暗影突袭"))
        pockmonAdapter?.items?.add(PockmonBean(18001, "格里芬", "飞行系", 79, 3, "绿",
                "97", "75", "75", 299, 154, "羽栖，暗影突袭"))
        pockmonAdapter?.items?.add(PockmonBean(18001, "格里芬", "飞行系", 79, 3, "蓝",
                "109", "85", "84", 335, 168, "羽栖，暗影突袭"))
    }

    /**金属系*/
    private fun initMetalSeries(){
        pockmonAdapter?.items?.add(PockmonBean(19000, "钢蜥龙", "金属系", 16, 2, "绿",
                "1", "1", "1", 92, 66, "金属利刃，成长"))
    }

    /**冰系*/
    private fun initIceSeries(){
        pockmonAdapter?.items?.add(PockmonBean(20000, "寒米亚", "冰系", 14, 3, "绿",
                "1", "1", "1", 85, 68, "冰雪，零度雪球，正义之拳"))
    }



    fun initSpinner() {

        val array: Array<String> = arrayOf("默认", "等级（低到高）", "等级（高到低）", "种类")

        //android.R.layout.simple_spinner_item为系统默认样式
        val adapter = ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, array)

        /*默认的的spinner控件下拉框会遮罩spinner本身，所以设置偏移量*/
        mSpinner.dropDownVerticalOffset = 35 * MyConstants.DP;

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        mSpinner.adapter = adapter

        mSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>, view: View, position: Int, l: Long) {

                LogT.i("position:" + position)
                when {
                    position == 0 -> Collections.sort(pockmonAdapter?.items) { o1, o2 -> o2.level - o1.level }
                    position == 1 -> Collections.sort(pockmonAdapter?.items)
                    position == 2 -> {
                        Collections.sort(pockmonAdapter?.items) { o1, o2 -> o2.level - o1.level }
                    }
                }
                pockmonAdapter?.notifyDataSetChanged()
            }

            override fun onNothingSelected(adapterView: AdapterView<*>) {

            }
        }
    }
}