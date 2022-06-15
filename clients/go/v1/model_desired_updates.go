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

// DesiredUpdates struct for DesiredUpdates
type DesiredUpdates struct {
	Canary *int32 `json:"Canary,omitempty"`
	DestructiveUpdate *int32 `json:"DestructiveUpdate,omitempty"`
	Ignore *int32 `json:"Ignore,omitempty"`
	InPlaceUpdate *int32 `json:"InPlaceUpdate,omitempty"`
	Migrate *int32 `json:"Migrate,omitempty"`
	Place *int32 `json:"Place,omitempty"`
	Preemptions *int32 `json:"Preemptions,omitempty"`
	Stop *int32 `json:"Stop,omitempty"`
}

// NewDesiredUpdates instantiates a new DesiredUpdates object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDesiredUpdates() *DesiredUpdates {
	this := DesiredUpdates{}
	return &this
}

// NewDesiredUpdatesWithDefaults instantiates a new DesiredUpdates object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDesiredUpdatesWithDefaults() *DesiredUpdates {
	this := DesiredUpdates{}
	return &this
}

// GetCanary returns the Canary field value if set, zero value otherwise.
func (o *DesiredUpdates) GetCanary() int32 {
	if o == nil || o.Canary == nil {
		var ret int32
		return ret
	}
	return *o.Canary
}

// GetCanaryOk returns a tuple with the Canary field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DesiredUpdates) GetCanaryOk() (*int32, bool) {
	if o == nil || o.Canary == nil {
		return nil, false
	}
	return o.Canary, true
}

// HasCanary returns a boolean if a field has been set.
func (o *DesiredUpdates) HasCanary() bool {
	if o != nil && o.Canary != nil {
		return true
	}

	return false
}

// SetCanary gets a reference to the given int32 and assigns it to the Canary field.
func (o *DesiredUpdates) SetCanary(v int32) {
	o.Canary = &v
}

// GetDestructiveUpdate returns the DestructiveUpdate field value if set, zero value otherwise.
func (o *DesiredUpdates) GetDestructiveUpdate() int32 {
	if o == nil || o.DestructiveUpdate == nil {
		var ret int32
		return ret
	}
	return *o.DestructiveUpdate
}

// GetDestructiveUpdateOk returns a tuple with the DestructiveUpdate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DesiredUpdates) GetDestructiveUpdateOk() (*int32, bool) {
	if o == nil || o.DestructiveUpdate == nil {
		return nil, false
	}
	return o.DestructiveUpdate, true
}

// HasDestructiveUpdate returns a boolean if a field has been set.
func (o *DesiredUpdates) HasDestructiveUpdate() bool {
	if o != nil && o.DestructiveUpdate != nil {
		return true
	}

	return false
}

// SetDestructiveUpdate gets a reference to the given int32 and assigns it to the DestructiveUpdate field.
func (o *DesiredUpdates) SetDestructiveUpdate(v int32) {
	o.DestructiveUpdate = &v
}

// GetIgnore returns the Ignore field value if set, zero value otherwise.
func (o *DesiredUpdates) GetIgnore() int32 {
	if o == nil || o.Ignore == nil {
		var ret int32
		return ret
	}
	return *o.Ignore
}

// GetIgnoreOk returns a tuple with the Ignore field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DesiredUpdates) GetIgnoreOk() (*int32, bool) {
	if o == nil || o.Ignore == nil {
		return nil, false
	}
	return o.Ignore, true
}

// HasIgnore returns a boolean if a field has been set.
func (o *DesiredUpdates) HasIgnore() bool {
	if o != nil && o.Ignore != nil {
		return true
	}

	return false
}

// SetIgnore gets a reference to the given int32 and assigns it to the Ignore field.
func (o *DesiredUpdates) SetIgnore(v int32) {
	o.Ignore = &v
}

// GetInPlaceUpdate returns the InPlaceUpdate field value if set, zero value otherwise.
func (o *DesiredUpdates) GetInPlaceUpdate() int32 {
	if o == nil || o.InPlaceUpdate == nil {
		var ret int32
		return ret
	}
	return *o.InPlaceUpdate
}

// GetInPlaceUpdateOk returns a tuple with the InPlaceUpdate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DesiredUpdates) GetInPlaceUpdateOk() (*int32, bool) {
	if o == nil || o.InPlaceUpdate == nil {
		return nil, false
	}
	return o.InPlaceUpdate, true
}

// HasInPlaceUpdate returns a boolean if a field has been set.
func (o *DesiredUpdates) HasInPlaceUpdate() bool {
	if o != nil && o.InPlaceUpdate != nil {
		return true
	}

	return false
}

// SetInPlaceUpdate gets a reference to the given int32 and assigns it to the InPlaceUpdate field.
func (o *DesiredUpdates) SetInPlaceUpdate(v int32) {
	o.InPlaceUpdate = &v
}

