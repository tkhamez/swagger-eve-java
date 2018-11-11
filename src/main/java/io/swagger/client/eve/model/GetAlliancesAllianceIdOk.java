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
import org.threeten.bp.OffsetDateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")

public class GetAlliancesAllianceIdOk {
  @SerializedName("creator_corporation_id")
  private Integer creatorCorporationId = null;

  @SerializedName("creator_id")
  private Integer creatorId = null;

  @SerializedName("date_founded")
  private OffsetDateTime dateFounded = null;

  @SerializedName("executor_corporation_id")
  private Integer executorCorporationId = null;

  @SerializedName("faction_id")
  private Integer factionId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ticker")
  private String ticker = null;

  public GetAlliancesAllianceIdOk creatorCorporationId(Integer creatorCorporationId) {
    this.creatorCorporationId = creatorCorporationId;
    return this;
  }

   /**
   * ID of the corporation that created the alliance
   * @return creatorCorporationId
  **/
  @ApiModelProperty(required = true, value = "ID of the corporation that created the alliance")
  public Integer getCreatorCorporationId() {
    return creatorCorporationId;
  }

  public void setCreatorCorporationId(Integer creatorCorporationId) {
    this.creatorCorporationId = creatorCorporationId;
  }

  public GetAlliancesAllianceIdOk creatorId(Integer creatorId) {
    this.creatorId = creatorId;
    return this;
  }

   /**
   * ID of the character that created the alliance
   * @return creatorId
  **/
  @ApiModelProperty(required = true, value = "ID of the character that created the alliance")
  public Integer getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }

  public GetAlliancesAllianceIdOk dateFounded(OffsetDateTime dateFounded) {
    this.dateFounded = dateFounded;
    return this;
  }

   /**
   * date_founded string
   * @return dateFounded
  **/
  @ApiModelProperty(required = true, value = "date_founded string")
  public OffsetDateTime getDateFounded() {
    return dateFounded;
  }

  public void setDateFounded(OffsetDateTime dateFounded) {
    this.dateFounded = dateFounded;
  }

  public GetAlliancesAllianceIdOk executorCorporationId(Integer executorCorporationId) {
    this.executorCorporationId = executorCorporationId;
    return this;
  }

   /**
   * the executor corporation ID, if this alliance is not closed
   * @return executorCorporationId
  **/
  @ApiModelProperty(value = "the executor corporation ID, if this alliance is not closed")
  public Integer getExecutorCorporationId() {
    return executorCorporationId;
  }

  public void setExecutorCorporationId(Integer executorCorporationId) {
    this.executorCorporationId = executorCorporationId;
  }

  public GetAlliancesAllianceIdOk factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

   /**
   * Faction ID this alliance is fighting for, if this alliance is enlisted in factional warfare
   * @return factionId
  **/
  @ApiModelProperty(value = "Faction ID this alliance is fighting for, if this alliance is enlisted in factional warfare")
  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetAlliancesAllianceIdOk name(String name) {
    this.name = name;
    return this;
  }

   /**
   * the full name of the alliance
   * @return name
  **/
  @ApiModelProperty(required = true, value = "the full name of the alliance")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetAlliancesAllianceIdOk ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * the short name of the alliance
   * @return ticker
  **/
  @ApiModelProperty(required = true, value = "the short name of the alliance")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAlliancesAllianceIdOk getAlliancesAllianceIdOk = (GetAlliancesAllianceIdOk) o;
    return Objects.equals(this.creatorCorporationId, getAlliancesAllianceIdOk.creatorCorporationId) &&
        Objects.equals(this.creatorId, getAlliancesAllianceIdOk.creatorId) &&
        Objects.equals(this.dateFounded, getAlliancesAllianceIdOk.dateFounded) &&
        Objects.equals(this.executorCorporationId, getAlliancesAllianceIdOk.executorCorporationId) &&
        Objects.equals(this.factionId, getAlliancesAllianceIdOk.factionId) &&
        Objects.equals(this.name, getAlliancesAllianceIdOk.name) &&
        Objects.equals(this.ticker, getAlliancesAllianceIdOk.ticker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorCorporationId, creatorId, dateFounded, executorCorporationId, factionId, name, ticker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlliancesAllianceIdOk {\n");
    
    sb.append("    creatorCorporationId: ").append(toIndentedString(creatorCorporationId)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    dateFounded: ").append(toIndentedString(dateFounded)).append("\n");
    sb.append("    executorCorporationId: ").append(toIndentedString(executorCorporationId)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
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

