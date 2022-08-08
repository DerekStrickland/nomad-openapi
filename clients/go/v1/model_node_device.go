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

// NodeDevice struct for NodeDevice
type NodeDevice struct {
	HealthDescription *string `json:"HealthDescription,omitempty"`
	Healthy *bool `json:"Healthy,omitempty"`
	ID *string `json:"ID,omitempty"`
	Locality NullableNodeDeviceLocality `json:"Locality,omitempty"`
}

// NewNodeDevice instantiates a new NodeDevice object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNodeDevice() *NodeDevice {
	this := NodeDevice{}
	return &this
}

// NewNodeDeviceWithDefaults instantiates a new NodeDevice object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNodeDeviceWithDefaults() *NodeDevice {
	this := NodeDevice{}
	return &this
}

// GetHealthDescription returns the HealthDescription field value if set, zero value otherwise.
func (o *NodeDevice) GetHealthDescription() string {
	if o == nil || o.HealthDescription == nil {
		var ret string
		return ret
	}
	return *o.HealthDescription
}

// GetHealthDescriptionOk returns a tuple with the HealthDescription field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *NodeDevice) GetHealthDescriptionOk() (*string, bool) {
	if o == nil || o.HealthDescription == nil {
		return nil, false
	}
	return o.HealthDescription, true
}

// HasHealthDescription returns a boolean if a field has been set.
func (o *NodeDevice) HasHealthDescription() bool {
	if o != nil && o.HealthDescription != nil {
		return true
	}

	return false
}

// SetHealthDescription gets a reference to the given string and assigns it to the HealthDescription field.
func (o *NodeDevice) SetHealthDescription(v string) {
	o.HealthDescription = &v
}

// GetHealthy returns the Healthy field value if set, zero value otherwise.
func (o *NodeDevice) GetHealthy() bool {
	if o == nil || o.Healthy == nil {
		var ret bool
		return ret
	}
	return *o.Healthy
}

// GetHealthyOk returns a tuple with the Healthy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *NodeDevice) GetHealthyOk() (*bool, bool) {
	if o == nil || o.Healthy == nil {
		return nil, false
	}
	return o.Healthy, true
}

// HasHealthy returns a boolean if a field has been set.
func (o *NodeDevice) HasHealthy() bool {
	if o != nil && o.Healthy != nil {
		return true
	}

	return false
}

// SetHealthy gets a reference to the given bool and assigns it to the Healthy field.
func (o *NodeDevice) SetHealthy(v bool) {
	o.Healthy = &v
}

// GetID returns the ID field value if set, zero value otherwise.
func (o *NodeDevice) GetID() string {
	if o == nil || o.ID == nil {
		var ret string
		return ret
	}
	return *o.ID
}

// GetIDOk returns a tuple with the ID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *NodeDevice) GetIDOk() (*string, bool) {
	if o == nil || o.ID == nil {
		return nil, false
	}
	return o.ID, true
}

// HasID returns a boolean if a field has been set.
func (o *NodeDevice) HasID() bool {
	if o != nil && o.ID != nil {
		return true
	}

	return false
}

// SetID gets a reference to the given string and assigns it to the ID field.
func (o *NodeDevice) SetID(v string) {
	o.ID = &v
}

// GetLocality returns the Locality field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *NodeDevice) GetLocality() NodeDeviceLocality {
	if o == nil || o.Locality.Get() == nil {
		var ret NodeDeviceLocality
		return ret
	}
	return *o.Locality.Get()
}

// GetLocalityOk returns a tuple with the Locality field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *NodeDevice) GetLocalityOk() (*NodeDeviceLocality, bool) {
	if o == nil  {
		return nil, false
	}
	return o.Locality.Get(), o.Locality.IsSet()
}

// HasLocality returns a boolean if a field has been set.
func (o *NodeDevice) HasLocality() bool {
	if o != nil && o.Locality.IsSet() {
		return true
	}

	return false
}

// SetLocality gets a reference to the given NullableNodeDeviceLocality and assigns it to the Locality field.
func (o *NodeDevice) SetLocality(v NodeDeviceLocality) {
	o.Locality.Set(&v)
}
// SetLocalityNil sets the value for Locality to be an explicit nil
func (o *NodeDevice) SetLocalityNil() {
	o.Locality.Set(nil)
}

// UnsetLocality ensures that no value is present for Locality, not even an explicit nil
func (o *NodeDevice) UnsetLocality() {
	o.Locality.Unset()
}

func (o NodeDevice) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.HealthDescription != nil {
		toSerialize["HealthDescription"] = o.HealthDescription
	}
	if o.Healthy != nil {
		toSerialize["Healthy"] = o.Healthy
	}
	if o.ID != nil {
		toSerialize["ID"] = o.ID
	}
	if o.Locality.IsSet() {
		toSerialize["Locality"] = o.Locality.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableNodeDevice struct {
	value *NodeDevice
	isSet bool
}

func (v NullableNodeDevice) Get() *NodeDevice {
	return v.value
}

func (v *NullableNodeDevice) Set(val *NodeDevice) {
	v.value = val
	v.isSet = true
}

func (v NullableNodeDevice) IsSet() bool {
	return v.isSet
}

func (v *NullableNodeDevice) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNodeDevice(val *NodeDevice) *NullableNodeDevice {
	return &NullableNodeDevice{value: val, isSet: true}
}

func (v NullableNodeDevice) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNodeDevice) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


