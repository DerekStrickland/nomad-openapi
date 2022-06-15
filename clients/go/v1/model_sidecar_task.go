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

// SidecarTask struct for SidecarTask
type SidecarTask struct {
	Config map[string]interface{} `json:"Config,omitempty"`
	Driver *string `json:"Driver,omitempty"`
	Env *map[string]string `json:"Env,omitempty"`
	KillSignal *string `json:"KillSignal,omitempty"`
	KillTimeout *int64 `json:"KillTimeout,omitempty"`
	LogConfig *LogConfig `json:"LogConfig,omitempty"`
	Meta *map[string]string `json:"Meta,omitempty"`
	Name *string `json:"Name,omitempty"`
	Resources NullableResources `json:"Resources,omitempty"`
	ShutdownDelay *int64 `json:"ShutdownDelay,omitempty"`
	User *string `json:"User,omitempty"`
}

// NewSidecarTask instantiates a new SidecarTask object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSidecarTask() *SidecarTask {
	this := SidecarTask{}
	return &this
}

// NewSidecarTaskWithDefaults instantiates a new SidecarTask object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSidecarTaskWithDefaults() *SidecarTask {
	this := SidecarTask{}
	return &this
}

// GetConfig returns the Config field value if set, zero value otherwise.
func (o *SidecarTask) GetConfig() map[string]interface{} {
	if o == nil || o.Config == nil {
		var ret map[string]interface{}
		return ret
	}
	return o.Config
}

// GetConfigOk returns a tuple with the Config field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SidecarTask) GetConfigOk() (map[string]interface{}, bool) {
	if o == nil || o.Config == nil {
		return nil, false
	}
	return o.Config, true
}

// HasConfig returns a boolean if a field has been set.
func (o *SidecarTask) HasConfig() bool {
	if o != nil && o.Config != nil {
		return true
	}

	return false
}

// SetConfig gets a reference to the given map[string]interface{} and assigns it to the Config field.
func (o *SidecarTask) SetConfig(v map[string]interface{}) {
	o.Config = v
}

// GetDriver returns the Driver field value if set, zero value otherwise.
func (o *SidecarTask) GetDriver() string {
	if o == nil || o.Driver == nil {
		var ret string
		return ret
	}
	return *o.Driver
}

// GetDriverOk returns a tuple with the Driver field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SidecarTask) GetDriverOk() (*string, bool) {
	if o == nil || o.Driver == nil {
		return nil, false
	}
	return o.Driver, true
}

// HasDriver returns a boolean if a field has been set.
func (o *SidecarTask) HasDriver() bool {
	if o != nil && o.Driver != nil {
		return true
	}

	return false
}

// SetDriver gets a reference to the given string and assigns it to the Driver field.
func (o *SidecarTask) SetDriver(v string) {
	o.Driver = &v
}

// GetEnv returns the Env field value if set, zero value otherwise.
func (o *SidecarTask) GetEnv() map[string]string {
	if o == nil || o.Env == nil {
		var ret map[string]string
		return ret
	}
	return *o.Env
}

// GetEnvOk returns a tuple with the Env field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SidecarTask) GetEnvOk() (*map[string]string, bool) {
	if o == nil || o.Env == nil {
		return nil, false
	}
	return o.Env, true
}

// HasEnv returns a boolean if a field has been set.
func (o *SidecarTask) HasEnv() bool {
	if o != nil && o.Env != nil {
		return true
	}

	return false
}

// SetEnv gets a reference to the given map[string]string and assigns it to the Env field.
func (o *SidecarTask) SetEnv(v map[string]string) {
	o.Env = &v
}

// GetKillSignal returns the KillSignal field value if set, zero value otherwise.
func (o *SidecarTask) GetKillSignal() string {
	if o == nil || o.KillSignal == nil {
		var ret string
		return ret
	}
	return *o.KillSignal
}

