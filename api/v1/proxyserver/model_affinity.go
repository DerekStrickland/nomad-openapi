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

type Affinity struct {
	LTarget string `json:"LTarget,omitempty"`

	Operand string `json:"Operand,omitempty"`

	RTarget string `json:"RTarget,omitempty"`

	Weight int32 `json:"Weight,omitempty"`
}
