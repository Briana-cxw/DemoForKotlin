package com.example.demoforbluetooth

class Student(name: String, age: Int) : Person(name, age), Study {
    override fun readBooks() {
        println(name + "is reading books")
    }

    override fun doHomework() {
        println(name + "is doing homework")
    }
}