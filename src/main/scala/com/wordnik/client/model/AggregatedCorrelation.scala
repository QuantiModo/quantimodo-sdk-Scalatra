package com.wordnik.client.model

import java.util.Date


case class AggregatedCorrelation (
  id: Int,
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
  number_of_users: Int,
  number_of_correlations: Int,
  statistical_significance: Float,
  cause_unit: String,
  cause_unit_id: Int,
  cause_changes: Int,
  effect_changes: Int,
  aggregate_qm_score: Float,
  created_at: Date,
  updated_at: Date,
  status: String,
  error_message: String,
  last_successful_update_time: Date,
  reverse_pearson_correlation_coefficient: Float,
  predictive_pearson_correlation_coefficient: Float
)
