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

type AllocatedSharedResources struct {
	DiskMB int64 `json:"DiskMB,omitempty"`

	Networks []NetworkResource `json:"Networks,omitempty"`

	Ports []PortMapping `json:"Ports,omitempty"`
}
