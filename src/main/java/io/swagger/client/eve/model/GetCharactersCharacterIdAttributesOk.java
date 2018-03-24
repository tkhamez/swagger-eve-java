/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.7.6
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
import org.threeten.bp.OffsetDateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")

public class GetCharactersCharacterIdAttributesOk {
  @SerializedName("charisma")
  private Integer charisma = null;

  @SerializedName("intelligence")
  private Integer intelligence = null;

  @SerializedName("memory")
  private Integer memory = null;

  @SerializedName("perception")
  private Integer perception = null;

  @SerializedName("willpower")
  private Integer willpower = null;

  @SerializedName("bonus_remaps")
  private Integer bonusRemaps = null;

  @SerializedName("last_remap_date")
  private OffsetDateTime lastRemapDate = null;

  @SerializedName("accrued_remap_cooldown_date")
  private OffsetDateTime accruedRemapCooldownDate = null;

  public GetCharactersCharacterIdAttributesOk charisma(Integer charisma) {
    this.charisma = charisma;
    return this;
  }

   /**
   * charisma integer
   * @return charisma
  **/
  @ApiModelProperty(required = true, value = "charisma integer")
  public Integer getCharisma() {
    return charisma;
  }

  public void setCharisma(Integer charisma) {
    this.charisma = charisma;
  }

  public GetCharactersCharacterIdAttributesOk intelligence(Integer intelligence) {
    this.intelligence = intelligence;
    return this;
  }

   /**
   * intelligence integer
   * @return intelligence
  **/
  @ApiModelProperty(required = true, value = "intelligence integer")
  public Integer getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(Integer intelligence) {
    this.intelligence = intelligence;
  }

  public GetCharactersCharacterIdAttributesOk memory(Integer memory) {
    this.memory = memory;
    return this;
  }

   /**
   * memory integer
   * @return memory
  **/
  @ApiModelProperty(required = true, value = "memory integer")
  public Integer getMemory() {
    return memory;
  }

  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  public GetCharactersCharacterIdAttributesOk perception(Integer perception) {
    this.perception = perception;
    return this;
  }

   /**
   * perception integer
   * @return perception
  **/
  @ApiModelProperty(required = true, value = "perception integer")
  public Integer getPerception() {
    return perception;
  }

  public void setPerception(Integer perception) {
    this.perception = perception;
  }

  public GetCharactersCharacterIdAttributesOk willpower(Integer willpower) {
    this.willpower = willpower;
    return this;
  }

   /**
   * willpower integer
   * @return willpower
  **/
  @ApiModelProperty(required = true, value = "willpower integer")
  public Integer getWillpower() {
    return willpower;
  }

  public void setWillpower(Integer willpower) {
    this.willpower = willpower;
  }

  public GetCharactersCharacterIdAttributesOk bonusRemaps(Integer bonusRemaps) {
    this.bonusRemaps = bonusRemaps;
    return this;
  }

   /**
   * Number of available bonus character neural remaps
   * @return bonusRemaps
  **/
  @ApiModelProperty(value = "Number of available bonus character neural remaps")
  public Integer getBonusRemaps() {
    return bonusRemaps;
  }

  public void setBonusRemaps(Integer bonusRemaps) {
    this.bonusRemaps = bonusRemaps;
  }

  public GetCharactersCharacterIdAttributesOk lastRemapDate(OffsetDateTime lastRemapDate) {
    this.lastRemapDate = lastRemapDate;
    return this;
  }

   /**
   * Datetime of last neural remap, including usage of bonus remaps
   * @return lastRemapDate
  **/
  @ApiModelProperty(value = "Datetime of last neural remap, including usage of bonus remaps")
  public OffsetDateTime getLastRemapDate() {
    return lastRemapDate;
  }

  public void setLastRemapDate(OffsetDateTime lastRemapDate) {
    this.lastRemapDate = lastRemapDate;
  }

  public GetCharactersCharacterIdAttributesOk accruedRemapCooldownDate(OffsetDateTime accruedRemapCooldownDate) {
    this.accruedRemapCooldownDate = accruedRemapCooldownDate;
    return this;
  }

   /**
   * Neural remapping cooldown after a character uses remap accrued over time
   * @return accruedRemapCooldownDate
  **/
  @ApiModelProperty(value = "Neural remapping cooldown after a character uses remap accrued over time")
  public OffsetDateTime getAccruedRemapCooldownDate() {
    return accruedRemapCooldownDate;
  }

  public void setAccruedRemapCooldownDate(OffsetDateTime accruedRemapCooldownDate) {
    this.accruedRemapCooldownDate = accruedRemapCooldownDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdAttributesOk getCharactersCharacterIdAttributesOk = (GetCharactersCharacterIdAttributesOk) o;
    return Objects.equals(this.charisma, getCharactersCharacterIdAttributesOk.charisma) &&
        Objects.equals(this.intelligence, getCharactersCharacterIdAttributesOk.intelligence) &&
        Objects.equals(this.memory, getCharactersCharacterIdAttributesOk.memory) &&
        Objects.equals(this.perception, getCharactersCharacterIdAttributesOk.perception) &&
        Objects.equals(this.willpower, getCharactersCharacterIdAttributesOk.willpower) &&
        Objects.equals(this.bonusRemaps, getCharactersCharacterIdAttributesOk.bonusRemaps) &&
        Objects.equals(this.lastRemapDate, getCharactersCharacterIdAttributesOk.lastRemapDate) &&
        Objects.equals(this.accruedRemapCooldownDate, getCharactersCharacterIdAttributesOk.accruedRemapCooldownDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charisma, intelligence, memory, perception, willpower, bonusRemaps, lastRemapDate, accruedRemapCooldownDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdAttributesOk {\n");
    
    sb.append("    charisma: ").append(toIndentedString(charisma)).append("\n");
    sb.append("    intelligence: ").append(toIndentedString(intelligence)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    perception: ").append(toIndentedString(perception)).append("\n");
    sb.append("    willpower: ").append(toIndentedString(willpower)).append("\n");
    sb.append("    bonusRemaps: ").append(toIndentedString(bonusRemaps)).append("\n");
    sb.append("    lastRemapDate: ").append(toIndentedString(lastRemapDate)).append("\n");
    sb.append("    accruedRemapCooldownDate: ").append(toIndentedString(accruedRemapCooldownDate)).append("\n");
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

