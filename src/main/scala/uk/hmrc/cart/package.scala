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

  sealed trait Offer {
    def costForNItems(item:Item, number: Int): Int
  }

  case object NoPromo extends Offer {
    override def costForNItems(item:Item, number: Int): Int = item.costInPence * number
  }

  case object BuyOneGetOneFree extends Offer {
    override def costForNItems(item:Item, number: Int): Int = item.costInPence * (number / 2) + item.costInPence * (number % 2)
  }

  case object ThreeForTwo extends Offer {
    override def costForNItems(item:Item, number: Int): Int = 2 * item.costInPence * (number / 3) + item.costInPence * (number % 3)
  }

  case class Promo(item: Item, offer:Offer)

}
