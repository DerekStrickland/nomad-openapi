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

// Evaluation struct for Evaluation
type Evaluation struct {
	AnnotatePlan *bool `json:"AnnotatePlan,omitempty"`
	BlockedEval *string `json:"BlockedEval,omitempty"`
	ClassEligibility *map[string]bool `json:"ClassEligibility,omitempty"`
	CreateIndex *int32 `json:"CreateIndex,omitempty"`
	CreateTime *int64 `json:"CreateTime,omitempty"`
	DeploymentID *string `json:"DeploymentID,omitempty"`
	EscapedComputedClass *bool `json:"EscapedComputedClass,omitempty"`
	FailedTGAllocs *map[string]AllocationMetric `json:"FailedTGAllocs,omitempty"`
	ID *string `json:"ID,omitempty"`
	JobID *string `json:"JobID,omitempty"`
	JobModifyIndex *int32 `json:"JobModifyIndex,omitempty"`
	ModifyIndex *int32 `json:"ModifyIndex,omitempty"`
	ModifyTime *int64 `json:"ModifyTime,omitempty"`
	Namespace *string `json:"Namespace,omitempty"`
	NextEval *string `json:"NextEval,omitempty"`
	NodeID *string `json:"NodeID,omitempty"`
	NodeModifyIndex *int32 `json:"NodeModifyIndex,omitempty"`
	PreviousEval *string `json:"PreviousEval,omitempty"`
	Priority *int32 `json:"Priority,omitempty"`
	QueuedAllocations *map[string]int32 `json:"QueuedAllocations,omitempty"`
	QuotaLimitReached *string `json:"QuotaLimitReached,omitempty"`
	RelatedEvals []EvaluationStub `json:"RelatedEvals,omitempty"`
	SnapshotIndex *int32 `json:"SnapshotIndex,omitempty"`
	Status *string `json:"Status,omitempty"`
	StatusDescription *string `json:"StatusDescription,omitempty"`
	TriggeredBy *string `json:"TriggeredBy,omitempty"`
	Type *string `json:"Type,omitempty"`
	Wait *int64 `json:"Wait,omitempty"`
	WaitUntil NullableTime `json:"WaitUntil,omitempty"`
}

// NewEvaluation instantiates a new Evaluation object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEvaluation() *Evaluation {
	this := Evaluation{}
	return &this
}

// NewEvaluationWithDefaults instantiates a new Evaluation object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEvaluationWithDefaults() *Evaluation {
	this := Evaluation{}
	return &this
}

// GetAnnotatePlan returns the AnnotatePlan field value if set, zero value otherwise.
func (o *Evaluation) GetAnnotatePlan() bool {
	if o == nil || o.AnnotatePlan == nil {
		var ret bool
		return ret
	}
	return *o.AnnotatePlan
}

// GetAnnotatePlanOk returns a tuple with the AnnotatePlan field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetAnnotatePlanOk() (*bool, bool) {
	if o == nil || o.AnnotatePlan == nil {
		return nil, false
	}
	return o.AnnotatePlan, true
}

// HasAnnotatePlan returns a boolean if a field has been set.
func (o *Evaluation) HasAnnotatePlan() bool {
	if o != nil && o.AnnotatePlan != nil {
		return true
	}

	return false
}

// SetAnnotatePlan gets a reference to the given bool and assigns it to the AnnotatePlan field.
func (o *Evaluation) SetAnnotatePlan(v bool) {
	o.AnnotatePlan = &v
}

// GetBlockedEval returns the BlockedEval field value if set, zero value otherwise.
func (o *Evaluation) GetBlockedEval() string {
	if o == nil || o.BlockedEval == nil {
		var ret string
		return ret
	}
	return *o.BlockedEval
}

// GetBlockedEvalOk returns a tuple with the BlockedEval field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetBlockedEvalOk() (*string, bool) {
	if o == nil || o.BlockedEval == nil {
		return nil, false
	}
	return o.BlockedEval, true
}

