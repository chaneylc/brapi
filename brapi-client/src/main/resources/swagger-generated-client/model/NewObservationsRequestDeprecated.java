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
import io.swagger.client.model.NewObservationsRequestDeprecatedData;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
/**
 * NewObservationsRequestDeprecated
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-25T02:56:46.257Z[GMT]")
public class NewObservationsRequestDeprecated {
  @SerializedName("commit")
  private String commit = null;

  @SerializedName("data")
  private List<NewObservationsRequestDeprecatedData> data = null;

  @SerializedName("transactionDbId")
  private String transactionDbId = null;

  public NewObservationsRequestDeprecated commit(String commit) {
    this.commit = commit;
    return this;
  }

   /**
   * Should these changes be commited
   * @return commit
  **/
  @Schema(description = "Should these changes be commited")
  public String getCommit() {
    return commit;
  }

  public void setCommit(String commit) {
    this.commit = commit;
  }

  public NewObservationsRequestDeprecated data(List<NewObservationsRequestDeprecatedData> data) {
    this.data = data;
    return this;
  }

  public NewObservationsRequestDeprecated addDataItem(NewObservationsRequestDeprecatedData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<NewObservationsRequestDeprecatedData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Required array of marker-name/score pairs
   * @return data
  **/
  @Schema(description = "Required array of marker-name/score pairs")
  public List<NewObservationsRequestDeprecatedData> getData() {
    return data;
  }

  public void setData(List<NewObservationsRequestDeprecatedData> data) {
    this.data = data;
  }

  public NewObservationsRequestDeprecated transactionDbId(String transactionDbId) {
    this.transactionDbId = transactionDbId;
    return this;
  }

   /**
   * The ID representing this transaction
   * @return transactionDbId
  **/
  @Schema(description = "The ID representing this transaction")
  public String getTransactionDbId() {
    return transactionDbId;
  }

  public void setTransactionDbId(String transactionDbId) {
    this.transactionDbId = transactionDbId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewObservationsRequestDeprecated newObservationsRequestDeprecated = (NewObservationsRequestDeprecated) o;
    return Objects.equals(this.commit, newObservationsRequestDeprecated.commit) &&
        Objects.equals(this.data, newObservationsRequestDeprecated.data) &&
        Objects.equals(this.transactionDbId, newObservationsRequestDeprecated.transactionDbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commit, data, transactionDbId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewObservationsRequestDeprecated {\n");
    
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    transactionDbId: ").append(toIndentedString(transactionDbId)).append("\n");
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
