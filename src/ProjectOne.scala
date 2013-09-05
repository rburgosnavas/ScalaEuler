object ProjectOne extends App {

  def multOfThreeAndFive(n: Double): Double = {
    @annotation.tailrec
    def loop(next: Double, acc: Double): Double = {
      if (next < 0) acc
      else if (next % 3 == 0 || next % 5 == 0) loop(next - 1, acc + next)
      else loop(next - 1, acc)
    }
    loop(n - 1, 0)
  }

  def mult2(target: Int): Double = {
    def sumDivBy(n: Int): Double = {
      val p = (target - 1) / n
      n * (p * (p + 1)) / 2
    }
    sumDivBy(3) + sumDivBy(5) - sumDivBy(15)
  }

  override def main(args: Array[String]) {
    super.main(args)
    println("multOfThreeAndFive(1000) = " + multOfThreeAndFive(1000))
    println("mult2(1000) = " + mult2(1000))
  }
}
