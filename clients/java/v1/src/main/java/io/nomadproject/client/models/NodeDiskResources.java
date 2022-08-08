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
 * NodeDiskResources
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NodeDiskResources {
  public static final String SERIALIZED_NAME_DISK_M_B = "DiskMB";
  @SerializedName(SERIALIZED_NAME_DISK_M_B)
  private Long diskMB;

  public NodeDiskResources() { 
  }

  public NodeDiskResources diskMB(Long diskMB) {
    
    this.diskMB = diskMB;
    return this;
  }

   /**
   * Get diskMB
   * @return diskMB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getDiskMB() {
    return diskMB;
  }


  public void setDiskMB(Long diskMB) {
    this.diskMB = diskMB;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDiskResources nodeDiskResources = (NodeDiskResources) o;
    return Objects.equals(this.diskMB, nodeDiskResources.diskMB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskMB);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDiskResources {\n");
    sb.append("    diskMB: ").append(toIndentedString(diskMB)).append("\n");
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

