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
	"time"
)

// TaskState struct for TaskState
type TaskState struct {
	Events []TaskEvent `json:"Events,omitempty"`
	Failed *bool `json:"Failed,omitempty"`
	FinishedAt NullableTime `json:"FinishedAt,omitempty"`
	LastRestart NullableTime `json:"LastRestart,omitempty"`
	Restarts *int32 `json:"Restarts,omitempty"`
	StartedAt NullableTime `json:"StartedAt,omitempty"`
	State *string `json:"State,omitempty"`
	TaskHandle NullableTaskHandle `json:"TaskHandle,omitempty"`
}

// NewTaskState instantiates a new TaskState object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTaskState() *TaskState {
	this := TaskState{}
	return &this
}

// NewTaskStateWithDefaults instantiates a new TaskState object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTaskStateWithDefaults() *TaskState {
	this := TaskState{}
	return &this
}

// GetEvents returns the Events field value if set, zero value otherwise.
func (o *TaskState) GetEvents() []TaskEvent {
	if o == nil || o.Events == nil {
		var ret []TaskEvent
		return ret
	}
	return o.Events
}

// GetEventsOk returns a tuple with the Events field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TaskState) GetEventsOk() ([]TaskEvent, bool) {
	if o == nil || o.Events == nil {
		return nil, false
	}
	return o.Events, true
}

// HasEvents returns a boolean if a field has been set.
func (o *TaskState) HasEvents() bool {
	if o != nil && o.Events != nil {
		return true
	}

	return false
}

// SetEvents gets a reference to the given []TaskEvent and assigns it to the Events field.
func (o *TaskState) SetEvents(v []TaskEvent) {
	o.Events = v
}

// GetFailed returns the Failed field value if set, zero value otherwise.
func (o *TaskState) GetFailed() bool {
	if o == nil || o.Failed == nil {
		var ret bool
		return ret
	}
	return *o.Failed
}

// GetFailedOk returns a tuple with the Failed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TaskState) GetFailedOk() (*bool, bool) {
	if o == nil || o.Failed == nil {
		return nil, false
	}
	return o.Failed, true
}

// HasFailed returns a boolean if a field has been set.
func (o *TaskState) HasFailed() bool {
	if o != nil && o.Failed != nil {
		return true
	}

	return false
}

// SetFailed gets a reference to the given bool and assigns it to the Failed field.
func (o *TaskState) SetFailed(v bool) {
	o.Failed = &v
}

// GetFinishedAt returns the FinishedAt field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *TaskState) GetFinishedAt() time.Time {
	if o == nil || o.FinishedAt.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.FinishedAt.Get()
}

// GetFinishedAtOk returns a tuple with the FinishedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *TaskState) GetFinishedAtOk() (*time.Time, bool) {
	if o == nil  {
		return nil, false
	}
	return o.FinishedAt.Get(), o.FinishedAt.IsSet()
}

// HasFinishedAt returns a boolean if a field has been set.
func (o *TaskState) HasFinishedAt() bool {
	if o != nil && o.FinishedAt.IsSet() {
		return true
	}

	return false
}

// SetFinishedAt gets a reference to the given NullableTime and assigns it to the FinishedAt field.
func (o *TaskState) SetFinishedAt(v time.Time) {
	o.FinishedAt.Set(&v)
}
// SetFinishedAtNil sets the value for FinishedAt to be an explicit nil
func (o *TaskState) SetFinishedAtNil() {
	o.FinishedAt.Set(nil)
}

// UnsetFinishedAt ensures that no value is present for FinishedAt, not even an explicit nil
func (o *TaskState) UnsetFinishedAt() {
	o.FinishedAt.Unset()
}

// GetLastRestart returns the LastRestart field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *TaskState) GetLastRestart() time.Time {
	if o == nil || o.LastRestart.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.LastRestart.Get()
}

// GetLastRestartOk returns a tuple with the LastRestart field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *TaskState) GetLastRestartOk() (*time.Time, bool) {
	if o == nil  {
		return nil, false
	}
	return o.LastRestart.Get(), o.LastRestart.IsSet()
}

// HasLastRestart returns a boolean if a field has been set.
func (o *TaskState) HasLastRestart() bool {
	if o != nil && o.LastRestart.IsSet() {
		return true
	}

	return false
}

// SetLastRestart gets a reference to the given NullableTime and assigns it to the LastRestart field.
func (o *TaskState) SetLastRestart(v time.Time) {
	o.LastRestart.Set(&v)
}
// SetLastRestartNil sets the value for LastRestart to be an explicit nil
func (o *TaskState) SetLastRestartNil() {
	o.LastRestart.Set(nil)
}

// UnsetLastRestart ensures that no value is present for LastRestart, not even an explicit nil
func (o *TaskState) UnsetLastRestart() {
	o.LastRestart.Unset()
}

// GetRestarts returns the Restarts field value if set, zero value otherwise.
func (o *TaskState) GetRestarts() int32 {
	if o == nil || o.Restarts == nil {
		var ret int32
		return ret
	}
	return *o.Restarts
}

