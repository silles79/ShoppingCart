package uk.hmrc.cart

case object ShoppingCart {

  def scanItems(items: Seq[Item]):Int = items.map(_.costInPence).sum

}
