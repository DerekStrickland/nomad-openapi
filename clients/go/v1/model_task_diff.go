/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.1.4
 * Contact: support@hashicorp.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// TaskDiff struct for TaskDiff
type TaskDiff struct {
	Annotations *[]string `json:"Annotations,omitempty"`
	Fields *[]FieldDiff `json:"Fields,omitempty"`
	Name *string `json:"Name,omitempty"`
	Objects *[]ObjectDiff `json:"Objects,omitempty"`
	Type *string `json:"Type,omitempty"`
}

// NewTaskDiff instantiates a new TaskDiff object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTaskDiff() *TaskDiff {
	this := TaskDiff{}
	return &this
}

// NewTaskDiffWithDefaults instantiates a new TaskDiff object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTaskDiffWithDefaults() *TaskDiff {
	this := TaskDiff{}
	return &this
}

// GetAnnotations returns the Annotations field value if set, zero value otherwise.
func (o *TaskDiff) GetAnnotations() []string {
	if o == nil || o.Annotations == nil {
		var ret []string
		return ret
	}
	return *o.Annotations
}

// GetAnnotationsOk returns a tuple with the Annotations field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TaskDiff) GetAnnotationsOk() (*[]string, bool) {
	if o == nil || o.Annotations == nil {
		return nil, false
	}
	return o.Annotations, true
}

// HasAnnotations returns a boolean if a field has been set.
func (o *TaskDiff) HasAnnotations() bool {
	if o != nil && o.Annotations != nil {
		return true
	}

	return false
}

// SetAnnotations gets a reference to the given []string and assigns it to the Annotations field.
func (o *TaskDiff) SetAnnotations(v []string) {
	o.Annotations = &v
}

// GetFields returns the Fields field value if set, zero value otherwise.
func (o *TaskDiff) GetFields() []FieldDiff {
	if o == nil || o.Fields == nil {
		var ret []FieldDiff
		return ret
	}
	return *o.Fields
}

// GetFieldsOk returns a tuple with the Fields field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TaskDiff) GetFieldsOk() (*[]FieldDiff, bool) {
	if o == nil || o.Fields == nil {
		return nil, false
	}
	return o.Fields, true
}

// HasFields returns a boolean if a field has been set.
func (o *TaskDiff) HasFields() bool {
	if o != nil && o.Fields != nil {
		return true
	}

	return false
}

// SetFields gets a reference to the given []FieldDiff and assigns it to the Fields field.
func (o *TaskDiff) SetFields(v []FieldDiff) {
	o.Fields = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *TaskDiff) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TaskDiff) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *TaskDiff) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *TaskDiff) SetName(v string) {
	o.Name = &v
}

// GetObjects returns the Objects field value if set, zero value otherwise.
func (o *TaskDiff) GetObjects() []ObjectDiff {
	if o == nil || o.Objects == nil {
		var ret []ObjectDiff
		return ret
	}
	return *o.Objects
}

// GetObjectsOk returns a tuple with the Objects field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TaskDiff) GetObjectsOk() (*[]ObjectDiff, bool) {
	if o == nil || o.Objects == nil {
		return nil, false
	}
	return o.Objects, true
}

// HasObjects returns a boolean if a field has been set.
func (o *TaskDiff) HasObjects() bool {
	if o != nil && o.Objects != nil {
		return true
	}

	return false
}

// SetObjects gets a reference to the given []ObjectDiff and assigns it to the Objects field.
func (o *TaskDiff) SetObjects(v []ObjectDiff) {
	o.Objects = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *TaskDiff) GetType() string {
	if o == nil || o.Type == nil {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TaskDiff) GetTypeOk() (*string, bool) {
	if o == nil || o.Type == nil {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *TaskDiff) HasType() bool {
	if o != nil && o.Type != nil {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *TaskDiff) SetType(v string) {
	o.Type = &v
}

func (o TaskDiff) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Annotations != nil {
		toSerialize["Annotations"] = o.Annotations
	}
	if o.Fields != nil {
		toSerialize["Fields"] = o.Fields
	}
	if o.Name != nil {
		toSerialize["Name"] = o.Name
	}
	if o.Objects != nil {
		toSerialize["Objects"] = o.Objects
	}
	if o.Type != nil {
		toSerialize["Type"] = o.Type
	}
	return json.Marshal(toSerialize)
}

type NullableTaskDiff struct {
	value *TaskDiff
	isSet bool
}

func (v NullableTaskDiff) Get() *TaskDiff {
	return v.value
}

func (v *NullableTaskDiff) Set(val *TaskDiff) {
	v.value = val
	v.isSet = true
}

func (v NullableTaskDiff) IsSet() bool {
	return v.isSet
}

func (v *NullableTaskDiff) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTaskDiff(val *TaskDiff) *NullableTaskDiff {
	return &NullableTaskDiff{value: val, isSet: true}
}

func (v NullableTaskDiff) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTaskDiff) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

