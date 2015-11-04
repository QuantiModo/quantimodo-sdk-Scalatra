package com.wordnik.client.model

import com.wordnik.client.model.MeasurementValue


case class MeasurementPost (
  variable_id: Int,
  source_id: Int,
  unit_id: Int,
  measurements: List[MeasurementValue]
)
