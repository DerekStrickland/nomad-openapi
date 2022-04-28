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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * HostNetworkInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HostNetworkInfo {
  public static final String SERIALIZED_NAME_C_I_D_R = "CIDR";
  @SerializedName(SERIALIZED_NAME_C_I_D_R)
  private String CIDR;

  public static final String SERIALIZED_NAME_INTERFACE = "Interface";
  @SerializedName(SERIALIZED_NAME_INTERFACE)
  private String _interface;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESERVED_PORTS = "ReservedPorts";
  @SerializedName(SERIALIZED_NAME_RESERVED_PORTS)
  private String reservedPorts;


  public HostNetworkInfo CIDR(String CIDR) {
    
    this.CIDR = CIDR;
    return this;
  }

   /**
   * Get CIDR
   * @return CIDR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCIDR() {
    return CIDR;
  }


  public void setCIDR(String CIDR) {
    this.CIDR = CIDR;
  }


  public HostNetworkInfo _interface(String _interface) {
    
    this._interface = _interface;
    return this;
  }

   /**
   * Get _interface
   * @return _interface
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInterface() {
    return _interface;
  }


  public void setInterface(String _interface) {
    this._interface = _interface;
  }


  public HostNetworkInfo name(String name) {
    
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


  public HostNetworkInfo reservedPorts(String reservedPorts) {
    
    this.reservedPorts = reservedPorts;
    return this;
  }

   /**
   * Get reservedPorts
   * @return reservedPorts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReservedPorts() {
    return reservedPorts;
  }


  public void setReservedPorts(String reservedPorts) {
    this.reservedPorts = reservedPorts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostNetworkInfo hostNetworkInfo = (HostNetworkInfo) o;
    return Objects.equals(this.CIDR, hostNetworkInfo.CIDR) &&
        Objects.equals(this._interface, hostNetworkInfo._interface) &&
        Objects.equals(this.name, hostNetworkInfo.name) &&
        Objects.equals(this.reservedPorts, hostNetworkInfo.reservedPorts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CIDR, _interface, name, reservedPorts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostNetworkInfo {\n");
    sb.append("    CIDR: ").append(toIndentedString(CIDR)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reservedPorts: ").append(toIndentedString(reservedPorts)).append("\n");
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
