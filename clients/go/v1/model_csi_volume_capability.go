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

// CSIVolumeCapability struct for CSIVolumeCapability
type CSIVolumeCapability struct {
	AccessMode *string `json:"AccessMode,omitempty"`
	AttachmentMode *string `json:"AttachmentMode,omitempty"`
}

// NewCSIVolumeCapability instantiates a new CSIVolumeCapability object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCSIVolumeCapability() *CSIVolumeCapability {
	this := CSIVolumeCapability{}
	return &this
}

// NewCSIVolumeCapabilityWithDefaults instantiates a new CSIVolumeCapability object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCSIVolumeCapabilityWithDefaults() *CSIVolumeCapability {
	this := CSIVolumeCapability{}
	return &this
}

// GetAccessMode returns the AccessMode field value if set, zero value otherwise.
func (o *CSIVolumeCapability) GetAccessMode() string {
	if o == nil || o.AccessMode == nil {
		var ret string
		return ret
	}
	return *o.AccessMode
}

// GetAccessModeOk returns a tuple with the AccessMode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolumeCapability) GetAccessModeOk() (*string, bool) {
	if o == nil || o.AccessMode == nil {
		return nil, false
	}
	return o.AccessMode, true
}

// HasAccessMode returns a boolean if a field has been set.
func (o *CSIVolumeCapability) HasAccessMode() bool {
	if o != nil && o.AccessMode != nil {
		return true
	}

	return false
}

// SetAccessMode gets a reference to the given string and assigns it to the AccessMode field.
func (o *CSIVolumeCapability) SetAccessMode(v string) {
	o.AccessMode = &v
}

// GetAttachmentMode returns the AttachmentMode field value if set, zero value otherwise.
func (o *CSIVolumeCapability) GetAttachmentMode() string {
	if o == nil || o.AttachmentMode == nil {
		var ret string
		return ret
	}
	return *o.AttachmentMode
}

// GetAttachmentModeOk returns a tuple with the AttachmentMode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolumeCapability) GetAttachmentModeOk() (*string, bool) {
	if o == nil || o.AttachmentMode == nil {
		return nil, false
	}
	return o.AttachmentMode, true
}

// HasAttachmentMode returns a boolean if a field has been set.
func (o *CSIVolumeCapability) HasAttachmentMode() bool {
	if o != nil && o.AttachmentMode != nil {
		return true
	}

	return false
}

// SetAttachmentMode gets a reference to the given string and assigns it to the AttachmentMode field.
func (o *CSIVolumeCapability) SetAttachmentMode(v string) {
	o.AttachmentMode = &v
}

func (o CSIVolumeCapability) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.AccessMode != nil {
		toSerialize["AccessMode"] = o.AccessMode
	}
	if o.AttachmentMode != nil {
		toSerialize["AttachmentMode"] = o.AttachmentMode
	}
	return json.Marshal(toSerialize)
}

type NullableCSIVolumeCapability struct {
	value *CSIVolumeCapability
	isSet bool
}

func (v NullableCSIVolumeCapability) Get() *CSIVolumeCapability {
	return v.value
}

func (v *NullableCSIVolumeCapability) Set(val *CSIVolumeCapability) {
	v.value = val
	v.isSet = true
}

func (v NullableCSIVolumeCapability) IsSet() bool {
	return v.isSet
}

func (v *NullableCSIVolumeCapability) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCSIVolumeCapability(val *CSIVolumeCapability) *NullableCSIVolumeCapability {
	return &NullableCSIVolumeCapability{value: val, isSet: true}
}

func (v NullableCSIVolumeCapability) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCSIVolumeCapability) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


