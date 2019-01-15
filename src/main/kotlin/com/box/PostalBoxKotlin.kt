package com.boxkotlin

import java.util.*


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("Please enter object's length : ")
    val length = scanner.nextFloat()
    print("Please enter object's width : ")
    val width = scanner.nextFloat()
    print("Please enter object's height : ")
    val height = scanner.nextFloat()

    print(when {
        Box3().validate(length, width, height) -> "${Box3().name}"
        Box5().validate(length, width, height) -> "${Box5().name}"
        else -> "No suitable box."
    })
}