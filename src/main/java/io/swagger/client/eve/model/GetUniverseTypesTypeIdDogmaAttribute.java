/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.eve.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * dogma_attribute object
 */
@ApiModel(description = "dogma_attribute object")

public class GetUniverseTypesTypeIdDogmaAttribute {
  @SerializedName("attribute_id")
  private Integer attributeId = null;

  @SerializedName("value")
  private Float value = null;

  public GetUniverseTypesTypeIdDogmaAttribute attributeId(Integer attributeId) {
    this.attributeId = attributeId;
    return this;
  }

   /**
   * attribute_id integer
   * @return attributeId
  **/
  @ApiModelProperty(required = true, value = "attribute_id integer")
  public Integer getAttributeId() {
    return attributeId;
  }

  public void setAttributeId(Integer attributeId) {
    this.attributeId = attributeId;
  }

  public GetUniverseTypesTypeIdDogmaAttribute value(Float value) {
    this.value = value;
    return this;
  }

   /**
   * value number
   * @return value
  **/
  @ApiModelProperty(required = true, value = "value number")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
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
    GetUniverseTypesTypeIdDogmaAttribute getUniverseTypesTypeIdDogmaAttribute = (GetUniverseTypesTypeIdDogmaAttribute) o;
    return Objects.equals(this.attributeId, getUniverseTypesTypeIdDogmaAttribute.attributeId) &&
        Objects.equals(this.value, getUniverseTypesTypeIdDogmaAttribute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeId, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseTypesTypeIdDogmaAttribute {\n");
    
    sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

