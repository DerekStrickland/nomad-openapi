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
  class PluginsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # @param plugin_id [String] The CSI plugin identifier.
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
    # @return [Array<CSIPlugin>]
    def get_plugin_csi(plugin_id, opts = {})
      data, _status_code, _headers = get_plugin_csi_with_http_info(plugin_id, opts)
      data
    end

    # @param plugin_id [String] The CSI plugin identifier.
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
    # @return [Array<(Array<CSIPlugin>, Integer, Hash)>] Array<CSIPlugin> data, response status code and response headers
    def get_plugin_csi_with_http_info(plugin_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PluginsApi.get_plugin_csi ...'
      end
      # verify the required parameter 'plugin_id' is set
      if @api_client.config.client_side_validation && plugin_id.nil?
        fail ArgumentError, "Missing the required parameter 'plugin_id' when calling PluginsApi.get_plugin_csi"
      end
      # resource path
      local_var_path = '/plugin/csi/{pluginID}'.sub('{' + 'pluginID' + '}', CGI.escape(plugin_id.to_s))

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
      return_type = opts[:debug_return_type] || 'Array<CSIPlugin>'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['X-Nomad-Token']

      new_options = opts.merge(
        :operation => :"PluginsApi.get_plugin_csi",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PluginsApi#get_plugin_csi\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
    # @return [Array<CSIPluginListStub>]
    def get_plugins(opts = {})
      data, _status_code, _headers = get_plugins_with_http_info(opts)
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
    # @return [Array<(Array<CSIPluginListStub>, Integer, Hash)>] Array<CSIPluginListStub> data, response status code and response headers
    def get_plugins_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PluginsApi.get_plugins ...'
      end
      # resource path
      local_var_path = '/plugins'

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
      return_type = opts[:debug_return_type] || 'Array<CSIPluginListStub>'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['X-Nomad-Token']

      new_options = opts.merge(
        :operation => :"PluginsApi.get_plugins",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PluginsApi#get_plugins\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
