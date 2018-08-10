package com.linqinen708.pockmon.fragment.fuse

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.linqinen.library.utils.LogT
import com.linqinen708.pockmon.R
import com.linqinen708.pockmon.fragment.fuse.adapter.FuseAdapter
import com.linqinen708.pockmon.fragment.fuse.bean.FuseBean
import kotlinx.android.synthetic.main.fragment_external_biography.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FuseFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FuseFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class FuseFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_fuse, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        LogT.i("合宠界面")
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
         * @return A new instance of fragment FuseFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                FuseFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
        @JvmStatic
        fun newInstance() = FuseFragment()
    }

    private var mAdapter: FuseAdapter? = null

    private fun initRecyclerView() {
        mRecyclerView.layoutManager = LinearLayoutManager(context)
        mAdapter = FuseAdapter(context)
        mRecyclerView.adapter = mAdapter

    }

    private fun initData() {
        mAdapter?.items?.add(FuseBean("烈游隼","飞行系",1,"风风犬","风系",1,
                "格里姆斯","飞行系",2,1,1))
        mAdapter?.items?.add(FuseBean("风灵兔","风系",1,"青草蛇","草系",1,"青风蛇","风系",2,1,1))
        mAdapter?.items?.add(FuseBean("铁尾拉特","金属系",1,"可可鲨","金属系",1,"狡诈鳄","水系",2,1,1))
        mAdapter?.items?.add(FuseBean("拉珂拉克","土系",1,"土岩犬","土系",1,"银希奇","兽系",2,1,1))
        mAdapter?.items?.add(FuseBean("冰凌犬","冰系",1,"小蓝熊","冰系",1,"波企鹅","水系",2,1,1))
        mAdapter?.items?.add(FuseBean("火灵兔","火系",1,"赤目瞄","兽系",1,"火焰喵","火系",2,1,1))
        mAdapter?.items?.add(FuseBean("米露","水系",1,"布伊","水系",1,"章鱼琼斯","水系",2,1,1))
        mAdapter?.items?.add(FuseBean("青草蛇","草系",1,"莲叶种子","草系",1,"粉香果","草系",2,1,1))
        mAdapter?.items?.add(FuseBean("青风蛇","风系",2,"冰翼蛇","冰系",2,"洛伊格","暗系",3,1,1))
        mAdapter?.items?.add(FuseBean("火焰喵","火系",2,"炎绒艾普","火系",2,"","火系",3,15,8))
        mAdapter?.items?.add(FuseBean("狡诈鳄","水系",2,"章鱼琼斯","水系",2,"蓝冰龟","冰系",3,1,1))
        mAdapter?.items?.add(FuseBean("丘丘","光系",2,"银希奇","兽系",2,"月宫玉兔","光系",3,1,1))
        mAdapter?.items?.add(FuseBean("钢蜥龙","金属系",2,"叶尾鼬","草系",2,"","系",3,1,1))
        mAdapter?.items?.add(FuseBean("钢蜥龙","金属系",2,"拉珂克拉","土系",2,"","系",3,1,1))
        mAdapter?.items?.add(FuseBean("钢蜥龙","金属系",2,"四季鹿","草系",2,"","系",3,1,1))
        mAdapter?.items?.add(FuseBean("劳斯罗","土系",3,"铁狮","金属系",3,"地岩龙","土系",4,1,1))
        mAdapter?.items?.add(FuseBean("伯尼德拉","水系",3,"冰牙泰戈","冰系",3,"斯诺曼","冰系",4,1,1))
        mAdapter?.items?.add(FuseBean("月宫玉兔","光系",3,"灵明石猴","兽系",3,"斯诺曼","冰系",4,1,1))
        mAdapter?.items?.add(FuseBean("尼米亚","金属系",3,"暗影蝎","暗系",3,"亚密雷欧","暗系",4,1,1))
        mAdapter?.items?.add(FuseBean("库德莱茵","冰系",4,"德拉库拉","水系",4,"盖拉乌","水系",5,1,1))
        mAdapter?.items?.add(FuseBean("斯诺曼","冰系",4,"钢铁龙","金属系",4,"金刚库玛","金属系",5,1,1))
        mAdapter?.items?.add(FuseBean("皇冠角蟒","草系",4,"钢铁龙","金属系",4,"斯蒂姆","金属系",5,1,1))
        mAdapter?.items?.add(FuseBean("波士拉拢","金属系",4,"钢铁龙","金属系",4,"库鲁奥拉","金属系",5,1,1))
        mAdapter?.items?.add(FuseBean("兰德塔奇","土系",4,"亚密雷欧","暗系",4,"克鲁巴卡","金属系",5,1,1))
        mAdapter?.items?.add(FuseBean("美库西露","电系",5,"始祖大树","草系",5,"德瑞阿姆","草系",6,1,1))

    }
}
