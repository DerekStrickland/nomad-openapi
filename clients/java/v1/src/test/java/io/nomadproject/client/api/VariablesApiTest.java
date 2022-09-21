/*
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.nomadproject.client.api;

import io.nomadproject.client.ApiException;
import io.nomadproject.client.models.Variable;
import io.nomadproject.client.models.VariableMetadata;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VariablesApi
 */
@Ignore
public class VariablesApiTest {

    private final VariablesApi api = new VariablesApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVariableTest() throws ApiException {
        String path = null;
        Variable variable = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        Integer cas = null;
        api.deleteVariable(path, variable, region, namespace, xNomadToken, idempotencyToken, cas);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVariableQueryTest() throws ApiException {
        String path = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        Variable response = api.getVariableQuery(path, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVariablesListRequestTest() throws ApiException {
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        List<VariableMetadata> response = api.getVariablesListRequest(region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postVariableTest() throws ApiException {
        String path = null;
        Variable variable = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        Integer cas = null;
        Variable response = api.postVariable(path, variable, region, namespace, xNomadToken, idempotencyToken, cas);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putVariableTest() throws ApiException {
        String path = null;
        Variable variable = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        Integer cas = null;
        Variable response = api.putVariable(path, variable, region, namespace, xNomadToken, idempotencyToken, cas);

        // TODO: test validations
    }
    
}