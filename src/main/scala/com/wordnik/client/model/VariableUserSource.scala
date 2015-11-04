package com.wordnik.client.model

import java.util.Date


case class VariableUserSource (
  user_id: Int,
  variable_id: Int,
  source_id: Int,
  timestamp: Int,
  earliest_measurement_time: Int,
  latest_measurement_time: Int,
  created_at: Date,
  updated_at: Date
)
