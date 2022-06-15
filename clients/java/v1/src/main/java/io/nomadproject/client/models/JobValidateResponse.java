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
 * JobValidateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobValidateResponse {
  public static final String SERIALIZED_NAME_DRIVER_CONFIG_VALIDATED = "DriverConfigValidated";
  @SerializedName(SERIALIZED_NAME_DRIVER_CONFIG_VALIDATED)
  private Boolean driverConfigValidated;

  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "ValidationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<String> validationErrors = null;

  public static final String SERIALIZED_NAME_WARNINGS = "Warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private String warnings;

  public JobValidateResponse() { 
  }

  public JobValidateResponse driverConfigValidated(Boolean driverConfigValidated) {
    
    this.driverConfigValidated = driverConfigValidated;
    return this;
  }

   /**
   * Get driverConfigValidated
   * @return driverConfigValidated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDriverConfigValidated() {
    return driverConfigValidated;
  }


  public void setDriverConfigValidated(Boolean driverConfigValidated) {
    this.driverConfigValidated = driverConfigValidated;
  }


  public JobValidateResponse error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public JobValidateResponse validationErrors(List<String> validationErrors) {
    
    this.validationErrors = validationErrors;
    return this;
  }

  public JobValidateResponse addValidationErrorsItem(String validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Get validationErrors
   * @return validationErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getValidationErrors() {
    return validationErrors;
  }


  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }


  public JobValidateResponse warnings(String warnings) {
    
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
    JobValidateResponse jobValidateResponse = (JobValidateResponse) o;
    return Objects.equals(this.driverConfigValidated, jobValidateResponse.driverConfigValidated) &&
        Objects.equals(this.error, jobValidateResponse.error) &&
        Objects.equals(this.validationErrors, jobValidateResponse.validationErrors) &&
        Objects.equals(this.warnings, jobValidateResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverConfigValidated, error, validationErrors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobValidateResponse {\n");
    sb.append("    driverConfigValidated: ").append(toIndentedString(driverConfigValidated)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
    openapiFields.add("DriverConfigValidated");
    openapiFields.add("Error");
    openapiFields.add("ValidationErrors");
    openapiFields.add("Warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobValidateResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JobValidateResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobValidateResponse is not found in the empty JSON string", JobValidateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobValidateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobValidateResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Error") != null && !jsonObj.get("Error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Error").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("ValidationErrors") != null && !jsonObj.get("ValidationErrors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ValidationErrors` to be an array in the JSON string but got `%s`", jsonObj.get("ValidationErrors").toString()));
      }
      if (jsonObj.get("Warnings") != null && !jsonObj.get("Warnings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Warnings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Warnings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobValidateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobValidateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobValidateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobValidateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<JobValidateResponse>() {
           @Override
           public void write(JsonWriter out, JobValidateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobValidateResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobValidateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobValidateResponse
  * @throws IOException if the JSON string is invalid with respect to JobValidateResponse
  */
  public static JobValidateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobValidateResponse.class);
  }

 /**
  * Convert an instance of JobValidateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

