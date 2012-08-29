name := "Lift Ajax Form"

organization := "mycompany"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.1"


resolvers += "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

{
  val liftVersion = "2.5-SNAPSHOT"
  //val liftVersion = "2.4"
  libraryDependencies ++= Seq(
  "net.liftweb"     %% "lift-webkit"          % liftVersion             % "compile->default" ,
    "org.eclipse.jetty" % "jetty-webapp" % "7.1.0.RC1" % "container"
  )
}

scalacOptions += "-deprecation"

seq(webSettings :_*)

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource