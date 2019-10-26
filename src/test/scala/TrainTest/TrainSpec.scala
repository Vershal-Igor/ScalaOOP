package TrainTest

import com.bsu.transport.Train.Train
import org.scalatest.FlatSpec

class TrainSpec extends FlatSpec {
  val train = new Train()

  "Train" should "consist of 8 carriages" in {
    assert(train.createTrain().size() === 8)
  }

  "Train" should "has 160 passengerAmount" in {
    assert(train.getPassengerAmount() === 160)
  }

  "Train" should "has 160 baggageAmount" in {
    assert(train.getBaggageAmount() === 160)
  }

}
