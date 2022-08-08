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
import io.nomadproject.client.models.NodeScoreMeta;
import io.nomadproject.client.models.Resources;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AllocationMetric
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AllocationMetric {
  public static final String SERIALIZED_NAME_ALLOCATION_TIME = "AllocationTime";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_TIME)
  private Long allocationTime;

  public static final String SERIALIZED_NAME_CLASS_EXHAUSTED = "ClassExhausted";
  @SerializedName(SERIALIZED_NAME_CLASS_EXHAUSTED)
  private Map<String, Integer> classExhausted = null;

  public static final String SERIALIZED_NAME_CLASS_FILTERED = "ClassFiltered";
  @SerializedName(SERIALIZED_NAME_CLASS_FILTERED)
  private Map<String, Integer> classFiltered = null;

  public static final String SERIALIZED_NAME_COALESCED_FAILURES = "CoalescedFailures";
  @SerializedName(SERIALIZED_NAME_COALESCED_FAILURES)
  private Integer coalescedFailures;

  public static final String SERIALIZED_NAME_CONSTRAINT_FILTERED = "ConstraintFiltered";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT_FILTERED)
  private Map<String, Integer> constraintFiltered = null;

  public static final String SERIALIZED_NAME_DIMENSION_EXHAUSTED = "DimensionExhausted";
  @SerializedName(SERIALIZED_NAME_DIMENSION_EXHAUSTED)
  private Map<String, Integer> dimensionExhausted = null;

  public static final String SERIALIZED_NAME_NODES_AVAILABLE = "NodesAvailable";
  @SerializedName(SERIALIZED_NAME_NODES_AVAILABLE)
  private Map<String, Integer> nodesAvailable = null;

  public static final String SERIALIZED_NAME_NODES_EVALUATED = "NodesEvaluated";
  @SerializedName(SERIALIZED_NAME_NODES_EVALUATED)
  private Integer nodesEvaluated;

  public static final String SERIALIZED_NAME_NODES_EXHAUSTED = "NodesExhausted";
  @SerializedName(SERIALIZED_NAME_NODES_EXHAUSTED)
  private Integer nodesExhausted;

  public static final String SERIALIZED_NAME_NODES_FILTERED = "NodesFiltered";
  @SerializedName(SERIALIZED_NAME_NODES_FILTERED)
  private Integer nodesFiltered;

  public static final String SERIALIZED_NAME_QUOTA_EXHAUSTED = "QuotaExhausted";
  @SerializedName(SERIALIZED_NAME_QUOTA_EXHAUSTED)
  private List<String> quotaExhausted = null;

  public static final String SERIALIZED_NAME_RESOURCES_EXHAUSTED = "ResourcesExhausted";
  @SerializedName(SERIALIZED_NAME_RESOURCES_EXHAUSTED)
  private Map<String, Resources> resourcesExhausted = null;

  public static final String SERIALIZED_NAME_SCORE_META_DATA = "ScoreMetaData";
  @SerializedName(SERIALIZED_NAME_SCORE_META_DATA)
  private List<NodeScoreMeta> scoreMetaData = null;

  public static final String SERIALIZED_NAME_SCORES = "Scores";
  @SerializedName(SERIALIZED_NAME_SCORES)
  private Map<String, Double> scores = null;

  public AllocationMetric() { 
  }

  public AllocationMetric allocationTime(Long allocationTime) {
    
    this.allocationTime = allocationTime;
    return this;
  }

   /**
   * Get allocationTime
   * @return allocationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAllocationTime() {
    return allocationTime;
  }


  public void setAllocationTime(Long allocationTime) {
    this.allocationTime = allocationTime;
  }


  public AllocationMetric classExhausted(Map<String, Integer> classExhausted) {
    
    this.classExhausted = classExhausted;
    return this;
  }

  public AllocationMetric putClassExhaustedItem(String key, Integer classExhaustedItem) {
    if (this.classExhausted == null) {
      this.classExhausted = new HashMap<String, Integer>();
    }
    this.classExhausted.put(key, classExhaustedItem);
    return this;
  }

   /**
   * Get classExhausted
   * @return classExhausted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getClassExhausted() {
    return classExhausted;
  }


  public void setClassExhausted(Map<String, Integer> classExhausted) {
    this.classExhausted = classExhausted;
  }


  public AllocationMetric classFiltered(Map<String, Integer> classFiltered) {
    
    this.classFiltered = classFiltered;
    return this;
  }

  public AllocationMetric putClassFilteredItem(String key, Integer classFilteredItem) {
    if (this.classFiltered == null) {
      this.classFiltered = new HashMap<String, Integer>();
    }
    this.classFiltered.put(key, classFilteredItem);
    return this;
  }

   /**
   * Get classFiltered
   * @return classFiltered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getClassFiltered() {
    return classFiltered;
  }


  public void setClassFiltered(Map<String, Integer> classFiltered) {
    this.classFiltered = classFiltered;
  }


  public AllocationMetric coalescedFailures(Integer coalescedFailures) {
    
    this.coalescedFailures = coalescedFailures;
    return this;
  }

   /**
   * Get coalescedFailures
   * @return coalescedFailures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCoalescedFailures() {
    return coalescedFailures;
  }


  public void setCoalescedFailures(Integer coalescedFailures) {
    this.coalescedFailures = coalescedFailures;
  }


  public AllocationMetric constraintFiltered(Map<String, Integer> constraintFiltered) {
    
    this.constraintFiltered = constraintFiltered;
    return this;
  }

  public AllocationMetric putConstraintFilteredItem(String key, Integer constraintFilteredItem) {
    if (this.constraintFiltered == null) {
      this.constraintFiltered = new HashMap<String, Integer>();
    }
    this.constraintFiltered.put(key, constraintFilteredItem);
    return this;
  }

   /**
   * Get constraintFiltered
   * @return constraintFiltered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getConstraintFiltered() {
    return constraintFiltered;
  }


  public void setConstraintFiltered(Map<String, Integer> constraintFiltered) {
    this.constraintFiltered = constraintFiltered;
  }


  public AllocationMetric dimensionExhausted(Map<String, Integer> dimensionExhausted) {
    
    this.dimensionExhausted = dimensionExhausted;
    return this;
  }

  public AllocationMetric putDimensionExhaustedItem(String key, Integer dimensionExhaustedItem) {
    if (this.dimensionExhausted == null) {
      this.dimensionExhausted = new HashMap<String, Integer>();
    }
    this.dimensionExhausted.put(key, dimensionExhaustedItem);
    return this;
  }

   /**
   * Get dimensionExhausted
   * @return dimensionExhausted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getDimensionExhausted() {
    return dimensionExhausted;
  }


  public void setDimensionExhausted(Map<String, Integer> dimensionExhausted) {
    this.dimensionExhausted = dimensionExhausted;
  }


  public AllocationMetric nodesAvailable(Map<String, Integer> nodesAvailable) {
    
    this.nodesAvailable = nodesAvailable;
    return this;
  }

  public AllocationMetric putNodesAvailableItem(String key, Integer nodesAvailableItem) {
    if (this.nodesAvailable == null) {
      this.nodesAvailable = new HashMap<String, Integer>();
    }
    this.nodesAvailable.put(key, nodesAvailableItem);
    return this;
  }

   /**
   * Get nodesAvailable
   * @return nodesAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getNodesAvailable() {
    return nodesAvailable;
  }


  public void setNodesAvailable(Map<String, Integer> nodesAvailable) {
    this.nodesAvailable = nodesAvailable;
  }


  public AllocationMetric nodesEvaluated(Integer nodesEvaluated) {
    
    this.nodesEvaluated = nodesEvaluated;
    return this;
  }

   /**
   * Get nodesEvaluated
   * @return nodesEvaluated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNodesEvaluated() {
    return nodesEvaluated;
  }


  public void setNodesEvaluated(Integer nodesEvaluated) {
    this.nodesEvaluated = nodesEvaluated;
  }


  public AllocationMetric nodesExhausted(Integer nodesExhausted) {
    
    this.nodesExhausted = nodesExhausted;
    return this;
  }

   /**
   * Get nodesExhausted
   * @return nodesExhausted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNodesExhausted() {
    return nodesExhausted;
  }


  public void setNodesExhausted(Integer nodesExhausted) {
    this.nodesExhausted = nodesExhausted;
  }


  public AllocationMetric nodesFiltered(Integer nodesFiltered) {
    
    this.nodesFiltered = nodesFiltered;
    return this;
  }

   /**
   * Get nodesFiltered
   * @return nodesFiltered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNodesFiltered() {
    return nodesFiltered;
  }


  public void setNodesFiltered(Integer nodesFiltered) {
    this.nodesFiltered = nodesFiltered;
  }


  public AllocationMetric quotaExhausted(List<String> quotaExhausted) {
    
    this.quotaExhausted = quotaExhausted;
    return this;
  }

  public AllocationMetric addQuotaExhaustedItem(String quotaExhaustedItem) {
    if (this.quotaExhausted == null) {
      this.quotaExhausted = new ArrayList<String>();
    }
    this.quotaExhausted.add(quotaExhaustedItem);
    return this;
  }

   /**
   * Get quotaExhausted
   * @return quotaExhausted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getQuotaExhausted() {
    return quotaExhausted;
  }


  public void setQuotaExhausted(List<String> quotaExhausted) {
    this.quotaExhausted = quotaExhausted;
  }


  public AllocationMetric resourcesExhausted(Map<String, Resources> resourcesExhausted) {
    
    this.resourcesExhausted = resourcesExhausted;
    return this;
  }

  public AllocationMetric putResourcesExhaustedItem(String key, Resources resourcesExhaustedItem) {
    if (this.resourcesExhausted == null) {
      this.resourcesExhausted = new HashMap<String, Resources>();
    }
    this.resourcesExhausted.put(key, resourcesExhaustedItem);
    return this;
  }

   /**
   * Get resourcesExhausted
   * @return resourcesExhausted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Resources> getResourcesExhausted() {
    return resourcesExhausted;
  }


  public void setResourcesExhausted(Map<String, Resources> resourcesExhausted) {
    this.resourcesExhausted = resourcesExhausted;
  }


  public AllocationMetric scoreMetaData(List<NodeScoreMeta> scoreMetaData) {
    
    this.scoreMetaData = scoreMetaData;
    return this;
  }

  public AllocationMetric addScoreMetaDataItem(NodeScoreMeta scoreMetaDataItem) {
    if (this.scoreMetaData == null) {
      this.scoreMetaData = new ArrayList<NodeScoreMeta>();
    }
    this.scoreMetaData.add(scoreMetaDataItem);
    return this;
  }

   /**
   * Get scoreMetaData
   * @return scoreMetaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NodeScoreMeta> getScoreMetaData() {
    return scoreMetaData;
  }


  public void setScoreMetaData(List<NodeScoreMeta> scoreMetaData) {
    this.scoreMetaData = scoreMetaData;
  }


  public AllocationMetric scores(Map<String, Double> scores) {
    
    this.scores = scores;
    return this;
  }

  public AllocationMetric putScoresItem(String key, Double scoresItem) {
    if (this.scores == null) {
      this.scores = new HashMap<String, Double>();
    }
    this.scores.put(key, scoresItem);
    return this;
  }

   /**
   * Get scores
   * @return scores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Double> getScores() {
    return scores;
  }


  public void setScores(Map<String, Double> scores) {
    this.scores = scores;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationMetric allocationMetric = (AllocationMetric) o;
    return Objects.equals(this.allocationTime, allocationMetric.allocationTime) &&
        Objects.equals(this.classExhausted, allocationMetric.classExhausted) &&
        Objects.equals(this.classFiltered, allocationMetric.classFiltered) &&
        Objects.equals(this.coalescedFailures, allocationMetric.coalescedFailures) &&
        Objects.equals(this.constraintFiltered, allocationMetric.constraintFiltered) &&
        Objects.equals(this.dimensionExhausted, allocationMetric.dimensionExhausted) &&
        Objects.equals(this.nodesAvailable, allocationMetric.nodesAvailable) &&
        Objects.equals(this.nodesEvaluated, allocationMetric.nodesEvaluated) &&
        Objects.equals(this.nodesExhausted, allocationMetric.nodesExhausted) &&
        Objects.equals(this.nodesFiltered, allocationMetric.nodesFiltered) &&
        Objects.equals(this.quotaExhausted, allocationMetric.quotaExhausted) &&
        Objects.equals(this.resourcesExhausted, allocationMetric.resourcesExhausted) &&
        Objects.equals(this.scoreMetaData, allocationMetric.scoreMetaData) &&
        Objects.equals(this.scores, allocationMetric.scores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationTime, classExhausted, classFiltered, coalescedFailures, constraintFiltered, dimensionExhausted, nodesAvailable, nodesEvaluated, nodesExhausted, nodesFiltered, quotaExhausted, resourcesExhausted, scoreMetaData, scores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationMetric {\n");
    sb.append("    allocationTime: ").append(toIndentedString(allocationTime)).append("\n");
    sb.append("    classExhausted: ").append(toIndentedString(classExhausted)).append("\n");
    sb.append("    classFiltered: ").append(toIndentedString(classFiltered)).append("\n");
    sb.append("    coalescedFailures: ").append(toIndentedString(coalescedFailures)).append("\n");
    sb.append("    constraintFiltered: ").append(toIndentedString(constraintFiltered)).append("\n");
    sb.append("    dimensionExhausted: ").append(toIndentedString(dimensionExhausted)).append("\n");
    sb.append("    nodesAvailable: ").append(toIndentedString(nodesAvailable)).append("\n");
    sb.append("    nodesEvaluated: ").append(toIndentedString(nodesEvaluated)).append("\n");
    sb.append("    nodesExhausted: ").append(toIndentedString(nodesExhausted)).append("\n");
    sb.append("    nodesFiltered: ").append(toIndentedString(nodesFiltered)).append("\n");
    sb.append("    quotaExhausted: ").append(toIndentedString(quotaExhausted)).append("\n");
    sb.append("    resourcesExhausted: ").append(toIndentedString(resourcesExhausted)).append("\n");
    sb.append("    scoreMetaData: ").append(toIndentedString(scoreMetaData)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
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

