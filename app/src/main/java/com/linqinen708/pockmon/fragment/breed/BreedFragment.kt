package com.linqinen708.pockmon.fragment.breed

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.linqinen708.pockmon.R
import kotlinx.android.synthetic.main.fragment_external_biography.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [BreadFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [BreadFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class BreadFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_bread, container, false)
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
         * @return A new instance of fragment BreadFragment.
         */
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                BreadFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
        @JvmStatic
        fun newInstance() = BreadFragment()
    }

    private var mAdapter: BreedAdapter? = null

    private fun initRecyclerView() {
        mRecyclerView.layoutManager = LinearLayoutManager(context)
        mAdapter = BreedAdapter(context)
        mRecyclerView.adapter = mAdapter

    }

    private fun initData() {
        mAdapter?.items?.add(BreedBean(
                "珀尼德拉","水系",3,0,
                "露达鲁","水系",3,1,
                "珀西尼","水系",1,0,1,"50,000"))
        mAdapter?.items?.add(BreedBean(
                "加拉露","水系",2,0,
                "珀尼德拉","水系",3,1,
                "珀西尼","水系",1,1,1,"50,000"))
        mAdapter?.items?.add(BreedBean(
                "岩米亚","土系",3,0,
                "露达鲁","水系",3,1,
                "尼米亚","金属系",3,1,1,"50,000"))
        mAdapter?.items?.add(BreedBean(
                "浮游龙","风系",4,0,
                "浮游龙","风系",4,1,
                "浮游龙","风系",4,0,15,"114，650"))



        mAdapter?.items?.add(BreedBean(
                "珀尼德拉","水系",3,1,
                "奇塔","兽系",1,0,
                "","",1,1,1,"1"))
        mAdapter?.items?.add(BreedBean(
                "珀尼德拉","水系",3,1,
                "皮皮芒奇","兽系",1,0,
                "","",1,1,1,"1"))
        mAdapter?.items?.add(BreedBean(
                "珀尼德拉","水系",3,1,
                "火焰犬","火系",1,0,
                "","",1,1,1,"1"))

    }
}
