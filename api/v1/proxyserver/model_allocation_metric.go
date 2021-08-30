/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.1.3
 * Contact: support@hashicorp.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package main

type AllocationMetric struct {
	AllocationTime int64 `json:"AllocationTime,omitempty"`

	ClassExhausted map[string]int32 `json:"ClassExhausted,omitempty"`

	ClassFiltered map[string]int32 `json:"ClassFiltered,omitempty"`

	CoalescedFailures int32 `json:"CoalescedFailures,omitempty"`

	ConstraintFiltered map[string]int32 `json:"ConstraintFiltered,omitempty"`

	DimensionExhausted map[string]int32 `json:"DimensionExhausted,omitempty"`

	NodesAvailable map[string]int32 `json:"NodesAvailable,omitempty"`

	NodesEvaluated int32 `json:"NodesEvaluated,omitempty"`

	NodesExhausted int32 `json:"NodesExhausted,omitempty"`

	NodesFiltered int32 `json:"NodesFiltered,omitempty"`

	QuotaExhausted []string `json:"QuotaExhausted,omitempty"`

	ResourcesExhausted map[string]Resources `json:"ResourcesExhausted,omitempty"`

	ScoreMetaData []NodeScoreMeta `json:"ScoreMetaData,omitempty"`

	Scores map[string]float64 `json:"Scores,omitempty"`
}
