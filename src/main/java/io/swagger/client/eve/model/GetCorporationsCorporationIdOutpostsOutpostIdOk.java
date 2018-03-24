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
import io.swagger.client.eve.model.GetCorporationsCorporationIdOutpostsOutpostIdCoordinates;
import io.swagger.client.eve.model.GetCorporationsCorporationIdOutpostsOutpostIdService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")

public class GetCorporationsCorporationIdOutpostsOutpostIdOk {
  @SerializedName("owner_id")
  private Integer ownerId = null;

  @SerializedName("system_id")
  private Integer systemId = null;

  @SerializedName("docking_cost_per_ship_volume")
  private Float dockingCostPerShipVolume = null;

  @SerializedName("office_rental_cost")
  private Long officeRentalCost = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  @SerializedName("reprocessing_efficiency")
  private Float reprocessingEfficiency = null;

  @SerializedName("reprocessing_station_take")
  private Float reprocessingStationTake = null;

  @SerializedName("standing_owner_id")
  private Integer standingOwnerId = null;

  @SerializedName("coordinates")
  private GetCorporationsCorporationIdOutpostsOutpostIdCoordinates coordinates = null;

  @SerializedName("services")
  private List<GetCorporationsCorporationIdOutpostsOutpostIdService> services = new ArrayList<GetCorporationsCorporationIdOutpostsOutpostIdService>();

  public GetCorporationsCorporationIdOutpostsOutpostIdOk ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The entity that owns the station (e.g. the entity whose logo is on the station services bar)
   * @return ownerId
  **/
  @ApiModelProperty(required = true, value = "The entity that owns the station (e.g. the entity whose logo is on the station services bar)")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public GetCorporationsCorporationIdOutpostsOutpostIdOk systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

