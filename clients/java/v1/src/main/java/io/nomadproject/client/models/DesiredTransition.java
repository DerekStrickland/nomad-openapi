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
 * DesiredTransition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DesiredTransition {
  public static final String SERIALIZED_NAME_MIGRATE = "Migrate";
  @SerializedName(SERIALIZED_NAME_MIGRATE)
  private Boolean migrate;

  public static final String SERIALIZED_NAME_RESCHEDULE = "Reschedule";
  @SerializedName(SERIALIZED_NAME_RESCHEDULE)
  private Boolean reschedule;

  public DesiredTransition() { 
  }

  public DesiredTransition migrate(Boolean migrate) {
    
    this.migrate = migrate;
    return this;
  }

   /**
   * Get migrate
   * @return migrate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMigrate() {
    return migrate;
  }


  public void setMigrate(Boolean migrate) {
    this.migrate = migrate;
  }


  public DesiredTransition reschedule(Boolean reschedule) {
    
    this.reschedule = reschedule;
    return this;
  }

   /**
   * Get reschedule
   * @return reschedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReschedule() {
    return reschedule;
  }


  public void setReschedule(Boolean reschedule) {
    this.reschedule = reschedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DesiredTransition desiredTransition = (DesiredTransition) o;
    return Objects.equals(this.migrate, desiredTransition.migrate) &&
        Objects.equals(this.reschedule, desiredTransition.reschedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrate, reschedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesiredTransition {\n");
    sb.append("    migrate: ").append(toIndentedString(migrate)).append("\n");
    sb.append("    reschedule: ").append(toIndentedString(reschedule)).append("\n");
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

