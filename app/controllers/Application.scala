package controllers

import play.api._
import play.api.mvc._

import com.twitter.util.Eval

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def eval = Action { request =>
println(s"    content-type: ${request.contentType}")
println(s"    headers: ${request.headers}")
println(s"    body: ${request.body}")
println(s"    query string: ${request.rawQueryString}")
    val text = request.body.asText
    val res: String = new Eval()(text.getOrElse("")).toString
    Ok(res)
  }
}
