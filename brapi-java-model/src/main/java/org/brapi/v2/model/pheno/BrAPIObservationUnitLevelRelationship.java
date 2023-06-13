package org.brapi.v2.model.pheno;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * ObservationUnitLevelRelationship
 */


public class BrAPIObservationUnitLevelRelationship extends BrAPIObservationUnitHierarchyLevel  {
  @JsonProperty("levelCode")
  private String levelCode = null;

  @JsonProperty("levelName")
  private String levelName = null;

  @JsonProperty("levelOrder")
  private Integer levelOrder = null;

  @JsonProperty("observationUnitDbId")
  private String observationUnitDbId = null;

  /**
   * An ID code for this level tag. Identify this observation unit by each level of the hierarchy where it exists
   * @return levelCode
  **/
  
  
  public String getLevelCode() {
    return levelCode;
  }

  public void setLevelCode(String levelCode) {
    this.levelCode = levelCode;
  }

  public BrAPIObservationUnitLevelRelationship levelName(String levelName) {
    this.levelName = levelName;
    return this;
  }

  public String getLevelName() {
    return levelName;
  }

  public void setLevelName(String levelName) {
    this.levelName = levelName;
  }

  public BrAPIObservationUnitLevelRelationship levelOrder(Integer levelOrder) {
    this.levelOrder = levelOrder;
    return this;
  }

  public Integer getLevelOrder() {
    return levelOrder;
  }

  public void setLevelOrder(Integer levelOrder) {
    this.levelOrder = levelOrder;
  }

  public BrAPIObservationUnitLevelRelationship observationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
    return this;
  }

  public String getObservationUnitDbId() {
    return observationUnitDbId;
  }

  public void setObservationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIObservationUnitLevelRelationship observationUnitLevelRelationship = (BrAPIObservationUnitLevelRelationship) o;
    return Objects.equals(this.levelCode, observationUnitLevelRelationship.levelCode) &&
            Objects.equals(this.levelName, observationUnitLevelRelationship.levelName) &&
            Objects.equals(this.levelOrder, observationUnitLevelRelationship.levelOrder) &&
            Objects.equals(this.observationUnitDbId, observationUnitLevelRelationship.observationUnitDbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levelCode, levelName, levelOrder, observationUnitDbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationUnitLevelRelationship {\n");

    sb.append("    levelCode: ").append(toIndentedString(levelCode)).append("\n");
    sb.append("    levelName: ").append(toIndentedString(levelName)).append("\n");
    sb.append("    levelOrder: ").append(toIndentedString(levelOrder)).append("\n");
    sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
