package com.example.demoforbluetooth

import kotlin.math.max
import kotlin.text.StringBuilder

fun main() {
    Person.eat()
}

fun Person.sleep(time:String){
    println("$name sleep at $time")
}

fun doSomething(){
    println("do something")
}

fun normal(){
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val builder = StringBuilder()
    builder.append("start eating..")
    for (fruit in list){
        builder.append("eat $fruit")
    }
    builder.append("end eating..")
    val result = builder.toString()
    println(result)
}

fun apply() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val result = StringBuilder().apply {
        append("start eating ..\n")
        for (fruit in list){
            append("eat $fruit \n")
        }
        append("end eating..\n")
    }
    println(result.toString())
}

fun with(){
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val result = with(StringBuilder()) {
        append("start eating..")
        for (fruit in list){
            append("eat $fruit")
        }
        append("end eating..")
        toString()
    }
    println(result)
}

fun run(){
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val result = StringBuilder().run {
        append("start eating ..\n")
        for (fruit in list){
            append("eat $fruit\n")
        }
        append("end eating ..")
        toString()
    }
    println(result)
}

fun study(study: Study?) {
    study?.let {
        it.readBooks()
        it.doHomework()
    }
}

fun sum(p1: Int, p2: Int): Int {
    return p1 + p2;
}

//TODO 函数function
fun largerNum1(p1: Int, p2: Int): Int {
    return max(p1, p2)
}

fun largerNum2(p1: Int, p2: Int): Int = max(p1, p2)

fun largerNum3(p1: Int, p2: Int) = max(p1, p2)

//TODO if语句
fun largerNum4(p1: Int, p2: Int): Int {
    var result = 0
    if (p1 > p2) {
        result = p1
    } else {
        result = p2
    }
    return result
}

fun largerNum5(p1: Int, p2: Int): Int {
    val result =
        if (p1 > p2) {
            p1
        } else {
            p2
        }
    return result
}

fun largerNum6(p1: Int, p2: Int): Int {
    return if (p1 > p2) {
        p1
    } else {
        p2
    }
}

fun largerNum7(p1: Int, p2: Int): Int =
    if (p1 > p2) {
        p1
    } else {
        p2
    }

fun largerNum8(p1: Int, p2: Int): Int = if (p1 > p2) p1 else p2

//TODO when条件语句
fun getScore(name: String) = if (name == "Ami") {
    86
} else if (name == "Bob") {
    88
} else {
    0
}

fun getScore2(name: String) = when (name) {
    "Ami" -> 86
    "Bob" -> 88
    else -> 0
}

//when——类型匹配
fun checkNum(number: Number) {
    when (number) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number is not support")
    }
}

//when——不带参数
fun getScore3(name: String) = when {
    name == "Ami" -> 88
    name == "Bob" -> 99
    else -> 0
}


//TODO for循环语句


fun funFor() {
    //1..10 -> [1,10]
    for (i in 0..10) {
        println(i)
    }

    //0 until 10 -> [0,10),step=2 -> i+=2
    for (i in 0 until 10 step 2) {
        println(i)
    }

    //10 downto 1 -> [10,1]
    for (i in 10 downTo 1) {
        println(i)
    }
}







