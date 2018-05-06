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
import io.swagger.client.eve.model.GetFwLeaderboardsCorporationsActiveTotal;
import io.swagger.client.eve.model.GetFwLeaderboardsCorporationsLastWeek;
import io.swagger.client.eve.model.GetFwLeaderboardsCorporationsYesterday;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Top 10 rankings of corporations by number of kills from yesterday, last week and in total.
 */
@ApiModel(description = "Top 10 rankings of corporations by number of kills from yesterday, last week and in total.")

public class GetFwLeaderboardsCorporationsKills {
  @SerializedName("active_total")
  private List<GetFwLeaderboardsCorporationsActiveTotal> activeTotal = new ArrayList<GetFwLeaderboardsCorporationsActiveTotal>();

  @SerializedName("last_week")
  private List<GetFwLeaderboardsCorporationsLastWeek> lastWeek = new ArrayList<GetFwLeaderboardsCorporationsLastWeek>();

  @SerializedName("yesterday")
  private List<GetFwLeaderboardsCorporationsYesterday> yesterday = new ArrayList<GetFwLeaderboardsCorporationsYesterday>();

  public GetFwLeaderboardsCorporationsKills activeTotal(List<GetFwLeaderboardsCorporationsActiveTotal> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsCorporationsKills addActiveTotalItem(GetFwLeaderboardsCorporationsActiveTotal activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

   /**
   * Top 10 ranking of corporations active in faction warfare by total kills. A corporation is considered \&quot;active\&quot; if they have participated in faction warfare in the past 14 days.
   * @return activeTotal
  **/
  @ApiModelProperty(required = true, value = "Top 10 ranking of corporations active in faction warfare by total kills. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days.")
  public List<GetFwLeaderboardsCorporationsActiveTotal> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsCorporationsActiveTotal> activeTotal) {
    this.activeTotal = activeTotal;
  }

  public GetFwLeaderboardsCorporationsKills lastWeek(List<GetFwLeaderboardsCorporationsLastWeek> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsCorporationsKills addLastWeekItem(GetFwLeaderboardsCorporationsLastWeek lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

   /**
   * Top 10 ranking of corporations by kills in the past week
   * @return lastWeek
  **/
  @ApiModelProperty(required = true, value = "Top 10 ranking of corporations by kills in the past week")
  public List<GetFwLeaderboardsCorporationsLastWeek> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsCorporationsLastWeek> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsCorporationsKills yesterday(List<GetFwLeaderboardsCorporationsYesterday> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsCorporationsKills addYesterdayItem(GetFwLeaderboardsCorporationsYesterday yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

   /**
   * Top 10 ranking of corporations by kills in the past day
   * @return yesterday
  **/
  @ApiModelProperty(required = true, value = "Top 10 ranking of corporations by kills in the past day")
  public List<GetFwLeaderboardsCorporationsYesterday> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsCorporationsYesterday> yesterday) {
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
    GetFwLeaderboardsCorporationsKills getFwLeaderboardsCorporationsKills = (GetFwLeaderboardsCorporationsKills) o;
    return Objects.equals(this.activeTotal, getFwLeaderboardsCorporationsKills.activeTotal) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsCorporationsKills.lastWeek) &&
        Objects.equals(this.yesterday, getFwLeaderboardsCorporationsKills.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTotal, lastWeek, yesterday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCorporationsKills {\n");
    
    sb.append("    activeTotal: ").append(toIndentedString(activeTotal)).append("\n");
    sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
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

