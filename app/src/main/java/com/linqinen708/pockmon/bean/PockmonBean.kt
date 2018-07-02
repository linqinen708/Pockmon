package com.linqinen708.pockmon.bean

/**
 * Created by 林 on 2018/5/22.
 */
class PockmonBean(var id: Int?, var name: String?, var level: Int = 0, var quality: String?,
                  var strength: String?, var defense: String?, var speed: String?
                  , var hp: Int = 0, var mp: Int = 0
) : Comparable<PockmonBean> {
    override fun compareTo(other: PockmonBean): Int {
        return level - other.level
    }
//    override fun compare(p0: PockmonBean?, p1: PockmonBean?): Int {
//
//        return p0?.level!! - p1?.level!!
//    }


    constructor(id: Int?, name: String?, level: Int = 0, stars: Int, quality: String?,
                strength: String?, defense: String?, speed: String?
                , hp: Int = 0, mp: Int = 0) : this(id, name, level, quality, strength, defense, speed, hp, mp)




}