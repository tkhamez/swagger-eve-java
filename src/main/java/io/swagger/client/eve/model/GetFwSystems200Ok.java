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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")

public class GetFwSystems200Ok {
  /**
   * contested string
   */
  @JsonAdapter(ContestedEnum.Adapter.class)
  public enum ContestedEnum {
    CAPTURED("captured"),
    
    CONTESTED("contested"),
    
    UNCONTESTED("uncontested"),
    
    VULNERABLE("vulnerable");

    private String value;

    ContestedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContestedEnum fromValue(String text) {
      for (ContestedEnum b : ContestedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ContestedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContestedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContestedEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContestedEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("contested")
  private ContestedEnum contested = null;

  @SerializedName("occupier_faction_id")
  private Integer occupierFactionId = null;

  @SerializedName("owner_faction_id")
  private Integer ownerFactionId = null;

  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  @SerializedName("victory_points")
  private Integer victoryPoints = null;

  @SerializedName("victory_points_threshold")
  private Integer victoryPointsThreshold = null;

  public GetFwSystems200Ok contested(ContestedEnum contested) {
    this.contested = contested;
    return this;
  }

   /**
   * contested string
   * @return contested
  **/
  @ApiModelProperty(required = true, value = "contested string")
  public ContestedEnum getContested() {
    return contested;
  }

  public void setContested(ContestedEnum contested) {
    this.contested = contested;
  }

  public GetFwSystems200Ok occupierFactionId(Integer occupierFactionId) {
    this.occupierFactionId = occupierFactionId;
    return this;
  }

   /**
   * occupier_faction_id integer
   * @return occupierFactionId
  **/
  @ApiModelProperty(required = true, value = "occupier_faction_id integer")
  public Integer getOccupierFactionId() {
    return occupierFactionId;
  }

  public void setOccupierFactionId(Integer occupierFactionId) {
    this.occupierFactionId = occupierFactionId;
  }

  public GetFwSystems200Ok ownerFactionId(Integer ownerFactionId) {
    this.ownerFactionId = ownerFactionId;
    return this;
  }

   /**
   * owner_faction_id integer
   * @return ownerFactionId
  **/
  @ApiModelProperty(required = true, value = "owner_faction_id integer")
  public Integer getOwnerFactionId() {
    return ownerFactionId;
  }

  public void setOwnerFactionId(Integer ownerFactionId) {
    this.ownerFactionId = ownerFactionId;
  }

  public GetFwSystems200Ok solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * solar_system_id integer
   * @return solarSystemId
  **/
  @ApiModelProperty(required = true, value = "solar_system_id integer")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetFwSystems200Ok victoryPoints(Integer victoryPoints) {
    this.victoryPoints = victoryPoints;
    return this;
  }

   /**
   * victory_points integer
   * @return victoryPoints
  **/
  @ApiModelProperty(required = true, value = "victory_points integer")
  public Integer getVictoryPoints() {
    return victoryPoints;
  }

  public void setVictoryPoints(Integer victoryPoints) {
    this.victoryPoints = victoryPoints;
  }

  public GetFwSystems200Ok victoryPointsThreshold(Integer victoryPointsThreshold) {
    this.victoryPointsThreshold = victoryPointsThreshold;
    return this;
  }

   /**
   * victory_points_threshold integer
   * @return victoryPointsThreshold
  **/
  @ApiModelProperty(required = true, value = "victory_points_threshold integer")
  public Integer getVictoryPointsThreshold() {
    return victoryPointsThreshold;
  }

  public void setVictoryPointsThreshold(Integer victoryPointsThreshold) {
    this.victoryPointsThreshold = victoryPointsThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwSystems200Ok getFwSystems200Ok = (GetFwSystems200Ok) o;
    return Objects.equals(this.contested, getFwSystems200Ok.contested) &&
        Objects.equals(this.occupierFactionId, getFwSystems200Ok.occupierFactionId) &&
        Objects.equals(this.ownerFactionId, getFwSystems200Ok.ownerFactionId) &&
        Objects.equals(this.solarSystemId, getFwSystems200Ok.solarSystemId) &&
        Objects.equals(this.victoryPoints, getFwSystems200Ok.victoryPoints) &&
        Objects.equals(this.victoryPointsThreshold, getFwSystems200Ok.victoryPointsThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contested, occupierFactionId, ownerFactionId, solarSystemId, victoryPoints, victoryPointsThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwSystems200Ok {\n");
    
    sb.append("    contested: ").append(toIndentedString(contested)).append("\n");
    sb.append("    occupierFactionId: ").append(toIndentedString(occupierFactionId)).append("\n");
    sb.append("    ownerFactionId: ").append(toIndentedString(ownerFactionId)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    victoryPoints: ").append(toIndentedString(victoryPoints)).append("\n");
    sb.append("    victoryPointsThreshold: ").append(toIndentedString(victoryPointsThreshold)).append("\n");
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

