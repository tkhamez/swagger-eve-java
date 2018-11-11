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
import io.swagger.client.eve.model.GetFwLeaderboardsActiveTotalActiveTotal;
import io.swagger.client.eve.model.GetFwLeaderboardsLastWeekLastWeek;
import io.swagger.client.eve.model.GetFwLeaderboardsYesterdayYesterday;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Top 4 rankings of factions by number of kills from yesterday, last week and in total
 */
@ApiModel(description = "Top 4 rankings of factions by number of kills from yesterday, last week and in total")

public class GetFwLeaderboardsKills {
  @SerializedName("active_total")
  private List<GetFwLeaderboardsActiveTotalActiveTotal> activeTotal = new ArrayList<GetFwLeaderboardsActiveTotalActiveTotal>();

  @SerializedName("last_week")
  private List<GetFwLeaderboardsLastWeekLastWeek> lastWeek = new ArrayList<GetFwLeaderboardsLastWeekLastWeek>();

  @SerializedName("yesterday")
  private List<GetFwLeaderboardsYesterdayYesterday> yesterday = new ArrayList<GetFwLeaderboardsYesterdayYesterday>();

  public GetFwLeaderboardsKills activeTotal(List<GetFwLeaderboardsActiveTotalActiveTotal> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsKills addActiveTotalItem(GetFwLeaderboardsActiveTotalActiveTotal activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

   /**
   * Top 4 ranking of factions active in faction warfare by total kills. A faction is considered \&quot;active\&quot; if they have participated in faction warfare in the past 14 days
   * @return activeTotal
  **/
  @ApiModelProperty(required = true, value = "Top 4 ranking of factions active in faction warfare by total kills. A faction is considered \"active\" if they have participated in faction warfare in the past 14 days")
  public List<GetFwLeaderboardsActiveTotalActiveTotal> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsActiveTotalActiveTotal> activeTotal) {
    this.activeTotal = activeTotal;
  }

  public GetFwLeaderboardsKills lastWeek(List<GetFwLeaderboardsLastWeekLastWeek> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsKills addLastWeekItem(GetFwLeaderboardsLastWeekLastWeek lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

   /**
   * Top 4 ranking of factions by kills in the past week
   * @return lastWeek
  **/
  @ApiModelProperty(required = true, value = "Top 4 ranking of factions by kills in the past week")
  public List<GetFwLeaderboardsLastWeekLastWeek> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsLastWeekLastWeek> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsKills yesterday(List<GetFwLeaderboardsYesterdayYesterday> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsKills addYesterdayItem(GetFwLeaderboardsYesterdayYesterday yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

   /**
   * Top 4 ranking of factions by kills in the past day
   * @return yesterday
  **/
  @ApiModelProperty(required = true, value = "Top 4 ranking of factions by kills in the past day")
  public List<GetFwLeaderboardsYesterdayYesterday> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsYesterdayYesterday> yesterday) {
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
    GetFwLeaderboardsKills getFwLeaderboardsKills = (GetFwLeaderboardsKills) o;
    return Objects.equals(this.activeTotal, getFwLeaderboardsKills.activeTotal) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsKills.lastWeek) &&
        Objects.equals(this.yesterday, getFwLeaderboardsKills.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTotal, lastWeek, yesterday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsKills {\n");
    
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

