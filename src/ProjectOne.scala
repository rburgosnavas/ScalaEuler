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

  override def main(args: Array[String]) {
    super.main(args)
    println("multOfThreeAndFive(1000) = " + multOfThreeAndFive(1000))
  }

}
