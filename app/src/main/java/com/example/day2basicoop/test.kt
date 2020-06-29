package com.example.day2basicoop

fun main()
{
    val sedan = Sedan()
    sedan.startEngine()    //Sedan Engine Started

    sedan.changeSpeed(5)     //5
    sedan.changeSpeed(5.5)   //5.5

    sedan.ubahWarna()
    sedan.gantiRoda()
    sedan.gantiMesin()

    println(Movement.GoForward)
    println(Movement.values().size)
    println(Movement.valueOf("Brake"))

    for (enum in Movement.values())
    {
        println(enum.name)
    }
}