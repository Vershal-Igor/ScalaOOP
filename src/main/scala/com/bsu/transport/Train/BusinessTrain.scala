package com.bsu.transport.Train

import java.util.ArrayList

import com.bsu.transport.Carriage.{BusinessCarriage, Carriage}

class BusinessTrain(carriagesList: ArrayList[Carriage] = new ArrayList[Carriage]) extends Train(carriagesList: ArrayList[Carriage]) {

  override def createTrain(): ArrayList[Carriage] = {
    for (i <- 1 to 5) {
      carriagesList.add(new BusinessCarriage())
    }
    carriagesList
  }

}
