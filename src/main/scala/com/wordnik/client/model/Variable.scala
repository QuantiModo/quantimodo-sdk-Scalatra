package com.wordnik.client.model

import java.util.Date


case class Variable (
  id: Int,
  client_id: String,
  parent_id: Int,
  name: String,
  variable_category_id: Int,
  default_unit_id: Int,
  combination_operation: String,
  filling_value: Float,
  maximum_allowed_value: Float,
  minimum_allowed_value: Float,
  onset_delay: Int,
  duration_of_action: Int,
  _public: Int,
  cause_only: Boolean,
  most_common_value: Float,
  most_common_unit_id: Int,
  standard_deviation: Float,
  variance: Float,
  mean: Float,
  median: Float,
  number_of_measurements: Float,
  number_of_unique_values: Float,
  skewness: Float,
  kurtosis: Float,
  status: String,
  error_message: String,
  last_successful_update_time: Date,
  created_at: Date,
  updated_at: Date,
  product_url: String,
  image_url: String,
  price: Float,
  number_of_user_variables: Int,
  outcome: Boolean,
  minimum_recorded_value: Float,
  maximum_recorded_value: Float
)
