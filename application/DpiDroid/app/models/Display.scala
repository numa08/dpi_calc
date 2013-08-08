package models

class Display(width:Pixel, height:Pixel, inch:Double) extends DpiCalcuable{
  
  def dpi:Double = {
    dpi(width, height, inch)
  }
}