// HasBlockedEval returns a boolean if a field has been set.
func (o *Evaluation) HasBlockedEval() bool {
	if o != nil && o.BlockedEval != nil {
		return true
	}

	return false
}

// SetBlockedEval gets a reference to the given string and assigns it to the BlockedEval field.
func (o *Evaluation) SetBlockedEval(v string) {
	o.BlockedEval = &v
}

// GetClassEligibility returns the ClassEligibility field value if set, zero value otherwise.
func (o *Evaluation) GetClassEligibility() map[string]bool {
	if o == nil || o.ClassEligibility == nil {
		var ret map[string]bool
		return ret
	}
	return *o.ClassEligibility
}

// GetClassEligibilityOk returns a tuple with the ClassEligibility field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetClassEligibilityOk() (*map[string]bool, bool) {
	if o == nil || o.ClassEligibility == nil {
		return nil, false
	}
	return o.ClassEligibility, true
}

// HasClassEligibility returns a boolean if a field has been set.
func (o *Evaluation) HasClassEligibility() bool {
	if o != nil && o.ClassEligibility != nil {
		return true
	}

	return false
}

// SetClassEligibility gets a reference to the given map[string]bool and assigns it to the ClassEligibility field.
func (o *Evaluation) SetClassEligibility(v map[string]bool) {
	o.ClassEligibility = &v
}

// GetCreateIndex returns the CreateIndex field value if set, zero value otherwise.
func (o *Evaluation) GetCreateIndex() int32 {
	if o == nil || o.CreateIndex == nil {
		var ret int32
		return ret
	}
	return *o.CreateIndex
}

// GetCreateIndexOk returns a tuple with the CreateIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetCreateIndexOk() (*int32, bool) {
	if o == nil || o.CreateIndex == nil {
		return nil, false
	}
	return o.CreateIndex, true
}

// HasCreateIndex returns a boolean if a field has been set.
func (o *Evaluation) HasCreateIndex() bool {
	if o != nil && o.CreateIndex != nil {
		return true
	}

	return false
}

// SetCreateIndex gets a reference to the given int32 and assigns it to the CreateIndex field.
func (o *Evaluation) SetCreateIndex(v int32) {
	o.CreateIndex = &v
}

// GetCreateTime returns the CreateTime field value if set, zero value otherwise.
func (o *Evaluation) GetCreateTime() int64 {
	if o == nil || o.CreateTime == nil {
		var ret int64
		return ret
	}
	return *o.CreateTime
}

// GetCreateTimeOk returns a tuple with the CreateTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetCreateTimeOk() (*int64, bool) {
	if o == nil || o.CreateTime == nil {
		return nil, false
	}
	return o.CreateTime, true
}

// HasCreateTime returns a boolean if a field has been set.
func (o *Evaluation) HasCreateTime() bool {
	if o != nil && o.CreateTime != nil {
		return true
	}

	return false
}

// SetCreateTime gets a reference to the given int64 and assigns it to the CreateTime field.
func (o *Evaluation) SetCreateTime(v int64) {
	o.CreateTime = &v
}

// GetDeploymentID returns the DeploymentID field value if set, zero value otherwise.
func (o *Evaluation) GetDeploymentID() string {
	if o == nil || o.DeploymentID == nil {
		var ret string
		return ret
	}
	return *o.DeploymentID
}

// GetDeploymentIDOk returns a tuple with the DeploymentID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetDeploymentIDOk() (*string, bool) {
	if o == nil || o.DeploymentID == nil {
		return nil, false
	}
	return o.DeploymentID, true
}

// HasDeploymentID returns a boolean if a field has been set.
func (o *Evaluation) HasDeploymentID() bool {
	if o != nil && o.DeploymentID != nil {
		return true
	}

	return false
}

// SetDeploymentID gets a reference to the given string and assigns it to the DeploymentID field.
func (o *Evaluation) SetDeploymentID(v string) {
	o.DeploymentID = &v
}

