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
import io.nomadproject.client.models.DrainSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NodeUpdateDrainRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NodeUpdateDrainRequest {
  public static final String SERIALIZED_NAME_DRAIN_SPEC = "DrainSpec";
  @SerializedName(SERIALIZED_NAME_DRAIN_SPEC)
  private DrainSpec drainSpec;

  public static final String SERIALIZED_NAME_MARK_ELIGIBLE = "MarkEligible";
  @SerializedName(SERIALIZED_NAME_MARK_ELIGIBLE)
  private Boolean markEligible;

  public static final String SERIALIZED_NAME_META = "Meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Map<String, String> meta = null;

  public static final String SERIALIZED_NAME_NODE_I_D = "NodeID";
  @SerializedName(SERIALIZED_NAME_NODE_I_D)
  private String nodeID;

  public NodeUpdateDrainRequest() { 
  }

  public NodeUpdateDrainRequest drainSpec(DrainSpec drainSpec) {
    
    this.drainSpec = drainSpec;
    return this;
  }

   /**
   * Get drainSpec
   * @return drainSpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DrainSpec getDrainSpec() {
    return drainSpec;
  }


  public void setDrainSpec(DrainSpec drainSpec) {
    this.drainSpec = drainSpec;
  }


  public NodeUpdateDrainRequest markEligible(Boolean markEligible) {
    
    this.markEligible = markEligible;
    return this;
  }

   /**
   * Get markEligible
   * @return markEligible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMarkEligible() {
    return markEligible;
  }


  public void setMarkEligible(Boolean markEligible) {
    this.markEligible = markEligible;
  }


  public NodeUpdateDrainRequest meta(Map<String, String> meta) {
    
    this.meta = meta;
    return this;
  }

  public NodeUpdateDrainRequest putMetaItem(String key, String metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<String, String>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMeta() {
    return meta;
  }


  public void setMeta(Map<String, String> meta) {
    this.meta = meta;
  }


  public NodeUpdateDrainRequest nodeID(String nodeID) {
    
    this.nodeID = nodeID;
    return this;
  }

   /**
   * Get nodeID
   * @return nodeID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeID() {
    return nodeID;
  }


  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeUpdateDrainRequest nodeUpdateDrainRequest = (NodeUpdateDrainRequest) o;
    return Objects.equals(this.drainSpec, nodeUpdateDrainRequest.drainSpec) &&
        Objects.equals(this.markEligible, nodeUpdateDrainRequest.markEligible) &&
        Objects.equals(this.meta, nodeUpdateDrainRequest.meta) &&
        Objects.equals(this.nodeID, nodeUpdateDrainRequest.nodeID);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(drainSpec, markEligible, meta, nodeID);
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
    sb.append("class NodeUpdateDrainRequest {\n");
    sb.append("    drainSpec: ").append(toIndentedString(drainSpec)).append("\n");
    sb.append("    markEligible: ").append(toIndentedString(markEligible)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
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

