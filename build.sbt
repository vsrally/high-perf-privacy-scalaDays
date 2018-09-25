name := "high-perf"


organization := "com.github.scala.io.talk"

scalaVersion := "2.11.12"

val matryoshkaVersion = "0.18.3"
val sparkVersion = "2.3.1"

libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % sparkVersion,
	"org.apache.spark" %% "spark-sql" % sparkVersion,
	"com.slamdata" %% "matryoshka-core" % matryoshkaVersion
)


scalacOptions += "-Ypartial-unification"

resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.7")