// GetEscapedComputedClass returns the EscapedComputedClass field value if set, zero value otherwise.
func (o *Evaluation) GetEscapedComputedClass() bool {
	if o == nil || o.EscapedComputedClass == nil {
		var ret bool
		return ret
	}
	return *o.EscapedComputedClass
}

// GetEscapedComputedClassOk returns a tuple with the EscapedComputedClass field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetEscapedComputedClassOk() (*bool, bool) {
	if o == nil || o.EscapedComputedClass == nil {
		return nil, false
	}
	return o.EscapedComputedClass, true
}

// HasEscapedComputedClass returns a boolean if a field has been set.
func (o *Evaluation) HasEscapedComputedClass() bool {
	if o != nil && o.EscapedComputedClass != nil {
		return true
	}

	return false
}

// SetEscapedComputedClass gets a reference to the given bool and assigns it to the EscapedComputedClass field.
func (o *Evaluation) SetEscapedComputedClass(v bool) {
	o.EscapedComputedClass = &v
}

// GetFailedTGAllocs returns the FailedTGAllocs field value if set, zero value otherwise.
func (o *Evaluation) GetFailedTGAllocs() map[string]AllocationMetric {
	if o == nil || o.FailedTGAllocs == nil {
		var ret map[string]AllocationMetric
		return ret
	}
	return *o.FailedTGAllocs
}

// GetFailedTGAllocsOk returns a tuple with the FailedTGAllocs field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetFailedTGAllocsOk() (*map[string]AllocationMetric, bool) {
	if o == nil || o.FailedTGAllocs == nil {
		return nil, false
	}
	return o.FailedTGAllocs, true
}

// HasFailedTGAllocs returns a boolean if a field has been set.
func (o *Evaluation) HasFailedTGAllocs() bool {
	if o != nil && o.FailedTGAllocs != nil {
		return true
	}

	return false
}

// SetFailedTGAllocs gets a reference to the given map[string]AllocationMetric and assigns it to the FailedTGAllocs field.
func (o *Evaluation) SetFailedTGAllocs(v map[string]AllocationMetric) {
	o.FailedTGAllocs = &v
}

// GetID returns the ID field value if set, zero value otherwise.
func (o *Evaluation) GetID() string {
	if o == nil || o.ID == nil {
		var ret string
		return ret
	}
	return *o.ID
}

// GetIDOk returns a tuple with the ID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetIDOk() (*string, bool) {
	if o == nil || o.ID == nil {
		return nil, false
	}
	return o.ID, true
}

// HasID returns a boolean if a field has been set.
func (o *Evaluation) HasID() bool {
	if o != nil && o.ID != nil {
		return true
	}

	return false
}

// SetID gets a reference to the given string and assigns it to the ID field.
func (o *Evaluation) SetID(v string) {
	o.ID = &v
}

// GetJobID returns the JobID field value if set, zero value otherwise.
func (o *Evaluation) GetJobID() string {
	if o == nil || o.JobID == nil {
		var ret string
		return ret
	}
	return *o.JobID
}

// GetJobIDOk returns a tuple with the JobID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetJobIDOk() (*string, bool) {
	if o == nil || o.JobID == nil {
		return nil, false
	}
	return o.JobID, true
}

// HasJobID returns a boolean if a field has been set.
func (o *Evaluation) HasJobID() bool {
	if o != nil && o.JobID != nil {
		return true
	}

	return false
}

// SetJobID gets a reference to the given string and assigns it to the JobID field.
func (o *Evaluation) SetJobID(v string) {
	o.JobID = &v
}

// GetJobModifyIndex returns the JobModifyIndex field value if set, zero value otherwise.
func (o *Evaluation) GetJobModifyIndex() int32 {
	if o == nil || o.JobModifyIndex == nil {
		var ret int32
		return ret
	}
	return *o.JobModifyIndex
}

