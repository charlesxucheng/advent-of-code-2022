package aoc
package common

import scala.io.Source

object Utils {

  def loadData[T](filename: String)(parser: Iterator[String] => List[T]): List[T] = {
    val source = Source.fromFile(filename)
    try {
      parser(source.getLines())
    } finally source.close()
  }
}

object NumberList {
  def parseInput(delimiter: String)(lines: Iterator[String]): List[List[Int]] =
    lines
      .map(_.split(delimiter)
        .map(_.toInt)
        .toList)
      .toList
}
