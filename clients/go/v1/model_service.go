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

// Service struct for Service
type Service struct {
	Address *string `json:"Address,omitempty"`
	AddressMode *string `json:"AddressMode,omitempty"`
	CanaryMeta *map[string]string `json:"CanaryMeta,omitempty"`
	CanaryTags []string `json:"CanaryTags,omitempty"`
	CheckRestart NullableCheckRestart `json:"CheckRestart,omitempty"`
	Checks []ServiceCheck `json:"Checks,omitempty"`
	Connect NullableConsulConnect `json:"Connect,omitempty"`
	EnableTagOverride *bool `json:"EnableTagOverride,omitempty"`
	Meta *map[string]string `json:"Meta,omitempty"`
	Name *string `json:"Name,omitempty"`
	OnUpdate *string `json:"OnUpdate,omitempty"`
	PortLabel *string `json:"PortLabel,omitempty"`
	Provider *string `json:"Provider,omitempty"`
	TaggedAddresses *map[string]string `json:"TaggedAddresses,omitempty"`
	Tags []string `json:"Tags,omitempty"`
	TaskName *string `json:"TaskName,omitempty"`
}

// NewService instantiates a new Service object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewService() *Service {
	this := Service{}
	return &this
}

// NewServiceWithDefaults instantiates a new Service object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewServiceWithDefaults() *Service {
	this := Service{}
	return &this
}

// GetAddress returns the Address field value if set, zero value otherwise.
func (o *Service) GetAddress() string {
	if o == nil || o.Address == nil {
		var ret string
		return ret
	}
	return *o.Address
}

// GetAddressOk returns a tuple with the Address field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetAddressOk() (*string, bool) {
	if o == nil || o.Address == nil {
		return nil, false
	}
	return o.Address, true
}

// HasAddress returns a boolean if a field has been set.
func (o *Service) HasAddress() bool {
	if o != nil && o.Address != nil {
		return true
	}

	return false
}

// SetAddress gets a reference to the given string and assigns it to the Address field.
func (o *Service) SetAddress(v string) {
	o.Address = &v
}

// GetAddressMode returns the AddressMode field value if set, zero value otherwise.
func (o *Service) GetAddressMode() string {
	if o == nil || o.AddressMode == nil {
		var ret string
		return ret
	}
	return *o.AddressMode
}

// GetAddressModeOk returns a tuple with the AddressMode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetAddressModeOk() (*string, bool) {
	if o == nil || o.AddressMode == nil {
		return nil, false
	}
	return o.AddressMode, true
}

// HasAddressMode returns a boolean if a field has been set.
func (o *Service) HasAddressMode() bool {
	if o != nil && o.AddressMode != nil {
		return true
	}

	return false
}

// SetAddressMode gets a reference to the given string and assigns it to the AddressMode field.
func (o *Service) SetAddressMode(v string) {
	o.AddressMode = &v
}

// GetCanaryMeta returns the CanaryMeta field value if set, zero value otherwise.
func (o *Service) GetCanaryMeta() map[string]string {
	if o == nil || o.CanaryMeta == nil {
		var ret map[string]string
		return ret
	}
	return *o.CanaryMeta
}

// GetCanaryMetaOk returns a tuple with the CanaryMeta field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetCanaryMetaOk() (*map[string]string, bool) {
	if o == nil || o.CanaryMeta == nil {
		return nil, false
	}
	return o.CanaryMeta, true
}

// HasCanaryMeta returns a boolean if a field has been set.
func (o *Service) HasCanaryMeta() bool {
	if o != nil && o.CanaryMeta != nil {
		return true
	}

	return false
}

// SetCanaryMeta gets a reference to the given map[string]string and assigns it to the CanaryMeta field.
func (o *Service) SetCanaryMeta(v map[string]string) {
	o.CanaryMeta = &v
}

// GetCanaryTags returns the CanaryTags field value if set, zero value otherwise.
func (o *Service) GetCanaryTags() []string {
	if o == nil || o.CanaryTags == nil {
		var ret []string
		return ret
	}
	return o.CanaryTags
}

