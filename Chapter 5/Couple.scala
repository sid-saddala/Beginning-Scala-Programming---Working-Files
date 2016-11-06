case class Couple[A, B](first:A, second:B) {
  def swap:Couple[B, A] = new Couple(second, first)
}
