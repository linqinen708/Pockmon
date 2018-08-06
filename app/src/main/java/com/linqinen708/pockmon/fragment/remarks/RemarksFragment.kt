package com.linqinen708.pockmon.fragment.remarks

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.linqinen708.pockmon.R
import com.linqinen708.pockmon.fragment.remarks.adapter.RemarksAdapter
import com.linqinen708.pockmon.fragment.remarks.bean.RemarkBean
import kotlinx.android.synthetic.main.fragment_external_biography.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [RemarksFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [RemarksFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class RemarksFragment : Fragment() {
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_remarks, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        initData()
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
         * @return A new instance of fragment RemarksFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                RemarksFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
        @JvmStatic
        fun newInstance() = RemarksFragment()
    }

    private var mAdapter: RemarksAdapter? = null

    fun initRecyclerView() {
        mRecyclerView.layoutManager = LinearLayoutManager(context)
        mAdapter = RemarksAdapter(context)
        mRecyclerView.adapter = mAdapter

    }

    fun initData() {
        mAdapter?.items?.add(RemarkBean(1,"合体宠物品质越高，合体后产生的宠物品质高低几率也会越高"))
        mAdapter?.items?.add(RemarkBean(2,"植物->水->火->植物、暗，飞行->风->土->雷->飞行，金属->冰->龙->光、暗->光、暗，野兽->野兽，暗->野兽、金属->->->->->"))
        mAdapter?.items?.add(RemarkBean(3,"宠物稀有度：白-绿-蓝-紫-橙-红"))
        mAdapter?.items?.add(RemarkBean(4,"两只不同性别的宠物（雄、雌）才可以进行繁育后代"))
        mAdapter?.items?.add(RemarkBean(5,"同一种宠物不同性别，天生属性会有一定差异，部分种类宠物只有单性别（即雄性或雌性）才可以进化"))
        mAdapter?.items?.add(RemarkBean(6,"次世代宠物一定几率可以获得强力的繁育天赋"))
        mAdapter?.items?.add(RemarkBean(7,"进入秘境需要使用不同的秘境挑战券，战胜秘境中的首领，有几率可以获得稀有道具奖励"))
        mAdapter?.items?.add(RemarkBean(8,"魅惑状态：该状态下宠物提升被捕获几率（野生宠物），不可使用道具，减少逃跑几率，降低自身力量"))
        mAdapter?.items?.add(RemarkBean(9,"石化状态：该状态下，宠物不能攻击，不能替换，受到伤害降低，不能逃跑"))
        mAdapter?.items?.add(RemarkBean(10,"混乱状态：该状态下，因为思维混乱一定几率对自身造成一次普通攻击伤害"))
//        mAdapter?.items?.add("")
//        mAdapter?.items?.add("")

    }

}
