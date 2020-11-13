package com.example.myapplication

class Count {
    var result = 0.0

    fun CountNumber (p:Int, l:Int):Int{
        this.result = (p+l).toDouble()
        return p+l
    }
}