// GetMigrate returns the Migrate field value if set, zero value otherwise.
func (o *DesiredUpdates) GetMigrate() int32 {
	if o == nil || o.Migrate == nil {
		var ret int32
		return ret
	}
	return *o.Migrate
}

// GetMigrateOk returns a tuple with the Migrate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DesiredUpdates) GetMigrateOk() (*int32, bool) {
	if o == nil || o.Migrate == nil {
		return nil, false
	}
	return o.Migrate, true
}

// HasMigrate returns a boolean if a field has been set.
func (o *DesiredUpdates) HasMigrate() bool {
	if o != nil && o.Migrate != nil {
		return true
	}

	return false
}

// SetMigrate gets a reference to the given int32 and assigns it to the Migrate field.
func (o *DesiredUpdates) SetMigrate(v int32) {
	o.Migrate = &v
}

// GetPlace returns the Place field value if set, zero value otherwise.
func (o *DesiredUpdates) GetPlace() int32 {
	if o == nil || o.Place == nil {
		var ret int32
		return ret
	}
	return *o.Place
}

// GetPlaceOk returns a tuple with the Place field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DesiredUpdates) GetPlaceOk() (*int32, bool) {
	if o == nil || o.Place == nil {
		return nil, false
	}
	return o.Place, true
}

// HasPlace returns a boolean if a field has been set.
func (o *DesiredUpdates) HasPlace() bool {
	if o != nil && o.Place != nil {
		return true
	}

	return false
}

// SetPlace gets a reference to the given int32 and assigns it to the Place field.
func (o *DesiredUpdates) SetPlace(v int32) {
	o.Place = &v
}

// GetPreemptions returns the Preemptions field value if set, zero value otherwise.
func (o *DesiredUpdates) GetPreemptions() int32 {
	if o == nil || o.Preemptions == nil {
		var ret int32
		return ret
	}
	return *o.Preemptions
}

// GetPreemptionsOk returns a tuple with the Preemptions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DesiredUpdates) GetPreemptionsOk() (*int32, bool) {
	if o == nil || o.Preemptions == nil {
		return nil, false
	}
	return o.Preemptions, true
}

// HasPreemptions returns a boolean if a field has been set.
func (o *DesiredUpdates) HasPreemptions() bool {
	if o != nil && o.Preemptions != nil {
		return true
	}

	return false
}

// SetPreemptions gets a reference to the given int32 and assigns it to the Preemptions field.
func (o *DesiredUpdates) SetPreemptions(v int32) {
	o.Preemptions = &v
}

// GetStop returns the Stop field value if set, zero value otherwise.
func (o *DesiredUpdates) GetStop() int32 {
	if o == nil || o.Stop == nil {
		var ret int32
		return ret
	}
	return *o.Stop
}

// GetStopOk returns a tuple with the Stop field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DesiredUpdates) GetStopOk() (*int32, bool) {
	if o == nil || o.Stop == nil {
		return nil, false
	}
	return o.Stop, true
}

// HasStop returns a boolean if a field has been set.
func (o *DesiredUpdates) HasStop() bool {
	if o != nil && o.Stop != nil {
		return true
	}

	return false
}

// SetStop gets a reference to the given int32 and assigns it to the Stop field.
func (o *DesiredUpdates) SetStop(v int32) {
	o.Stop = &v
}

func (o DesiredUpdates) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Canary != nil {
		toSerialize["Canary"] = o.Canary
	}
	if o.DestructiveUpdate != nil {
		toSerialize["DestructiveUpdate"] = o.DestructiveUpdate
	}
	if o.Ignore != nil {
		toSerialize["Ignore"] = o.Ignore
	}
	if o.InPlaceUpdate != nil {
		toSerialize["InPlaceUpdate"] = o.InPlaceUpdate
	}
	if o.Migrate != nil {
		toSerialize["Migrate"] = o.Migrate
	}
	if o.Place != nil {
		toSerialize["Place"] = o.Place
	}
	if o.Preemptions != nil {
		toSerialize["Preemptions"] = o.Preemptions
	}
	if o.Stop != nil {
		toSerialize["Stop"] = o.Stop
	}
	return json.Marshal(toSerialize)
}

type NullableDesiredUpdates struct {
	value *DesiredUpdates
	isSet bool
}

func (v NullableDesiredUpdates) Get() *DesiredUpdates {
	return v.value
}

func (v *NullableDesiredUpdates) Set(val *DesiredUpdates) {
	v.value = val
	v.isSet = true
}

func (v NullableDesiredUpdates) IsSet() bool {
	return v.isSet
}

func (v *NullableDesiredUpdates) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDesiredUpdates(val *DesiredUpdates) *NullableDesiredUpdates {
	return &NullableDesiredUpdates{value: val, isSet: true}
}

func (v NullableDesiredUpdates) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDesiredUpdates) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


