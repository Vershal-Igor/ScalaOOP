package TrainTest

import com.bsu.transport.Train.BusinessTrain
import org.scalatest.FlatSpec

class BusinessTrainSpec extends FlatSpec {
  val train = new BusinessTrain()

  "Train" should "consist of 5 carriages" in {
    assert(train.createTrain().size() === 5)
  }

  "Train" should "has 30 passengerAmount" in {
    assert(train.getPassengerAmount() === 30)
  }

  "Train" should "has 60 baggageAmount" in {
    assert(train.getBaggageAmount() === 60)
  }

}