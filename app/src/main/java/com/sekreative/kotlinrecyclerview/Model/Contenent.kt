package com.sekreative.kotlinrecyclerview


/**
 * Created by Aayush on 02/05/2019
 */

class  Contenent{
    var imgResId : Int? = 0
    var name: String? = null
    var famous: String? = null


    constructor(imgResId: Int, name: String, famous: String) {
        this.imgResId = imgResId
        this.name = name
        this.famous = famous

    }
}