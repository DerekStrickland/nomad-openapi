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


package io.nomadproject.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.nomadproject.client.models.DrainMetadata;
import io.nomadproject.client.models.DriverInfo;
import io.nomadproject.client.models.NodeReservedResources;
import io.nomadproject.client.models.NodeResources;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NodeListStub
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NodeListStub {
  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "Attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, String> attributes = null;

  public static final String SERIALIZED_NAME_CREATE_INDEX = "CreateIndex";
  @SerializedName(SERIALIZED_NAME_CREATE_INDEX)
  private Integer createIndex;

  public static final String SERIALIZED_NAME_DATACENTER = "Datacenter";
  @SerializedName(SERIALIZED_NAME_DATACENTER)
  private String datacenter;

  public static final String SERIALIZED_NAME_DRAIN = "Drain";
  @SerializedName(SERIALIZED_NAME_DRAIN)
  private Boolean drain;

  public static final String SERIALIZED_NAME_DRIVERS = "Drivers";
  @SerializedName(SERIALIZED_NAME_DRIVERS)
  private Map<String, DriverInfo> drivers = null;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_LAST_DRAIN = "LastDrain";
  @SerializedName(SERIALIZED_NAME_LAST_DRAIN)
  private DrainMetadata lastDrain;

  public static final String SERIALIZED_NAME_MODIFY_INDEX = "ModifyIndex";
  @SerializedName(SERIALIZED_NAME_MODIFY_INDEX)
  private Integer modifyIndex;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_CLASS = "NodeClass";
  @SerializedName(SERIALIZED_NAME_NODE_CLASS)
  private String nodeClass;

  public static final String SERIALIZED_NAME_NODE_RESOURCES = "NodeResources";
  @SerializedName(SERIALIZED_NAME_NODE_RESOURCES)
  private NodeResources nodeResources;

  public static final String SERIALIZED_NAME_RESERVED_RESOURCES = "ReservedResources";
  @SerializedName(SERIALIZED_NAME_RESERVED_RESOURCES)
  private NodeReservedResources reservedResources;

  public static final String SERIALIZED_NAME_SCHEDULING_ELIGIBILITY = "SchedulingEligibility";
  @SerializedName(SERIALIZED_NAME_SCHEDULING_ELIGIBILITY)
  private String schedulingEligibility;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "StatusDescription";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public NodeListStub() { 
  }

  public NodeListStub address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public NodeListStub attributes(Map<String, String> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public NodeListStub putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, String>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }


  public NodeListStub createIndex(Integer createIndex) {
    
    this.createIndex = createIndex;
    return this;
  }

   /**
   * Get createIndex
   * minimum: 0
   * maximum: 384
   * @return createIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreateIndex() {
    return createIndex;
  }


  public void setCreateIndex(Integer createIndex) {
    this.createIndex = createIndex;
  }


  public NodeListStub datacenter(String datacenter) {
    
    this.datacenter = datacenter;
    return this;
  }

   /**
   * Get datacenter
   * @return datacenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatacenter() {
    return datacenter;
  }


  public void setDatacenter(String datacenter) {
    this.datacenter = datacenter;
  }


  public NodeListStub drain(Boolean drain) {
    
    this.drain = drain;
    return this;
  }

   /**
   * Get drain
   * @return drain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDrain() {
    return drain;
  }


  public void setDrain(Boolean drain) {
    this.drain = drain;
  }


  public NodeListStub drivers(Map<String, DriverInfo> drivers) {
    
    this.drivers = drivers;
    return this;
  }

  public NodeListStub putDriversItem(String key, DriverInfo driversItem) {
    if (this.drivers == null) {
      this.drivers = new HashMap<String, DriverInfo>();
    }
    this.drivers.put(key, driversItem);
    return this;
  }

   /**
   * Get drivers
   * @return drivers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, DriverInfo> getDrivers() {
    return drivers;
  }


  public void setDrivers(Map<String, DriverInfo> drivers) {
    this.drivers = drivers;
  }


  public NodeListStub ID(String ID) {
    
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getID() {
    return ID;
  }


  public void setID(String ID) {
    this.ID = ID;
  }


  public NodeListStub lastDrain(DrainMetadata lastDrain) {
    
    this.lastDrain = lastDrain;
    return this;
  }

   /**
   * Get lastDrain
   * @return lastDrain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DrainMetadata getLastDrain() {
    return lastDrain;
  }


  public void setLastDrain(DrainMetadata lastDrain) {
    this.lastDrain = lastDrain;
  }


  public NodeListStub modifyIndex(Integer modifyIndex) {
    
    this.modifyIndex = modifyIndex;
    return this;
  }

   /**
   * Get modifyIndex
   * minimum: 0
   * maximum: 384
   * @return modifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getModifyIndex() {
    return modifyIndex;
  }


  public void setModifyIndex(Integer modifyIndex) {
    this.modifyIndex = modifyIndex;
  }


  public NodeListStub name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NodeListStub nodeClass(String nodeClass) {
    
    this.nodeClass = nodeClass;
    return this;
  }

   /**
   * Get nodeClass
   * @return nodeClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeClass() {
    return nodeClass;
  }


  public void setNodeClass(String nodeClass) {
    this.nodeClass = nodeClass;
  }


  public NodeListStub nodeResources(NodeResources nodeResources) {
    
    this.nodeResources = nodeResources;
    return this;
  }

   /**
   * Get nodeResources
   * @return nodeResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeResources getNodeResources() {
    return nodeResources;
  }


  public void setNodeResources(NodeResources nodeResources) {
    this.nodeResources = nodeResources;
  }


  public NodeListStub reservedResources(NodeReservedResources reservedResources) {
    
    this.reservedResources = reservedResources;
    return this;
  }

   /**
   * Get reservedResources
   * @return reservedResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeReservedResources getReservedResources() {
    return reservedResources;
  }


  public void setReservedResources(NodeReservedResources reservedResources) {
    this.reservedResources = reservedResources;
  }


  public NodeListStub schedulingEligibility(String schedulingEligibility) {
    
    this.schedulingEligibility = schedulingEligibility;
    return this;
  }

   /**
   * Get schedulingEligibility
   * @return schedulingEligibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchedulingEligibility() {
    return schedulingEligibility;
  }


  public void setSchedulingEligibility(String schedulingEligibility) {
    this.schedulingEligibility = schedulingEligibility;
  }


  public NodeListStub status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public NodeListStub statusDescription(String statusDescription) {
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusDescription() {
    return statusDescription;
  }


  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  public NodeListStub version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeListStub nodeListStub = (NodeListStub) o;
    return Objects.equals(this.address, nodeListStub.address) &&
        Objects.equals(this.attributes, nodeListStub.attributes) &&
        Objects.equals(this.createIndex, nodeListStub.createIndex) &&
        Objects.equals(this.datacenter, nodeListStub.datacenter) &&
        Objects.equals(this.drain, nodeListStub.drain) &&
        Objects.equals(this.drivers, nodeListStub.drivers) &&
        Objects.equals(this.ID, nodeListStub.ID) &&
        Objects.equals(this.lastDrain, nodeListStub.lastDrain) &&
        Objects.equals(this.modifyIndex, nodeListStub.modifyIndex) &&
        Objects.equals(this.name, nodeListStub.name) &&
        Objects.equals(this.nodeClass, nodeListStub.nodeClass) &&
        Objects.equals(this.nodeResources, nodeListStub.nodeResources) &&
        Objects.equals(this.reservedResources, nodeListStub.reservedResources) &&
        Objects.equals(this.schedulingEligibility, nodeListStub.schedulingEligibility) &&
        Objects.equals(this.status, nodeListStub.status) &&
        Objects.equals(this.statusDescription, nodeListStub.statusDescription) &&
        Objects.equals(this.version, nodeListStub.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, attributes, createIndex, datacenter, drain, drivers, ID, lastDrain, modifyIndex, name, nodeClass, nodeResources, reservedResources, schedulingEligibility, status, statusDescription, version);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeListStub {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    createIndex: ").append(toIndentedString(createIndex)).append("\n");
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
    sb.append("    drain: ").append(toIndentedString(drain)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    lastDrain: ").append(toIndentedString(lastDrain)).append("\n");
    sb.append("    modifyIndex: ").append(toIndentedString(modifyIndex)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeClass: ").append(toIndentedString(nodeClass)).append("\n");
    sb.append("    nodeResources: ").append(toIndentedString(nodeResources)).append("\n");
    sb.append("    reservedResources: ").append(toIndentedString(reservedResources)).append("\n");
    sb.append("    schedulingEligibility: ").append(toIndentedString(schedulingEligibility)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

