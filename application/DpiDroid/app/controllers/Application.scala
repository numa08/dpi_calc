package controllers

import models._
import play.api._
import play.api.templates._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.main.render)
  }

  def calc(width: Long, height: Long, inch: Double) = Action {
    val dpi = new Display(width, height, inch).dpi
    Ok(dpi.toString)
  }

}
