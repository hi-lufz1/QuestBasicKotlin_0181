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

    // Check for null in conditions
    if (neverNull == null){
        println ("inferredNonNull is Null")
    }else{
        println("inferredNonNull is not NUll")
    }

    //Safe call oeprator
    println(neverNull.length) //18
    println(nullable?.length) //null

    //notNull doesn't accept null values
    fun strLength(notNull: String) : Int{
        return notNull.length
    }
    println(strLength(neverNull)) //18
}

fun main (){
    nullSafety()
}
