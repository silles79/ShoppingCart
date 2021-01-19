package uk.hmrc.cart

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShoppingCartTest extends AnyFlatSpec with Matchers {

  it should "calculate cost 0 items" in {
    ShoppingCart.scanItems(Seq()) shouldBe 0
  }

  it should "calculate cost for 4 items" in {
    ShoppingCart.scanItems(Seq(Apple, Apple, Orange, Apple)) shouldBe 205
  }

  it should "calculate cost for 6 items" in {
    ShoppingCart.scanItems(Seq(Apple, Apple, Orange, Apple, Apple, Orange)) shouldBe 290
  }

}
