package controllers

import models._
import play.api._
import play.api.templates._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    val width = 1136
    val height = 640
    val inch = 4
    val dpi = new Display(width, height, inch).dpi
    val content = new StringBuilder().append("<p>").append(dpi).append("</p>")
    Ok(views.html.main.render)
  }

  def calc(width: Long, height: Long, inch: Long) = Action {
    val dpi = new Display(width, height, inch).dpi
    Ok(dpi.toString)
  }
  
}
