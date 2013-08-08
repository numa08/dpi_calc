package models

trait DpiCalcuable{
  def dpi(width:Pixel, height:Pixel, inch:Double):Double = {
    val dpi = (width.pow + height.pow).sqrt.value / inch
    math.round(dpi)
  }
}
