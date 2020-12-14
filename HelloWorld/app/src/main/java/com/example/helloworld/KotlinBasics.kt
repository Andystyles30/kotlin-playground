package com.example.helloworld

fun main(){
    var myName = "Denis"
    // TODO: Add new functionality
    // immutable with val
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    print("Hello $myName")
    print("First character $firstCharInStr")
    print("Last character $lastCharInStr")
}