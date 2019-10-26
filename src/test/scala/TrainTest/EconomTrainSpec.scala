package TrainTest

import com.bsu.transport.Train.EconomTrain
import org.scalatest.FlatSpec

class EconomTrainSpec extends FlatSpec {
  val train = new EconomTrain()

  "EconomTrain" should "consist of 8 carriages" in {
    assert(train.createTrain().size() === 10)
  }

  "EconomTrain" should "has 250 passengerAmount" in {
    assert(train.getPassengerAmount() === 250)
  }

  "EconomTrain" should "has 200 baggageAmount" in {
    assert(train.getBaggageAmount() === 200)
  }

  "EconomTrain " should "find 5 carriages with 30 passangers" in {
    assert(train.findCarriagesWithCertainPassengerAmount(30).size() === 5)
  }

  "EconomTrain " should "find 5 carriages with 20 passangers" in {
    assert(train.findCarriagesWithCertainPassengerAmount(30).size() === 5)
  }

  "EconomTrain " should "not find carriages with 10 passangers" in {
    assert(train.findCarriagesWithCertainPassengerAmount(10).size() === 0)
  }

}