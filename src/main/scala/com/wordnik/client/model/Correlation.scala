package com.wordnik.client.model

import java.util.Date


case class Correlation (
  id: Int,
  timestamp: Int,
  user_id: Int,
  correlation: Float,
  cause_id: Int,
  effect_id: Int,
  onset_delay: Int,
  duration_of_action: Int,
  number_of_pairs: Int,
  value_predicting_high_outcome: Float,
  value_predicting_low_outcome: Float,
  optimal_pearson_product: Float,
  vote: Float,
  statistical_significance: Float,
  cause_unit: String,
  cause_unit_id: Int,
  cause_changes: Int,
  effect_changes: Int,
  qm_score: Float,
  error: String,
  created_at: Date,
  updated_at: Date,
  reverse_pearson_correlation_coefficient: Float,
  predictive_pearson_correlation_coefficient: Float
)
