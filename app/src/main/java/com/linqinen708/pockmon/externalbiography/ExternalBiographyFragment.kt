package com.linqinen708.pockmon.externalbiography

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

    fun initData() {
        /**风系*/
        pockmonAdapter?.items?.add(PockmonBean(10001, "绵绵", "风系",15, 1, "蓝", "12", "8", "9", 108, 68,"血量特别多"))
        /**暗系*/
        pockmonAdapter?.items?.add(PockmonBean(11001, "暗灵兔", "暗系",29, 1, "绿", "20", "18", "24", 70, 72,""))
        pockmonAdapter?.items?.add(PockmonBean(11010, "影绒艾普", "暗系",15, 2, "绿", "18", "17", "13", 93, 74,""))

        /**火系*/
        pockmonAdapter?.items?.add(PockmonBean(12001, "宝宝龙", "火系",17, 1, "蓝", "17", "14", "11+3", 56, 63,"积蓄，撒气"))
        pockmonAdapter?.items?.add(PockmonBean(12002, "宝宝龙", "火系",30, 1, "蓝", "27", "22", "16+4", 79, 73,"积蓄，撒气"))
        pockmonAdapter?.items?.add(PockmonBean(12003, "火蜥龙", "火系",19, 2, "蓝", "25", "19", "14+4", 78, 73,""))
        pockmonAdapter?.items?.add(PockmonBean(12004, "火蜥龙", "火系",30, 2, "蓝", "36", "27", "19+5", 108, 86,""))

        /**草系*/
        pockmonAdapter?.items?.add(PockmonBean(13001, "妙蛙种子", "植物系",13, 1, "紫", "16", "14", "15", 96, 93,"成长"))
        pockmonAdapter?.items?.add(PockmonBean(13002, "妙蛙草", "植物系",13, 3, "紫", "18", "16", "17", 106, 97,"冥想"))
        pockmonAdapter?.items?.add(PockmonBean(13003, "妙蛙草", "植物系",22, 3, "紫", "27", "24", "26", 153, 119,"冥想"))
        pockmonAdapter?.items?.add(PockmonBean(13004, "妙蛙草", "植物系",30, 3, "紫", "36", "27", "29", 108, 86,"冥想"))
        pockmonAdapter?.items?.add(PockmonBean(13010, "青草蛇", "植物系",1, 1, "蓝", "10", "10", "10", 10, 8,"积蓄"))
        pockmonAdapter?.items?.add(PockmonBean(13020, "莲草种子", "植物系",15, 1, "绿", "10", "12", "10", 51, 62,"积蓄，寄生魔芽"))
        pockmonAdapter?.items?.add(PockmonBean(13021, "莲草种子", "植物系",17, 1, "紫", "11", "13", "13", 51, 65,"积蓄，寄生魔芽"))
        pockmonAdapter?.items?.add(PockmonBean(13022, "莲草种子", "植物系",31, 1, "紫", "17", "19", "19", 68, 79,"积蓄，寄生魔芽"))
        pockmonAdapter?.items?.add(PockmonBean(13023, "根性草", "植物系",31, 2, "紫", "30+1", "23+1", "19", 130, 104,""))
        pockmonAdapter?.items?.add(PockmonBean(13024, "冥想花", "植物系",31, 3, "紫", "36+1", "25+1", "23+1", 156, 104,""))

        /**兽系*/
        pockmonAdapter?.items?.add(PockmonBean(14001, "皮皮芒奇", "兽系",15, 1, "绿", "11", "12", "11", 72, 67,""))
        pockmonAdapter?.items?.add(PockmonBean(14010, "阿科泰克", "兽系",37, 3, "紫", "53+7", "36", "52", 149, 114,""))
        pockmonAdapter?.items?.add(PockmonBean(14020, "德德尼", "兽系",26, 1, "紫", "26", "20+3", "23+6", 93, 83,""))

        /**雷系*/
        pockmonAdapter?.items?.add(PockmonBean(15001, "幼雷犬", "雷系",19, 1, "蓝", "17", "11", "17", 81, 72,"成长"))
        pockmonAdapter?.items?.add(PockmonBean(15002, "幼雷犬", "雷系",21, 1, "蓝", "18", "12", "18", 87, 74,"成长"))
        pockmonAdapter?.items?.add(PockmonBean(15003, "幻雷狼", "雷系",21, 3, "蓝", "22", "16", "25", 105, 77,"忍耐，成长"))
        pockmonAdapter?.items?.add(PockmonBean(15010, "凯希", "雷系",26, 3, "紫", "30", "27+4", "40+12", 97, 102,""))

        /**水系*/
        pockmonAdapter?.items?.add(PockmonBean(16001, "波企鹅", "水系",15, 1, "蓝", "15", "15", "13", 67, 75,"成长"))
        pockmonAdapter?.items?.add(PockmonBean(16002, "斗企鹅", "水系",15, 3, "蓝", "19", "18", "14", 71, 83,"忍耐，成长"))
        pockmonAdapter?.items?.add(PockmonBean(16003, "斗企鹅", "水系",22, 3, "蓝", "26", "24", "19", 91, 98,"忍耐，成长"))
        pockmonAdapter?.items?.add(PockmonBean(16004, "斗企鹅", "水系",44, 3, "蓝", "48", "43", "33", 153, 149,""))
        pockmonAdapter?.items?.add(PockmonBean(16005, "首领企鹅", "水系",44, 3, "蓝", "50", "47", "38", 194, 165,""))

    }

    fun initSpinner() {

        val array: Array<String> = arrayOf("默认", "等级（低到高）", "等级（高到低）","种类")

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
                    position == 1 -> Collections.sort(pockmonAdapter?.items)
                    position == 2 -> {
                        Collections.sort(pockmonAdapter?.items) { o1, o2 -> o2.level - o1.level }
                    }

                }
            }

            override fun onNothingSelected(adapterView: AdapterView<*>) {

            }
        }
    }
}