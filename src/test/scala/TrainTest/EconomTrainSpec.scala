package TrainTest

import com.bsu.transport.Train.EconomTrain
import org.scalatest.FlatSpec

class EconomTrainSpec extends FlatSpec {
  val train = new EconomTrain()

  "Train" should "consist of 8 carriages" in {
    assert(train.createTrain().size() === 10)
  }

  "Train" should "has 250 passengerAmount" in {
    assert(train.getPassengerAmount() === 250)
  }

  "Train" should "has 200 baggageAmount" in {
    assert(train.getBaggageAmount() === 200)
  }

}