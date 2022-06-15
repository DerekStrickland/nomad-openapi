/*
Nomad

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 1.1.4
Contact: support@hashicorp.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// DrainSpec struct for DrainSpec
type DrainSpec struct {
	Deadline *int64 `json:"Deadline,omitempty"`
	IgnoreSystemJobs *bool `json:"IgnoreSystemJobs,omitempty"`
}

// NewDrainSpec instantiates a new DrainSpec object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDrainSpec() *DrainSpec {
	this := DrainSpec{}
	return &this
}

// NewDrainSpecWithDefaults instantiates a new DrainSpec object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDrainSpecWithDefaults() *DrainSpec {
	this := DrainSpec{}
	return &this
}

// GetDeadline returns the Deadline field value if set, zero value otherwise.
func (o *DrainSpec) GetDeadline() int64 {
	if o == nil || o.Deadline == nil {
		var ret int64
		return ret
	}
	return *o.Deadline
}

// GetDeadlineOk returns a tuple with the Deadline field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DrainSpec) GetDeadlineOk() (*int64, bool) {
	if o == nil || o.Deadline == nil {
		return nil, false
	}
	return o.Deadline, true
}

// HasDeadline returns a boolean if a field has been set.
func (o *DrainSpec) HasDeadline() bool {
	if o != nil && o.Deadline != nil {
		return true
	}

	return false
}

// SetDeadline gets a reference to the given int64 and assigns it to the Deadline field.
func (o *DrainSpec) SetDeadline(v int64) {
	o.Deadline = &v
}

// GetIgnoreSystemJobs returns the IgnoreSystemJobs field value if set, zero value otherwise.
func (o *DrainSpec) GetIgnoreSystemJobs() bool {
	if o == nil || o.IgnoreSystemJobs == nil {
		var ret bool
		return ret
	}
	return *o.IgnoreSystemJobs
}

// GetIgnoreSystemJobsOk returns a tuple with the IgnoreSystemJobs field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DrainSpec) GetIgnoreSystemJobsOk() (*bool, bool) {
	if o == nil || o.IgnoreSystemJobs == nil {
		return nil, false
	}
	return o.IgnoreSystemJobs, true
}

// HasIgnoreSystemJobs returns a boolean if a field has been set.
func (o *DrainSpec) HasIgnoreSystemJobs() bool {
	if o != nil && o.IgnoreSystemJobs != nil {
		return true
	}

	return false
}

// SetIgnoreSystemJobs gets a reference to the given bool and assigns it to the IgnoreSystemJobs field.
func (o *DrainSpec) SetIgnoreSystemJobs(v bool) {
	o.IgnoreSystemJobs = &v
}

func (o DrainSpec) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Deadline != nil {
		toSerialize["Deadline"] = o.Deadline
	}
	if o.IgnoreSystemJobs != nil {
		toSerialize["IgnoreSystemJobs"] = o.IgnoreSystemJobs
	}
	return json.Marshal(toSerialize)
}

type NullableDrainSpec struct {
	value *DrainSpec
	isSet bool
}

func (v NullableDrainSpec) Get() *DrainSpec {
	return v.value
}

func (v *NullableDrainSpec) Set(val *DrainSpec) {
	v.value = val
	v.isSet = true
}

func (v NullableDrainSpec) IsSet() bool {
	return v.isSet
}

func (v *NullableDrainSpec) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDrainSpec(val *DrainSpec) *NullableDrainSpec {
	return &NullableDrainSpec{value: val, isSet: true}
}

func (v NullableDrainSpec) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDrainSpec) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


