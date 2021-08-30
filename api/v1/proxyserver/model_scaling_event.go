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

type ScalingEvent struct {
	Count int64 `json:"Count,omitempty"`

	CreateIndex int32 `json:"CreateIndex,omitempty"`

	Error bool `json:"Error,omitempty"`

	EvalID string `json:"EvalID,omitempty"`

	Message string `json:"Message,omitempty"`

	Meta map[string]interface{} `json:"Meta,omitempty"`

	PreviousCount int64 `json:"PreviousCount,omitempty"`

	Time int32 `json:"Time,omitempty"`
}
