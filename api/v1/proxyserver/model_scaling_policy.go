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

type ScalingPolicy struct {
	CreateIndex int32 `json:"CreateIndex,omitempty"`

	Enabled bool `json:"Enabled,omitempty"`

	ID string `json:"ID,omitempty"`

	Max int64 `json:"Max,omitempty"`

	Min int64 `json:"Min,omitempty"`

	ModifyIndex int32 `json:"ModifyIndex,omitempty"`

	Namespace string `json:"Namespace,omitempty"`

	Policy map[string]interface{} `json:"Policy,omitempty"`

	Target map[string]string `json:"Target,omitempty"`

	Type string `json:"Type,omitempty"`
}
