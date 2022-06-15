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
import io.nomadproject.client.models.CheckRestart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * ServiceCheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceCheck {
  public static final String SERIALIZED_NAME_ADDRESS_MODE = "AddressMode";
  @SerializedName(SERIALIZED_NAME_ADDRESS_MODE)
  private String addressMode;

  public static final String SERIALIZED_NAME_ADVERTISE = "Advertise";
  @SerializedName(SERIALIZED_NAME_ADVERTISE)
  private String advertise;

  public static final String SERIALIZED_NAME_ARGS = "Args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = null;

  public static final String SERIALIZED_NAME_BODY = "Body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CHECK_RESTART = "CheckRestart";
  @SerializedName(SERIALIZED_NAME_CHECK_RESTART)
  private CheckRestart checkRestart;

  public static final String SERIALIZED_NAME_COMMAND = "Command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private String command;

  public static final String SERIALIZED_NAME_EXPOSE = "Expose";
  @SerializedName(SERIALIZED_NAME_EXPOSE)
  private Boolean expose;

  public static final String SERIALIZED_NAME_FAILURES_BEFORE_CRITICAL = "FailuresBeforeCritical";
  @SerializedName(SERIALIZED_NAME_FAILURES_BEFORE_CRITICAL)
  private Integer failuresBeforeCritical;

  public static final String SERIALIZED_NAME_GR_P_C_SERVICE = "GRPCService";
  @SerializedName(SERIALIZED_NAME_GR_P_C_SERVICE)
  private String grPCService;

  public static final String SERIALIZED_NAME_GR_P_C_USE_T_L_S = "GRPCUseTLS";
  @SerializedName(SERIALIZED_NAME_GR_P_C_USE_T_L_S)
  private Boolean grPCUseTLS;

  public static final String SERIALIZED_NAME_HEADER = "Header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private Map<String, List<String>> header = null;

  public static final String SERIALIZED_NAME_INITIAL_STATUS = "InitialStatus";
  @SerializedName(SERIALIZED_NAME_INITIAL_STATUS)
  private String initialStatus;

  public static final String SERIALIZED_NAME_INTERVAL = "Interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private Long interval;

  public static final String SERIALIZED_NAME_METHOD = "Method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ON_UPDATE = "OnUpdate";
  @SerializedName(SERIALIZED_NAME_ON_UPDATE)
  private String onUpdate;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PORT_LABEL = "PortLabel";
  @SerializedName(SERIALIZED_NAME_PORT_LABEL)
  private String portLabel;

  public static final String SERIALIZED_NAME_PROTOCOL = "Protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_SUCCESS_BEFORE_PASSING = "SuccessBeforePassing";
  @SerializedName(SERIALIZED_NAME_SUCCESS_BEFORE_PASSING)
  private Integer successBeforePassing;

  public static final String SERIALIZED_NAME_TL_S_SKIP_VERIFY = "TLSSkipVerify";
  @SerializedName(SERIALIZED_NAME_TL_S_SKIP_VERIFY)
  private Boolean tlSSkipVerify;

  public static final String SERIALIZED_NAME_TASK_NAME = "TaskName";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName;

  public static final String SERIALIZED_NAME_TIMEOUT = "Timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Long timeout;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ServiceCheck() { 
  }

  public ServiceCheck addressMode(String addressMode) {
    
    this.addressMode = addressMode;
    return this;
  }

   /**
   * Get addressMode
   * @return addressMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressMode() {
    return addressMode;
  }


  public void setAddressMode(String addressMode) {
    this.addressMode = addressMode;
  }


  public ServiceCheck advertise(String advertise) {
    
    this.advertise = advertise;
    return this;
  }

   /**
   * Get advertise
   * @return advertise
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdvertise() {
    return advertise;
  }


  public void setAdvertise(String advertise) {
    this.advertise = advertise;
  }


  public ServiceCheck args(List<String> args) {
    
    this.args = args;
    return this;
  }

  public ServiceCheck addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getArgs() {
    return args;
  }


  public void setArgs(List<String> args) {
    this.args = args;
  }


  public ServiceCheck body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public ServiceCheck checkRestart(CheckRestart checkRestart) {
    
    this.checkRestart = checkRestart;
    return this;
  }

   /**
   * Get checkRestart
   * @return checkRestart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CheckRestart getCheckRestart() {
    return checkRestart;
  }


  public void setCheckRestart(CheckRestart checkRestart) {
    this.checkRestart = checkRestart;
  }


  public ServiceCheck command(String command) {
    
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommand() {
    return command;
  }


  public void setCommand(String command) {
    this.command = command;
  }


  public ServiceCheck expose(Boolean expose) {
    
    this.expose = expose;
    return this;
  }

   /**
   * Get expose
   * @return expose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExpose() {
    return expose;
  }


  public void setExpose(Boolean expose) {
    this.expose = expose;
  }


  public ServiceCheck failuresBeforeCritical(Integer failuresBeforeCritical) {
    
    this.failuresBeforeCritical = failuresBeforeCritical;
    return this;
  }

   /**
   * Get failuresBeforeCritical
   * @return failuresBeforeCritical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFailuresBeforeCritical() {
    return failuresBeforeCritical;
  }


  public void setFailuresBeforeCritical(Integer failuresBeforeCritical) {
    this.failuresBeforeCritical = failuresBeforeCritical;
  }


  public ServiceCheck grPCService(String grPCService) {
    
    this.grPCService = grPCService;
    return this;
  }

   /**
   * Get grPCService
   * @return grPCService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGrPCService() {
    return grPCService;
  }


  public void setGrPCService(String grPCService) {
    this.grPCService = grPCService;
  }


  public ServiceCheck grPCUseTLS(Boolean grPCUseTLS) {
    
    this.grPCUseTLS = grPCUseTLS;
    return this;
  }

   /**
   * Get grPCUseTLS
   * @return grPCUseTLS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGrPCUseTLS() {
    return grPCUseTLS;
  }


  public void setGrPCUseTLS(Boolean grPCUseTLS) {
    this.grPCUseTLS = grPCUseTLS;
  }


  public ServiceCheck header(Map<String, List<String>> header) {
    
    this.header = header;
    return this;
  }

  public ServiceCheck putHeaderItem(String key, List<String> headerItem) {
    if (this.header == null) {
      this.header = new HashMap<>();
    }
    this.header.put(key, headerItem);
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getHeader() {
    return header;
  }


  public void setHeader(Map<String, List<String>> header) {
    this.header = header;
  }


  public ServiceCheck initialStatus(String initialStatus) {
    
    this.initialStatus = initialStatus;
    return this;
  }

   /**
   * Get initialStatus
   * @return initialStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInitialStatus() {
    return initialStatus;
  }


  public void setInitialStatus(String initialStatus) {
    this.initialStatus = initialStatus;
  }


  public ServiceCheck interval(Long interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getInterval() {
    return interval;
  }


  public void setInterval(Long interval) {
    this.interval = interval;
  }


  public ServiceCheck method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public ServiceCheck name(String name) {
    
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


  public ServiceCheck onUpdate(String onUpdate) {
    
    this.onUpdate = onUpdate;
    return this;
  }

   /**
   * Get onUpdate
   * @return onUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOnUpdate() {
    return onUpdate;
  }


  public void setOnUpdate(String onUpdate) {
    this.onUpdate = onUpdate;
  }


  public ServiceCheck path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ServiceCheck portLabel(String portLabel) {
    
    this.portLabel = portLabel;
    return this;
  }

   /**
   * Get portLabel
   * @return portLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPortLabel() {
    return portLabel;
  }


  public void setPortLabel(String portLabel) {
    this.portLabel = portLabel;
  }


  public ServiceCheck protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public ServiceCheck successBeforePassing(Integer successBeforePassing) {
    
    this.successBeforePassing = successBeforePassing;
    return this;
  }

   /**
   * Get successBeforePassing
   * @return successBeforePassing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuccessBeforePassing() {
    return successBeforePassing;
  }


  public void setSuccessBeforePassing(Integer successBeforePassing) {
    this.successBeforePassing = successBeforePassing;
  }


  public ServiceCheck tlSSkipVerify(Boolean tlSSkipVerify) {
    
    this.tlSSkipVerify = tlSSkipVerify;
    return this;
  }

   /**
   * Get tlSSkipVerify
   * @return tlSSkipVerify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTlSSkipVerify() {
    return tlSSkipVerify;
  }


  public void setTlSSkipVerify(Boolean tlSSkipVerify) {
    this.tlSSkipVerify = tlSSkipVerify;
  }


  public ServiceCheck taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskName() {
    return taskName;
  }


  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  public ServiceCheck timeout(Long timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTimeout() {
    return timeout;
  }


  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }


  public ServiceCheck type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCheck serviceCheck = (ServiceCheck) o;
    return Objects.equals(this.addressMode, serviceCheck.addressMode) &&
        Objects.equals(this.advertise, serviceCheck.advertise) &&
        Objects.equals(this.args, serviceCheck.args) &&
        Objects.equals(this.body, serviceCheck.body) &&
        Objects.equals(this.checkRestart, serviceCheck.checkRestart) &&
        Objects.equals(this.command, serviceCheck.command) &&
        Objects.equals(this.expose, serviceCheck.expose) &&
        Objects.equals(this.failuresBeforeCritical, serviceCheck.failuresBeforeCritical) &&
        Objects.equals(this.grPCService, serviceCheck.grPCService) &&
        Objects.equals(this.grPCUseTLS, serviceCheck.grPCUseTLS) &&
        Objects.equals(this.header, serviceCheck.header) &&
        Objects.equals(this.initialStatus, serviceCheck.initialStatus) &&
        Objects.equals(this.interval, serviceCheck.interval) &&
        Objects.equals(this.method, serviceCheck.method) &&
        Objects.equals(this.name, serviceCheck.name) &&
        Objects.equals(this.onUpdate, serviceCheck.onUpdate) &&
        Objects.equals(this.path, serviceCheck.path) &&
        Objects.equals(this.portLabel, serviceCheck.portLabel) &&
        Objects.equals(this.protocol, serviceCheck.protocol) &&
        Objects.equals(this.successBeforePassing, serviceCheck.successBeforePassing) &&
        Objects.equals(this.tlSSkipVerify, serviceCheck.tlSSkipVerify) &&
        Objects.equals(this.taskName, serviceCheck.taskName) &&
        Objects.equals(this.timeout, serviceCheck.timeout) &&
        Objects.equals(this.type, serviceCheck.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressMode, advertise, args, body, checkRestart, command, expose, failuresBeforeCritical, grPCService, grPCUseTLS, header, initialStatus, interval, method, name, onUpdate, path, portLabel, protocol, successBeforePassing, tlSSkipVerify, taskName, timeout, type);
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
    sb.append("class ServiceCheck {\n");
    sb.append("    addressMode: ").append(toIndentedString(addressMode)).append("\n");
    sb.append("    advertise: ").append(toIndentedString(advertise)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    checkRestart: ").append(toIndentedString(checkRestart)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    expose: ").append(toIndentedString(expose)).append("\n");
    sb.append("    failuresBeforeCritical: ").append(toIndentedString(failuresBeforeCritical)).append("\n");
    sb.append("    grPCService: ").append(toIndentedString(grPCService)).append("\n");
    sb.append("    grPCUseTLS: ").append(toIndentedString(grPCUseTLS)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    initialStatus: ").append(toIndentedString(initialStatus)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onUpdate: ").append(toIndentedString(onUpdate)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    portLabel: ").append(toIndentedString(portLabel)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    successBeforePassing: ").append(toIndentedString(successBeforePassing)).append("\n");
    sb.append("    tlSSkipVerify: ").append(toIndentedString(tlSSkipVerify)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("AddressMode");
    openapiFields.add("Advertise");
    openapiFields.add("Args");
    openapiFields.add("Body");
    openapiFields.add("CheckRestart");
    openapiFields.add("Command");
    openapiFields.add("Expose");
    openapiFields.add("FailuresBeforeCritical");
    openapiFields.add("GRPCService");
    openapiFields.add("GRPCUseTLS");
    openapiFields.add("Header");
    openapiFields.add("InitialStatus");
    openapiFields.add("Interval");
    openapiFields.add("Method");
    openapiFields.add("Name");
    openapiFields.add("OnUpdate");
    openapiFields.add("Path");
    openapiFields.add("PortLabel");
    openapiFields.add("Protocol");
    openapiFields.add("SuccessBeforePassing");
    openapiFields.add("TLSSkipVerify");
    openapiFields.add("TaskName");
    openapiFields.add("Timeout");
    openapiFields.add("Type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceCheck
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ServiceCheck.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceCheck is not found in the empty JSON string", ServiceCheck.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ServiceCheck.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServiceCheck` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("AddressMode") != null && !jsonObj.get("AddressMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AddressMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AddressMode").toString()));
      }
      if (jsonObj.get("Advertise") != null && !jsonObj.get("Advertise").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Advertise` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Advertise").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("Args") != null && !jsonObj.get("Args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Args` to be an array in the JSON string but got `%s`", jsonObj.get("Args").toString()));
      }
      if (jsonObj.get("Body") != null && !jsonObj.get("Body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Body").toString()));
      }
      // validate the optional field `CheckRestart`
      if (jsonObj.getAsJsonObject("CheckRestart") != null) {
        CheckRestart.validateJsonObject(jsonObj.getAsJsonObject("CheckRestart"));
      }
      if (jsonObj.get("Command") != null && !jsonObj.get("Command").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Command` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Command").toString()));
      }
      if (jsonObj.get("GRPCService") != null && !jsonObj.get("GRPCService").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GRPCService` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GRPCService").toString()));
      }
      if (jsonObj.get("InitialStatus") != null && !jsonObj.get("InitialStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InitialStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InitialStatus").toString()));
      }
      if (jsonObj.get("Method") != null && !jsonObj.get("Method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Method").toString()));
      }
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (jsonObj.get("OnUpdate") != null && !jsonObj.get("OnUpdate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OnUpdate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OnUpdate").toString()));
      }
      if (jsonObj.get("Path") != null && !jsonObj.get("Path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Path").toString()));
      }
      if (jsonObj.get("PortLabel") != null && !jsonObj.get("PortLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PortLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PortLabel").toString()));
      }
      if (jsonObj.get("Protocol") != null && !jsonObj.get("Protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Protocol").toString()));
      }
      if (jsonObj.get("TaskName") != null && !jsonObj.get("TaskName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TaskName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TaskName").toString()));
      }
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceCheck.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceCheck' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceCheck> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceCheck.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceCheck>() {
           @Override
           public void write(JsonWriter out, ServiceCheck value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceCheck read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServiceCheck given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceCheck
  * @throws IOException if the JSON string is invalid with respect to ServiceCheck
  */
  public static ServiceCheck fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceCheck.class);
  }

 /**
  * Convert an instance of ServiceCheck to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

