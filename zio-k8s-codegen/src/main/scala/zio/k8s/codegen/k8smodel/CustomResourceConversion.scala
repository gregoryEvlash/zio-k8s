/*
 * This file was generated by guardrail (https://github.com/twilio/guardrail).
 * Modifications will be overwritten; instead edit the OpenAPI/Swagger spec file.
 */
package zio.k8s.codegen.k8smodel

import io.circe._
import io.circe.syntax._
case class CustomResourceConversion(strategy: String, webhook: Option[WebhookConversion] = None)
object CustomResourceConversion {
  implicit val encodeIoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion
    : Encoder.AsObject[CustomResourceConversion] = {
    val readOnlyKeys = Set[String]()
    Encoder.AsObject
      .instance[CustomResourceConversion](a =>
        JsonObject.fromIterable(
          Vector(("strategy", a.strategy.asJson), ("webhook", a.webhook.asJson))
        )
      )
      .mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeIoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion
    : Decoder[CustomResourceConversion] = new Decoder[CustomResourceConversion] {
    final def apply(c: HCursor): Decoder.Result[CustomResourceConversion] =
      for {
        v0 <- c.downField("strategy").as[String]
        v1 <- c.downField("webhook").as[Option[WebhookConversion]]
      } yield CustomResourceConversion(v0, v1)
  }
}
