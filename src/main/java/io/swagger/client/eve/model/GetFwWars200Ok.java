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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")

public class GetFwWars200Ok {
  @SerializedName("against_id")
  private Integer againstId = null;

  @SerializedName("faction_id")
  private Integer factionId = null;

  public GetFwWars200Ok againstId(Integer againstId) {
    this.againstId = againstId;
    return this;
  }

   /**
   * The faction ID of the enemy faction.
   * @return againstId
  **/
  @ApiModelProperty(required = true, value = "The faction ID of the enemy faction.")
  public Integer getAgainstId() {
    return againstId;
  }

  public void setAgainstId(Integer againstId) {
    this.againstId = againstId;
  }

  public GetFwWars200Ok factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

   /**
   * faction_id integer
   * @return factionId
  **/
  @ApiModelProperty(required = true, value = "faction_id integer")
  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwWars200Ok getFwWars200Ok = (GetFwWars200Ok) o;
    return Objects.equals(this.againstId, getFwWars200Ok.againstId) &&
        Objects.equals(this.factionId, getFwWars200Ok.factionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(againstId, factionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwWars200Ok {\n");
    
    sb.append("    againstId: ").append(toIndentedString(againstId)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
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

