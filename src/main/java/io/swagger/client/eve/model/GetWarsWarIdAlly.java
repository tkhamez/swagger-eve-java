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
 * ally object
 */
@ApiModel(description = "ally object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T21:17:18.195+01:00")
public class GetWarsWarIdAlly {
  @SerializedName("corporation_id")
  private Integer corporationId = null;

  @SerializedName("alliance_id")
  private Integer allianceId = null;

  public GetWarsWarIdAlly corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

   /**
   * Corporation ID if and only if this ally is a corporation
   * @return corporationId
  **/
  @ApiModelProperty(value = "Corporation ID if and only if this ally is a corporation")
  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetWarsWarIdAlly allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

   /**
   * Alliance ID if and only if this ally is an alliance
   * @return allianceId
  **/
  @ApiModelProperty(value = "Alliance ID if and only if this ally is an alliance")
  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWarsWarIdAlly getWarsWarIdAlly = (GetWarsWarIdAlly) o;
    return Objects.equals(this.corporationId, getWarsWarIdAlly.corporationId) &&
        Objects.equals(this.allianceId, getWarsWarIdAlly.allianceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporationId, allianceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWarsWarIdAlly {\n");
    
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
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

