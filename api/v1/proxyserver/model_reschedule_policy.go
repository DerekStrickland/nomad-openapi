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

type ReschedulePolicy struct {
	Attempts int32 `json:"Attempts,omitempty"`

	Delay int64 `json:"Delay,omitempty"`

	DelayFunction string `json:"DelayFunction,omitempty"`

	Interval int64 `json:"Interval,omitempty"`

	MaxDelay int64 `json:"MaxDelay,omitempty"`

	Unlimited bool `json:"Unlimited,omitempty"`
}
