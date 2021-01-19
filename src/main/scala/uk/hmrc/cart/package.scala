package uk.hmrc

package object cart {

  sealed trait Item {
    val costInPence: Int
  }

  case object Apple extends Item {
    override val costInPence: Int = 60
  }

  case object Orange extends Item {
    override val costInPence: Int = 25
  }

  sealed trait Offer
  case object NoPromo extends Offer
  case object BuyOneGetOneFree extends Offer
  case object ThreeForTwo extends Offer

  case class Promo(item: Item, offer:Offer)

}
