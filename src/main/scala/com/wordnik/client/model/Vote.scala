package com.wordnik.client.model

import java.util.Date


case class Vote (
  id: Int,
  client_id: String,
  user_id: Int,
  cause_id: Int,
  effect_id: Int,
  value: Int,
  created_at: Date,
  updated_at: Date
)
