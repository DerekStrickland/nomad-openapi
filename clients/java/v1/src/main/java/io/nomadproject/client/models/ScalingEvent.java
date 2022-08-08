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

/**
 * ScalingEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScalingEvent {
  public static final String SERIALIZED_NAME_COUNT = "Count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count;

  public static final String SERIALIZED_NAME_CREATE_INDEX = "CreateIndex";
  @SerializedName(SERIALIZED_NAME_CREATE_INDEX)
  private Integer createIndex;

  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Boolean error;

  public static final String SERIALIZED_NAME_EVAL_I_D = "EvalID";
  @SerializedName(SERIALIZED_NAME_EVAL_I_D)
  private String evalID;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_META = "Meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Map<String, Object> meta = null;

  public static final String SERIALIZED_NAME_PREVIOUS_COUNT = "PreviousCount";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_COUNT)
  private Long previousCount;

  public static final String SERIALIZED_NAME_TIME = "Time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Integer time;

  public ScalingEvent() { 
  }

  public ScalingEvent count(Long count) {
    
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


  public ScalingEvent createIndex(Integer createIndex) {
    
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


  public ScalingEvent error(Boolean error) {
    
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


  public ScalingEvent evalID(String evalID) {
    
    this.evalID = evalID;
    return this;
  }

   /**
   * Get evalID
   * @return evalID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEvalID() {
    return evalID;
  }


  public void setEvalID(String evalID) {
    this.evalID = evalID;
  }


  public ScalingEvent message(String message) {
    
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


  public ScalingEvent meta(Map<String, Object> meta) {
    
    this.meta = meta;
    return this;
  }

  public ScalingEvent putMetaItem(String key, Object metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<String, Object>();
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


  public ScalingEvent previousCount(Long previousCount) {
    
    this.previousCount = previousCount;
    return this;
  }

   /**
   * Get previousCount
   * @return previousCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPreviousCount() {
    return previousCount;
  }


  public void setPreviousCount(Long previousCount) {
    this.previousCount = previousCount;
  }


  public ScalingEvent time(Integer time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * minimum: 0
   * maximum: 384
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTime() {
    return time;
  }


  public void setTime(Integer time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalingEvent scalingEvent = (ScalingEvent) o;
    return Objects.equals(this.count, scalingEvent.count) &&
        Objects.equals(this.createIndex, scalingEvent.createIndex) &&
        Objects.equals(this.error, scalingEvent.error) &&
        Objects.equals(this.evalID, scalingEvent.evalID) &&
        Objects.equals(this.message, scalingEvent.message) &&
        Objects.equals(this.meta, scalingEvent.meta) &&
        Objects.equals(this.previousCount, scalingEvent.previousCount) &&
        Objects.equals(this.time, scalingEvent.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, createIndex, error, evalID, message, meta, previousCount, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalingEvent {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    createIndex: ").append(toIndentedString(createIndex)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    evalID: ").append(toIndentedString(evalID)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    previousCount: ").append(toIndentedString(previousCount)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

