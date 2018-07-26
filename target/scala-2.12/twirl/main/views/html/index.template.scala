
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

 """),format.raw/*5.2*/("""<body>
        <header>
            <a href=""""),_display_(/*7.23*/routes/*7.29*/.Application.login),format.raw/*7.47*/("""" id="logo">Login</a>
        </header>
    
    </body>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 26 16:36:10 BST 2018
                  SOURCE: C:/Users/Liam/Desktop/Play/play-java-usernames/log-in/app/views/index.scala.html
                  HASH: b59db6229a2fbe10f8193db4a1e3d07d40205546
                  MATRIX: 941->1|1037->3|1067->8|1098->31|1137->33|1168->38|1242->86|1256->92|1294->110|1386->172
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|43->11
                  -- GENERATED --
              */
          