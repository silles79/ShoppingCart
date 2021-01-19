package uk.hmrc.cart

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShoppingCartTest extends AnyFlatSpec with Matchers {

  it should "calculate cost for items" in {

    ShoppingCart.scanItems(Seq(Apple, Apple, Orange, Apple)) shouldBe 205

  }

}
