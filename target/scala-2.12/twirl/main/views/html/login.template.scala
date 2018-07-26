
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


Seq[Any](format.raw/*6.1*/("""
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
                  DATE: Thu Jul 26 16:08:28 IST 2018
                  SOURCE: /Users/vasilyulianko/dev/projects/log-in/app/views/login.scala.html
                  HASH: d3371bbdd34c487b361605a9a641b50bf885e81c
                  MATRIX: 997->46|1117->73|1144->74|1221->126|1234->132|1288->178|1327->180|1360->187|1375->193|1426->223|1459->230|1474->236|1529->270|1561->275
                  LINES: 30->5|35->6|36->7|38->9|38->9|38->9|38->9|40->11|40->11|40->11|42->13|42->13|42->13|43->14
                  -- GENERATED --
              */
          