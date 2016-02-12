package com.wordnik.client.model

import java.util.Date


case class Credential (
  user_id: Int,
  connector_id: Int,
  attr_key: String,
  attr_value: String,
  created_at: Date,
  updated_at: Date
)
