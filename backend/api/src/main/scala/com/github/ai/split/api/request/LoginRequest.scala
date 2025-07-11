package com.github.ai.split.api.request

import zio.json.{DeriveJsonDecoder, JsonDecoder}

case class LoginRequest(
  email: String,
  password: String
)

object LoginRequest {
  implicit val decoder: JsonDecoder[LoginRequest] = DeriveJsonDecoder.gen[LoginRequest]
}
