// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vasilyulianko/dev/projects/log-in/conf/routes
// @DATE:Thu Jul 26 15:49:24 IST 2018


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
