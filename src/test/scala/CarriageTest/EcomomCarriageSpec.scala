package CarriageTest

import com.bsu.transport.Carriage.EconomCarriage
import org.scalatest.FlatSpec

class EcomomCarriageSpec extends FlatSpec {
  val carriage = new EconomCarriage()

  "EconomCarriage" should "return 30 passangerAmount" in {
    assert(carriage.getPassangerAmount() === 30)
  }

  "EconomCarriage" should "return 20 baggageAmount" in {
    assert(carriage.getBaggageAmount() === 20)
  }

}