// GetJobModifyIndexOk returns a tuple with the JobModifyIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetJobModifyIndexOk() (*int32, bool) {
	if o == nil || o.JobModifyIndex == nil {
		return nil, false
	}
	return o.JobModifyIndex, true
}

// HasJobModifyIndex returns a boolean if a field has been set.
func (o *Evaluation) HasJobModifyIndex() bool {
	if o != nil && o.JobModifyIndex != nil {
		return true
	}

	return false
}

// SetJobModifyIndex gets a reference to the given int32 and assigns it to the JobModifyIndex field.
func (o *Evaluation) SetJobModifyIndex(v int32) {
	o.JobModifyIndex = &v
}

// GetModifyIndex returns the ModifyIndex field value if set, zero value otherwise.
func (o *Evaluation) GetModifyIndex() int32 {
	if o == nil || o.ModifyIndex == nil {
		var ret int32
		return ret
	}
	return *o.ModifyIndex
}

// GetModifyIndexOk returns a tuple with the ModifyIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetModifyIndexOk() (*int32, bool) {
	if o == nil || o.ModifyIndex == nil {
		return nil, false
	}
	return o.ModifyIndex, true
}

// HasModifyIndex returns a boolean if a field has been set.
func (o *Evaluation) HasModifyIndex() bool {
	if o != nil && o.ModifyIndex != nil {
		return true
	}

	return false
}

// SetModifyIndex gets a reference to the given int32 and assigns it to the ModifyIndex field.
func (o *Evaluation) SetModifyIndex(v int32) {
	o.ModifyIndex = &v
}

// GetModifyTime returns the ModifyTime field value if set, zero value otherwise.
func (o *Evaluation) GetModifyTime() int64 {
	if o == nil || o.ModifyTime == nil {
		var ret int64
		return ret
	}
	return *o.ModifyTime
}

// GetModifyTimeOk returns a tuple with the ModifyTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetModifyTimeOk() (*int64, bool) {
	if o == nil || o.ModifyTime == nil {
		return nil, false
	}
	return o.ModifyTime, true
}

// HasModifyTime returns a boolean if a field has been set.
func (o *Evaluation) HasModifyTime() bool {
	if o != nil && o.ModifyTime != nil {
		return true
	}

	return false
}

// SetModifyTime gets a reference to the given int64 and assigns it to the ModifyTime field.
func (o *Evaluation) SetModifyTime(v int64) {
	o.ModifyTime = &v
}

// GetNamespace returns the Namespace field value if set, zero value otherwise.
func (o *Evaluation) GetNamespace() string {
	if o == nil || o.Namespace == nil {
		var ret string
		return ret
	}
	return *o.Namespace
}

// GetNamespaceOk returns a tuple with the Namespace field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetNamespaceOk() (*string, bool) {
	if o == nil || o.Namespace == nil {
		return nil, false
	}
	return o.Namespace, true
}

// HasNamespace returns a boolean if a field has been set.
func (o *Evaluation) HasNamespace() bool {
	if o != nil && o.Namespace != nil {
		return true
	}

	return false
}

// SetNamespace gets a reference to the given string and assigns it to the Namespace field.
func (o *Evaluation) SetNamespace(v string) {
	o.Namespace = &v
}

// GetNextEval returns the NextEval field value if set, zero value otherwise.
func (o *Evaluation) GetNextEval() string {
	if o == nil || o.NextEval == nil {
		var ret string
		return ret
	}
	return *o.NextEval
}

// GetNextEvalOk returns a tuple with the NextEval field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetNextEvalOk() (*string, bool) {
	if o == nil || o.NextEval == nil {
		return nil, false
	}
	return o.NextEval, true
}

// HasNextEval returns a boolean if a field has been set.
func (o *Evaluation) HasNextEval() bool {
	if o != nil && o.NextEval != nil {
		return true
	}

	return false
}

// SetNextEval gets a reference to the given string and assigns it to the NextEval field.
func (o *Evaluation) SetNextEval(v string) {
	o.NextEval = &v
}

