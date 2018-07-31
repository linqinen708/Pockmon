package com.linqinen708.pockmon.bean

/**
 * Created by 林 on 2018/5/22.
 */
class PockmonBean(var id: Int?, var name: String?, var series: String?, var level: Int = 0, var stars: Int, var quality: String?,
                  var strength: String?, var defense: String?, var speed: String?
                  , var hp: Int = 0, var mp: Int = 0, var ps: String?
) : Comparable<PockmonBean> {
    override fun compareTo(other: PockmonBean): Int {
        return level - other.level
    }

//    fun compareToReverse(other: PockmonBean): Comparable<PockmonBean> {
//
//        Comparable<PockmonBean> { pockmonBean: PockmonBean -> 0  }
//
//        return other.level - level
//    }
//    override fun compare(p0: PockmonBean?, p1: PockmonBean?): Int {
//
//        return p0?.level!! - p1?.level!!
//    }


    var gender: Int = -1


    constructor(id: Int?, name: String?, series: String?, level: Int = 0, stars: Int, quality: String?,
                strength: String?, defense: String?, speed: String?
                , hp: Int = 0, mp: Int = 0, gender: Int?, ps: String) :
            this(id, name, series, level, stars, quality, strength, defense, speed, hp, mp, ps) {

        this.gender = gender!!
    }
//    constructor(id: Int?, name: String?, series: String?,level: Int = 0, stars: Int, quality: String?,
//                strength: String?, defense: String?, speed: String?
//                , hp: Int = 0, mp: Int = 0,ps:String) :
//            this(id, name,series, level, stars,quality, strength, defense, speed, hp, mp,ps)

    constructor(id: Int?, name: String?, level: Int = 0, stars: Int, quality: String?,
                strength: String?, defense: String?, speed: String?
                , hp: Int = 0, mp: Int = 0, ps: String) :
            this(id, name, null, level, stars, quality, strength, defense, speed, hp, mp, ps)


    constructor(id: Int?, name: String?, level: Int = 0, quality: String?, strength: String?, defense: String?, speed: String?
                , hp: Int = 0, mp: Int = 0)
            : this(id, name, null, level, 0, quality, strength, defense, speed, hp, mp, null)


    constructor(id: Int?, name: String?, level: Int = 0, stars: Int, quality: String?,
                strength: String?, defense: String?, speed: String?
                , hp: Int = 0, mp: Int = 0) :
            this(id, name, null, stars, level, quality, strength, defense, speed, hp, mp, null)


    public fun getGenderInfo() {
        when (gender) {
            0 -> "母"
            1 -> "公"
            else -> "未知"
        }
    }


}