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
 * orbital object
 */
@ApiModel(description = "orbital object")

public class GetCharactersCharacterIdStatsOrbital {
  @SerializedName("strike_characters_killed")
  private Long strikeCharactersKilled = null;

  @SerializedName("strike_damage_to_players_armor_amount")
  private Long strikeDamageToPlayersArmorAmount = null;

  @SerializedName("strike_damage_to_players_shield_amount")
  private Long strikeDamageToPlayersShieldAmount = null;

  public GetCharactersCharacterIdStatsOrbital strikeCharactersKilled(Long strikeCharactersKilled) {
    this.strikeCharactersKilled = strikeCharactersKilled;
    return this;
  }

   /**
   * strike_characters_killed integer
   * @return strikeCharactersKilled
  **/
  @ApiModelProperty(value = "strike_characters_killed integer")
  public Long getStrikeCharactersKilled() {
    return strikeCharactersKilled;
  }

  public void setStrikeCharactersKilled(Long strikeCharactersKilled) {
    this.strikeCharactersKilled = strikeCharactersKilled;
  }

  public GetCharactersCharacterIdStatsOrbital strikeDamageToPlayersArmorAmount(Long strikeDamageToPlayersArmorAmount) {
    this.strikeDamageToPlayersArmorAmount = strikeDamageToPlayersArmorAmount;
    return this;
  }

   /**
   * strike_damage_to_players_armor_amount integer
   * @return strikeDamageToPlayersArmorAmount
  **/
  @ApiModelProperty(value = "strike_damage_to_players_armor_amount integer")
  public Long getStrikeDamageToPlayersArmorAmount() {
    return strikeDamageToPlayersArmorAmount;
  }

  public void setStrikeDamageToPlayersArmorAmount(Long strikeDamageToPlayersArmorAmount) {
    this.strikeDamageToPlayersArmorAmount = strikeDamageToPlayersArmorAmount;
  }

  public GetCharactersCharacterIdStatsOrbital strikeDamageToPlayersShieldAmount(Long strikeDamageToPlayersShieldAmount) {
    this.strikeDamageToPlayersShieldAmount = strikeDamageToPlayersShieldAmount;
    return this;
  }

   /**
   * strike_damage_to_players_shield_amount integer
   * @return strikeDamageToPlayersShieldAmount
  **/
  @ApiModelProperty(value = "strike_damage_to_players_shield_amount integer")
  public Long getStrikeDamageToPlayersShieldAmount() {
    return strikeDamageToPlayersShieldAmount;
  }

  public void setStrikeDamageToPlayersShieldAmount(Long strikeDamageToPlayersShieldAmount) {
    this.strikeDamageToPlayersShieldAmount = strikeDamageToPlayersShieldAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsOrbital getCharactersCharacterIdStatsOrbital = (GetCharactersCharacterIdStatsOrbital) o;
    return Objects.equals(this.strikeCharactersKilled, getCharactersCharacterIdStatsOrbital.strikeCharactersKilled) &&
        Objects.equals(this.strikeDamageToPlayersArmorAmount, getCharactersCharacterIdStatsOrbital.strikeDamageToPlayersArmorAmount) &&
        Objects.equals(this.strikeDamageToPlayersShieldAmount, getCharactersCharacterIdStatsOrbital.strikeDamageToPlayersShieldAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strikeCharactersKilled, strikeDamageToPlayersArmorAmount, strikeDamageToPlayersShieldAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsOrbital {\n");
    
    sb.append("    strikeCharactersKilled: ").append(toIndentedString(strikeCharactersKilled)).append("\n");
    sb.append("    strikeDamageToPlayersArmorAmount: ").append(toIndentedString(strikeDamageToPlayersArmorAmount)).append("\n");
    sb.append("    strikeDamageToPlayersShieldAmount: ").append(toIndentedString(strikeDamageToPlayersShieldAmount)).append("\n");
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

