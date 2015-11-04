package com.wordnik.client.model

import java.util.Date


case class Update (
  id: Int,
  user_id: Int,
  connector_id: Int,
  number_of_measurements: Int,
  success: Boolean,
  message: String,
  created_at: Date,
  updated_at: Date
)
