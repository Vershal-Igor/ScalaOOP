package CarriageTest

import com.bsu.transport.Carriage.Carriage
import org.scalatest.FlatSpec

class CarriageSpec extends FlatSpec {
  val carriage = new Carriage()

  "Carriage" should "return 20 passangerAmount" in {
    assert(carriage.getPassangerAmount() === 20)
  }

  "Carriage" should "return 20 baggageAmount" in {
    assert(carriage.getBaggageAmount() === 20)
  }

}