// GetNodeID returns the NodeID field value if set, zero value otherwise.
func (o *Evaluation) GetNodeID() string {
	if o == nil || o.NodeID == nil {
		var ret string
		return ret
	}
	return *o.NodeID
}

// GetNodeIDOk returns a tuple with the NodeID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetNodeIDOk() (*string, bool) {
	if o == nil || o.NodeID == nil {
		return nil, false
	}
	return o.NodeID, true
}

// HasNodeID returns a boolean if a field has been set.
func (o *Evaluation) HasNodeID() bool {
	if o != nil && o.NodeID != nil {
		return true
	}

	return false
}

// SetNodeID gets a reference to the given string and assigns it to the NodeID field.
func (o *Evaluation) SetNodeID(v string) {
	o.NodeID = &v
}

// GetNodeModifyIndex returns the NodeModifyIndex field value if set, zero value otherwise.
func (o *Evaluation) GetNodeModifyIndex() int32 {
	if o == nil || o.NodeModifyIndex == nil {
		var ret int32
		return ret
	}
	return *o.NodeModifyIndex
}

// GetNodeModifyIndexOk returns a tuple with the NodeModifyIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetNodeModifyIndexOk() (*int32, bool) {
	if o == nil || o.NodeModifyIndex == nil {
		return nil, false
	}
	return o.NodeModifyIndex, true
}

// HasNodeModifyIndex returns a boolean if a field has been set.
func (o *Evaluation) HasNodeModifyIndex() bool {
	if o != nil && o.NodeModifyIndex != nil {
		return true
	}

	return false
}

// SetNodeModifyIndex gets a reference to the given int32 and assigns it to the NodeModifyIndex field.
func (o *Evaluation) SetNodeModifyIndex(v int32) {
	o.NodeModifyIndex = &v
}

// GetPreviousEval returns the PreviousEval field value if set, zero value otherwise.
func (o *Evaluation) GetPreviousEval() string {
	if o == nil || o.PreviousEval == nil {
		var ret string
		return ret
	}
	return *o.PreviousEval
}

// GetPreviousEvalOk returns a tuple with the PreviousEval field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetPreviousEvalOk() (*string, bool) {
	if o == nil || o.PreviousEval == nil {
		return nil, false
	}
	return o.PreviousEval, true
}

// HasPreviousEval returns a boolean if a field has been set.
func (o *Evaluation) HasPreviousEval() bool {
	if o != nil && o.PreviousEval != nil {
		return true
	}

	return false
}

// SetPreviousEval gets a reference to the given string and assigns it to the PreviousEval field.
func (o *Evaluation) SetPreviousEval(v string) {
	o.PreviousEval = &v
}

// GetPriority returns the Priority field value if set, zero value otherwise.
func (o *Evaluation) GetPriority() int32 {
	if o == nil || o.Priority == nil {
		var ret int32
		return ret
	}
	return *o.Priority
}

// GetPriorityOk returns a tuple with the Priority field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetPriorityOk() (*int32, bool) {
	if o == nil || o.Priority == nil {
		return nil, false
	}
	return o.Priority, true
}

// HasPriority returns a boolean if a field has been set.
func (o *Evaluation) HasPriority() bool {
	if o != nil && o.Priority != nil {
		return true
	}

	return false
}

// SetPriority gets a reference to the given int32 and assigns it to the Priority field.
func (o *Evaluation) SetPriority(v int32) {
	o.Priority = &v
}

// GetQueuedAllocations returns the QueuedAllocations field value if set, zero value otherwise.
func (o *Evaluation) GetQueuedAllocations() map[string]int32 {
	if o == nil || o.QueuedAllocations == nil {
		var ret map[string]int32
		return ret
	}
	return *o.QueuedAllocations
}

