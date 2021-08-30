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

type ConsulConnect struct {
	Gateway ConsulGateway `json:"Gateway,omitempty"`

	Native bool `json:"Native,omitempty"`

	SidecarService ConsulSidecarService `json:"SidecarService,omitempty"`

	SidecarTask SidecarTask `json:"SidecarTask,omitempty"`
}
