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
 * Summary of victory points gained by the given corporation for the enlisted faction
 */
@ApiModel(description = "Summary of victory points gained by the given corporation for the enlisted faction")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T21:17:18.195+01:00")
public class GetCorporationsCorporationIdFwStatsVictoryPoints {
  @SerializedName("yesterday")
  private Integer yesterday = null;

  @SerializedName("last_week")
  private Integer lastWeek = null;

  @SerializedName("total")
  private Integer total = null;

  public GetCorporationsCorporationIdFwStatsVictoryPoints yesterday(Integer yesterday) {
    this.yesterday = yesterday;
    return this;
  }

   /**
   * Yesterday&#39;s victory points gained by members of the given corporation
   * @return yesterday
  **/
  @ApiModelProperty(required = true, value = "Yesterday's victory points gained by members of the given corporation")
  public Integer getYesterday() {
    return yesterday;
  }

  public void setYesterday(Integer yesterday) {
    this.yesterday = yesterday;
  }

  public GetCorporationsCorporationIdFwStatsVictoryPoints lastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

   /**
   * Last week&#39;s victory points gained by members of the given corporation
   * @return lastWeek
  **/
  @ApiModelProperty(required = true, value = "Last week's victory points gained by members of the given corporation")
  public Integer getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetCorporationsCorporationIdFwStatsVictoryPoints total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total victory points gained since the given corporation enlisted
   * @return total
  **/
  @ApiModelProperty(required = true, value = "Total victory points gained since the given corporation enlisted")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdFwStatsVictoryPoints getCorporationsCorporationIdFwStatsVictoryPoints = (GetCorporationsCorporationIdFwStatsVictoryPoints) o;
    return Objects.equals(this.yesterday, getCorporationsCorporationIdFwStatsVictoryPoints.yesterday) &&
        Objects.equals(this.lastWeek, getCorporationsCorporationIdFwStatsVictoryPoints.lastWeek) &&
        Objects.equals(this.total, getCorporationsCorporationIdFwStatsVictoryPoints.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yesterday, lastWeek, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdFwStatsVictoryPoints {\n");
    
    sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
    sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

