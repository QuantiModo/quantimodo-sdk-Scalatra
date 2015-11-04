package com.wordnik.client.model

import java.util.Date


case class Connection (
  id: Int,
  user_id: Int,
  connector_id: Int,
  connect_status: String,
  connect_error: String,
  update_requested_at: Date,
  update_status: String,
  update_error: String,
  last_successful_updated_at: Date,
  created_at: Date,
  updated_at: Date
)
