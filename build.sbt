organization  := "org.copygrinder"

version       := "0.1"

scalaVersion  := "2.10.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io/",
  "JGit repo" at "https://repo.eclipse.org/content/groups/releases/"
)

/* SCALA LIBS */
libraryDependencies ++= Seq(
  "io.spray"            %   "spray-can"         % "1.2-M8",
  "io.spray"            %   "spray-routing"     % "1.2-M8",
  "io.spray"            %   "spray-testkit"     % "1.2-M8",
  "com.typesafe.akka"   %%  "akka-actor"        % "2.2.0-RC1",
  "com.typesafe.akka"   %%  "akka-testkit"      % "2.2.0-RC1"
)

/* JAVA LIBS */
libraryDependencies ++= Seq(
  "org.eclipse.jgit"   	%   "org.eclipse.jgit"  % "3.1.0.201310021548-r",
  "commons-io"          %   "commons-io"        % "2.4"
)

/* TEST LIBS */
libraryDependencies ++= Seq(
  "org.specs2"          %%  "specs2"                       % "2.2.2"    % "test",
  "org.scalatest"       %%  "scalatest"                    % "2.0.RC2"  % "test",
  "org.scalamock"       %%  "scalamock-scalatest-support"  % "3.0.1"    % "test"
)

seq(Revolver.settings: _*)

unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil

unmanagedSourceDirectories in Test := (scalaSource in Test).value :: Nil

EclipseKeys.withSource := true

fork := true
