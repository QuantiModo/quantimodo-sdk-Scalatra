package com.wordnik.client.model

import java.util.Date


case class Unit (
  id: Int,
  client_id: String,
  name: String,
  abbreviated_name: String,
  category_id: Int,
  minimum_value: Float,
  maximum_value: Float,
  updated: Int,
  default_unit_id: Int,
  multiply: Float,
  add: Float,
  created_at: Date,
  updated_at: Date
)
