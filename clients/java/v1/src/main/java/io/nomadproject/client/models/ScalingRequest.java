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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * ScalingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScalingRequest {
  public static final String SERIALIZED_NAME_COUNT = "Count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count;

  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Boolean error;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_META = "Meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Map<String, Object> meta = null;

  public static final String SERIALIZED_NAME_NAMESPACE = "Namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_POLICY_OVERRIDE = "PolicyOverride";
  @SerializedName(SERIALIZED_NAME_POLICY_OVERRIDE)
  private Boolean policyOverride;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SECRET_I_D = "SecretID";
  @SerializedName(SERIALIZED_NAME_SECRET_I_D)
  private String secretID;

  public static final String SERIALIZED_NAME_TARGET = "Target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private Map<String, String> target = null;

  public ScalingRequest() { 
  }

  public ScalingRequest count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public ScalingRequest error(Boolean error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getError() {
    return error;
  }


  public void setError(Boolean error) {
    this.error = error;
  }


  public ScalingRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ScalingRequest meta(Map<String, Object> meta) {
    
    this.meta = meta;
    return this;
  }

  public ScalingRequest putMetaItem(String key, Object metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<>();
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

  public Map<String, Object> getMeta() {
    return meta;
  }


  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }


  public ScalingRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public ScalingRequest policyOverride(Boolean policyOverride) {
    
    this.policyOverride = policyOverride;
    return this;
  }

   /**
   * Get policyOverride
   * @return policyOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPolicyOverride() {
    return policyOverride;
  }


  public void setPolicyOverride(Boolean policyOverride) {
    this.policyOverride = policyOverride;
  }


  public ScalingRequest region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public ScalingRequest secretID(String secretID) {
    
    this.secretID = secretID;
    return this;
  }

   /**
   * Get secretID
   * @return secretID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecretID() {
    return secretID;
  }


  public void setSecretID(String secretID) {
    this.secretID = secretID;
  }


  public ScalingRequest target(Map<String, String> target) {
    
    this.target = target;
    return this;
  }

  public ScalingRequest putTargetItem(String key, String targetItem) {
    if (this.target == null) {
      this.target = new HashMap<>();
    }
    this.target.put(key, targetItem);
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getTarget() {
    return target;
  }


  public void setTarget(Map<String, String> target) {
    this.target = target;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalingRequest scalingRequest = (ScalingRequest) o;
    return Objects.equals(this.count, scalingRequest.count) &&
        Objects.equals(this.error, scalingRequest.error) &&
        Objects.equals(this.message, scalingRequest.message) &&
        Objects.equals(this.meta, scalingRequest.meta) &&
        Objects.equals(this.namespace, scalingRequest.namespace) &&
        Objects.equals(this.policyOverride, scalingRequest.policyOverride) &&
        Objects.equals(this.region, scalingRequest.region) &&
        Objects.equals(this.secretID, scalingRequest.secretID) &&
        Objects.equals(this.target, scalingRequest.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, error, message, meta, namespace, policyOverride, region, secretID, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalingRequest {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    policyOverride: ").append(toIndentedString(policyOverride)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretID: ").append(toIndentedString(secretID)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
    openapiFields.add("Count");
    openapiFields.add("Error");
    openapiFields.add("Message");
    openapiFields.add("Meta");
    openapiFields.add("Namespace");
    openapiFields.add("PolicyOverride");
    openapiFields.add("Region");
    openapiFields.add("SecretID");
    openapiFields.add("Target");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScalingRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ScalingRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScalingRequest is not found in the empty JSON string", ScalingRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ScalingRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScalingRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Message") != null && !jsonObj.get("Message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Message").toString()));
      }
      if (jsonObj.get("Namespace") != null && !jsonObj.get("Namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Namespace").toString()));
      }
      if (jsonObj.get("Region") != null && !jsonObj.get("Region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Region").toString()));
      }
      if (jsonObj.get("SecretID") != null && !jsonObj.get("SecretID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecretID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecretID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScalingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScalingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScalingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScalingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ScalingRequest>() {
           @Override
           public void write(JsonWriter out, ScalingRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScalingRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScalingRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScalingRequest
  * @throws IOException if the JSON string is invalid with respect to ScalingRequest
  */
  public static ScalingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScalingRequest.class);
  }

 /**
  * Convert an instance of ScalingRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

