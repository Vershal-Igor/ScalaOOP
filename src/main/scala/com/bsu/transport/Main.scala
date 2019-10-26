package com.bsu.transport

import com.bsu.transport.Carriage.{BusinessCarriage}
import com.bsu.transport.Train.{BusinessTrain}

object Main {

  def main(args: Array[String]) {
    val carriage = new BusinessCarriage()

    println("Passenger amount in carriage is:" + carriage.getPassangerAmount())
    println("Baggage amount in carriage is:" + carriage.getBaggageAmount())

    val train = new BusinessTrain()
    train.createTrain()

    println("Passenger amount in train is:" + train.getPassengerAmount())
    println("Baggage amount in train is:" + train.getBaggageAmount())

    println(train.findCarriagesWithCertainPassengerAmount(6))
  }
}
