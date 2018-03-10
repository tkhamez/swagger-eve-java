/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.7.5
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
 * modifier object
 */
@ApiModel(description = "modifier object")

public class GetDogmaEffectsEffectIdModifier {
  @SerializedName("func")
  private String func = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("modified_attribute_id")
  private Integer modifiedAttributeId = null;

  @SerializedName("modifying_attribute_id")
  private Integer modifyingAttributeId = null;

  @SerializedName("effect_id")
  private Integer effectId = null;

  @SerializedName("operator")
  private Integer operator = null;

  public GetDogmaEffectsEffectIdModifier func(String func) {
    this.func = func;
    return this;
  }

   /**
   * func string
   * @return func
  **/
  @ApiModelProperty(required = true, value = "func string")
  public String getFunc() {
    return func;
  }

  public void setFunc(String func) {
    this.func = func;
  }

  public GetDogmaEffectsEffectIdModifier domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * domain string
   * @return domain
  **/
  @ApiModelProperty(value = "domain string")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public GetDogmaEffectsEffectIdModifier modifiedAttributeId(Integer modifiedAttributeId) {
    this.modifiedAttributeId = modifiedAttributeId;
    return this;
  }

   /**
   * modified_attribute_id integer
   * @return modifiedAttributeId
  **/
  @ApiModelProperty(value = "modified_attribute_id integer")
  public Integer getModifiedAttributeId() {
    return modifiedAttributeId;
  }

  public void setModifiedAttributeId(Integer modifiedAttributeId) {
    this.modifiedAttributeId = modifiedAttributeId;
  }

  public GetDogmaEffectsEffectIdModifier modifyingAttributeId(Integer modifyingAttributeId) {
    this.modifyingAttributeId = modifyingAttributeId;
    return this;
  }

   /**
   * modifying_attribute_id integer
   * @return modifyingAttributeId
  **/
  @ApiModelProperty(value = "modifying_attribute_id integer")
  public Integer getModifyingAttributeId() {
    return modifyingAttributeId;
  }

  public void setModifyingAttributeId(Integer modifyingAttributeId) {
    this.modifyingAttributeId = modifyingAttributeId;
  }

  public GetDogmaEffectsEffectIdModifier effectId(Integer effectId) {
    this.effectId = effectId;
    return this;
  }

   /**
   * effect_id integer
   * @return effectId
  **/
  @ApiModelProperty(value = "effect_id integer")
  public Integer getEffectId() {
    return effectId;
  }

  public void setEffectId(Integer effectId) {
    this.effectId = effectId;
  }

  public GetDogmaEffectsEffectIdModifier operator(Integer operator) {
    this.operator = operator;
    return this;
  }

   /**
   * operator integer
   * @return operator
  **/
  @ApiModelProperty(value = "operator integer")
  public Integer getOperator() {
    return operator;
  }

  public void setOperator(Integer operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDogmaEffectsEffectIdModifier getDogmaEffectsEffectIdModifier = (GetDogmaEffectsEffectIdModifier) o;
    return Objects.equals(this.func, getDogmaEffectsEffectIdModifier.func) &&
        Objects.equals(this.domain, getDogmaEffectsEffectIdModifier.domain) &&
        Objects.equals(this.modifiedAttributeId, getDogmaEffectsEffectIdModifier.modifiedAttributeId) &&
        Objects.equals(this.modifyingAttributeId, getDogmaEffectsEffectIdModifier.modifyingAttributeId) &&
        Objects.equals(this.effectId, getDogmaEffectsEffectIdModifier.effectId) &&
        Objects.equals(this.operator, getDogmaEffectsEffectIdModifier.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(func, domain, modifiedAttributeId, modifyingAttributeId, effectId, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDogmaEffectsEffectIdModifier {\n");
    
    sb.append("    func: ").append(toIndentedString(func)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    modifiedAttributeId: ").append(toIndentedString(modifiedAttributeId)).append("\n");
    sb.append("    modifyingAttributeId: ").append(toIndentedString(modifyingAttributeId)).append("\n");
    sb.append("    effectId: ").append(toIndentedString(effectId)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