// GetQueuedAllocationsOk returns a tuple with the QueuedAllocations field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetQueuedAllocationsOk() (*map[string]int32, bool) {
	if o == nil || o.QueuedAllocations == nil {
		return nil, false
	}
	return o.QueuedAllocations, true
}

// HasQueuedAllocations returns a boolean if a field has been set.
func (o *Evaluation) HasQueuedAllocations() bool {
	if o != nil && o.QueuedAllocations != nil {
		return true
	}

	return false
}

// SetQueuedAllocations gets a reference to the given map[string]int32 and assigns it to the QueuedAllocations field.
func (o *Evaluation) SetQueuedAllocations(v map[string]int32) {
	o.QueuedAllocations = &v
}

// GetQuotaLimitReached returns the QuotaLimitReached field value if set, zero value otherwise.
func (o *Evaluation) GetQuotaLimitReached() string {
	if o == nil || o.QuotaLimitReached == nil {
		var ret string
		return ret
	}
	return *o.QuotaLimitReached
}

// GetQuotaLimitReachedOk returns a tuple with the QuotaLimitReached field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetQuotaLimitReachedOk() (*string, bool) {
	if o == nil || o.QuotaLimitReached == nil {
		return nil, false
	}
	return o.QuotaLimitReached, true
}

// HasQuotaLimitReached returns a boolean if a field has been set.
func (o *Evaluation) HasQuotaLimitReached() bool {
	if o != nil && o.QuotaLimitReached != nil {
		return true
	}

	return false
}

// SetQuotaLimitReached gets a reference to the given string and assigns it to the QuotaLimitReached field.
func (o *Evaluation) SetQuotaLimitReached(v string) {
	o.QuotaLimitReached = &v
}

// GetRelatedEvals returns the RelatedEvals field value if set, zero value otherwise.
func (o *Evaluation) GetRelatedEvals() []EvaluationStub {
	if o == nil || o.RelatedEvals == nil {
		var ret []EvaluationStub
		return ret
	}
	return o.RelatedEvals
}

// GetRelatedEvalsOk returns a tuple with the RelatedEvals field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetRelatedEvalsOk() ([]EvaluationStub, bool) {
	if o == nil || o.RelatedEvals == nil {
		return nil, false
	}
	return o.RelatedEvals, true
}

// HasRelatedEvals returns a boolean if a field has been set.
func (o *Evaluation) HasRelatedEvals() bool {
	if o != nil && o.RelatedEvals != nil {
		return true
	}

	return false
}

// SetRelatedEvals gets a reference to the given []EvaluationStub and assigns it to the RelatedEvals field.
func (o *Evaluation) SetRelatedEvals(v []EvaluationStub) {
	o.RelatedEvals = v
}

// GetSnapshotIndex returns the SnapshotIndex field value if set, zero value otherwise.
func (o *Evaluation) GetSnapshotIndex() int32 {
	if o == nil || o.SnapshotIndex == nil {
		var ret int32
		return ret
	}
	return *o.SnapshotIndex
}

// GetSnapshotIndexOk returns a tuple with the SnapshotIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetSnapshotIndexOk() (*int32, bool) {
	if o == nil || o.SnapshotIndex == nil {
		return nil, false
	}
	return o.SnapshotIndex, true
}

// HasSnapshotIndex returns a boolean if a field has been set.
func (o *Evaluation) HasSnapshotIndex() bool {
	if o != nil && o.SnapshotIndex != nil {
		return true
	}

	return false
}

