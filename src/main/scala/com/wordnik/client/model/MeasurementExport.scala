package com.wordnik.client.model

import java.util.Date


case class MeasurementExport (
  id: Int,
  user_id: Int,
  status: String,
  error_message: String,
  created_at: Date,
  updated_at: Date
)
