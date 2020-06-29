package com.example.day2basicoop

//open class Car()
abstract class Car()
{
    open var roda = 2
    private var warna = "Merah"

    fun changeSpeed(speed: Int) : Int
    {
        println("Speed = $speed")
        return speed
    }
    fun changeSpeed(speed: Double) : Double
    {
        println("Speed = $speed")
        return speed
    }

    open fun startEngine()
    {
        println("Car Engine Started")
    }

    fun getCekWarna(): String
    {
        println("Warna = $warna")
        return warna
    }

    fun setGantiWarna()
    {
        warna = "Kuning"
        println("Warna = $warna")
    }

    abstract fun gantiRoda()
/*
    fun main()
    {
        val mobil = Car()
        mobil.changeSpeed(5)     //5
        mobil.changeSpeed(5.5)   //5.5

        val sedan = Sedan()
        mobil.startEngine()     //Car Engine Started
        sedan.startEngine()    //Sedan Engine Started

        sedan.ubahWarna()
        sedan.gantiRoda()
    }

 */
}