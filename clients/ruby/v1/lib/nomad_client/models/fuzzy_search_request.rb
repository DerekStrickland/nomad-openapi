=begin
#Nomad

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1.1.4
Contact: support@hashicorp.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.0

=end

require 'date'
require 'time'

module NomadClient
  class FuzzySearchRequest
    attr_accessor :allow_stale

    attr_accessor :auth_token

    attr_accessor :context

    attr_accessor :namespace

    attr_accessor :next_token

    attr_accessor :params

    attr_accessor :per_page

    attr_accessor :prefix

    attr_accessor :region

    attr_accessor :text

    attr_accessor :wait_index

    attr_accessor :wait_time

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'allow_stale' => :'AllowStale',
        :'auth_token' => :'AuthToken',
        :'context' => :'Context',
        :'namespace' => :'Namespace',
        :'next_token' => :'NextToken',
        :'params' => :'Params',
        :'per_page' => :'PerPage',
        :'prefix' => :'Prefix',
        :'region' => :'Region',
        :'text' => :'Text',
        :'wait_index' => :'WaitIndex',
        :'wait_time' => :'WaitTime'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'allow_stale' => :'Boolean',
        :'auth_token' => :'String',
        :'context' => :'String',
        :'namespace' => :'String',
        :'next_token' => :'String',
        :'params' => :'Hash<String, String>',
        :'per_page' => :'Integer',
        :'prefix' => :'String',
        :'region' => :'String',
        :'text' => :'String',
        :'wait_index' => :'Integer',
        :'wait_time' => :'Integer'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `NomadClient::FuzzySearchRequest` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `NomadClient::FuzzySearchRequest`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'allow_stale')
        self.allow_stale = attributes[:'allow_stale']
      end

      if attributes.key?(:'auth_token')
        self.auth_token = attributes[:'auth_token']
      end

      if attributes.key?(:'context')
        self.context = attributes[:'context']
      end

      if attributes.key?(:'namespace')
        self.namespace = attributes[:'namespace']
      end

      if attributes.key?(:'next_token')
        self.next_token = attributes[:'next_token']
      end

      if attributes.key?(:'params')
        if (value = attributes[:'params']).is_a?(Hash)
          self.params = value
        end
      end

      if attributes.key?(:'per_page')
        self.per_page = attributes[:'per_page']
      end

      if attributes.key?(:'prefix')
        self.prefix = attributes[:'prefix']
      end

      if attributes.key?(:'region')
        self.region = attributes[:'region']
      end

      if attributes.key?(:'text')
        self.text = attributes[:'text']
      end

      if attributes.key?(:'wait_index')
        self.wait_index = attributes[:'wait_index']
      end

      if attributes.key?(:'wait_time')
        self.wait_time = attributes[:'wait_time']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@wait_index.nil? && @wait_index > 384
        invalid_properties.push('invalid value for "wait_index", must be smaller than or equal to 384.')
      end

      if !@wait_index.nil? && @wait_index < 0
        invalid_properties.push('invalid value for "wait_index", must be greater than or equal to 0.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@wait_index.nil? && @wait_index > 384
      return false if !@wait_index.nil? && @wait_index < 0
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] wait_index Value to be assigned
    def wait_index=(wait_index)
      if !wait_index.nil? && wait_index > 384
        fail ArgumentError, 'invalid value for "wait_index", must be smaller than or equal to 384.'
      end

      if !wait_index.nil? && wait_index < 0
        fail ArgumentError, 'invalid value for "wait_index", must be greater than or equal to 0.'
      end

      @wait_index = wait_index
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          allow_stale == o.allow_stale &&
          auth_token == o.auth_token &&
          context == o.context &&
          namespace == o.namespace &&
          next_token == o.next_token &&
          params == o.params &&
          per_page == o.per_page &&
          prefix == o.prefix &&
          region == o.region &&
          text == o.text &&
          wait_index == o.wait_index &&
          wait_time == o.wait_time
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [allow_stale, auth_token, context, namespace, next_token, params, per_page, prefix, region, text, wait_index, wait_time].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = NomadClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
