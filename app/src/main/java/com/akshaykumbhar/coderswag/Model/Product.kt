package com.akshaykumbhar.coderswag.Model

class Product(val title : String, val Price : String, val image : String){
    override fun toString(): String {
        return title
    }
}