package com.bsu.transport.Train

import java.util
import java.util.ArrayList

import com.bsu.transport.Carriage.Carriage

class Train(carriagesList: ArrayList[Carriage] = new ArrayList[Carriage]) {

  def createTrain(): ArrayList[Carriage] = {
    for (i <- 1 to 8) {
      carriagesList.add(new Carriage())
    }
    carriagesList
  }

  def getPassengerAmount(): Int = {
    var passangerAmount = 0
    for (i <- 0 until carriagesList.size()) {
      passangerAmount += carriagesList.get(i).getPassangerAmount
    }
    passangerAmount
  }

  def getBaggageAmount(): Int = {
    var baggageAmount = 0
    for (i <- 0 until carriagesList.size()) {
      baggageAmount += carriagesList.get(i).getBaggageAmount
    }
    baggageAmount
  }

  def findCarriagesWithCertainPassengerAmount(passengerAmount: Int): ArrayList[Carriage] = {
    val list = new ArrayList[Carriage]()
    for (i <- 0 until carriagesList.size()) {
      if (carriagesList.get(i).getPassangerAmount() == passengerAmount) {
        list.add(carriagesList.get(i))
      }
    }
    if (list.isEmpty) {
      println("There is no carriages with such amount of passengers in the train")
    }
    list
  }

}
