package models

case class Dpi(value : Double){
  
  def pow = {
    Dpi(math.pow(value, 2))
  }

  def +(target : Dpi) = {
    Dpi(value + target.value)
  }

  def sqrt = {
    Dpi(math.sqrt(value))
  }
}
