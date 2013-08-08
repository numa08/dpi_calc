package models

case class Dpi(value : Double){
  
  def pow = {
    math.pow(value, 2)
  }

  def +(target : Dpi) = {
    value + target.value
  }

  def sqrt = {
    math.sqrt(value)
  }
}