// GetKillSignalOk returns a tuple with the KillSignal field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SidecarTask) GetKillSignalOk() (*string, bool) {
	if o == nil || o.KillSignal == nil {
		return nil, false
	}
	return o.KillSignal, true
}

// HasKillSignal returns a boolean if a field has been set.
func (o *SidecarTask) HasKillSignal() bool {
	if o != nil && o.KillSignal != nil {
		return true
	}

	return false
}

// SetKillSignal gets a reference to the given string and assigns it to the KillSignal field.
func (o *SidecarTask) SetKillSignal(v string) {
	o.KillSignal = &v
}

// GetKillTimeout returns the KillTimeout field value if set, zero value otherwise.
func (o *SidecarTask) GetKillTimeout() int64 {
	if o == nil || o.KillTimeout == nil {
		var ret int64
		return ret
	}
	return *o.KillTimeout
}

// GetKillTimeoutOk returns a tuple with the KillTimeout field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SidecarTask) GetKillTimeoutOk() (*int64, bool) {
	if o == nil || o.KillTimeout == nil {
		return nil, false
	}
	return o.KillTimeout, true
}

// HasKillTimeout returns a boolean if a field has been set.
func (o *SidecarTask) HasKillTimeout() bool {
	if o != nil && o.KillTimeout != nil {
		return true
	}

	return false
}

// SetKillTimeout gets a reference to the given int64 and assigns it to the KillTimeout field.
func (o *SidecarTask) SetKillTimeout(v int64) {
	o.KillTimeout = &v
}

// GetLogConfig returns the LogConfig field value if set, zero value otherwise.
func (o *SidecarTask) GetLogConfig() LogConfig {
	if o == nil || o.LogConfig == nil {
		var ret LogConfig
		return ret
	}
	return *o.LogConfig
}

// GetLogConfigOk returns a tuple with the LogConfig field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SidecarTask) GetLogConfigOk() (*LogConfig, bool) {
	if o == nil || o.LogConfig == nil {
		return nil, false
	}
	return o.LogConfig, true
}

// HasLogConfig returns a boolean if a field has been set.
func (o *SidecarTask) HasLogConfig() bool {
	if o != nil && o.LogConfig != nil {
		return true
	}

	return false
}

// SetLogConfig gets a reference to the given LogConfig and assigns it to the LogConfig field.
func (o *SidecarTask) SetLogConfig(v LogConfig) {
	o.LogConfig = &v
}

// GetMeta returns the Meta field value if set, zero value otherwise.
func (o *SidecarTask) GetMeta() map[string]string {
	if o == nil || o.Meta == nil {
		var ret map[string]string
		return ret
	}
	return *o.Meta
}

// GetMetaOk returns a tuple with the Meta field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SidecarTask) GetMetaOk() (*map[string]string, bool) {
	if o == nil || o.Meta == nil {
		return nil, false
	}
	return o.Meta, true
}

// HasMeta returns a boolean if a field has been set.
func (o *SidecarTask) HasMeta() bool {
	if o != nil && o.Meta != nil {
		return true
	}

	return false
}

// SetMeta gets a reference to the given map[string]string and assigns it to the Meta field.
func (o *SidecarTask) SetMeta(v map[string]string) {
	o.Meta = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *SidecarTask) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SidecarTask) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *SidecarTask) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *SidecarTask) SetName(v string) {
	o.Name = &v
}

// GetResources returns the Resources field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SidecarTask) GetResources() Resources {
	if o == nil || o.Resources.Get() == nil {
		var ret Resources
		return ret
	}
	return *o.Resources.Get()
}

// GetResourcesOk returns a tuple with the Resources field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SidecarTask) GetResourcesOk() (*Resources, bool) {
	if o == nil {
		return nil, false
	}
	return o.Resources.Get(), o.Resources.IsSet()
}

// HasResources returns a boolean if a field has been set.
func (o *SidecarTask) HasResources() bool {
	if o != nil && o.Resources.IsSet() {
		return true
	}

	return false
}

