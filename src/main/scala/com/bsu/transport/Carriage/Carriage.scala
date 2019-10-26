package com.bsu.transport.Carriage

class Carriage(var comfortLevel: String = "STANDARD", var passangerAmount: Int = 20, var baggageAmount: Int = 20) {

  def printCarriage(): Unit = {
    println("comfortLevel:" + comfortLevel +
      ", passangerAmount:" + passangerAmount +
      ", baggageAmount:" + baggageAmount)
  }

  def getPassangerAmount(): Int = {
    passangerAmount
  }

  def getBaggageAmount(): Int = {
    baggageAmount
  }

  def getComfortLevel(): String = {
    comfortLevel
  }

  override def toString = s"Carriage($comfortLevel, $passangerAmount, $baggageAmount)"
}


