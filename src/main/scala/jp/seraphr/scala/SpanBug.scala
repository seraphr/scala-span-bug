package jp.seraphr.scala

/**
  */
object SpanBug extends App {
  def test(thunk: => Boolean, m: String): Unit = if(!thunk) throw new RuntimeException(m)

  val (tLeft, tRight) = Iterator(1,2,3).span(_ => true)
  test(tRight.hasNext == false, "tRight.hasNext shouldBe false")
  test(tLeft.hasNext == true, "tLeft.hasNext shouldBe true")
}
