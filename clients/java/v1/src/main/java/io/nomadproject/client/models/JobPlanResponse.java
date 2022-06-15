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
import io.nomadproject.client.models.AllocationMetric;
import io.nomadproject.client.models.Evaluation;
import io.nomadproject.client.models.JobDiff;
import io.nomadproject.client.models.PlanAnnotations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * JobPlanResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobPlanResponse {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "Annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private PlanAnnotations annotations;

  public static final String SERIALIZED_NAME_CREATED_EVALS = "CreatedEvals";
  @SerializedName(SERIALIZED_NAME_CREATED_EVALS)
  private List<Evaluation> createdEvals = null;

  public static final String SERIALIZED_NAME_DIFF = "Diff";
  @SerializedName(SERIALIZED_NAME_DIFF)
  private JobDiff diff;

  public static final String SERIALIZED_NAME_FAILED_T_G_ALLOCS = "FailedTGAllocs";
  @SerializedName(SERIALIZED_NAME_FAILED_T_G_ALLOCS)
  private Map<String, AllocationMetric> failedTGAllocs = null;

  public static final String SERIALIZED_NAME_JOB_MODIFY_INDEX = "JobModifyIndex";
  @SerializedName(SERIALIZED_NAME_JOB_MODIFY_INDEX)
  private Integer jobModifyIndex;

  public static final String SERIALIZED_NAME_NEXT_PERIODIC_LAUNCH = "NextPeriodicLaunch";
  @SerializedName(SERIALIZED_NAME_NEXT_PERIODIC_LAUNCH)
  private OffsetDateTime nextPeriodicLaunch;

  public static final String SERIALIZED_NAME_WARNINGS = "Warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private String warnings;

  public JobPlanResponse() { 
  }

  public JobPlanResponse annotations(PlanAnnotations annotations) {
    
    this.annotations = annotations;
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlanAnnotations getAnnotations() {
    return annotations;
  }


  public void setAnnotations(PlanAnnotations annotations) {
    this.annotations = annotations;
  }


  public JobPlanResponse createdEvals(List<Evaluation> createdEvals) {
    
    this.createdEvals = createdEvals;
    return this;
  }

  public JobPlanResponse addCreatedEvalsItem(Evaluation createdEvalsItem) {
    if (this.createdEvals == null) {
      this.createdEvals = new ArrayList<>();
    }
    this.createdEvals.add(createdEvalsItem);
    return this;
  }

   /**
   * Get createdEvals
   * @return createdEvals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Evaluation> getCreatedEvals() {
    return createdEvals;
  }


  public void setCreatedEvals(List<Evaluation> createdEvals) {
    this.createdEvals = createdEvals;
  }


  public JobPlanResponse diff(JobDiff diff) {
    
    this.diff = diff;
    return this;
  }

   /**
   * Get diff
   * @return diff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobDiff getDiff() {
    return diff;
  }


  public void setDiff(JobDiff diff) {
    this.diff = diff;
  }


  public JobPlanResponse failedTGAllocs(Map<String, AllocationMetric> failedTGAllocs) {
    
    this.failedTGAllocs = failedTGAllocs;
    return this;
  }

  public JobPlanResponse putFailedTGAllocsItem(String key, AllocationMetric failedTGAllocsItem) {
    if (this.failedTGAllocs == null) {
      this.failedTGAllocs = new HashMap<>();
    }
    this.failedTGAllocs.put(key, failedTGAllocsItem);
    return this;
  }

   /**
   * Get failedTGAllocs
   * @return failedTGAllocs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, AllocationMetric> getFailedTGAllocs() {
    return failedTGAllocs;
  }


  public void setFailedTGAllocs(Map<String, AllocationMetric> failedTGAllocs) {
    this.failedTGAllocs = failedTGAllocs;
  }


  public JobPlanResponse jobModifyIndex(Integer jobModifyIndex) {
    
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


  public JobPlanResponse nextPeriodicLaunch(OffsetDateTime nextPeriodicLaunch) {
    
    this.nextPeriodicLaunch = nextPeriodicLaunch;
    return this;
  }

   /**
   * Get nextPeriodicLaunch
   * @return nextPeriodicLaunch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNextPeriodicLaunch() {
    return nextPeriodicLaunch;
  }


  public void setNextPeriodicLaunch(OffsetDateTime nextPeriodicLaunch) {
    this.nextPeriodicLaunch = nextPeriodicLaunch;
  }


  public JobPlanResponse warnings(String warnings) {
    
    this.warnings = warnings;
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWarnings() {
    return warnings;
  }


  public void setWarnings(String warnings) {
    this.warnings = warnings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobPlanResponse jobPlanResponse = (JobPlanResponse) o;
    return Objects.equals(this.annotations, jobPlanResponse.annotations) &&
        Objects.equals(this.createdEvals, jobPlanResponse.createdEvals) &&
        Objects.equals(this.diff, jobPlanResponse.diff) &&
        Objects.equals(this.failedTGAllocs, jobPlanResponse.failedTGAllocs) &&
        Objects.equals(this.jobModifyIndex, jobPlanResponse.jobModifyIndex) &&
        Objects.equals(this.nextPeriodicLaunch, jobPlanResponse.nextPeriodicLaunch) &&
        Objects.equals(this.warnings, jobPlanResponse.warnings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, createdEvals, diff, failedTGAllocs, jobModifyIndex, nextPeriodicLaunch, warnings);
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
    sb.append("class JobPlanResponse {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    createdEvals: ").append(toIndentedString(createdEvals)).append("\n");
    sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
    sb.append("    failedTGAllocs: ").append(toIndentedString(failedTGAllocs)).append("\n");
    sb.append("    jobModifyIndex: ").append(toIndentedString(jobModifyIndex)).append("\n");
    sb.append("    nextPeriodicLaunch: ").append(toIndentedString(nextPeriodicLaunch)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
    openapiFields.add("Annotations");
    openapiFields.add("CreatedEvals");
    openapiFields.add("Diff");
    openapiFields.add("FailedTGAllocs");
    openapiFields.add("JobModifyIndex");
    openapiFields.add("NextPeriodicLaunch");
    openapiFields.add("Warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobPlanResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JobPlanResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobPlanResponse is not found in the empty JSON string", JobPlanResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobPlanResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobPlanResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `Annotations`
      if (jsonObj.getAsJsonObject("Annotations") != null) {
        PlanAnnotations.validateJsonObject(jsonObj.getAsJsonObject("Annotations"));
      }
      JsonArray jsonArraycreatedEvals = jsonObj.getAsJsonArray("CreatedEvals");
      if (jsonArraycreatedEvals != null) {
        // ensure the json data is an array
        if (!jsonObj.get("CreatedEvals").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `CreatedEvals` to be an array in the JSON string but got `%s`", jsonObj.get("CreatedEvals").toString()));
        }

        // validate the optional field `CreatedEvals` (array)
        for (int i = 0; i < jsonArraycreatedEvals.size(); i++) {
          Evaluation.validateJsonObject(jsonArraycreatedEvals.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `Diff`
      if (jsonObj.getAsJsonObject("Diff") != null) {
        JobDiff.validateJsonObject(jsonObj.getAsJsonObject("Diff"));
      }
      if (jsonObj.get("Warnings") != null && !jsonObj.get("Warnings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Warnings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Warnings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobPlanResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobPlanResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobPlanResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobPlanResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<JobPlanResponse>() {
           @Override
           public void write(JsonWriter out, JobPlanResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobPlanResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobPlanResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobPlanResponse
  * @throws IOException if the JSON string is invalid with respect to JobPlanResponse
  */
  public static JobPlanResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobPlanResponse.class);
  }

 /**
  * Convert an instance of JobPlanResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

