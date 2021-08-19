# Go API client for client

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [OpenAPI-spec](https://www.openapis.org/) from a remote server, you can easily generate an API client.

- API version: 1.1.3
- Package version: 1.1.3
- Build package: org.openapitools.codegen.languages.GoClientCodegen

## Installation

Install the following dependencies:

```shell
go get github.com/stretchr/testify/assert
go get golang.org/x/oauth2
go get golang.org/x/net/context
```

Put the package under your project folder and add the following in import:

```golang
import sw "./client"
```

To use a proxy, set the environment variable `HTTP_PROXY`:

```golang
os.Setenv("HTTP_PROXY", "http://proxy_name:proxy_port")
```

## Configuration of Server URL

Default configuration comes with `Servers` field that contains server objects as defined in the OpenAPI specification.

### Select Server Configuration

For using other server than the one defined on index 0 set context value `sw.ContextServerIndex` of type `int`.

```golang
ctx := context.WithValue(context.Background(), sw.ContextServerIndex, 1)
```

### Templated Server URL

Templated server URL is formatted using default variables from configuration or from context value `sw.ContextServerVariables` of type `map[string]string`.

```golang
ctx := context.WithValue(context.Background(), sw.ContextServerVariables, map[string]string{
	"basePath": "v2",
})
```

Note, enum values are always validated and all unused variables are silently ignored.

### URLs Configuration per Operation

Each operation can use different server URL defined using `OperationServers` map in the `Configuration`.
An operation is uniquely identifield by `"{classname}Service.{nickname}"` string.
Similar rules for overriding default operation server index and variables applies by using `sw.ContextOperationServerIndices` and `sw.ContextOperationServerVariables` context maps.

```
ctx := context.WithValue(context.Background(), sw.ContextOperationServerIndices, map[string]int{
	"{classname}Service.{nickname}": 2,
})
ctx = context.WithValue(context.Background(), sw.ContextOperationServerVariables, map[string]map[string]string{
	"{classname}Service.{nickname}": {
		"port": "8443",
	},
})
```

## Documentation for API Endpoints

All URIs are relative to *https://127.0.0.1:4646/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EnterpriseApi* | [**CreateQuotaSpec**](docs/EnterpriseApi.md#createquotaspec) | **Post** /quota | 
*EnterpriseApi* | [**DeleteQuotaSpec**](docs/EnterpriseApi.md#deletequotaspec) | **Delete** /quota/{specName} | 
*EnterpriseApi* | [**GetQuotaSpec**](docs/EnterpriseApi.md#getquotaspec) | **Get** /quota/{specName} | 
*EnterpriseApi* | [**GetQuotas**](docs/EnterpriseApi.md#getquotas) | **Get** /quotas | 
*EnterpriseApi* | [**PostQuotaSpec**](docs/EnterpriseApi.md#postquotaspec) | **Post** /quota/{specName} | 
*JobsApi* | [**DeleteJob**](docs/JobsApi.md#deletejob) | **Delete** /job/{jobName} | 
*JobsApi* | [**GetAllocations**](docs/JobsApi.md#getallocations) | **Get** /job/{jobName}/allocations | 
*JobsApi* | [**GetEvaluations**](docs/JobsApi.md#getevaluations) | **Get** /job/{jobName}/evaluations | 
*JobsApi* | [**GetJobs**](docs/JobsApi.md#getjobs) | **Get** /jobs | 
*JobsApi* | [**PostJob**](docs/JobsApi.md#postjob) | **Post** /jobs | 
*JobsApi* | [**PostJobEvaluate**](docs/JobsApi.md#postjobevaluate) | **Post** /job/{jobName}/evaluate | 
*JobsApi* | [**PostJobParse**](docs/JobsApi.md#postjobparse) | **Post** /jobs/parse | 
*JobsApi* | [**PostJobPlan**](docs/JobsApi.md#postjobplan) | **Post** /job/{jobName}/plan | 
*JobsApi* | [**PostPeriodicForce**](docs/JobsApi.md#postperiodicforce) | **Post** /job/{jobName}/periodic/force | 
*MetricsApi* | [**GetMetricsSummary**](docs/MetricsApi.md#getmetricssummary) | **Get** /metrics | 
*NamespacesApi* | [**CreateNamespace**](docs/NamespacesApi.md#createnamespace) | **Post** /namespace | 
*NamespacesApi* | [**DeleteNamespace**](docs/NamespacesApi.md#deletenamespace) | **Delete** /namespace/{namespaceName} | 
*NamespacesApi* | [**GetNamespace**](docs/NamespacesApi.md#getnamespace) | **Get** /namespace/{namespaceName} | 
*NamespacesApi* | [**GetNamespaces**](docs/NamespacesApi.md#getnamespaces) | **Get** /namespaces | 
*NamespacesApi* | [**PostNamespace**](docs/NamespacesApi.md#postnamespace) | **Post** /namespace/{namespaceName} | 
*RegionsApi* | [**GetRegions**](docs/RegionsApi.md#getregions) | **Get** /regions | 
*SearchApi* | [**GetFuzzySearch**](docs/SearchApi.md#getfuzzysearch) | **Post** /search/fuzzy | 
*SearchApi* | [**GetSearch**](docs/SearchApi.md#getsearch) | **Post** /search | 
*VolumesApi* | [**CreateVolume**](docs/VolumesApi.md#createvolume) | **Post** /volume/csi/{volumeId}/{action} | 
*VolumesApi* | [**DeleteSnapshot**](docs/VolumesApi.md#deletesnapshot) | **Delete** /volumes/snapshot | 
*VolumesApi* | [**DeleteVolumeRegistration**](docs/VolumesApi.md#deletevolumeregistration) | **Delete** /volume/csi/{volumeId} | 
*VolumesApi* | [**DetachOrDeleteVolume**](docs/VolumesApi.md#detachordeletevolume) | **Delete** /volume/csi/{volumeId}/{action} | 
*VolumesApi* | [**GetExternalVolumes**](docs/VolumesApi.md#getexternalvolumes) | **Get** /volumes/external | 
*VolumesApi* | [**GetSnapshots**](docs/VolumesApi.md#getsnapshots) | **Get** /volumes/snapshot | 
*VolumesApi* | [**GetVolume**](docs/VolumesApi.md#getvolume) | **Get** /volume/csi/{volumeId} | 
*VolumesApi* | [**GetVolumes**](docs/VolumesApi.md#getvolumes) | **Get** /volumes | 
*VolumesApi* | [**PostSnapshot**](docs/VolumesApi.md#postsnapshot) | **Post** /volumes/snapshot | 
*VolumesApi* | [**PostVolume**](docs/VolumesApi.md#postvolume) | **Post** /volumes | 
*VolumesApi* | [**PostVolumeRegistration**](docs/VolumesApi.md#postvolumeregistration) | **Post** /volume/csi/{volumeId} | 


## Documentation For Models

 - [Affinity](docs/Affinity.md)
 - [AllocDeploymentStatus](docs/AllocDeploymentStatus.md)
 - [AllocatedCpuResources](docs/AllocatedCpuResources.md)
 - [AllocatedDeviceResource](docs/AllocatedDeviceResource.md)
 - [AllocatedMemoryResources](docs/AllocatedMemoryResources.md)
 - [AllocatedResources](docs/AllocatedResources.md)
 - [AllocatedSharedResources](docs/AllocatedSharedResources.md)
 - [AllocatedTaskResources](docs/AllocatedTaskResources.md)
 - [Allocation](docs/Allocation.md)
 - [AllocationListStub](docs/AllocationListStub.md)
 - [AllocationMetric](docs/AllocationMetric.md)
 - [CSIMountOptions](docs/CSIMountOptions.md)
 - [CSISnapshot](docs/CSISnapshot.md)
 - [CSISnapshotCreateRequest](docs/CSISnapshotCreateRequest.md)
 - [CSISnapshotCreateResponse](docs/CSISnapshotCreateResponse.md)
 - [CSISnapshotListResponse](docs/CSISnapshotListResponse.md)
 - [CSITopology](docs/CSITopology.md)
 - [CSIVolume](docs/CSIVolume.md)
 - [CSIVolumeCapability](docs/CSIVolumeCapability.md)
 - [CSIVolumeCreateRequest](docs/CSIVolumeCreateRequest.md)
 - [CSIVolumeExternalStub](docs/CSIVolumeExternalStub.md)
 - [CSIVolumeListExternalResponse](docs/CSIVolumeListExternalResponse.md)
 - [CSIVolumeListStub](docs/CSIVolumeListStub.md)
 - [CSIVolumeRegisterRequest](docs/CSIVolumeRegisterRequest.md)
 - [CheckRestart](docs/CheckRestart.md)
 - [Constraint](docs/Constraint.md)
 - [Consul](docs/Consul.md)
 - [ConsulConnect](docs/ConsulConnect.md)
 - [ConsulExposeConfig](docs/ConsulExposeConfig.md)
 - [ConsulExposePath](docs/ConsulExposePath.md)
 - [ConsulGateway](docs/ConsulGateway.md)
 - [ConsulGatewayBindAddress](docs/ConsulGatewayBindAddress.md)
 - [ConsulGatewayProxy](docs/ConsulGatewayProxy.md)
 - [ConsulGatewayTLSConfig](docs/ConsulGatewayTLSConfig.md)
 - [ConsulIngressConfigEntry](docs/ConsulIngressConfigEntry.md)
 - [ConsulIngressListener](docs/ConsulIngressListener.md)
 - [ConsulIngressService](docs/ConsulIngressService.md)
 - [ConsulLinkedService](docs/ConsulLinkedService.md)
 - [ConsulMeshGateway](docs/ConsulMeshGateway.md)
 - [ConsulProxy](docs/ConsulProxy.md)
 - [ConsulSidecarService](docs/ConsulSidecarService.md)
 - [ConsulTerminatingConfigEntry](docs/ConsulTerminatingConfigEntry.md)
 - [ConsulUpstream](docs/ConsulUpstream.md)
 - [DNSConfig](docs/DNSConfig.md)
 - [DesiredTransition](docs/DesiredTransition.md)
 - [DesiredUpdates](docs/DesiredUpdates.md)
 - [DispatchPayloadConfig](docs/DispatchPayloadConfig.md)
 - [EphemeralDisk](docs/EphemeralDisk.md)
 - [EvalOptions](docs/EvalOptions.md)
 - [Evaluation](docs/Evaluation.md)
 - [FieldDiff](docs/FieldDiff.md)
 - [FuzzyMatch](docs/FuzzyMatch.md)
 - [FuzzySearchRequest](docs/FuzzySearchRequest.md)
 - [FuzzySearchResponse](docs/FuzzySearchResponse.md)
 - [GaugeValue](docs/GaugeValue.md)
 - [Job](docs/Job.md)
 - [JobChildrenSummary](docs/JobChildrenSummary.md)
 - [JobDeregisterResponse](docs/JobDeregisterResponse.md)
 - [JobDiff](docs/JobDiff.md)
 - [JobEvaluateRequest](docs/JobEvaluateRequest.md)
 - [JobListStub](docs/JobListStub.md)
 - [JobPlanRequest](docs/JobPlanRequest.md)
 - [JobPlanResponse](docs/JobPlanResponse.md)
 - [JobRegisterRequest](docs/JobRegisterRequest.md)
 - [JobRegisterResponse](docs/JobRegisterResponse.md)
 - [JobSummary](docs/JobSummary.md)
 - [JobsParseRequest](docs/JobsParseRequest.md)
 - [LogConfig](docs/LogConfig.md)
 - [MetricsSummary](docs/MetricsSummary.md)
 - [MigrateStrategy](docs/MigrateStrategy.md)
 - [Multiregion](docs/Multiregion.md)
 - [MultiregionRegion](docs/MultiregionRegion.md)
 - [MultiregionStrategy](docs/MultiregionStrategy.md)
 - [Namespace](docs/Namespace.md)
 - [NamespaceListRequest](docs/NamespaceListRequest.md)
 - [NetworkResource](docs/NetworkResource.md)
 - [NodeScoreMeta](docs/NodeScoreMeta.md)
 - [ObjectDiff](docs/ObjectDiff.md)
 - [ParameterizedJobConfig](docs/ParameterizedJobConfig.md)
 - [PeriodicConfig](docs/PeriodicConfig.md)
 - [PeriodicForceResponse](docs/PeriodicForceResponse.md)
 - [PlanAnnotations](docs/PlanAnnotations.md)
 - [PointValue](docs/PointValue.md)
 - [Port](docs/Port.md)
 - [PortMapping](docs/PortMapping.md)
 - [QuotaLimit](docs/QuotaLimit.md)
 - [QuotaSpec](docs/QuotaSpec.md)
 - [RequestedDevice](docs/RequestedDevice.md)
 - [RescheduleEvent](docs/RescheduleEvent.md)
 - [ReschedulePolicy](docs/ReschedulePolicy.md)
 - [RescheduleTracker](docs/RescheduleTracker.md)
 - [Resources](docs/Resources.md)
 - [RestartPolicy](docs/RestartPolicy.md)
 - [SampledValue](docs/SampledValue.md)
 - [ScalingPolicy](docs/ScalingPolicy.md)
 - [SearchRequest](docs/SearchRequest.md)
 - [SearchResponse](docs/SearchResponse.md)
 - [Service](docs/Service.md)
 - [ServiceCheck](docs/ServiceCheck.md)
 - [SidecarTask](docs/SidecarTask.md)
 - [Spread](docs/Spread.md)
 - [SpreadTarget](docs/SpreadTarget.md)
 - [Task](docs/Task.md)
 - [TaskArtifact](docs/TaskArtifact.md)
 - [TaskCSIPluginConfig](docs/TaskCSIPluginConfig.md)
 - [TaskDiff](docs/TaskDiff.md)
 - [TaskEvent](docs/TaskEvent.md)
 - [TaskGroup](docs/TaskGroup.md)
 - [TaskGroupDiff](docs/TaskGroupDiff.md)
 - [TaskGroupSummary](docs/TaskGroupSummary.md)
 - [TaskHandle](docs/TaskHandle.md)
 - [TaskLifecycle](docs/TaskLifecycle.md)
 - [TaskState](docs/TaskState.md)
 - [Template](docs/Template.md)
 - [UpdateStrategy](docs/UpdateStrategy.md)
 - [Vault](docs/Vault.md)
 - [VolumeMount](docs/VolumeMount.md)
 - [VolumeRequest](docs/VolumeRequest.md)


## Documentation For Authorization



### X-Nomad-Token

- **Type**: API key
- **API key parameter name**: X-Nomad-Token
- **Location**: HTTP header

Note, each API key must be added to a map of `map[string]APIKey` where the key is: X-Nomad-Token and passed in as the auth context for each request.


## Documentation for Utility Methods

Due to the fact that model structure members are all pointers, this package contains
a number of utility functions to easily obtain pointers to values of basic types.
Each of these functions takes a value of the given basic type and returns a pointer to it:

* `PtrBool`
* `PtrInt`
* `PtrInt32`
* `PtrInt64`
* `PtrFloat`
* `PtrFloat32`
* `PtrFloat64`
* `PtrString`
* `PtrTime`

## Author

support@hashicorp.com
