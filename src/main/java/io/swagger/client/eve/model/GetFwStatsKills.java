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
 * Summary of kills against an enemy faction for the given faction
 */
@ApiModel(description = "Summary of kills against an enemy faction for the given faction")

public class GetFwStatsKills {
  @SerializedName("last_week")
  private Integer lastWeek = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("yesterday")
  private Integer yesterday = null;

  public GetFwStatsKills lastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

   /**
   * Last week&#39;s total number of kills against enemy factions
   * @return lastWeek
  **/
  @ApiModelProperty(required = true, value = "Last week's total number of kills against enemy factions")
  public Integer getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwStatsKills total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of kills against enemy factions since faction warfare began
   * @return total
  **/
  @ApiModelProperty(required = true, value = "Total number of kills against enemy factions since faction warfare began")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public GetFwStatsKills yesterday(Integer yesterday) {
    this.yesterday = yesterday;
    return this;
  }

   /**
   * Yesterday&#39;s total number of kills against enemy factions
   * @return yesterday
  **/
  @ApiModelProperty(required = true, value = "Yesterday's total number of kills against enemy factions")
  public Integer getYesterday() {
    return yesterday;
  }

  public void setYesterday(Integer yesterday) {
    this.yesterday = yesterday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwStatsKills getFwStatsKills = (GetFwStatsKills) o;
    return Objects.equals(this.lastWeek, getFwStatsKills.lastWeek) &&
        Objects.equals(this.total, getFwStatsKills.total) &&
        Objects.equals(this.yesterday, getFwStatsKills.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastWeek, total, yesterday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwStatsKills {\n");
    
    sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
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

