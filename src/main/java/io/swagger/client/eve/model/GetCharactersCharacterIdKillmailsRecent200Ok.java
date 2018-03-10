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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T21:17:18.195+01:00")
public class GetCharactersCharacterIdKillmailsRecent200Ok {
  @SerializedName("killmail_id")
  private Integer killmailId = null;

  @SerializedName("killmail_hash")
  private String killmailHash = null;

  public GetCharactersCharacterIdKillmailsRecent200Ok killmailId(Integer killmailId) {
    this.killmailId = killmailId;
    return this;
  }

   /**
   * ID of this killmail
   * @return killmailId
  **/
  @ApiModelProperty(required = true, value = "ID of this killmail")
  public Integer getKillmailId() {
    return killmailId;
  }

  public void setKillmailId(Integer killmailId) {
    this.killmailId = killmailId;
  }

  public GetCharactersCharacterIdKillmailsRecent200Ok killmailHash(String killmailHash) {
    this.killmailHash = killmailHash;
    return this;
  }

   /**
   * A hash of this killmail
   * @return killmailHash
  **/
  @ApiModelProperty(required = true, value = "A hash of this killmail")
  public String getKillmailHash() {
    return killmailHash;
  }

  public void setKillmailHash(String killmailHash) {
    this.killmailHash = killmailHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdKillmailsRecent200Ok getCharactersCharacterIdKillmailsRecent200Ok = (GetCharactersCharacterIdKillmailsRecent200Ok) o;
    return Objects.equals(this.killmailId, getCharactersCharacterIdKillmailsRecent200Ok.killmailId) &&
        Objects.equals(this.killmailHash, getCharactersCharacterIdKillmailsRecent200Ok.killmailHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(killmailId, killmailHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdKillmailsRecent200Ok {\n");
    
    sb.append("    killmailId: ").append(toIndentedString(killmailId)).append("\n");
    sb.append("    killmailHash: ").append(toIndentedString(killmailHash)).append("\n");
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

