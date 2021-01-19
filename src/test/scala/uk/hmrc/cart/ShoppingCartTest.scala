package uk.hmrc.cart

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShoppingCartTest extends AnyFlatSpec with Matchers {

  val cartNoPromo = ShoppingCart()
  val cartWithPromo = ShoppingCart(
    Seq(
      Promo(item = Apple, offer = BuyOneGetOneFree),
      Promo(item = Orange, offer = ThreeForTwo)
    )
  )

  it should "calculate cost 0 items" in {
    cartNoPromo.scanItems(Seq()) shouldBe 0
  }

  it should "calculate cost for 4 items" in {
    cartNoPromo.scanItems(Seq(Apple, Apple, Orange, Apple)) shouldBe 205
  }

  it should "calculate cost for 6 items" in {
    cartNoPromo.scanItems(Seq(Apple, Apple, Orange, Apple, Apple, Orange)) shouldBe 290
  }

  it should "calculate cost for 7 items with promotion" in {
    cartWithPromo.scanItems(Seq(Apple, Orange, Apple, Apple, Orange, Orange, Orange)) shouldBe 120 + 75
  }

}
