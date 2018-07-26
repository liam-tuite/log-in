// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Liam/Desktop/Play/play-java-usernames/log-in/conf/routes
// @DATE:Thu Jul 26 16:36:07 BST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