// SetSnapshotIndex gets a reference to the given int32 and assigns it to the SnapshotIndex field.
func (o *Evaluation) SetSnapshotIndex(v int32) {
	o.SnapshotIndex = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *Evaluation) GetStatus() string {
	if o == nil || o.Status == nil {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetStatusOk() (*string, bool) {
	if o == nil || o.Status == nil {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *Evaluation) HasStatus() bool {
	if o != nil && o.Status != nil {
		return true
	}

	return false
}

// SetStatus gets a reference to the given string and assigns it to the Status field.
func (o *Evaluation) SetStatus(v string) {
	o.Status = &v
}

// GetStatusDescription returns the StatusDescription field value if set, zero value otherwise.
func (o *Evaluation) GetStatusDescription() string {
	if o == nil || o.StatusDescription == nil {
		var ret string
		return ret
	}
	return *o.StatusDescription
}

// GetStatusDescriptionOk returns a tuple with the StatusDescription field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetStatusDescriptionOk() (*string, bool) {
	if o == nil || o.StatusDescription == nil {
		return nil, false
	}
	return o.StatusDescription, true
}

// HasStatusDescription returns a boolean if a field has been set.
func (o *Evaluation) HasStatusDescription() bool {
	if o != nil && o.StatusDescription != nil {
		return true
	}

	return false
}

// SetStatusDescription gets a reference to the given string and assigns it to the StatusDescription field.
func (o *Evaluation) SetStatusDescription(v string) {
	o.StatusDescription = &v
}

// GetTriggeredBy returns the TriggeredBy field value if set, zero value otherwise.
func (o *Evaluation) GetTriggeredBy() string {
	if o == nil || o.TriggeredBy == nil {
		var ret string
		return ret
	}
	return *o.TriggeredBy
}

// GetTriggeredByOk returns a tuple with the TriggeredBy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetTriggeredByOk() (*string, bool) {
	if o == nil || o.TriggeredBy == nil {
		return nil, false
	}
	return o.TriggeredBy, true
}

// HasTriggeredBy returns a boolean if a field has been set.
func (o *Evaluation) HasTriggeredBy() bool {
	if o != nil && o.TriggeredBy != nil {
		return true
	}

	return false
}

// SetTriggeredBy gets a reference to the given string and assigns it to the TriggeredBy field.
func (o *Evaluation) SetTriggeredBy(v string) {
	o.TriggeredBy = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *Evaluation) GetType() string {
	if o == nil || o.Type == nil {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetTypeOk() (*string, bool) {
	if o == nil || o.Type == nil {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *Evaluation) HasType() bool {
	if o != nil && o.Type != nil {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *Evaluation) SetType(v string) {
	o.Type = &v
}

// GetWait returns the Wait field value if set, zero value otherwise.
func (o *Evaluation) GetWait() int64 {
	if o == nil || o.Wait == nil {
		var ret int64
		return ret
	}
	return *o.Wait
}

// GetWaitOk returns a tuple with the Wait field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Evaluation) GetWaitOk() (*int64, bool) {
	if o == nil || o.Wait == nil {
		return nil, false
	}
	return o.Wait, true
}

// HasWait returns a boolean if a field has been set.
func (o *Evaluation) HasWait() bool {
	if o != nil && o.Wait != nil {
		return true
	}

	return false
}

// SetWait gets a reference to the given int64 and assigns it to the Wait field.
func (o *Evaluation) SetWait(v int64) {
	o.Wait = &v
}

// GetWaitUntil returns the WaitUntil field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Evaluation) GetWaitUntil() time.Time {
	if o == nil || o.WaitUntil.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.WaitUntil.Get()
}

// GetWaitUntilOk returns a tuple with the WaitUntil field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Evaluation) GetWaitUntilOk() (*time.Time, bool) {
	if o == nil  {
		return nil, false
	}
	return o.WaitUntil.Get(), o.WaitUntil.IsSet()
}

// HasWaitUntil returns a boolean if a field has been set.
func (o *Evaluation) HasWaitUntil() bool {
	if o != nil && o.WaitUntil.IsSet() {
		return true
	}

	return false
}

// SetWaitUntil gets a reference to the given NullableTime and assigns it to the WaitUntil field.
func (o *Evaluation) SetWaitUntil(v time.Time) {
	o.WaitUntil.Set(&v)
}
// SetWaitUntilNil sets the value for WaitUntil to be an explicit nil
func (o *Evaluation) SetWaitUntilNil() {
	o.WaitUntil.Set(nil)
}

// UnsetWaitUntil ensures that no value is present for WaitUntil, not even an explicit nil
func (o *Evaluation) UnsetWaitUntil() {
	o.WaitUntil.Unset()
}

func (o Evaluation) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.AnnotatePlan != nil {
		toSerialize["AnnotatePlan"] = o.AnnotatePlan
	}
	if o.BlockedEval != nil {
		toSerialize["BlockedEval"] = o.BlockedEval
	}
	if o.ClassEligibility != nil {
		toSerialize["ClassEligibility"] = o.ClassEligibility
	}
	if o.CreateIndex != nil {
		toSerialize["CreateIndex"] = o.CreateIndex
	}
	if o.CreateTime != nil {
		toSerialize["CreateTime"] = o.CreateTime
	}
	if o.DeploymentID != nil {
		toSerialize["DeploymentID"] = o.DeploymentID
	}
	if o.EscapedComputedClass != nil {
		toSerialize["EscapedComputedClass"] = o.EscapedComputedClass
	}
	if o.FailedTGAllocs != nil {
		toSerialize["FailedTGAllocs"] = o.FailedTGAllocs
	}
	if o.ID != nil {
		toSerialize["ID"] = o.ID
	}
	if o.JobID != nil {
		toSerialize["JobID"] = o.JobID
	}
	if o.JobModifyIndex != nil {
		toSerialize["JobModifyIndex"] = o.JobModifyIndex
	}
	if o.ModifyIndex != nil {
		toSerialize["ModifyIndex"] = o.ModifyIndex
	}
	if o.ModifyTime != nil {
		toSerialize["ModifyTime"] = o.ModifyTime
	}
	if o.Namespace != nil {
		toSerialize["Namespace"] = o.Namespace
	}
	if o.NextEval != nil {
		toSerialize["NextEval"] = o.NextEval
	}
	if o.NodeID != nil {
		toSerialize["NodeID"] = o.NodeID
	}
	if o.NodeModifyIndex != nil {
		toSerialize["NodeModifyIndex"] = o.NodeModifyIndex
	}
	if o.PreviousEval != nil {
		toSerialize["PreviousEval"] = o.PreviousEval
	}
	if o.Priority != nil {
		toSerialize["Priority"] = o.Priority
	}
	if o.QueuedAllocations != nil {
		toSerialize["QueuedAllocations"] = o.QueuedAllocations
	}
	if o.QuotaLimitReached != nil {
		toSerialize["QuotaLimitReached"] = o.QuotaLimitReached
	}
	if o.RelatedEvals != nil {
		toSerialize["RelatedEvals"] = o.RelatedEvals
	}
	if o.SnapshotIndex != nil {
		toSerialize["SnapshotIndex"] = o.SnapshotIndex
	}
	if o.Status != nil {
		toSerialize["Status"] = o.Status
	}
	if o.StatusDescription != nil {
		toSerialize["StatusDescription"] = o.StatusDescription
	}
	if o.TriggeredBy != nil {
		toSerialize["TriggeredBy"] = o.TriggeredBy
	}
	if o.Type != nil {
		toSerialize["Type"] = o.Type
	}
	if o.Wait != nil {
		toSerialize["Wait"] = o.Wait
	}
	if o.WaitUntil.IsSet() {
		toSerialize["WaitUntil"] = o.WaitUntil.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableEvaluation struct {
	value *Evaluation
	isSet bool
}

func (v NullableEvaluation) Get() *Evaluation {
	return v.value
}

func (v *NullableEvaluation) Set(val *Evaluation) {
	v.value = val
	v.isSet = true
}

func (v NullableEvaluation) IsSet() bool {
	return v.isSet
}

func (v *NullableEvaluation) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEvaluation(val *Evaluation) *NullableEvaluation {
	return &NullableEvaluation{value: val, isSet: true}
}

func (v NullableEvaluation) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEvaluation) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


