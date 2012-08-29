package bootstrap.liftweb

import code._
import net.liftweb._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb.util._
import net.liftweb.util.Helpers._

/**
 * A class that's instantiated early and run.  It allows the application
 * to modify lift's environment
 */
class Boot extends Loggable {
  def boot {
    logger.info("Run Mode: "+Props.mode.toString)

    // where to search snippet
    LiftRules.addToPackages("code")

    // set the default htmlProperties
    LiftRules.htmlProperties.default.set((r: Req) => new Html5Properties(r.userAgent))

    // Build SiteMap
   // LiftRules.setSiteMap(Site.siteMap)

  }
}
