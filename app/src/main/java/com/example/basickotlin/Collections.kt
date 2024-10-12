package com.example.basickotlin

fun ContohList(){
    println("=== List ====")
    //read only
    val readOnlyAbjad = listOf("A","B","C")
    println(readOnlyAbjad)

    //mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square","Triangle")

    //Add data
    shape.add("Circle")
    println(shape)

    //Delete data dari mutable
    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    // Update data
    shape[0] = "Oval"
    println(shape)

    //List read only
    val shapeLocked: List<String> = shape
    println(shapeLocked)

}

fun main (){
    ContohList()
}