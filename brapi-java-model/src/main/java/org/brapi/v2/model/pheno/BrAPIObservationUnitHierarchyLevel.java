package org.brapi.v2.model.pheno;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * Observation levels indicate the granularity level at which the measurements are taken. &#x60;levelName&#x60; defines the level, &#x60;levelOrder&#x60; defines where that level exists in the hierarchy of levels. &#x60;levelOrder&#x60;s lower numbers are at the top of the hierarchy (ie field &gt; 0) and higher numbers are at the bottom of the hierarchy (ie plant &gt; 6). 
 */



public class BrAPIObservationUnitHierarchyLevel   {

  @JsonProperty("levelName")
  private BrAPIObservationUnitHierarchyLevelEnum levelName = null;

  @JsonProperty("levelOrder")
  private Integer levelOrder = null;

  public BrAPIObservationUnitHierarchyLevel levelName(BrAPIObservationUnitHierarchyLevelEnum levelName) {
    this.levelName = levelName;
    return this;
  }

  /**
   * A name for this level
   * @return levelName
  **/
  
  
    public BrAPIObservationUnitHierarchyLevelEnum getLevelName() {
    return levelName;
  }

  public void setLevelName(BrAPIObservationUnitHierarchyLevelEnum levelName) {
    this.levelName = levelName;
  }

  public BrAPIObservationUnitHierarchyLevel levelOrder(Integer levelOrder) {
    this.levelOrder = levelOrder;
    return this;
  }

  /**
   * `levelOrder` defines where that level exists in the hierarchy of levels. `levelOrder`'s lower numbers are at the top of the hierarchy (ie field -> 1) and higher numbers are at the bottom of the hierarchy (ie plant -> 9).
   * @return levelOrder
  **/
  
  
    public Integer getLevelOrder() {
    return levelOrder;
  }

  public void setLevelOrder(Integer levelOrder) {
    this.levelOrder = levelOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIObservationUnitHierarchyLevel observationUnitHierarchyLevel = (BrAPIObservationUnitHierarchyLevel) o;
    return Objects.equals(this.levelName, observationUnitHierarchyLevel.levelName) &&
        Objects.equals(this.levelOrder, observationUnitHierarchyLevel.levelOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levelName, levelOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationUnitHierarchyLevel {\n");
    
    sb.append("    levelName: ").append(toIndentedString(levelName)).append("\n");
    sb.append("    levelOrder: ").append(toIndentedString(levelOrder)).append("\n");
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
