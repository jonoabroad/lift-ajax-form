package code.snippet

import net.liftweb.http.S
import net.liftweb.http.SHtml
import net.liftweb.http.js.JsCmd
import net.liftweb.http.js.JsCmds._
import net.liftweb.util._
import net.liftweb.util.Helpers._
import net.liftweb.common.Loggable

object Login {


  def render = {

    println("render")

    // form vars
    var email:String = ""

    "#id_email" #> (SHtml.text(email, email = _) ++   SHtml.hidden(() => doSubmit(email)))
  }

    def doSubmit(email:String): JsCmd =  if (email.length > 0) {

         if ("you@example.com".equals(email.trim.toLowerCase))
         {
              S.notice("An email has been sent to you with instructions for accessing your account")
              Noop

         } else if ("me@example.com".equals(email.trim.toLowerCase)) {
              S.notice("Yay!")
              S.redirectTo("/")
          }
        }
        else {
          S.error("Please enter an email address")
          Noop
        }
}
