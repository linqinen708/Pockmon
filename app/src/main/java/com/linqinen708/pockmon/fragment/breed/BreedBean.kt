package com.linqinen708.pockmon.fragment.breed

/**
 * Created by Ian on 2018/8/13.
 */
class BreedBean(var name01: String, var series01: String, var stars01: Int, var gender01: Int,
                var name02: String, var series02: String, var stars02: Int, var gender02: Int,
                var result: String, var series: String, var stars: Int, var gender: Int,
                var vaporisation: Int, var money: String
) {
    fun showGender(gender: Int) =
            when (gender) {
                0 -> "母"
                1 -> "公"
                else ->"未知"
            }

}