// GetCanaryTagsOk returns a tuple with the CanaryTags field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetCanaryTagsOk() ([]string, bool) {
	if o == nil || o.CanaryTags == nil {
		return nil, false
	}
	return o.CanaryTags, true
}

// HasCanaryTags returns a boolean if a field has been set.
func (o *Service) HasCanaryTags() bool {
	if o != nil && o.CanaryTags != nil {
		return true
	}

	return false
}

// SetCanaryTags gets a reference to the given []string and assigns it to the CanaryTags field.
func (o *Service) SetCanaryTags(v []string) {
	o.CanaryTags = v
}

// GetCheckRestart returns the CheckRestart field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Service) GetCheckRestart() CheckRestart {
	if o == nil || o.CheckRestart.Get() == nil {
		var ret CheckRestart
		return ret
	}
	return *o.CheckRestart.Get()
}

// GetCheckRestartOk returns a tuple with the CheckRestart field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Service) GetCheckRestartOk() (*CheckRestart, bool) {
	if o == nil  {
		return nil, false
	}
	return o.CheckRestart.Get(), o.CheckRestart.IsSet()
}

// HasCheckRestart returns a boolean if a field has been set.
func (o *Service) HasCheckRestart() bool {
	if o != nil && o.CheckRestart.IsSet() {
		return true
	}

	return false
}

// SetCheckRestart gets a reference to the given NullableCheckRestart and assigns it to the CheckRestart field.
func (o *Service) SetCheckRestart(v CheckRestart) {
	o.CheckRestart.Set(&v)
}
// SetCheckRestartNil sets the value for CheckRestart to be an explicit nil
func (o *Service) SetCheckRestartNil() {
	o.CheckRestart.Set(nil)
}

// UnsetCheckRestart ensures that no value is present for CheckRestart, not even an explicit nil
func (o *Service) UnsetCheckRestart() {
	o.CheckRestart.Unset()
}

// GetChecks returns the Checks field value if set, zero value otherwise.
func (o *Service) GetChecks() []ServiceCheck {
	if o == nil || o.Checks == nil {
		var ret []ServiceCheck
		return ret
	}
	return o.Checks
}

// GetChecksOk returns a tuple with the Checks field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetChecksOk() ([]ServiceCheck, bool) {
	if o == nil || o.Checks == nil {
		return nil, false
	}
	return o.Checks, true
}

// HasChecks returns a boolean if a field has been set.
func (o *Service) HasChecks() bool {
	if o != nil && o.Checks != nil {
		return true
	}

	return false
}

// SetChecks gets a reference to the given []ServiceCheck and assigns it to the Checks field.
func (o *Service) SetChecks(v []ServiceCheck) {
	o.Checks = v
}

// GetConnect returns the Connect field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Service) GetConnect() ConsulConnect {
	if o == nil || o.Connect.Get() == nil {
		var ret ConsulConnect
		return ret
	}
	return *o.Connect.Get()
}

// GetConnectOk returns a tuple with the Connect field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Service) GetConnectOk() (*ConsulConnect, bool) {
	if o == nil  {
		return nil, false
	}
	return o.Connect.Get(), o.Connect.IsSet()
}

// HasConnect returns a boolean if a field has been set.
func (o *Service) HasConnect() bool {
	if o != nil && o.Connect.IsSet() {
		return true
	}

	return false
}

// SetConnect gets a reference to the given NullableConsulConnect and assigns it to the Connect field.
func (o *Service) SetConnect(v ConsulConnect) {
	o.Connect.Set(&v)
}
// SetConnectNil sets the value for Connect to be an explicit nil
func (o *Service) SetConnectNil() {
	o.Connect.Set(nil)
}

// UnsetConnect ensures that no value is present for Connect, not even an explicit nil
func (o *Service) UnsetConnect() {
	o.Connect.Unset()
}

// GetEnableTagOverride returns the EnableTagOverride field value if set, zero value otherwise.
func (o *Service) GetEnableTagOverride() bool {
	if o == nil || o.EnableTagOverride == nil {
		var ret bool
		return ret
	}
	return *o.EnableTagOverride
}

