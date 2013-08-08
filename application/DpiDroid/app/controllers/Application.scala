package controllers

import models._
import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    val width = 1136
    val height = 640
    val inch = 4
    val dpi = new Display(width, height, inch).dpi
    Ok(dpi.toString)
  }
  
}
