package uk.hmrc.cart

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class OfferTest extends AnyFlatSpec with Matchers {

  it should "calculate cost for no-promo" in {
    NoPromo.costForNItems(Apple, 3) shouldBe Apple.costInPence * 3
  }

  it should "calculate cost for buy 1 get 1 free offer" in {
    BuyOneGetOneFree.costForNItems(Apple, 5) shouldBe Apple.costInPence * 2 + Apple.costInPence
  }

  it should "calculate cost for 3 for 2 offer" in {
    ThreeForTwo.costForNItems(Apple, 7) shouldBe 2 * 2 * Apple.costInPence + 1 * Apple.costInPence
  }
}
