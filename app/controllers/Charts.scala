package controllers

import play.api.mvc._

object Charts extends Controller {

  def flot() = Action {
    Ok(views.html.charts.flot())
  }
def bouneb() = Action {
    Ok(views.html.charts.reporting("ons","ons"))
  }

  def morris() = Action {
    Ok(views.html.charts.morris())
  }

}
