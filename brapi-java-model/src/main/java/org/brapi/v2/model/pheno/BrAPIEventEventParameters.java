package org.brapi.v2.model.pheno;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * EventEventParameters
 */
public class BrAPIEventEventParameters   {

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rdfValue")
  private String rdfValue = null;

  @JsonProperty("units")
  private String units = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("valueDescription")
  private String valueDescription = null;

  @JsonProperty("valuesByDate")
  private List<String> valuesByDate = null;

  public BrAPIEventEventParameters key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Specifies the relationship between the event and the given property. E.g. fertilizer, operator
   * @return key
  **/
  
  
    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public BrAPIEventEventParameters rdfValue(String rdfValue) {
    this.rdfValue = rdfValue;
    return this;
  }

  /**
   * The type of the value given above, e.g. http://xmlns.com/foaf/0.1/Agent
   * @return rdfValue
  **/
  
  
    public String getRdfValue() {
    return rdfValue;
  }

  public void setRdfValue(String rdfValue) {
    this.rdfValue = rdfValue;
  }

  public BrAPIEventEventParameters value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the property for this event. E.g. nitrogen, John Doe
   * @return value
  **/
  
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIEventEventParameters eventEventParameters = (BrAPIEventEventParameters) o;
    return Objects.equals(this.code, eventEventParameters.code) &&
            Objects.equals(this.description, eventEventParameters.description) &&
            Objects.equals(this.key, eventEventParameters.key) &&
            Objects.equals(this.name, eventEventParameters.name) &&
            Objects.equals(this.rdfValue, eventEventParameters.rdfValue) &&
            Objects.equals(this.units, eventEventParameters.units) &&
            Objects.equals(this.value, eventEventParameters.value) &&
            Objects.equals(this.valueDescription, eventEventParameters.valueDescription) &&
            Objects.equals(this.valuesByDate, eventEventParameters.valuesByDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, key, name, rdfValue, units, value, valueDescription, valuesByDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventEventParameters {\n");

    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rdfValue: ").append(toIndentedString(rdfValue)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueDescription: ").append(toIndentedString(valueDescription)).append("\n");
    sb.append("    valuesByDate: ").append(toIndentedString(valuesByDate)).append("\n");
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

  public String getValueDescription() {
    return valueDescription;
  }

  public void setValueDescription(String valueDescription) {
    this.valueDescription = valueDescription;
  }

  public List<String> getValuesByDate() {
    return valuesByDate;
  }

  public void setValuesByDate(List<String> valuesByDate) {
    this.valuesByDate = valuesByDate;
  }

  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
