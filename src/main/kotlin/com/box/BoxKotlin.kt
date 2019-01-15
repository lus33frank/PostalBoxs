package com.boxkotlin


open class BoxKotlin(var length: Float, var width: Float, var height: Float,
                     var name: String = "") : BoxInterfaceKotlin {


    override fun validate(length: Float, width: Float, height: Float) : Boolean {
        return (this.length > length && this.width > width && this.height > height)
    }

}

class Box3 : BoxKotlin(23.0f, 14.0f, 13.0f, "Box3")

class Box5 : BoxKotlin(39.5f, 27.5f, 23.0f, "Box5")