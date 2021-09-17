/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.1.3
 * Contact: support@hashicorp.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// DiskUsage struct for DiskUsage
type DiskUsage struct {
	DiskMB *int64 `json:"DiskMB,omitempty"`
	UsedMB *int64 `json:"UsedMB,omitempty"`
}

// NewDiskUsage instantiates a new DiskUsage object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDiskUsage() *DiskUsage {
	this := DiskUsage{}
	return &this
}

// NewDiskUsageWithDefaults instantiates a new DiskUsage object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDiskUsageWithDefaults() *DiskUsage {
	this := DiskUsage{}
	return &this
}

// GetDiskMB returns the DiskMB field value if set, zero value otherwise.
func (o *DiskUsage) GetDiskMB() int64 {
	if o == nil || o.DiskMB == nil {
		var ret int64
		return ret
	}
	return *o.DiskMB
}

// GetDiskMBOk returns a tuple with the DiskMB field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiskUsage) GetDiskMBOk() (*int64, bool) {
	if o == nil || o.DiskMB == nil {
		return nil, false
	}
	return o.DiskMB, true
}

// HasDiskMB returns a boolean if a field has been set.
func (o *DiskUsage) HasDiskMB() bool {
	if o != nil && o.DiskMB != nil {
		return true
	}

	return false
}

// SetDiskMB gets a reference to the given int64 and assigns it to the DiskMB field.
func (o *DiskUsage) SetDiskMB(v int64) {
	o.DiskMB = &v
}

// GetUsedMB returns the UsedMB field value if set, zero value otherwise.
func (o *DiskUsage) GetUsedMB() int64 {
	if o == nil || o.UsedMB == nil {
		var ret int64
		return ret
	}
	return *o.UsedMB
}

// GetUsedMBOk returns a tuple with the UsedMB field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiskUsage) GetUsedMBOk() (*int64, bool) {
	if o == nil || o.UsedMB == nil {
		return nil, false
	}
	return o.UsedMB, true
}

// HasUsedMB returns a boolean if a field has been set.
func (o *DiskUsage) HasUsedMB() bool {
	if o != nil && o.UsedMB != nil {
		return true
	}

	return false
}

// SetUsedMB gets a reference to the given int64 and assigns it to the UsedMB field.
func (o *DiskUsage) SetUsedMB(v int64) {
	o.UsedMB = &v
}

func (o DiskUsage) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.DiskMB != nil {
		toSerialize["DiskMB"] = o.DiskMB
	}
	if o.UsedMB != nil {
		toSerialize["UsedMB"] = o.UsedMB
	}
	return json.Marshal(toSerialize)
}

type NullableDiskUsage struct {
	value *DiskUsage
	isSet bool
}

func (v NullableDiskUsage) Get() *DiskUsage {
	return v.value
}

func (v *NullableDiskUsage) Set(val *DiskUsage) {
	v.value = val
	v.isSet = true
}

func (v NullableDiskUsage) IsSet() bool {
	return v.isSet
}

func (v *NullableDiskUsage) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDiskUsage(val *DiskUsage) *NullableDiskUsage {
	return &NullableDiskUsage{value: val, isSet: true}
}

func (v NullableDiskUsage) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDiskUsage) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

