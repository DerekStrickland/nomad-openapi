=begin
#Nomad

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1.1.4
Contact: support@hashicorp.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.0

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for NomadClient::AllocatedCpuResources
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe NomadClient::AllocatedCpuResources do
  let(:instance) { NomadClient::AllocatedCpuResources.new }

  describe 'test an instance of AllocatedCpuResources' do
    it 'should create an instance of AllocatedCpuResources' do
      expect(instance).to be_instance_of(NomadClient::AllocatedCpuResources)
    end
  end
  describe 'test attribute "cpu_shares"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
