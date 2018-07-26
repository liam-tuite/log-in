
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[model.User],play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This file displays the login form.
*/
  def apply/*5.2*/(myForm: Form[model.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.28*/("""

"""),format.raw/*7.1*/("""<h2>Please enter your username and password.</h2>

"""),_display_(/*9.2*/helper/*9.8*/.form(action = routes.Application.loginPost())/*9.54*/ {_display_(Seq[Any](format.raw/*9.56*/("""

    """),_display_(/*11.6*/helper/*11.12*/.inputText(myForm("username"))),format.raw/*11.42*/("""

    """),_display_(/*13.6*/helper/*13.12*/.inputPassword(myForm("password"))),format.raw/*13.46*/("""
    """),format.raw/*14.5*/("""<button type="submit">Log In</button>
""")))}))
      }
    }
  }

  def render(myForm:Form[model.User]): play.twirl.api.HtmlFormat.Appendable = apply(myForm)

  def f:((Form[model.User]) => play.twirl.api.HtmlFormat.Appendable) = (myForm) => apply(myForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 26 16:58:26 BST 2018
                  SOURCE: C:/Users/Liam/Desktop/Play/play-java-usernames/log-in/app/views/login.scala.html
                  HASH: c3a76852cdee43d998a22c532a7b1ac6bcad47d8
                  MATRIX: 999->50|1120->76|1150->80|1229->134|1242->140|1296->186|1335->188|1370->197|1385->203|1436->233|1471->242|1486->248|1541->282|1574->288
                  LINES: 30->5|35->5|37->7|39->9|39->9|39->9|39->9|41->11|41->11|41->11|43->13|43->13|43->13|44->14
                  -- GENERATED --
              */
          