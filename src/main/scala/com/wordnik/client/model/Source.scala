package com.wordnik.client.model

import java.util.Date


case class Source (
  id: Int,
  client_id: String,
  name: String,
  created_at: Date,
  updated_at: Date
)