// GetEnableTagOverrideOk returns a tuple with the EnableTagOverride field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetEnableTagOverrideOk() (*bool, bool) {
	if o == nil || o.EnableTagOverride == nil {
		return nil, false
	}
	return o.EnableTagOverride, true
}

// HasEnableTagOverride returns a boolean if a field has been set.
func (o *Service) HasEnableTagOverride() bool {
	if o != nil && o.EnableTagOverride != nil {
		return true
	}

	return false
}

// SetEnableTagOverride gets a reference to the given bool and assigns it to the EnableTagOverride field.
func (o *Service) SetEnableTagOverride(v bool) {
	o.EnableTagOverride = &v
}

// GetMeta returns the Meta field value if set, zero value otherwise.
func (o *Service) GetMeta() map[string]string {
	if o == nil || o.Meta == nil {
		var ret map[string]string
		return ret
	}
	return *o.Meta
}

// GetMetaOk returns a tuple with the Meta field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetMetaOk() (*map[string]string, bool) {
	if o == nil || o.Meta == nil {
		return nil, false
	}
	return o.Meta, true
}

// HasMeta returns a boolean if a field has been set.
func (o *Service) HasMeta() bool {
	if o != nil && o.Meta != nil {
		return true
	}

	return false
}

// SetMeta gets a reference to the given map[string]string and assigns it to the Meta field.
func (o *Service) SetMeta(v map[string]string) {
	o.Meta = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *Service) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *Service) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *Service) SetName(v string) {
	o.Name = &v
}

// GetOnUpdate returns the OnUpdate field value if set, zero value otherwise.
func (o *Service) GetOnUpdate() string {
	if o == nil || o.OnUpdate == nil {
		var ret string
		return ret
	}
	return *o.OnUpdate
}

// GetOnUpdateOk returns a tuple with the OnUpdate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetOnUpdateOk() (*string, bool) {
	if o == nil || o.OnUpdate == nil {
		return nil, false
	}
	return o.OnUpdate, true
}

// HasOnUpdate returns a boolean if a field has been set.
func (o *Service) HasOnUpdate() bool {
	if o != nil && o.OnUpdate != nil {
		return true
	}

	return false
}

// SetOnUpdate gets a reference to the given string and assigns it to the OnUpdate field.
func (o *Service) SetOnUpdate(v string) {
	o.OnUpdate = &v
}

// GetPortLabel returns the PortLabel field value if set, zero value otherwise.
func (o *Service) GetPortLabel() string {
	if o == nil || o.PortLabel == nil {
		var ret string
		return ret
	}
	return *o.PortLabel
}

// GetPortLabelOk returns a tuple with the PortLabel field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetPortLabelOk() (*string, bool) {
	if o == nil || o.PortLabel == nil {
		return nil, false
	}
	return o.PortLabel, true
}

// HasPortLabel returns a boolean if a field has been set.
func (o *Service) HasPortLabel() bool {
	if o != nil && o.PortLabel != nil {
		return true
	}

	return false
}

// SetPortLabel gets a reference to the given string and assigns it to the PortLabel field.
func (o *Service) SetPortLabel(v string) {
	o.PortLabel = &v
}

// GetProvider returns the Provider field value if set, zero value otherwise.
func (o *Service) GetProvider() string {
	if o == nil || o.Provider == nil {
		var ret string
		return ret
	}
	return *o.Provider
}

// GetProviderOk returns a tuple with the Provider field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetProviderOk() (*string, bool) {
	if o == nil || o.Provider == nil {
		return nil, false
	}
	return o.Provider, true
}

// HasProvider returns a boolean if a field has been set.
func (o *Service) HasProvider() bool {
	if o != nil && o.Provider != nil {
		return true
	}

	return false
}

// SetProvider gets a reference to the given string and assigns it to the Provider field.
func (o *Service) SetProvider(v string) {
	o.Provider = &v
}

// GetTaggedAddresses returns the TaggedAddresses field value if set, zero value otherwise.
func (o *Service) GetTaggedAddresses() map[string]string {
	if o == nil || o.TaggedAddresses == nil {
		var ret map[string]string
		return ret
	}
	return *o.TaggedAddresses
}

