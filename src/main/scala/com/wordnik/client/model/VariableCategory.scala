package com.wordnik.client.model

import java.util.Date


case class VariableCategory (
  id: Int,
  name: String,
  filling_value: Float,
  maximum_allowed_value: Float,
  minimum_allowed_value: Float,
  duration_of_action: Int,
  onset_delay: Int,
  combination_operation: String,
  updated: Int,
  cause_only: Boolean,
  _public: Int,
  outcome: Boolean,
  created_at: Date,
  updated_at: Date,
  image_url: String,
  default_unit_id: Int
)
