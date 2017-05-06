package controllers

import play.api._
import play.api.mvc._

object HelloWorld extends Controller {
	def getHelloWorld = Action {
		Ok(views.html.hello("Hello World!"))
  	}

	def putHelloWorld(value: String) = Action {
		Ok(views.html.hello(value))
	}
}
