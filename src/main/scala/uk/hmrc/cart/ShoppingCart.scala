package uk.hmrc.cart

case class ShoppingCart(offers: Seq[Promo] = Seq.empty) {

  def scanItems(items: Seq[Item]):Int = items.map(_.costInPence).sum

}
