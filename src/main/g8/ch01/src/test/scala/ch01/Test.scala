package ch01

import org.scalatest.funsuite._

class Ch01Spec extends AnyFunSuite {
  test("Chapter_01 should start with capital C") {
    assert("Chapter_01".startsWith("C"))
  }
}
