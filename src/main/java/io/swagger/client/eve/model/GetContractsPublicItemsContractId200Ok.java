/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.6
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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")

public class GetContractsPublicItemsContractId200Ok {
  @SerializedName("is_blueprint_copy")
  private Boolean isBlueprintCopy = null;

  @SerializedName("is_included")
  private Boolean isIncluded = null;

  @SerializedName("item_id")
  private Long itemId = null;

  @SerializedName("material_efficiency")
  private Integer materialEfficiency = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("record_id")
  private Long recordId = null;

  @SerializedName("runs")
  private Integer runs = null;

  @SerializedName("time_efficiency")
  private Integer timeEfficiency = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetContractsPublicItemsContractId200Ok isBlueprintCopy(Boolean isBlueprintCopy) {
    this.isBlueprintCopy = isBlueprintCopy;
    return this;
  }

   /**
   * is_blueprint_copy boolean
   * @return isBlueprintCopy
  **/
  @ApiModelProperty(value = "is_blueprint_copy boolean")
  public Boolean isIsBlueprintCopy() {
    return isBlueprintCopy;
  }

  public void setIsBlueprintCopy(Boolean isBlueprintCopy) {
    this.isBlueprintCopy = isBlueprintCopy;
  }

  public GetContractsPublicItemsContractId200Ok isIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
    return this;
  }

   /**
   * true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract
   * @return isIncluded
  **/
  @ApiModelProperty(required = true, value = "true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract")
  public Boolean isIsIncluded() {
    return isIncluded;
  }

  public void setIsIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
  }

  public GetContractsPublicItemsContractId200Ok itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Unique ID for the item being sold. Not present if item is being requested by contract rather than sold with contract
   * @return itemId
  **/
  @ApiModelProperty(value = "Unique ID for the item being sold. Not present if item is being requested by contract rather than sold with contract")
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public GetContractsPublicItemsContractId200Ok materialEfficiency(Integer materialEfficiency) {
    this.materialEfficiency = materialEfficiency;
    return this;
  }

   /**
   * Material Efficiency Level of the blueprint
   * minimum: 0
   * maximum: 25
   * @return materialEfficiency
  **/
  @ApiModelProperty(value = "Material Efficiency Level of the blueprint")
  public Integer getMaterialEfficiency() {
    return materialEfficiency;
  }

  public void setMaterialEfficiency(Integer materialEfficiency) {
    this.materialEfficiency = materialEfficiency;
  }

  public GetContractsPublicItemsContractId200Ok quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of items in the stack
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Number of items in the stack")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public GetContractsPublicItemsContractId200Ok recordId(Long recordId) {
    this.recordId = recordId;
    return this;
  }

   /**
   * Unique ID for the item, used by the contract system
   * @return recordId
  **/
  @ApiModelProperty(required = true, value = "Unique ID for the item, used by the contract system")
  public Long getRecordId() {
    return recordId;
  }

  public void setRecordId(Long recordId) {
    this.recordId = recordId;
  }

  public GetContractsPublicItemsContractId200Ok runs(Integer runs) {
    this.runs = runs;
    return this;
  }

   /**
   * Number of runs remaining if the blueprint is a copy, -1 if it is an original
   * minimum: -1
   * @return runs
  **/
  @ApiModelProperty(value = "Number of runs remaining if the blueprint is a copy, -1 if it is an original")
  public Integer getRuns() {
    return runs;
  }

  public void setRuns(Integer runs) {
    this.runs = runs;
  }

  public GetContractsPublicItemsContractId200Ok timeEfficiency(Integer timeEfficiency) {
    this.timeEfficiency = timeEfficiency;
    return this;
  }

   /**
   * Time Efficiency Level of the blueprint
   * minimum: 0
   * maximum: 20
   * @return timeEfficiency
  **/
  @ApiModelProperty(value = "Time Efficiency Level of the blueprint")
  public Integer getTimeEfficiency() {
    return timeEfficiency;
  }

  public void setTimeEfficiency(Integer timeEfficiency) {
    this.timeEfficiency = timeEfficiency;
  }

  public GetContractsPublicItemsContractId200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Type ID for item
   * @return typeId
  **/
  @ApiModelProperty(required = true, value = "Type ID for item")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractsPublicItemsContractId200Ok getContractsPublicItemsContractId200Ok = (GetContractsPublicItemsContractId200Ok) o;
    return Objects.equals(this.isBlueprintCopy, getContractsPublicItemsContractId200Ok.isBlueprintCopy) &&
        Objects.equals(this.isIncluded, getContractsPublicItemsContractId200Ok.isIncluded) &&
        Objects.equals(this.itemId, getContractsPublicItemsContractId200Ok.itemId) &&
        Objects.equals(this.materialEfficiency, getContractsPublicItemsContractId200Ok.materialEfficiency) &&
        Objects.equals(this.quantity, getContractsPublicItemsContractId200Ok.quantity) &&
        Objects.equals(this.recordId, getContractsPublicItemsContractId200Ok.recordId) &&
        Objects.equals(this.runs, getContractsPublicItemsContractId200Ok.runs) &&
        Objects.equals(this.timeEfficiency, getContractsPublicItemsContractId200Ok.timeEfficiency) &&
        Objects.equals(this.typeId, getContractsPublicItemsContractId200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBlueprintCopy, isIncluded, itemId, materialEfficiency, quantity, recordId, runs, timeEfficiency, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractsPublicItemsContractId200Ok {\n");
    
    sb.append("    isBlueprintCopy: ").append(toIndentedString(isBlueprintCopy)).append("\n");
    sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    materialEfficiency: ").append(toIndentedString(materialEfficiency)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
    sb.append("    timeEfficiency: ").append(toIndentedString(timeEfficiency)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

