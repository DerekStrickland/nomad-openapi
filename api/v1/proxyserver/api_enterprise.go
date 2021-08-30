/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.1.3
 * Contact: support@hashicorp.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package main

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// A EnterpriseApiController binds http requests to an api service and writes the service results to the http response
type EnterpriseApiController struct {
	service EnterpriseApiServicer
}

// NewEnterpriseApiController creates a default api controller
func NewEnterpriseApiController(s EnterpriseApiServicer) Router {
	return &EnterpriseApiController{service: s}
}

// Routes returns all of the api route for the EnterpriseApiController
func (c *EnterpriseApiController) Routes() Routes {
	return Routes{
		{
			"CreateQuotaSpec",
			strings.ToUpper("Post"),
			"/v1/quota",
			c.CreateQuotaSpec,
		},
		{
			"DeleteQuotaSpec",
			strings.ToUpper("Delete"),
			"/v1/quota/{specName}",
			c.DeleteQuotaSpec,
		},
		{
			"GetQuotaSpec",
			strings.ToUpper("Get"),
			"/v1/quota/{specName}",
			c.GetQuotaSpec,
		},
		{
			"GetQuotas",
			strings.ToUpper("Get"),
			"/v1/quotas",
			c.GetQuotas,
		},
		{
			"PostQuotaSpec",
			strings.ToUpper("Post"),
			"/v1/quota/{specName}",
			c.PostQuotaSpec,
		},
	}
}

// CreateQuotaSpec -
func (c *EnterpriseApiController) CreateQuotaSpec(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	quotaSpec := &QuotaSpec{}
	if err := json.NewDecoder(r.Body).Decode(&quotaSpec); err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	region := query.Get("region")
	namespace := query.Get("namespace")
	xNomadToken := r.Header.Get("X-Nomad-Token")
	idempotencyToken := query.Get("idempotency_token")
	result, err := c.service.CreateQuotaSpec(r.Context(), *quotaSpec, region, namespace, xNomadToken, idempotencyToken)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, result.Headers, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)

}

// DeleteQuotaSpec -
func (c *EnterpriseApiController) DeleteQuotaSpec(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	specName := params["specName"]

	region := query.Get("region")
	namespace := query.Get("namespace")
	xNomadToken := r.Header.Get("X-Nomad-Token")
	idempotencyToken := query.Get("idempotency_token")
	result, err := c.service.DeleteQuotaSpec(r.Context(), specName, region, namespace, xNomadToken, idempotencyToken)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, result.Headers, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)

}

// GetQuotaSpec -
func (c *EnterpriseApiController) GetQuotaSpec(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	specName := params["specName"]

	region := query.Get("region")
	namespace := query.Get("namespace")
	index, err := parseInt32Parameter(query.Get("index"), false)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	wait := query.Get("wait")
	stale := query.Get("stale")
	prefix := query.Get("prefix")
	xNomadToken := r.Header.Get("X-Nomad-Token")
	perPage, err := parseInt32Parameter(query.Get("per_page"), false)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	nextToken := query.Get("next_token")
	result, err := c.service.GetQuotaSpec(r.Context(), specName, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, result.Headers, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)

}

// GetQuotas -
func (c *EnterpriseApiController) GetQuotas(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	region := query.Get("region")
	namespace := query.Get("namespace")
	index, err := parseInt32Parameter(query.Get("index"), false)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	wait := query.Get("wait")
	stale := query.Get("stale")
	prefix := query.Get("prefix")
	xNomadToken := r.Header.Get("X-Nomad-Token")
	perPage, err := parseInt32Parameter(query.Get("per_page"), false)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	nextToken := query.Get("next_token")
	result, err := c.service.GetQuotas(r.Context(), region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, result.Headers, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)

}

// PostQuotaSpec -
func (c *EnterpriseApiController) PostQuotaSpec(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	specName := params["specName"]

	quotaSpec := &QuotaSpec{}
	if err := json.NewDecoder(r.Body).Decode(&quotaSpec); err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	region := query.Get("region")
	namespace := query.Get("namespace")
	xNomadToken := r.Header.Get("X-Nomad-Token")
	idempotencyToken := query.Get("idempotency_token")
	result, err := c.service.PostQuotaSpec(r.Context(), specName, *quotaSpec, region, namespace, xNomadToken, idempotencyToken)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, result.Headers, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)

}