// GetRestartsOk returns a tuple with the Restarts field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TaskState) GetRestartsOk() (*int32, bool) {
	if o == nil || o.Restarts == nil {
		return nil, false
	}
	return o.Restarts, true
}

// HasRestarts returns a boolean if a field has been set.
func (o *TaskState) HasRestarts() bool {
	if o != nil && o.Restarts != nil {
		return true
	}

	return false
}

// SetRestarts gets a reference to the given int32 and assigns it to the Restarts field.
func (o *TaskState) SetRestarts(v int32) {
	o.Restarts = &v
}

// GetStartedAt returns the StartedAt field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *TaskState) GetStartedAt() time.Time {
	if o == nil || o.StartedAt.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.StartedAt.Get()
}

// GetStartedAtOk returns a tuple with the StartedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *TaskState) GetStartedAtOk() (*time.Time, bool) {
	if o == nil  {
		return nil, false
	}
	return o.StartedAt.Get(), o.StartedAt.IsSet()
}

// HasStartedAt returns a boolean if a field has been set.
func (o *TaskState) HasStartedAt() bool {
	if o != nil && o.StartedAt.IsSet() {
		return true
	}

	return false
}

// SetStartedAt gets a reference to the given NullableTime and assigns it to the StartedAt field.
func (o *TaskState) SetStartedAt(v time.Time) {
	o.StartedAt.Set(&v)
}
// SetStartedAtNil sets the value for StartedAt to be an explicit nil
func (o *TaskState) SetStartedAtNil() {
	o.StartedAt.Set(nil)
}

// UnsetStartedAt ensures that no value is present for StartedAt, not even an explicit nil
func (o *TaskState) UnsetStartedAt() {
	o.StartedAt.Unset()
}

// GetState returns the State field value if set, zero value otherwise.
func (o *TaskState) GetState() string {
	if o == nil || o.State == nil {
		var ret string
		return ret
	}
	return *o.State
}

// GetStateOk returns a tuple with the State field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TaskState) GetStateOk() (*string, bool) {
	if o == nil || o.State == nil {
		return nil, false
	}
	return o.State, true
}

// HasState returns a boolean if a field has been set.
func (o *TaskState) HasState() bool {
	if o != nil && o.State != nil {
		return true
	}

	return false
}

// SetState gets a reference to the given string and assigns it to the State field.
func (o *TaskState) SetState(v string) {
	o.State = &v
}

// GetTaskHandle returns the TaskHandle field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *TaskState) GetTaskHandle() TaskHandle {
	if o == nil || o.TaskHandle.Get() == nil {
		var ret TaskHandle
		return ret
	}
	return *o.TaskHandle.Get()
}

// GetTaskHandleOk returns a tuple with the TaskHandle field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *TaskState) GetTaskHandleOk() (*TaskHandle, bool) {
	if o == nil  {
		return nil, false
	}
	return o.TaskHandle.Get(), o.TaskHandle.IsSet()
}

// HasTaskHandle returns a boolean if a field has been set.
func (o *TaskState) HasTaskHandle() bool {
	if o != nil && o.TaskHandle.IsSet() {
		return true
	}

	return false
}

// SetTaskHandle gets a reference to the given NullableTaskHandle and assigns it to the TaskHandle field.
func (o *TaskState) SetTaskHandle(v TaskHandle) {
	o.TaskHandle.Set(&v)
}
// SetTaskHandleNil sets the value for TaskHandle to be an explicit nil
func (o *TaskState) SetTaskHandleNil() {
	o.TaskHandle.Set(nil)
}

// UnsetTaskHandle ensures that no value is present for TaskHandle, not even an explicit nil
func (o *TaskState) UnsetTaskHandle() {
	o.TaskHandle.Unset()
}

func (o TaskState) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Events != nil {
		toSerialize["Events"] = o.Events
	}
	if o.Failed != nil {
		toSerialize["Failed"] = o.Failed
	}
	if o.FinishedAt.IsSet() {
		toSerialize["FinishedAt"] = o.FinishedAt.Get()
	}
	if o.LastRestart.IsSet() {
		toSerialize["LastRestart"] = o.LastRestart.Get()
	}
	if o.Restarts != nil {
		toSerialize["Restarts"] = o.Restarts
	}
	if o.StartedAt.IsSet() {
		toSerialize["StartedAt"] = o.StartedAt.Get()
	}
	if o.State != nil {
		toSerialize["State"] = o.State
	}
	if o.TaskHandle.IsSet() {
		toSerialize["TaskHandle"] = o.TaskHandle.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableTaskState struct {
	value *TaskState
	isSet bool
}

func (v NullableTaskState) Get() *TaskState {
	return v.value
}

func (v *NullableTaskState) Set(val *TaskState) {
	v.value = val
	v.isSet = true
}

func (v NullableTaskState) IsSet() bool {
	return v.isSet
}

func (v *NullableTaskState) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTaskState(val *TaskState) *NullableTaskState {
	return &NullableTaskState{value: val, isSet: true}
}

func (v NullableTaskState) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTaskState) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


