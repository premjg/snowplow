/*
 * Copyright (c) 2013-2016 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0, and
 * you may not use this file except in compliance with the Apache License
 * Version 2.0.  You may obtain a copy of the Apache License Version 2.0 at
 * http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Apache License Version 2.0 is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the Apache License Version 2.0 for the specific language
 * governing permissions and limitations there under.
 */
import sbt._

object Dependencies {

  val resolutionRepos = Seq(
    "Snowplow Analytics Maven repo"          at "http://maven.snplow.com/releases/",
    "Snowplow Analytics Maven snapshot repo" at "http://maven.snplow.com/snapshots/",
    "Spray repo"                             at "http://repo.spray.io",
    "Typesafe repository"                    at "http://repo.typesafe.com/typesafe/releases/",
    // For sbt-thrift
    "bigtoast-github"                        at "http://bigtoast.github.com/repo/"
  )

  object V {
    // Java
    val awsSdk               = "1.11.115"
    val yodaTime             = "2.1"
    val kafka                = "0.10.1.0"
    val commonsCodec         = "1.5"
    val logback              = "1.0.13"
    // Scala
    val snowplowCommonEnrich = "0.22.0"
    val collectorPayload     = "0.0.0"
    val scalaz7              = "7.0.9"
    val akkaHttp             = "10.0.9"
    val scopt                = "3.6.0"
    val json4s               = "3.2.11"
    // Scala (test only)
    val specs2               = "3.9.4"
  }

  object Libraries {
    // Java
    val awsSdk               = "com.amazonaws"         %  "aws-java-sdk-kinesis"      % V.awsSdk
    val yodaTime             = "joda-time"             %  "joda-time"                 % V.yodaTime
    val kafkaClients         = "org.apache.kafka"      %  "kafka-clients"             % V.kafka
    val logback              = "ch.qos.logback"        %  "logback-classic"           % V.logback
    val commonsCodec         = "commons-codec"         %  "commons-codec"             % V.commonsCodec

    // Scala
    val snowplowCommonEnrich = "com.snowplowanalytics" %  "snowplow-common-enrich"    % V.snowplowCommonEnrich intransitive
    val collectorPayload     = "com.snowplowanalytics" %  "collector-payload-1"       % V.collectorPayload
    val scalaz7              = "org.scalaz"            %% "scalaz-core"               % V.scalaz7
    val scopt                = "com.github.scopt"      %% "scopt"                     % V.scopt
    val akkaHttp             = "com.typesafe.akka"     %% "akka-http"                 % V.akkaHttp
    val json4sJackson        = "org.json4s"            %% "json4s-jackson"            % V.json4s

    // Scala (test only)
    val specs2               = "org.specs2"            %% "specs2-core"               % V.specs2   % "test"
    val akkaHttpTestkit      = "com.typesafe.akka"     %% "akka-http-testkit"         % V.akkaHttp % "test"
  }
}
