package com.wordnik.client.model

import java.util.Date


case class UnitConversion (
  unit_id: Int,
  step_number: Boolean,
  operation: Boolean,
  value: Float,
  created_at: Date,
  updated_at: Date
)
