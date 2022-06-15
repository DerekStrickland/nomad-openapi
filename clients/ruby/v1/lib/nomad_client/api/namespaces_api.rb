=begin
#Nomad

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1.1.4
Contact: support@hashicorp.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.0

=end

require 'cgi'

module NomadClient
  class NamespacesApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # @param [Hash] opts the optional parameters
    # @option opts [String] :region Filters results based on the specified region.
    # @option opts [String] :namespace Filters results based on the specified namespace.
    # @option opts [String] :x_nomad_token A Nomad ACL token.
    # @option opts [String] :idempotency_token Can be used to ensure operations are only run once.
    # @return [nil]
    def create_namespace(opts = {})
      create_namespace_with_http_info(opts)
      nil
    end

    # @param [Hash] opts the optional parameters
    # @option opts [String] :region Filters results based on the specified region.
    # @option opts [String] :namespace Filters results based on the specified namespace.
    # @option opts [String] :x_nomad_token A Nomad ACL token.
    # @option opts [String] :idempotency_token Can be used to ensure operations are only run once.
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def create_namespace_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: NamespacesApi.create_namespace ...'
      end
      # resource path
      local_var_path = '/namespace'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'region'] = opts[:'region'] if !opts[:'region'].nil?
      query_params[:'namespace'] = opts[:'namespace'] if !opts[:'namespace'].nil?
      query_params[:'idempotency_token'] = opts[:'idempotency_token'] if !opts[:'idempotency_token'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      header_params[:'X-Nomad-Token'] = opts[:'x_nomad_token'] if !opts[:'x_nomad_token'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || ['X-Nomad-Token']

      new_options = opts.merge(
        :operation => :"NamespacesApi.create_namespace",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: NamespacesApi#create_namespace\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # @param namespace_name [String] The namespace identifier.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :region Filters results based on the specified region.
    # @option opts [String] :namespace Filters results based on the specified namespace.
    # @option opts [String] :x_nomad_token A Nomad ACL token.
    # @option opts [String] :idempotency_token Can be used to ensure operations are only run once.
    # @return [nil]
    def delete_namespace(namespace_name, opts = {})
      delete_namespace_with_http_info(namespace_name, opts)
      nil
    end

    # @param namespace_name [String] The namespace identifier.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :region Filters results based on the specified region.
    # @option opts [String] :namespace Filters results based on the specified namespace.
    # @option opts [String] :x_nomad_token A Nomad ACL token.
    # @option opts [String] :idempotency_token Can be used to ensure operations are only run once.
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def delete_namespace_with_http_info(namespace_name, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: NamespacesApi.delete_namespace ...'
      end
      # verify the required parameter 'namespace_name' is set
      if @api_client.config.client_side_validation && namespace_name.nil?
        fail ArgumentError, "Missing the required parameter 'namespace_name' when calling NamespacesApi.delete_namespace"
      end
      # resource path
      local_var_path = '/namespace/{namespaceName}'.sub('{' + 'namespaceName' + '}', CGI.escape(namespace_name.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'region'] = opts[:'region'] if !opts[:'region'].nil?
      query_params[:'namespace'] = opts[:'namespace'] if !opts[:'namespace'].nil?
      query_params[:'idempotency_token'] = opts[:'idempotency_token'] if !opts[:'idempotency_token'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      header_params[:'X-Nomad-Token'] = opts[:'x_nomad_token'] if !opts[:'x_nomad_token'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || ['X-Nomad-Token']

      new_options = opts.merge(
        :operation => :"NamespacesApi.delete_namespace",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: NamespacesApi#delete_namespace\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # @param namespace_name [String] The namespace identifier.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :region Filters results based on the specified region.
    # @option opts [String] :namespace Filters results based on the specified namespace.
    # @option opts [Integer] :index If set, wait until query exceeds given index. Must be provided with WaitParam.
    # @option opts [String] :wait Provided with IndexParam to wait for change.
    # @option opts [String] :stale If present, results will include stale reads.
    # @option opts [String] :prefix Constrains results to jobs that start with the defined prefix
    # @option opts [String] :x_nomad_token A Nomad ACL token.
    # @option opts [Integer] :per_page Maximum number of results to return.
    # @option opts [String] :next_token Indicates where to start paging for queries that support pagination.
    # @return [Namespace]
    def get_namespace(namespace_name, opts = {})
      data, _status_code, _headers = get_namespace_with_http_info(namespace_name, opts)
      data
    end

    # @param namespace_name [String] The namespace identifier.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :region Filters results based on the specified region.
    # @option opts [String] :namespace Filters results based on the specified namespace.
    # @option opts [Integer] :index If set, wait until query exceeds given index. Must be provided with WaitParam.
    # @option opts [String] :wait Provided with IndexParam to wait for change.
    # @option opts [String] :stale If present, results will include stale reads.
    # @option opts [String] :prefix Constrains results to jobs that start with the defined prefix
    # @option opts [String] :x_nomad_token A Nomad ACL token.
    # @option opts [Integer] :per_page Maximum number of results to return.
    # @option opts [String] :next_token Indicates where to start paging for queries that support pagination.
    # @return [Array<(Namespace, Integer, Hash)>] Namespace data, response status code and response headers
    def get_namespace_with_http_info(namespace_name, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: NamespacesApi.get_namespace ...'
      end
      # verify the required parameter 'namespace_name' is set
      if @api_client.config.client_side_validation && namespace_name.nil?
        fail ArgumentError, "Missing the required parameter 'namespace_name' when calling NamespacesApi.get_namespace"
      end
      # resource path
      local_var_path = '/namespace/{namespaceName}'.sub('{' + 'namespaceName' + '}', CGI.escape(namespace_name.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'region'] = opts[:'region'] if !opts[:'region'].nil?
      query_params[:'namespace'] = opts[:'namespace'] if !opts[:'namespace'].nil?
      query_params[:'wait'] = opts[:'wait'] if !opts[:'wait'].nil?
      query_params[:'stale'] = opts[:'stale'] if !opts[:'stale'].nil?
      query_params[:'prefix'] = opts[:'prefix'] if !opts[:'prefix'].nil?
      query_params[:'per_page'] = opts[:'per_page'] if !opts[:'per_page'].nil?
      query_params[:'next_token'] = opts[:'next_token'] if !opts[:'next_token'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      header_params[:'index'] = opts[:'index'] if !opts[:'index'].nil?
      header_params[:'X-Nomad-Token'] = opts[:'x_nomad_token'] if !opts[:'x_nomad_token'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'Namespace'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['X-Nomad-Token']

      new_options = opts.merge(
        :operation => :"NamespacesApi.get_namespace",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: NamespacesApi#get_namespace\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # @param [Hash] opts the optional parameters
    # @option opts [String] :region Filters results based on the specified region.
    # @option opts [String] :namespace Filters results based on the specified namespace.
    # @option opts [Integer] :index If set, wait until query exceeds given index. Must be provided with WaitParam.
    # @option opts [String] :wait Provided with IndexParam to wait for change.
    # @option opts [String] :stale If present, results will include stale reads.
    # @option opts [String] :prefix Constrains results to jobs that start with the defined prefix
    # @option opts [String] :x_nomad_token A Nomad ACL token.
    # @option opts [Integer] :per_page Maximum number of results to return.
    # @option opts [String] :next_token Indicates where to start paging for queries that support pagination.
    # @return [Array<Namespace>]
    def get_namespaces(opts = {})
      data, _status_code, _headers = get_namespaces_with_http_info(opts)
      data
    end

    # @param [Hash] opts the optional parameters
    # @option opts [String] :region Filters results based on the specified region.
    # @option opts [String] :namespace Filters results based on the specified namespace.
    # @option opts [Integer] :index If set, wait until query exceeds given index. Must be provided with WaitParam.
    # @option opts [String] :wait Provided with IndexParam to wait for change.
    # @option opts [String] :stale If present, results will include stale reads.
    # @option opts [String] :prefix Constrains results to jobs that start with the defined prefix
    # @option opts [String] :x_nomad_token A Nomad ACL token.
    # @option opts [Integer] :per_page Maximum number of results to return.
    # @option opts [String] :next_token Indicates where to start paging for queries that support pagination.
    # @return [Array<(Array<Namespace>, Integer, Hash)>] Array<Namespace> data, response status code and response headers
    def get_namespaces_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: NamespacesApi.get_namespaces ...'
      end
      # resource path
      local_var_path = '/namespaces'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'region'] = opts[:'region'] if !opts[:'region'].nil?
      query_params[:'namespace'] = opts[:'namespace'] if !opts[:'namespace'].nil?
      query_params[:'wait'] = opts[:'wait'] if !opts[:'wait'].nil?
      query_params[:'stale'] = opts[:'stale'] if !opts[:'stale'].nil?
      query_params[:'prefix'] = opts[:'prefix'] if !opts[:'prefix'].nil?
      query_params[:'per_page'] = opts[:'per_page'] if !opts[:'per_page'].nil?
      query_params[:'next_token'] = opts[:'next_token'] if !opts[:'next_token'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      header_params[:'index'] = opts[:'index'] if !opts[:'index'].nil?
      header_params[:'X-Nomad-Token'] = opts[:'x_nomad_token'] if !opts[:'x_nomad_token'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'Array<Namespace>'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['X-Nomad-Token']

      new_options = opts.merge(
        :operation => :"NamespacesApi.get_namespaces",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: NamespacesApi#get_namespaces\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # @param namespace_name [String] The namespace identifier.
    # @param namespace2 [Namespace] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :region Filters results based on the specified region.
    # @option opts [String] :namespace Filters results based on the specified namespace.
    # @option opts [String] :x_nomad_token A Nomad ACL token.
    # @option opts [String] :idempotency_token Can be used to ensure operations are only run once.
    # @return [nil]
    def post_namespace(namespace_name, namespace2, opts = {})
      post_namespace_with_http_info(namespace_name, namespace2, opts)
      nil
    end

    # @param namespace_name [String] The namespace identifier.
    # @param namespace2 [Namespace] 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :region Filters results based on the specified region.
    # @option opts [String] :namespace Filters results based on the specified namespace.
    # @option opts [String] :x_nomad_token A Nomad ACL token.
    # @option opts [String] :idempotency_token Can be used to ensure operations are only run once.
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def post_namespace_with_http_info(namespace_name, namespace2, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: NamespacesApi.post_namespace ...'
      end
      # verify the required parameter 'namespace_name' is set
      if @api_client.config.client_side_validation && namespace_name.nil?
        fail ArgumentError, "Missing the required parameter 'namespace_name' when calling NamespacesApi.post_namespace"
      end
      # resource path
      local_var_path = '/namespace/{namespaceName}'.sub('{' + 'namespaceName' + '}', CGI.escape(namespace_name.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'region'] = opts[:'region'] if !opts[:'region'].nil?
      query_params[:'namespace'] = opts[:'namespace'] if !opts[:'namespace'].nil?
      query_params[:'idempotency_token'] = opts[:'idempotency_token'] if !opts[:'idempotency_token'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end
      header_params[:'X-Nomad-Token'] = opts[:'x_nomad_token'] if !opts[:'x_nomad_token'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(namespace2)

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || ['X-Nomad-Token']

      new_options = opts.merge(
        :operation => :"NamespacesApi.post_namespace",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: NamespacesApi#post_namespace\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