// GetTaggedAddressesOk returns a tuple with the TaggedAddresses field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetTaggedAddressesOk() (*map[string]string, bool) {
	if o == nil || o.TaggedAddresses == nil {
		return nil, false
	}
	return o.TaggedAddresses, true
}

// HasTaggedAddresses returns a boolean if a field has been set.
func (o *Service) HasTaggedAddresses() bool {
	if o != nil && o.TaggedAddresses != nil {
		return true
	}

	return false
}

// SetTaggedAddresses gets a reference to the given map[string]string and assigns it to the TaggedAddresses field.
func (o *Service) SetTaggedAddresses(v map[string]string) {
	o.TaggedAddresses = &v
}

// GetTags returns the Tags field value if set, zero value otherwise.
func (o *Service) GetTags() []string {
	if o == nil || o.Tags == nil {
		var ret []string
		return ret
	}
	return o.Tags
}

// GetTagsOk returns a tuple with the Tags field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetTagsOk() ([]string, bool) {
	if o == nil || o.Tags == nil {
		return nil, false
	}
	return o.Tags, true
}

// HasTags returns a boolean if a field has been set.
func (o *Service) HasTags() bool {
	if o != nil && o.Tags != nil {
		return true
	}

	return false
}

// SetTags gets a reference to the given []string and assigns it to the Tags field.
func (o *Service) SetTags(v []string) {
	o.Tags = v
}

// GetTaskName returns the TaskName field value if set, zero value otherwise.
func (o *Service) GetTaskName() string {
	if o == nil || o.TaskName == nil {
		var ret string
		return ret
	}
	return *o.TaskName
}

// GetTaskNameOk returns a tuple with the TaskName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Service) GetTaskNameOk() (*string, bool) {
	if o == nil || o.TaskName == nil {
		return nil, false
	}
	return o.TaskName, true
}

// HasTaskName returns a boolean if a field has been set.
func (o *Service) HasTaskName() bool {
	if o != nil && o.TaskName != nil {
		return true
	}

	return false
}

// SetTaskName gets a reference to the given string and assigns it to the TaskName field.
func (o *Service) SetTaskName(v string) {
	o.TaskName = &v
}

func (o Service) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Address != nil {
		toSerialize["Address"] = o.Address
	}
	if o.AddressMode != nil {
		toSerialize["AddressMode"] = o.AddressMode
	}
	if o.CanaryMeta != nil {
		toSerialize["CanaryMeta"] = o.CanaryMeta
	}
	if o.CanaryTags != nil {
		toSerialize["CanaryTags"] = o.CanaryTags
	}
	if o.CheckRestart.IsSet() {
		toSerialize["CheckRestart"] = o.CheckRestart.Get()
	}
	if o.Checks != nil {
		toSerialize["Checks"] = o.Checks
	}
	if o.Connect.IsSet() {
		toSerialize["Connect"] = o.Connect.Get()
	}
	if o.EnableTagOverride != nil {
		toSerialize["EnableTagOverride"] = o.EnableTagOverride
	}
	if o.Meta != nil {
		toSerialize["Meta"] = o.Meta
	}
	if o.Name != nil {
		toSerialize["Name"] = o.Name
	}
	if o.OnUpdate != nil {
		toSerialize["OnUpdate"] = o.OnUpdate
	}
	if o.PortLabel != nil {
		toSerialize["PortLabel"] = o.PortLabel
	}
	if o.Provider != nil {
		toSerialize["Provider"] = o.Provider
	}
	if o.TaggedAddresses != nil {
		toSerialize["TaggedAddresses"] = o.TaggedAddresses
	}
	if o.Tags != nil {
		toSerialize["Tags"] = o.Tags
	}
	if o.TaskName != nil {
		toSerialize["TaskName"] = o.TaskName
	}
	return json.Marshal(toSerialize)
}

type NullableService struct {
	value *Service
	isSet bool
}

func (v NullableService) Get() *Service {
	return v.value
}

func (v *NullableService) Set(val *Service) {
	v.value = val
	v.isSet = true
}

func (v NullableService) IsSet() bool {
	return v.isSet
}

func (v *NullableService) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableService(val *Service) *NullableService {
	return &NullableService{value: val, isSet: true}
}

func (v NullableService) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableService) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


