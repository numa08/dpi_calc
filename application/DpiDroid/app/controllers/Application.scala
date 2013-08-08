package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    val width = 1136
    val height = 640
    val inch = 4
    val dpi = math.sqrt(math.pow(1136, 2) + math.pow(640, 2) ) / inch
    Ok(dpi.toString)
  }
  
}
