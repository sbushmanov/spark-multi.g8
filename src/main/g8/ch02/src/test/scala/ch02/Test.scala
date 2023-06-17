package ch02

import org.scalatest.funsuite._

class Chapter_02 extends AnyFunSuite {
  test("Chapter_02 should start with capital C") {
    assert("chapter_o2".startsWith("C"))
  }
}
