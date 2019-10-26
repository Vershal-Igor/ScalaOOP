package CarriageTest

import com.bsu.transport.Carriage.BusinessCarriage
import org.scalatest.FlatSpec

class BusinessCarriageSpec extends FlatSpec {
  val carriage = new BusinessCarriage()

  "BusinessCarriage" should "return 6 passangerAmount" in {
    assert(carriage.getPassangerAmount() === 6)
  }

  "BusinessCarriage" should "return 12 baggageAmount" in {
    assert(carriage.getBaggageAmount() === 12)
  }

}