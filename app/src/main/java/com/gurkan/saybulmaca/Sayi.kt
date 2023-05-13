package com.gurkan.saybulmaca


class Sayi(sayi: String) {
    var isFound = false
    val sayiVal = sayi
    var _start = 0
    var _end = 0

    fun setLoc(tag: Int, isHorizontal: Boolean){
        _start = tag
        _end = if(isHorizontal) tag + sayiVal.length - 1 else tag + (sayiVal.length -1)*8
    }

    fun checkLoc(start: Int, end: Int, isHorizontal: Boolean): Boolean{

        if(isHorizontal){
            // horizontal case: check if word length and selected equal
            if(end - start != sayiVal.length - 1){
                return false
            }
        } else {
            // vertical case: check if word length and selected equal
            if((end - start)/8 != sayiVal.length - 1){
                return false
            }
        }
        if(_start == start && _end == end){
            return true
        }
        return false
    }
}