package io.github.mvillafuertem.scalcite.example.domain.error

import java.util.UUID

sealed trait ScalciteError extends Product {
  val uuid: UUID = UUID.randomUUID()
  val code: String
}

object ScalciteError {

  case class DuplicatedEntity(override val code: String = "duplicated-entity") extends ScalciteError

  case class Unknown(override val code: String = "unknown") extends ScalciteError

}

