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
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.nomadproject.client.JSON;

/**
 * NodeEligibilityUpdateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NodeEligibilityUpdateResponse {
  public static final String SERIALIZED_NAME_EVAL_CREATE_INDEX = "EvalCreateIndex";
  @SerializedName(SERIALIZED_NAME_EVAL_CREATE_INDEX)
  private Integer evalCreateIndex;

  public static final String SERIALIZED_NAME_EVAL_I_DS = "EvalIDs";
  @SerializedName(SERIALIZED_NAME_EVAL_I_DS)
  private List<String> evalIDs = null;

  public static final String SERIALIZED_NAME_LAST_INDEX = "LastIndex";
  @SerializedName(SERIALIZED_NAME_LAST_INDEX)
  private Integer lastIndex;

  public static final String SERIALIZED_NAME_NODE_MODIFY_INDEX = "NodeModifyIndex";
  @SerializedName(SERIALIZED_NAME_NODE_MODIFY_INDEX)
  private Integer nodeModifyIndex;

  public static final String SERIALIZED_NAME_REQUEST_TIME = "RequestTime";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIME)
  private Long requestTime;

  public NodeEligibilityUpdateResponse() { 
  }

  public NodeEligibilityUpdateResponse evalCreateIndex(Integer evalCreateIndex) {
    
    this.evalCreateIndex = evalCreateIndex;
    return this;
  }

   /**
   * Get evalCreateIndex
   * minimum: 0
   * maximum: 384
   * @return evalCreateIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEvalCreateIndex() {
    return evalCreateIndex;
  }


  public void setEvalCreateIndex(Integer evalCreateIndex) {
    this.evalCreateIndex = evalCreateIndex;
  }


  public NodeEligibilityUpdateResponse evalIDs(List<String> evalIDs) {
    
    this.evalIDs = evalIDs;
    return this;
  }

  public NodeEligibilityUpdateResponse addEvalIDsItem(String evalIDsItem) {
    if (this.evalIDs == null) {
      this.evalIDs = new ArrayList<>();
    }
    this.evalIDs.add(evalIDsItem);
    return this;
  }

   /**
   * Get evalIDs
   * @return evalIDs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEvalIDs() {
    return evalIDs;
  }


  public void setEvalIDs(List<String> evalIDs) {
    this.evalIDs = evalIDs;
  }


  public NodeEligibilityUpdateResponse lastIndex(Integer lastIndex) {
    
    this.lastIndex = lastIndex;
    return this;
  }

   /**
   * Get lastIndex
   * minimum: 0
   * maximum: 384
   * @return lastIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastIndex() {
    return lastIndex;
  }


  public void setLastIndex(Integer lastIndex) {
    this.lastIndex = lastIndex;
  }


  public NodeEligibilityUpdateResponse nodeModifyIndex(Integer nodeModifyIndex) {
    
    this.nodeModifyIndex = nodeModifyIndex;
    return this;
  }

   /**
   * Get nodeModifyIndex
   * minimum: 0
   * maximum: 384
   * @return nodeModifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNodeModifyIndex() {
    return nodeModifyIndex;
  }


  public void setNodeModifyIndex(Integer nodeModifyIndex) {
    this.nodeModifyIndex = nodeModifyIndex;
  }


  public NodeEligibilityUpdateResponse requestTime(Long requestTime) {
    
    this.requestTime = requestTime;
    return this;
  }

   /**
   * Get requestTime
   * @return requestTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRequestTime() {
    return requestTime;
  }


  public void setRequestTime(Long requestTime) {
    this.requestTime = requestTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeEligibilityUpdateResponse nodeEligibilityUpdateResponse = (NodeEligibilityUpdateResponse) o;
    return Objects.equals(this.evalCreateIndex, nodeEligibilityUpdateResponse.evalCreateIndex) &&
        Objects.equals(this.evalIDs, nodeEligibilityUpdateResponse.evalIDs) &&
        Objects.equals(this.lastIndex, nodeEligibilityUpdateResponse.lastIndex) &&
        Objects.equals(this.nodeModifyIndex, nodeEligibilityUpdateResponse.nodeModifyIndex) &&
        Objects.equals(this.requestTime, nodeEligibilityUpdateResponse.requestTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evalCreateIndex, evalIDs, lastIndex, nodeModifyIndex, requestTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeEligibilityUpdateResponse {\n");
    sb.append("    evalCreateIndex: ").append(toIndentedString(evalCreateIndex)).append("\n");
    sb.append("    evalIDs: ").append(toIndentedString(evalIDs)).append("\n");
    sb.append("    lastIndex: ").append(toIndentedString(lastIndex)).append("\n");
    sb.append("    nodeModifyIndex: ").append(toIndentedString(nodeModifyIndex)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("EvalCreateIndex");
    openapiFields.add("EvalIDs");
    openapiFields.add("LastIndex");
    openapiFields.add("NodeModifyIndex");
    openapiFields.add("RequestTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NodeEligibilityUpdateResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NodeEligibilityUpdateResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NodeEligibilityUpdateResponse is not found in the empty JSON string", NodeEligibilityUpdateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NodeEligibilityUpdateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NodeEligibilityUpdateResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("EvalIDs") != null && !jsonObj.get("EvalIDs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `EvalIDs` to be an array in the JSON string but got `%s`", jsonObj.get("EvalIDs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NodeEligibilityUpdateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NodeEligibilityUpdateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NodeEligibilityUpdateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NodeEligibilityUpdateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<NodeEligibilityUpdateResponse>() {
           @Override
           public void write(JsonWriter out, NodeEligibilityUpdateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NodeEligibilityUpdateResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NodeEligibilityUpdateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NodeEligibilityUpdateResponse
  * @throws IOException if the JSON string is invalid with respect to NodeEligibilityUpdateResponse
  */
  public static NodeEligibilityUpdateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NodeEligibilityUpdateResponse.class);
  }

 /**
  * Convert an instance of NodeEligibilityUpdateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

