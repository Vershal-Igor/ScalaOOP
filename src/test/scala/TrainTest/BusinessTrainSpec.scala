package TrainTest

import com.bsu.transport.Train.BusinessTrain
import org.scalatest.FlatSpec

class BusinessTrainSpec extends FlatSpec {
  val train = new BusinessTrain()

  "BusinessTrain" should "consist of 5 carriages" in {
    assert(train.createTrain().size() === 5)
  }

  "BusinessTrain" should "has 30 passengerAmount" in {
    assert(train.getPassengerAmount() === 30)
  }

  "BusinessTrain" should "has 60 baggageAmount" in {
    assert(train.getBaggageAmount() === 60)
  }

  "BusinessTrain " should "find 5 carriages with 6 passangers" in {
    assert(train.findCarriagesWithCertainPassengerAmount(6).size() === 5)
  }

  "BusinessTrain " should "not find carriages with 10 passangers" in {
    assert(train.findCarriagesWithCertainPassengerAmount(10).size() === 0)
  }

}