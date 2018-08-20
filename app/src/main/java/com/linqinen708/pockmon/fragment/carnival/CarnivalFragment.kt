package com.linqinen708.pockmon.fragment.carnival

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
 * [CarnivalFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [CarnivalFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class CarnivalFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_carnival, container, false)
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
         * @return A new instance of fragment CarnivalFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                CarnivalFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    private var mAdapter: CarnivalAdapter? = null

    private fun initRecyclerView() {
        mRecyclerView.layoutManager = LinearLayoutManager(context)
        mAdapter = CarnivalAdapter(context)
        mRecyclerView.adapter = mAdapter

    }

    private fun initData() {
        mAdapter?.items?.add(CarnivalBean(
                1,4,9.4f,"",
                2,1,6.0f,"",
                4,4,4.5f,"",
                3,4,5.1f,""))
        mAdapter?.items?.add(CarnivalBean(
                1,1,4.3f,"陆行鸟",
                2,4,5.1f,"龙",
                4,4,6.2f,"飞马",
                3,2,3.9f,"火龙"))
        mAdapter?.items?.add(CarnivalBean(
                4,4,1.6f,"陆行鸟",
                1,1,7.4f,"龙",
                3,4,4.8f,"火龙",
                2,2,7.0f,"植物"))
        mAdapter?.items?.add(CarnivalBean(
                3,3,5.6f,"陆行鸟",
                4,4,4.6f,"乘龙",
                2,2,7.1f,"鸟",
                1,1,7.8f,"岩龙"))
        mAdapter?.items?.add(CarnivalBean(
                1,4,9.3f,"火龙",
                3,1,2.7f,"龙",
                4,4,2.3f,"植物",
                2,2,3.8f,"乘龙"))
        mAdapter?.items?.add(CarnivalBean(
                4,4,2.1f,"植物",
                1,3,8.9f,"龙",
                2,2,5.8f,"植物",
                3,1,3.1f,"乘龙"))
        mAdapter?.items?.add(CarnivalBean(
                1,4,10f,"岩龙",
                2,2,9.5f,"鸟",
                4,1,4.0f,"乘龙",
                3,3,6.4f,"鸟"))


    }
}
