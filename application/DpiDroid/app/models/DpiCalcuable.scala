package models

trait DpiCalcuable{
  def dpi(width:Pixel, height:Pixel, inch:Double):Double = {
    (width.pow + height.pow).sqrt.value / inch
  }
}
