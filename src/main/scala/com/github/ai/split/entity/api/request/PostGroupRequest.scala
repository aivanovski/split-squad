package com.github.ai.split.entity.api.request

import zio.json.{DeriveJsonDecoder, JsonDecoder}

case class PostGroupRequest(
  title: String,
  description: Option[String]
)

object PostGroupRequest {
  implicit val decoder: JsonDecoder[PostGroupRequest] = DeriveJsonDecoder.gen[PostGroupRequest]
}
