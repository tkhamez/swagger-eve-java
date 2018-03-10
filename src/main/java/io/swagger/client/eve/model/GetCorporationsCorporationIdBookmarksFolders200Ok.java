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
public class GetCorporationsCorporationIdBookmarksFolders200Ok {
  @SerializedName("folder_id")
  private Integer folderId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("creator_id")
  private Integer creatorId = null;

  public GetCorporationsCorporationIdBookmarksFolders200Ok folderId(Integer folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * folder_id integer
   * @return folderId
  **/
  @ApiModelProperty(required = true, value = "folder_id integer")
  public Integer getFolderId() {
    return folderId;
  }

  public void setFolderId(Integer folderId) {
    this.folderId = folderId;
  }

  public GetCorporationsCorporationIdBookmarksFolders200Ok name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCorporationsCorporationIdBookmarksFolders200Ok creatorId(Integer creatorId) {
    this.creatorId = creatorId;
    return this;
  }

   /**
   * creator_id integer
   * @return creatorId
  **/
  @ApiModelProperty(value = "creator_id integer")
  public Integer getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdBookmarksFolders200Ok getCorporationsCorporationIdBookmarksFolders200Ok = (GetCorporationsCorporationIdBookmarksFolders200Ok) o;
    return Objects.equals(this.folderId, getCorporationsCorporationIdBookmarksFolders200Ok.folderId) &&
        Objects.equals(this.name, getCorporationsCorporationIdBookmarksFolders200Ok.name) &&
        Objects.equals(this.creatorId, getCorporationsCorporationIdBookmarksFolders200Ok.creatorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folderId, name, creatorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdBookmarksFolders200Ok {\n");
    
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
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

