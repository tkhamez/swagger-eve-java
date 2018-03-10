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
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T21:17:18.195+01:00")
public class GetIncursions200Ok {
  @SerializedName("type")
  private String type = null;

  /**
   * The state of this incursion
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    WITHDRAWING("withdrawing"),
    
    MOBILIZING("mobilizing"),
    
    ESTABLISHED("established");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("influence")
  private Float influence = null;

  @SerializedName("has_boss")
  private Boolean hasBoss = null;

  @SerializedName("faction_id")
  private Integer factionId = null;

  @SerializedName("constellation_id")
  private Integer constellationId = null;

  @SerializedName("staging_solar_system_id")
  private Integer stagingSolarSystemId = null;

  @SerializedName("infested_solar_systems")
  private List<Integer> infestedSolarSystems = new ArrayList<Integer>();

  public GetIncursions200Ok type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of this incursion
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of this incursion")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GetIncursions200Ok state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of this incursion
   * @return state
  **/
  @ApiModelProperty(required = true, value = "The state of this incursion")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public GetIncursions200Ok influence(Float influence) {
    this.influence = influence;
    return this;
  }

   /**
   * Influence of this incursion as a float from 0 to 1
   * @return influence
  **/
  @ApiModelProperty(required = true, value = "Influence of this incursion as a float from 0 to 1")
  public Float getInfluence() {
    return influence;
  }

  public void setInfluence(Float influence) {
    this.influence = influence;
  }

  public GetIncursions200Ok hasBoss(Boolean hasBoss) {
    this.hasBoss = hasBoss;
    return this;
  }

   /**
   * Whether the final encounter has boss or not
   * @return hasBoss
  **/
  @ApiModelProperty(required = true, value = "Whether the final encounter has boss or not")
  public Boolean isHasBoss() {
    return hasBoss;
  }

  public void setHasBoss(Boolean hasBoss) {
    this.hasBoss = hasBoss;
  }

  public GetIncursions200Ok factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

   /**
   * The attacking faction&#39;s id
   * @return factionId
  **/
  @ApiModelProperty(required = true, value = "The attacking faction's id")
  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetIncursions200Ok constellationId(Integer constellationId) {
    this.constellationId = constellationId;
    return this;
  }

   /**
   * The constellation id in which this incursion takes place
   * @return constellationId
  **/
  @ApiModelProperty(required = true, value = "The constellation id in which this incursion takes place")
  public Integer getConstellationId() {
    return constellationId;
  }

  public void setConstellationId(Integer constellationId) {
    this.constellationId = constellationId;
  }

  public GetIncursions200Ok stagingSolarSystemId(Integer stagingSolarSystemId) {
    this.stagingSolarSystemId = stagingSolarSystemId;
    return this;
  }

   /**
   * Staging solar system for this incursion
   * @return stagingSolarSystemId
  **/
  @ApiModelProperty(required = true, value = "Staging solar system for this incursion")
  public Integer getStagingSolarSystemId() {
    return stagingSolarSystemId;
  }

  public void setStagingSolarSystemId(Integer stagingSolarSystemId) {
    this.stagingSolarSystemId = stagingSolarSystemId;
  }

  public GetIncursions200Ok infestedSolarSystems(List<Integer> infestedSolarSystems) {
    this.infestedSolarSystems = infestedSolarSystems;
    return this;
  }

  public GetIncursions200Ok addInfestedSolarSystemsItem(Integer infestedSolarSystemsItem) {
    this.infestedSolarSystems.add(infestedSolarSystemsItem);
    return this;
  }

   /**
   * A list of infested solar system ids that are a part of this incursion
   * @return infestedSolarSystems
  **/
  @ApiModelProperty(required = true, value = "A list of infested solar system ids that are a part of this incursion")
  public List<Integer> getInfestedSolarSystems() {
    return infestedSolarSystems;
  }

  public void setInfestedSolarSystems(List<Integer> infestedSolarSystems) {
    this.infestedSolarSystems = infestedSolarSystems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIncursions200Ok getIncursions200Ok = (GetIncursions200Ok) o;
    return Objects.equals(this.type, getIncursions200Ok.type) &&
        Objects.equals(this.state, getIncursions200Ok.state) &&
        Objects.equals(this.influence, getIncursions200Ok.influence) &&
        Objects.equals(this.hasBoss, getIncursions200Ok.hasBoss) &&
        Objects.equals(this.factionId, getIncursions200Ok.factionId) &&
        Objects.equals(this.constellationId, getIncursions200Ok.constellationId) &&
        Objects.equals(this.stagingSolarSystemId, getIncursions200Ok.stagingSolarSystemId) &&
        Objects.equals(this.infestedSolarSystems, getIncursions200Ok.infestedSolarSystems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, state, influence, hasBoss, factionId, constellationId, stagingSolarSystemId, infestedSolarSystems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIncursions200Ok {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    influence: ").append(toIndentedString(influence)).append("\n");
    sb.append("    hasBoss: ").append(toIndentedString(hasBoss)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    constellationId: ").append(toIndentedString(constellationId)).append("\n");
    sb.append("    stagingSolarSystemId: ").append(toIndentedString(stagingSolarSystemId)).append("\n");
    sb.append("    infestedSolarSystems: ").append(toIndentedString(infestedSolarSystems)).append("\n");
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

