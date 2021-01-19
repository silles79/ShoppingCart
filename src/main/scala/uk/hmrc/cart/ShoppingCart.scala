package uk.hmrc.cart

case class ShoppingCart(offers: Seq[Promo] = Seq.empty) {

  def scanItems(items: Seq[Item]):Int =
    items
      .groupBy(identity)
      .map { case (item, items) =>
        val offer = offers.find(offer => offer.item == item).map(_.offer).getOrElse(NoPromo)
        offer.costForNItems(item, items.size)
      }.sum

}
