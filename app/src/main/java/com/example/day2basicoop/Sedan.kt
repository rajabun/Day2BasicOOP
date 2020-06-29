package com.example.day2basicoop

class Sedan: Car(), SportCar
{
    override var roda = 4

    override fun startEngine()
    {
        println("Sedan Engine Started")
    }

    fun ubahWarna()
    {
        getCekWarna()
        setGantiWarna()
    }

    override fun gantiRoda()
    {
        roda = 8
        println("Roda = $roda")
    }

    override fun gantiMesin()
    {
        println("Mesin Diganti Mesin Ferrari")
    }

}