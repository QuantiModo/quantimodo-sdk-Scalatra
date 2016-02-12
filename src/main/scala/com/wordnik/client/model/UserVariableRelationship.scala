package com.wordnik.client.model



case class UserVariableRelationship (
  id: Int,
  confidence_level: String,
  confidence_score: Float,
  direction: String,
  duration_of_action: Int,
  error_message: String,
  onset_delay: Int,
  outcome_variable_id: Int,
  predictor_variable_id: Int,
  predictor_unit_id: Int,
  sinn_rank: Float,
  strength_level: String,
  strength_score: Float,
  user_id: Int,
  vote: String,
  value_predicting_high_outcome: Float,
  value_predicting_low_outcome: Float
)
