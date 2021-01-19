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

}
