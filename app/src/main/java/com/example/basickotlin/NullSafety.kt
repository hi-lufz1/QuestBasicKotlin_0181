package com.example.basickotlin

fun nullSafety() {
    // neverNull has string Type
    var neverNull: String = "This can't be null"

    //Throws a compiler error
    // neverNull = null

    //nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    //This is OK
    nullable = null


}



fun main (){
    nullSafety()
}
