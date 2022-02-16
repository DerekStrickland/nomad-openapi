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
  class ServerHealth
    attr_accessor :address

    attr_accessor :healthy

    attr_accessor :id

    attr_accessor :last_contact

    attr_accessor :last_index

    attr_accessor :last_term

    attr_accessor :leader

    attr_accessor :name

    attr_accessor :serf_status

    attr_accessor :stable_since

    attr_accessor :version

    attr_accessor :voter

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'address' => :'Address',
        :'healthy' => :'Healthy',
        :'id' => :'ID',
        :'last_contact' => :'LastContact',
        :'last_index' => :'LastIndex',
        :'last_term' => :'LastTerm',
        :'leader' => :'Leader',
        :'name' => :'Name',
        :'serf_status' => :'SerfStatus',
        :'stable_since' => :'StableSince',
        :'version' => :'Version',
        :'voter' => :'Voter'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'address' => :'String',
        :'healthy' => :'Boolean',
        :'id' => :'String',
        :'last_contact' => :'Integer',
        :'last_index' => :'Integer',
        :'last_term' => :'Integer',
        :'leader' => :'Boolean',
        :'name' => :'String',
        :'serf_status' => :'String',
        :'stable_since' => :'Time',
        :'version' => :'String',
        :'voter' => :'Boolean'
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
        fail ArgumentError, "The input argument (attributes) must be a hash in `NomadClient::ServerHealth` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `NomadClient::ServerHealth`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'address')
        self.address = attributes[:'address']
      end

      if attributes.key?(:'healthy')
        self.healthy = attributes[:'healthy']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.key?(:'last_contact')
        self.last_contact = attributes[:'last_contact']
      end

      if attributes.key?(:'last_index')
        self.last_index = attributes[:'last_index']
      end

      if attributes.key?(:'last_term')
        self.last_term = attributes[:'last_term']
      end

      if attributes.key?(:'leader')
        self.leader = attributes[:'leader']
      end

      if attributes.key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.key?(:'serf_status')
        self.serf_status = attributes[:'serf_status']
      end

      if attributes.key?(:'stable_since')
        self.stable_since = attributes[:'stable_since']
      end

      if attributes.key?(:'version')
        self.version = attributes[:'version']
      end

      if attributes.key?(:'voter')
        self.voter = attributes[:'voter']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@last_index.nil? && @last_index > 384
        invalid_properties.push('invalid value for "last_index", must be smaller than or equal to 384.')
      end

      if !@last_index.nil? && @last_index < 0
        invalid_properties.push('invalid value for "last_index", must be greater than or equal to 0.')
      end

      if !@last_term.nil? && @last_term > 384
        invalid_properties.push('invalid value for "last_term", must be smaller than or equal to 384.')
      end

      if !@last_term.nil? && @last_term < 0
        invalid_properties.push('invalid value for "last_term", must be greater than or equal to 0.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@last_index.nil? && @last_index > 384
      return false if !@last_index.nil? && @last_index < 0
      return false if !@last_term.nil? && @last_term > 384
      return false if !@last_term.nil? && @last_term < 0
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] last_index Value to be assigned
    def last_index=(last_index)
      if !last_index.nil? && last_index > 384
        fail ArgumentError, 'invalid value for "last_index", must be smaller than or equal to 384.'
      end

      if !last_index.nil? && last_index < 0
        fail ArgumentError, 'invalid value for "last_index", must be greater than or equal to 0.'
      end

      @last_index = last_index
    end

    # Custom attribute writer method with validation
    # @param [Object] last_term Value to be assigned
    def last_term=(last_term)
      if !last_term.nil? && last_term > 384
        fail ArgumentError, 'invalid value for "last_term", must be smaller than or equal to 384.'
      end

      if !last_term.nil? && last_term < 0
        fail ArgumentError, 'invalid value for "last_term", must be greater than or equal to 0.'
      end

      @last_term = last_term
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          address == o.address &&
          healthy == o.healthy &&
          id == o.id &&
          last_contact == o.last_contact &&
          last_index == o.last_index &&
          last_term == o.last_term &&
          leader == o.leader &&
          name == o.name &&
          serf_status == o.serf_status &&
          stable_since == o.stable_since &&
          version == o.version &&
          voter == o.voter
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [address, healthy, id, last_contact, last_index, last_term, leader, name, serf_status, stable_since, version, voter].hash
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