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

type Job struct {
	Affinities []Affinity `json:"Affinities,omitempty"`

	AllAtOnce bool `json:"AllAtOnce,omitempty"`

	Constraints []Constraint `json:"Constraints,omitempty"`

	ConsulNamespace string `json:"ConsulNamespace,omitempty"`

	ConsulToken string `json:"ConsulToken,omitempty"`

	CreateIndex int32 `json:"CreateIndex,omitempty"`

	Datacenters []string `json:"Datacenters,omitempty"`

	Dispatched bool `json:"Dispatched,omitempty"`

	ID string `json:"ID,omitempty"`

	JobModifyIndex int32 `json:"JobModifyIndex,omitempty"`

	Meta map[string]string `json:"Meta,omitempty"`

	Migrate MigrateStrategy `json:"Migrate,omitempty"`

	ModifyIndex int32 `json:"ModifyIndex,omitempty"`

	Multiregion Multiregion `json:"Multiregion,omitempty"`

	Name string `json:"Name,omitempty"`

	Namespace string `json:"Namespace,omitempty"`

	NomadTokenID string `json:"NomadTokenID,omitempty"`

	ParameterizedJob ParameterizedJobConfig `json:"ParameterizedJob,omitempty"`

	ParentID string `json:"ParentID,omitempty"`

	Payload string `json:"Payload,omitempty"`

	Periodic PeriodicConfig `json:"Periodic,omitempty"`

	Priority int32 `json:"Priority,omitempty"`

	Region string `json:"Region,omitempty"`

	Reschedule ReschedulePolicy `json:"Reschedule,omitempty"`

	Spreads []Spread `json:"Spreads,omitempty"`

	Stable bool `json:"Stable,omitempty"`

	Status string `json:"Status,omitempty"`

	StatusDescription string `json:"StatusDescription,omitempty"`

	Stop bool `json:"Stop,omitempty"`

	SubmitTime int64 `json:"SubmitTime,omitempty"`

	TaskGroups []TaskGroup `json:"TaskGroups,omitempty"`

	Type string `json:"Type,omitempty"`

	Update UpdateStrategy `json:"Update,omitempty"`

	VaultNamespace string `json:"VaultNamespace,omitempty"`

	VaultToken string `json:"VaultToken,omitempty"`

	Version int32 `json:"Version,omitempty"`
}
