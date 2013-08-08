package models

case class Pixel(value : Double){
  
  def pow = {
    Pixel(math.pow(value, 2))
  }

  def +(target : Pixel) = {
    Pixel(value + target.value)
  }

  def sqrt = {
    Pixel(math.sqrt(value))
  }
}
