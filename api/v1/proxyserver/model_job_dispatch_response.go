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

type JobDispatchResponse struct {
	DispatchedJobID string `json:"DispatchedJobID,omitempty"`

	EvalCreateIndex int32 `json:"EvalCreateIndex,omitempty"`

	EvalID string `json:"EvalID,omitempty"`

	JobCreateIndex int32 `json:"JobCreateIndex,omitempty"`

	LastIndex int32 `json:"LastIndex,omitempty"`

	RequestTime int64 `json:"RequestTime,omitempty"`
}
