package com.wordnik.client.model

import java.util.Date


case class TrackingReminder (
  id: Int,
  client_id: String,
  user_id: Int,
  variable_id: Int,
  default_value: Float,
  reminder_start_time: String,
  reminder_end_time: String,
  reminder_sound: String,
  reminder_frequency: Int,
  pop_up: Boolean,
  sms: Boolean,
  email: Boolean,
  notification_bar: Boolean,
  last_reminded: Date,
  last_tracked: Date,
  created_at: Date,
  updated_at: Date
)
