package asyncapigenerator

import (
	"fmt"

	"github.com/hashicorp/go-hclog"
	"github.com/hashicorp/nomad/nomad/structs"
	"github.com/swaggest/go-asyncapi/reflector/asyncapi-2.0.0"
	spec2 "github.com/swaggest/go-asyncapi/spec-2.0.0"
)

type spec struct {
	reflector *asyncapi.Reflector
}

func (s *spec) ToYAML() (string, error) {
	prefix := "# Code generated from hashicorp/nomad-openapi/generator; DO NOT EDIT.\n"
	yaml, err := s.reflector.Schema.MarshalYAML()
	if err != nil {
		return "", err
	}

	return fmt.Sprintf("%s%s", prefix, yaml), nil
}

type specBuilder struct {
	spec      *spec
	logger    hclog.Logger
	reflector *asyncapi.Reflector
}

func (b *specBuilder) buildSpec() (*spec, error) {
	b.reflector = &asyncapi.Reflector{
		Schema: &spec2.AsyncAPI{
			Info:    info,
			Servers: servers,
		},
	}

	err := b.addEventStream()
	if err != nil {
		return nil, err
	}

	return &spec{
		reflector: b.reflector,
	}, nil
}

func (b *specBuilder) addEventStream() error {
	return b.reflector.AddChannel(asyncapi.ChannelInfo{
		Name:            "event.stream",
		BaseChannelItem: eventStreamChannelItem,
		Publish:         publishMessage,
		Subscribe:       subscribeMessage,
	})
}

var info = &spec2.Info{
	Version: "1.1.3", // required
	Title:   "Nomad Streaming API",
}

var servers = map[string]spec2.Server{
	"default": {
		URL:             "127.0.0.1:4646",
		Description:     "Local agent",
		ProtocolVersion: "2.0",
		Protocol:        "http",
		Variables: map[string]spec2.ServerVariable{
			"address": {
				Default:     "127.0.0.1",
				Description: "Hostname or ip address of server",
			},
			"port": {
				Default:     "4646",
				Description: "Port server is exposed at",
			},
		},
	},
}

var eventStreamChannelItem = &spec2.ChannelItem{
	Parameters: eventStreamParams,
	Bindings: &spec2.ChannelBindingsObject{
		HTTP: nil, //HTTPChannelBindingObject{},
	},
}

var eventStreamParams = map[string]spec2.Parameter{
	"X-Nomad-Token": {
		Description: "X-Nomad-Token query filter",
		Schema: map[string]interface{}{
			"type": "string",
		},
		Location: "$message.header#X-Nomad-Token",
	},
}

var publishMessage = &asyncapi.MessageSample{
	MessageEntity: spec2.MessageEntity{
		Description:   "An array of events, each containing a discrete event",
		Summary:       "Events in the event stream",
		SchemaFormat:  "",
		ContentType:   "",
		Headers:       nil,
		Payload:       nil,
		CorrelationID: nil,
		Tags:          nil,
		Name:          "",
		Title:         "",
		ExternalDocs:  nil,
		Deprecated:    false,
		Examples:      nil,
		Bindings:      nil,
		Traits:        nil,
		MapOfAnything: nil,
	},
	MessageSample: new(structs.Events),
}

var subscribeMessage = &asyncapi.MessageSample{
	MessageEntity: spec2.MessageEntity{
		SchemaFormat:  "",
		ContentType:   "",
		Headers:       nil,
		Payload:       nil,
		CorrelationID: nil,
		Tags:          nil,
		Summary:       "",
		Name:          "",
		Title:         "",
		Description:   "",
		ExternalDocs:  nil,
		Deprecated:    false,
		Examples:      nil,
		Bindings:      nil,
		Traits:        nil,
		MapOfAnything: nil,
	},
	MessageSample: new(structs.EventStreamRequest),
}

var eventStreamOperationsBinding = &spec2.OperationBindingsObject{
	//HTTP: &OperationBindingObject{},
}

type OperationBindingObject struct {
	Type           string
	Method         string
	Query          *SchemaObject
	BindingVersion string
}

var httpEventStreamBindingObject = &OperationBindingObject{
	Type:           "request",
	Method:         "GET",
	BindingVersion: "latest",
	//Query: &SchemaObject{
	//	type: object
	//	required:
	//	- companyId
	//	properties:
	//	companyId:
	//	type: number
	//	minimum: 1
	//	description: The Id of the company.
	//	additionalProperties: false
	//},
}

type SchemaObject struct {
	Name        string
	Type        string
	Description string
}

var components = &spec2.Components{
	Schemas:           nil,
	Messages:          nil,
	SecuritySchemes:   nil,
	Parameters:        eventStreamParams,
	CorrelationIds:    nil,
	OperationTraits:   nil,
	MessageTraits:     nil,
	ServerBindings:    nil,
	ChannelBindings:   nil,
	OperationBindings: nil,
	MessageBindings:   nil,
}

var queryOptionParams = map[string]SchemaObject{
	"topic": {
		Name:        "topic",
		Description: "colon separate list of topics to subscribe to",
		Type:        "string",
	},
	"index": {
		Name:        "index",
		Description: "index to query from",
		Type:        "integer",
		//Schema: map[string]interface{}{
		//	"type": "integer",
		//},
		//Location: "$message.payload#/QueryOptions/MinQueryIndex",
	},
	"region": {
		Name:        "region",
		Description: "region query filter",
		Type:        "string",
		//Schema: map[string]interface{}{
		//	"type": "string",
		//},
		//Location: "$message.payload#/QueryOptions/Region",
	},
	"namespace": {
		Name:        "namespace",
		Description: "namespace query filter",
		Type:        "string",
		//Schema: map[string]interface{}{
		//	"type": "string",
		//},
		//Location: "$message.payload#/QueryOptions/Namespace",
	},
}
