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
 * new_settings object
 */
@ApiModel(description = "new_settings object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T21:17:18.195+01:00")
public class PutFleetsFleetIdNewSettings {
  @SerializedName("motd")
  private String motd = null;

  @SerializedName("is_free_move")
  private Boolean isFreeMove = null;

  public PutFleetsFleetIdNewSettings motd(String motd) {
    this.motd = motd;
    return this;
  }

   /**
   * New fleet MOTD in CCP flavoured HTML
   * @return motd
  **/
  @ApiModelProperty(value = "New fleet MOTD in CCP flavoured HTML")
  public String getMotd() {
    return motd;
  }

  public void setMotd(String motd) {
    this.motd = motd;
  }

  public PutFleetsFleetIdNewSettings isFreeMove(Boolean isFreeMove) {
    this.isFreeMove = isFreeMove;
    return this;
  }

   /**
   * Should free-move be enabled in the fleet
   * @return isFreeMove
  **/
  @ApiModelProperty(value = "Should free-move be enabled in the fleet")
  public Boolean isIsFreeMove() {
    return isFreeMove;
  }

  public void setIsFreeMove(Boolean isFreeMove) {
    this.isFreeMove = isFreeMove;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutFleetsFleetIdNewSettings putFleetsFleetIdNewSettings = (PutFleetsFleetIdNewSettings) o;
    return Objects.equals(this.motd, putFleetsFleetIdNewSettings.motd) &&
        Objects.equals(this.isFreeMove, putFleetsFleetIdNewSettings.isFreeMove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(motd, isFreeMove);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutFleetsFleetIdNewSettings {\n");
    
    sb.append("    motd: ").append(toIndentedString(motd)).append("\n");
    sb.append("    isFreeMove: ").append(toIndentedString(isFreeMove)).append("\n");
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