   /**
   * The ID of the solar system the outpost rests in
   * @return systemId
  **/
  @ApiModelProperty(required = true, value = "The ID of the solar system the outpost rests in")
  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }

  public GetCorporationsCorporationIdOutpostsOutpostIdOk dockingCostPerShipVolume(Float dockingCostPerShipVolume) {
    this.dockingCostPerShipVolume = dockingCostPerShipVolume;
    return this;
  }

   /**
   * docking_cost_per_ship_volume number
   * @return dockingCostPerShipVolume
  **/
  @ApiModelProperty(required = true, value = "docking_cost_per_ship_volume number")
  public Float getDockingCostPerShipVolume() {
    return dockingCostPerShipVolume;
  }

  public void setDockingCostPerShipVolume(Float dockingCostPerShipVolume) {
    this.dockingCostPerShipVolume = dockingCostPerShipVolume;
  }

  public GetCorporationsCorporationIdOutpostsOutpostIdOk officeRentalCost(Long officeRentalCost) {
    this.officeRentalCost = officeRentalCost;
    return this;
  }

   /**
   * office_rental_cost integer
   * @return officeRentalCost
  **/
  @ApiModelProperty(required = true, value = "office_rental_cost integer")
  public Long getOfficeRentalCost() {
    return officeRentalCost;
  }

  public void setOfficeRentalCost(Long officeRentalCost) {
    this.officeRentalCost = officeRentalCost;
  }

  public GetCorporationsCorporationIdOutpostsOutpostIdOk typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * The type ID of the given outpost
   * @return typeId
  **/
  @ApiModelProperty(required = true, value = "The type ID of the given outpost")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public GetCorporationsCorporationIdOutpostsOutpostIdOk reprocessingEfficiency(Float reprocessingEfficiency) {
    this.reprocessingEfficiency = reprocessingEfficiency;
    return this;
  }

   /**
   * reprocessing_efficiency number
   * @return reprocessingEfficiency
  **/
  @ApiModelProperty(required = true, value = "reprocessing_efficiency number")
  public Float getReprocessingEfficiency() {
    return reprocessingEfficiency;
  }

  public void setReprocessingEfficiency(Float reprocessingEfficiency) {
    this.reprocessingEfficiency = reprocessingEfficiency;
  }

  public GetCorporationsCorporationIdOutpostsOutpostIdOk reprocessingStationTake(Float reprocessingStationTake) {
    this.reprocessingStationTake = reprocessingStationTake;
    return this;
  }

   /**
   * reprocessing_station_take number
   * @return reprocessingStationTake
  **/
  @ApiModelProperty(required = true, value = "reprocessing_station_take number")
  public Float getReprocessingStationTake() {
    return reprocessingStationTake;
  }

  public void setReprocessingStationTake(Float reprocessingStationTake) {
    this.reprocessingStationTake = reprocessingStationTake;
  }

  public GetCorporationsCorporationIdOutpostsOutpostIdOk standingOwnerId(Integer standingOwnerId) {
    this.standingOwnerId = standingOwnerId;
    return this;
  }

   /**
   * The owner ID that sets the ability for someone to dock based on standings.
   * @return standingOwnerId
  **/
  @ApiModelProperty(required = true, value = "The owner ID that sets the ability for someone to dock based on standings.")
  public Integer getStandingOwnerId() {
    return standingOwnerId;
  }

  public void setStandingOwnerId(Integer standingOwnerId) {
    this.standingOwnerId = standingOwnerId;
  }

  public GetCorporationsCorporationIdOutpostsOutpostIdOk coordinates(GetCorporationsCorporationIdOutpostsOutpostIdCoordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(required = true, value = "")
  public GetCorporationsCorporationIdOutpostsOutpostIdCoordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(GetCorporationsCorporationIdOutpostsOutpostIdCoordinates coordinates) {
    this.coordinates = coordinates;
  }

  public GetCorporationsCorporationIdOutpostsOutpostIdOk services(List<GetCorporationsCorporationIdOutpostsOutpostIdService> services) {
    this.services = services;
    return this;
  }

  public GetCorporationsCorporationIdOutpostsOutpostIdOk addServicesItem(GetCorporationsCorporationIdOutpostsOutpostIdService servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

   /**
   * A list of services the given outpost provides
   * @return services
  **/
  @ApiModelProperty(required = true, value = "A list of services the given outpost provides")
  public List<GetCorporationsCorporationIdOutpostsOutpostIdService> getServices() {
    return services;
  }

  public void setServices(List<GetCorporationsCorporationIdOutpostsOutpostIdService> services) {
    this.services = services;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdOutpostsOutpostIdOk getCorporationsCorporationIdOutpostsOutpostIdOk = (GetCorporationsCorporationIdOutpostsOutpostIdOk) o;
    return Objects.equals(this.ownerId, getCorporationsCorporationIdOutpostsOutpostIdOk.ownerId) &&
        Objects.equals(this.systemId, getCorporationsCorporationIdOutpostsOutpostIdOk.systemId) &&
        Objects.equals(this.dockingCostPerShipVolume, getCorporationsCorporationIdOutpostsOutpostIdOk.dockingCostPerShipVolume) &&
        Objects.equals(this.officeRentalCost, getCorporationsCorporationIdOutpostsOutpostIdOk.officeRentalCost) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdOutpostsOutpostIdOk.typeId) &&
        Objects.equals(this.reprocessingEfficiency, getCorporationsCorporationIdOutpostsOutpostIdOk.reprocessingEfficiency) &&
        Objects.equals(this.reprocessingStationTake, getCorporationsCorporationIdOutpostsOutpostIdOk.reprocessingStationTake) &&
        Objects.equals(this.standingOwnerId, getCorporationsCorporationIdOutpostsOutpostIdOk.standingOwnerId) &&
        Objects.equals(this.coordinates, getCorporationsCorporationIdOutpostsOutpostIdOk.coordinates) &&
        Objects.equals(this.services, getCorporationsCorporationIdOutpostsOutpostIdOk.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, systemId, dockingCostPerShipVolume, officeRentalCost, typeId, reprocessingEfficiency, reprocessingStationTake, standingOwnerId, coordinates, services);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdOutpostsOutpostIdOk {\n");
    
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    dockingCostPerShipVolume: ").append(toIndentedString(dockingCostPerShipVolume)).append("\n");
    sb.append("    officeRentalCost: ").append(toIndentedString(officeRentalCost)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    reprocessingEfficiency: ").append(toIndentedString(reprocessingEfficiency)).append("\n");
    sb.append("    reprocessingStationTake: ").append(toIndentedString(reprocessingStationTake)).append("\n");
    sb.append("    standingOwnerId: ").append(toIndentedString(standingOwnerId)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

