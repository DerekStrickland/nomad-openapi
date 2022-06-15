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
import io.nomadproject.client.models.TaskGroupScaleStatus;
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
 * JobScaleStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobScaleStatusResponse {
  public static final String SERIALIZED_NAME_JOB_CREATE_INDEX = "JobCreateIndex";
  @SerializedName(SERIALIZED_NAME_JOB_CREATE_INDEX)
  private Integer jobCreateIndex;

  public static final String SERIALIZED_NAME_JOB_I_D = "JobID";
  @SerializedName(SERIALIZED_NAME_JOB_I_D)
  private String jobID;

  public static final String SERIALIZED_NAME_JOB_MODIFY_INDEX = "JobModifyIndex";
  @SerializedName(SERIALIZED_NAME_JOB_MODIFY_INDEX)
  private Integer jobModifyIndex;

  public static final String SERIALIZED_NAME_JOB_STOPPED = "JobStopped";
  @SerializedName(SERIALIZED_NAME_JOB_STOPPED)
  private Boolean jobStopped;

  public static final String SERIALIZED_NAME_NAMESPACE = "Namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_TASK_GROUPS = "TaskGroups";
  @SerializedName(SERIALIZED_NAME_TASK_GROUPS)
  private Map<String, TaskGroupScaleStatus> taskGroups = null;

  public JobScaleStatusResponse() { 
  }

  public JobScaleStatusResponse jobCreateIndex(Integer jobCreateIndex) {
    
    this.jobCreateIndex = jobCreateIndex;
    return this;
  }

   /**
   * Get jobCreateIndex
   * minimum: 0
   * maximum: 384
   * @return jobCreateIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getJobCreateIndex() {
    return jobCreateIndex;
  }


  public void setJobCreateIndex(Integer jobCreateIndex) {
    this.jobCreateIndex = jobCreateIndex;
  }


  public JobScaleStatusResponse jobID(String jobID) {
    
    this.jobID = jobID;
    return this;
  }

   /**
   * Get jobID
   * @return jobID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobID() {
    return jobID;
  }


  public void setJobID(String jobID) {
    this.jobID = jobID;
  }


  public JobScaleStatusResponse jobModifyIndex(Integer jobModifyIndex) {
    
    this.jobModifyIndex = jobModifyIndex;
    return this;
  }

   /**
   * Get jobModifyIndex
   * minimum: 0
   * maximum: 384
   * @return jobModifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getJobModifyIndex() {
    return jobModifyIndex;
  }


  public void setJobModifyIndex(Integer jobModifyIndex) {
    this.jobModifyIndex = jobModifyIndex;
  }


  public JobScaleStatusResponse jobStopped(Boolean jobStopped) {
    
    this.jobStopped = jobStopped;
    return this;
  }

   /**
   * Get jobStopped
   * @return jobStopped
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getJobStopped() {
    return jobStopped;
  }


  public void setJobStopped(Boolean jobStopped) {
    this.jobStopped = jobStopped;
  }


  public JobScaleStatusResponse namespace(String namespace) {
    
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


  public JobScaleStatusResponse taskGroups(Map<String, TaskGroupScaleStatus> taskGroups) {
    
    this.taskGroups = taskGroups;
    return this;
  }

  public JobScaleStatusResponse putTaskGroupsItem(String key, TaskGroupScaleStatus taskGroupsItem) {
    if (this.taskGroups == null) {
      this.taskGroups = new HashMap<>();
    }
    this.taskGroups.put(key, taskGroupsItem);
    return this;
  }

   /**
   * Get taskGroups
   * @return taskGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, TaskGroupScaleStatus> getTaskGroups() {
    return taskGroups;
  }


  public void setTaskGroups(Map<String, TaskGroupScaleStatus> taskGroups) {
    this.taskGroups = taskGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobScaleStatusResponse jobScaleStatusResponse = (JobScaleStatusResponse) o;
    return Objects.equals(this.jobCreateIndex, jobScaleStatusResponse.jobCreateIndex) &&
        Objects.equals(this.jobID, jobScaleStatusResponse.jobID) &&
        Objects.equals(this.jobModifyIndex, jobScaleStatusResponse.jobModifyIndex) &&
        Objects.equals(this.jobStopped, jobScaleStatusResponse.jobStopped) &&
        Objects.equals(this.namespace, jobScaleStatusResponse.namespace) &&
        Objects.equals(this.taskGroups, jobScaleStatusResponse.taskGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobCreateIndex, jobID, jobModifyIndex, jobStopped, namespace, taskGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobScaleStatusResponse {\n");
    sb.append("    jobCreateIndex: ").append(toIndentedString(jobCreateIndex)).append("\n");
    sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
    sb.append("    jobModifyIndex: ").append(toIndentedString(jobModifyIndex)).append("\n");
    sb.append("    jobStopped: ").append(toIndentedString(jobStopped)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    taskGroups: ").append(toIndentedString(taskGroups)).append("\n");
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
    openapiFields.add("JobCreateIndex");
    openapiFields.add("JobID");
    openapiFields.add("JobModifyIndex");
    openapiFields.add("JobStopped");
    openapiFields.add("Namespace");
    openapiFields.add("TaskGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobScaleStatusResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JobScaleStatusResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobScaleStatusResponse is not found in the empty JSON string", JobScaleStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobScaleStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobScaleStatusResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("JobID") != null && !jsonObj.get("JobID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobID").toString()));
      }
      if (jsonObj.get("Namespace") != null && !jsonObj.get("Namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Namespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobScaleStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobScaleStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobScaleStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobScaleStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<JobScaleStatusResponse>() {
           @Override
           public void write(JsonWriter out, JobScaleStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobScaleStatusResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobScaleStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobScaleStatusResponse
  * @throws IOException if the JSON string is invalid with respect to JobScaleStatusResponse
  */
  public static JobScaleStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobScaleStatusResponse.class);
  }

 /**
  * Convert an instance of JobScaleStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

