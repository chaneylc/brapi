/*
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.client.model.LinkageGroup;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
/**
 * GenomeMapDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-25T02:56:46.257Z[GMT]")
public class GenomeMapDetails {
  @SerializedName("data")
  private List<LinkageGroup> data = null;

  @SerializedName("documentationURL")
  private String documentationURL = null;

  @SerializedName("linkageGroups")
  private List<LinkageGroup> linkageGroups = null;

  @SerializedName("mapDbId")
  private String mapDbId = null;

  @SerializedName("mapName")
  private String mapName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("unit")
  private String unit = null;

  public GenomeMapDetails data(List<LinkageGroup> data) {
    this.data = data;
    return this;
  }

  public GenomeMapDetails addDataItem(LinkageGroup dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<LinkageGroup>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of linkage group details associated with a given map
   * @return data
  **/
  @Schema(description = "List of linkage group details associated with a given map")
  public List<LinkageGroup> getData() {
    return data;
  }

  public void setData(List<LinkageGroup> data) {
    this.data = data;
  }

  public GenomeMapDetails documentationURL(String documentationURL) {
    this.documentationURL = documentationURL;
    return this;
  }

   /**
   * A URL to the human readable documentation of this object
   * @return documentationURL
  **/
  @Schema(description = "A URL to the human readable documentation of this object")
  public String getDocumentationURL() {
    return documentationURL;
  }

  public void setDocumentationURL(String documentationURL) {
    this.documentationURL = documentationURL;
  }

  public GenomeMapDetails linkageGroups(List<LinkageGroup> linkageGroups) {
    this.linkageGroups = linkageGroups;
    return this;
  }

  public GenomeMapDetails addLinkageGroupsItem(LinkageGroup linkageGroupsItem) {
    if (this.linkageGroups == null) {
      this.linkageGroups = new ArrayList<LinkageGroup>();
    }
    this.linkageGroups.add(linkageGroupsItem);
    return this;
  }

   /**
   * **Deprecated** Use \&quot;data\&quot;
   * @return linkageGroups
  **/
  @Schema(description = "**Deprecated** Use \"data\"")
  public List<LinkageGroup> getLinkageGroups() {
    return linkageGroups;
  }

  public void setLinkageGroups(List<LinkageGroup> linkageGroups) {
    this.linkageGroups = linkageGroups;
  }

  public GenomeMapDetails mapDbId(String mapDbId) {
    this.mapDbId = mapDbId;
    return this;
  }

   /**
   * The ID which uniquely identifies this genome map
   * @return mapDbId
  **/
  @Schema(description = "The ID which uniquely identifies this genome map")
  public String getMapDbId() {
    return mapDbId;
  }

  public void setMapDbId(String mapDbId) {
    this.mapDbId = mapDbId;
  }

  public GenomeMapDetails mapName(String mapName) {
    this.mapName = mapName;
    return this;
  }

   /**
   * A human readable name for this map
   * @return mapName
  **/
  @Schema(description = "A human readable name for this map")
  public String getMapName() {
    return mapName;
  }

  public void setMapName(String mapName) {
    this.mapName = mapName;
  }

  public GenomeMapDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * DEPRECATED in v1.3 - Use \&quot;mapName\&quot;
   * @return name
  **/
  @Schema(description = "DEPRECATED in v1.3 - Use \"mapName\"")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GenomeMapDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of map this represents, ussually \&quot;Genetic\&quot; or \&quot;Physical\&quot;
   * @return type
  **/
  @Schema(description = "The type of map this represents, ussually \"Genetic\" or \"Physical\"")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GenomeMapDetails unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The units used to describe the data in this map
   * @return unit
  **/
  @Schema(description = "The units used to describe the data in this map")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenomeMapDetails genomeMapDetails = (GenomeMapDetails) o;
    return Objects.equals(this.data, genomeMapDetails.data) &&
        Objects.equals(this.documentationURL, genomeMapDetails.documentationURL) &&
        Objects.equals(this.linkageGroups, genomeMapDetails.linkageGroups) &&
        Objects.equals(this.mapDbId, genomeMapDetails.mapDbId) &&
        Objects.equals(this.mapName, genomeMapDetails.mapName) &&
        Objects.equals(this.name, genomeMapDetails.name) &&
        Objects.equals(this.type, genomeMapDetails.type) &&
        Objects.equals(this.unit, genomeMapDetails.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, documentationURL, linkageGroups, mapDbId, mapName, name, type, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenomeMapDetails {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    documentationURL: ").append(toIndentedString(documentationURL)).append("\n");
    sb.append("    linkageGroups: ").append(toIndentedString(linkageGroups)).append("\n");
    sb.append("    mapDbId: ").append(toIndentedString(mapDbId)).append("\n");
    sb.append("    mapName: ").append(toIndentedString(mapName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
