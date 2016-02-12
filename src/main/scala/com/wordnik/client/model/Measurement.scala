package com.wordnik.client.model

import java.util.Date


case class Measurement (
  id: Int,
  user_id: Int,
  client_id: String,
  connector_id: Int,
  variable_id: Int,
  source_id: Int,
  start_time: String,
  value: Float,
  unit_id: Int,
  original_value: Float,
  original_unit_id: Int,
  duration: Int,
  note: String,
  latitude: Float,
  longitude: Float,
  location: String,
  created_at: Date,
  updated_at: Date,
  error: String
)