// SetResources gets a reference to the given NullableResources and assigns it to the Resources field.
func (o *SidecarTask) SetResources(v Resources) {
	o.Resources.Set(&v)
}
// SetResourcesNil sets the value for Resources to be an explicit nil
func (o *SidecarTask) SetResourcesNil() {
	o.Resources.Set(nil)
}

// UnsetResources ensures that no value is present for Resources, not even an explicit nil
func (o *SidecarTask) UnsetResources() {
	o.Resources.Unset()
}

// GetShutdownDelay returns the ShutdownDelay field value if set, zero value otherwise.
func (o *SidecarTask) GetShutdownDelay() int64 {
	if o == nil || o.ShutdownDelay == nil {
		var ret int64
		return ret
	}
	return *o.ShutdownDelay
}

// GetShutdownDelayOk returns a tuple with the ShutdownDelay field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SidecarTask) GetShutdownDelayOk() (*int64, bool) {
	if o == nil || o.ShutdownDelay == nil {
		return nil, false
	}
	return o.ShutdownDelay, true
}

// HasShutdownDelay returns a boolean if a field has been set.
func (o *SidecarTask) HasShutdownDelay() bool {
	if o != nil && o.ShutdownDelay != nil {
		return true
	}

	return false
}

// SetShutdownDelay gets a reference to the given int64 and assigns it to the ShutdownDelay field.
func (o *SidecarTask) SetShutdownDelay(v int64) {
	o.ShutdownDelay = &v
}

// GetUser returns the User field value if set, zero value otherwise.
func (o *SidecarTask) GetUser() string {
	if o == nil || o.User == nil {
		var ret string
		return ret
	}
	return *o.User
}

// GetUserOk returns a tuple with the User field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SidecarTask) GetUserOk() (*string, bool) {
	if o == nil || o.User == nil {
		return nil, false
	}
	return o.User, true
}

// HasUser returns a boolean if a field has been set.
func (o *SidecarTask) HasUser() bool {
	if o != nil && o.User != nil {
		return true
	}

	return false
}

// SetUser gets a reference to the given string and assigns it to the User field.
func (o *SidecarTask) SetUser(v string) {
	o.User = &v
}

func (o SidecarTask) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Config != nil {
		toSerialize["Config"] = o.Config
	}
	if o.Driver != nil {
		toSerialize["Driver"] = o.Driver
	}
	if o.Env != nil {
		toSerialize["Env"] = o.Env
	}
	if o.KillSignal != nil {
		toSerialize["KillSignal"] = o.KillSignal
	}
	if o.KillTimeout != nil {
		toSerialize["KillTimeout"] = o.KillTimeout
	}
	if o.LogConfig != nil {
		toSerialize["LogConfig"] = o.LogConfig
	}
	if o.Meta != nil {
		toSerialize["Meta"] = o.Meta
	}
	if o.Name != nil {
		toSerialize["Name"] = o.Name
	}
	if o.Resources.IsSet() {
		toSerialize["Resources"] = o.Resources.Get()
	}
	if o.ShutdownDelay != nil {
		toSerialize["ShutdownDelay"] = o.ShutdownDelay
	}
	if o.User != nil {
		toSerialize["User"] = o.User
	}
	return json.Marshal(toSerialize)
}

type NullableSidecarTask struct {
	value *SidecarTask
	isSet bool
}

func (v NullableSidecarTask) Get() *SidecarTask {
	return v.value
}

func (v *NullableSidecarTask) Set(val *SidecarTask) {
	v.value = val
	v.isSet = true
}

func (v NullableSidecarTask) IsSet() bool {
	return v.isSet
}

func (v *NullableSidecarTask) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSidecarTask(val *SidecarTask) *NullableSidecarTask {
	return &NullableSidecarTask{value: val, isSet: true}
}

func (v NullableSidecarTask) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSidecarTask) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


