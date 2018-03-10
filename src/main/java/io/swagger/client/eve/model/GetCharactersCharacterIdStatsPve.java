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
 * pve object
 */
@ApiModel(description = "pve object")

public class GetCharactersCharacterIdStatsPve {
  @SerializedName("dungeons_completed_agent")
  private Long dungeonsCompletedAgent = null;

  @SerializedName("dungeons_completed_distribution")
  private Long dungeonsCompletedDistribution = null;

  @SerializedName("missions_succeeded")
  private Long missionsSucceeded = null;

  @SerializedName("missions_succeeded_epic_arc")
  private Long missionsSucceededEpicArc = null;

  public GetCharactersCharacterIdStatsPve dungeonsCompletedAgent(Long dungeonsCompletedAgent) {
    this.dungeonsCompletedAgent = dungeonsCompletedAgent;
    return this;
  }

   /**
   * dungeons_completed_agent integer
   * @return dungeonsCompletedAgent
  **/
  @ApiModelProperty(value = "dungeons_completed_agent integer")
  public Long getDungeonsCompletedAgent() {
    return dungeonsCompletedAgent;
  }

  public void setDungeonsCompletedAgent(Long dungeonsCompletedAgent) {
    this.dungeonsCompletedAgent = dungeonsCompletedAgent;
  }

  public GetCharactersCharacterIdStatsPve dungeonsCompletedDistribution(Long dungeonsCompletedDistribution) {
    this.dungeonsCompletedDistribution = dungeonsCompletedDistribution;
    return this;
  }

   /**
   * dungeons_completed_distribution integer
   * @return dungeonsCompletedDistribution
  **/
  @ApiModelProperty(value = "dungeons_completed_distribution integer")
  public Long getDungeonsCompletedDistribution() {
    return dungeonsCompletedDistribution;
  }

  public void setDungeonsCompletedDistribution(Long dungeonsCompletedDistribution) {
    this.dungeonsCompletedDistribution = dungeonsCompletedDistribution;
  }

  public GetCharactersCharacterIdStatsPve missionsSucceeded(Long missionsSucceeded) {
    this.missionsSucceeded = missionsSucceeded;
    return this;
  }

   /**
   * missions_succeeded integer
   * @return missionsSucceeded
  **/
  @ApiModelProperty(value = "missions_succeeded integer")
  public Long getMissionsSucceeded() {
    return missionsSucceeded;
  }

  public void setMissionsSucceeded(Long missionsSucceeded) {
    this.missionsSucceeded = missionsSucceeded;
  }

  public GetCharactersCharacterIdStatsPve missionsSucceededEpicArc(Long missionsSucceededEpicArc) {
    this.missionsSucceededEpicArc = missionsSucceededEpicArc;
    return this;
  }

   /**
   * missions_succeeded_epic_arc integer
   * @return missionsSucceededEpicArc
  **/
  @ApiModelProperty(value = "missions_succeeded_epic_arc integer")
  public Long getMissionsSucceededEpicArc() {
    return missionsSucceededEpicArc;
  }

  public void setMissionsSucceededEpicArc(Long missionsSucceededEpicArc) {
    this.missionsSucceededEpicArc = missionsSucceededEpicArc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsPve getCharactersCharacterIdStatsPve = (GetCharactersCharacterIdStatsPve) o;
    return Objects.equals(this.dungeonsCompletedAgent, getCharactersCharacterIdStatsPve.dungeonsCompletedAgent) &&
        Objects.equals(this.dungeonsCompletedDistribution, getCharactersCharacterIdStatsPve.dungeonsCompletedDistribution) &&
        Objects.equals(this.missionsSucceeded, getCharactersCharacterIdStatsPve.missionsSucceeded) &&
        Objects.equals(this.missionsSucceededEpicArc, getCharactersCharacterIdStatsPve.missionsSucceededEpicArc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dungeonsCompletedAgent, dungeonsCompletedDistribution, missionsSucceeded, missionsSucceededEpicArc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsPve {\n");
    
    sb.append("    dungeonsCompletedAgent: ").append(toIndentedString(dungeonsCompletedAgent)).append("\n");
    sb.append("    dungeonsCompletedDistribution: ").append(toIndentedString(dungeonsCompletedDistribution)).append("\n");
    sb.append("    missionsSucceeded: ").append(toIndentedString(missionsSucceeded)).append("\n");
    sb.append("    missionsSucceededEpicArc: ").append(toIndentedString(missionsSucceededEpicArc)).append("\n");
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

