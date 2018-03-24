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

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")

public class GetUniverseSystemKills200Ok {
  @SerializedName("system_id")
  private Integer systemId = null;

  @SerializedName("ship_kills")
  private Integer shipKills = null;

  @SerializedName("npc_kills")
  private Integer npcKills = null;

  @SerializedName("pod_kills")
  private Integer podKills = null;

  public GetUniverseSystemKills200Ok systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

   /**
   * system_id integer
   * @return systemId
  **/
  @ApiModelProperty(required = true, value = "system_id integer")
  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }

  public GetUniverseSystemKills200Ok shipKills(Integer shipKills) {
    this.shipKills = shipKills;
    return this;
  }

   /**
   * Number of player ships killed in this system
   * @return shipKills
  **/
  @ApiModelProperty(required = true, value = "Number of player ships killed in this system")
  public Integer getShipKills() {
    return shipKills;
  }

  public void setShipKills(Integer shipKills) {
    this.shipKills = shipKills;
  }

  public GetUniverseSystemKills200Ok npcKills(Integer npcKills) {
    this.npcKills = npcKills;
    return this;
  }

   /**
   * Number of NPC ships killed in this system
   * @return npcKills
  **/
  @ApiModelProperty(required = true, value = "Number of NPC ships killed in this system")
  public Integer getNpcKills() {
    return npcKills;
  }

  public void setNpcKills(Integer npcKills) {
    this.npcKills = npcKills;
  }

  public GetUniverseSystemKills200Ok podKills(Integer podKills) {
    this.podKills = podKills;
    return this;
  }

   /**
   * Number of pods killed in this system
   * @return podKills
  **/
  @ApiModelProperty(required = true, value = "Number of pods killed in this system")
  public Integer getPodKills() {
    return podKills;
  }

  public void setPodKills(Integer podKills) {
    this.podKills = podKills;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseSystemKills200Ok getUniverseSystemKills200Ok = (GetUniverseSystemKills200Ok) o;
    return Objects.equals(this.systemId, getUniverseSystemKills200Ok.systemId) &&
        Objects.equals(this.shipKills, getUniverseSystemKills200Ok.shipKills) &&
        Objects.equals(this.npcKills, getUniverseSystemKills200Ok.npcKills) &&
        Objects.equals(this.podKills, getUniverseSystemKills200Ok.podKills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemId, shipKills, npcKills, podKills);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseSystemKills200Ok {\n");
    
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    shipKills: ").append(toIndentedString(shipKills)).append("\n");
    sb.append("    npcKills: ").append(toIndentedString(npcKills)).append("\n");
    sb.append("    podKills: ").append(toIndentedString(podKills)).append("\n");
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

