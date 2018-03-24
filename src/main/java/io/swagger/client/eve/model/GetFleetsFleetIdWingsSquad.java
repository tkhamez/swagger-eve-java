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
 * squad object
 */
@ApiModel(description = "squad object")

public class GetFleetsFleetIdWingsSquad {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private Long id = null;

  public GetFleetsFleetIdWingsSquad name(String name) {
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

  public GetFleetsFleetIdWingsSquad id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * id integer
   * @return id
  **/
  @ApiModelProperty(required = true, value = "id integer")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFleetsFleetIdWingsSquad getFleetsFleetIdWingsSquad = (GetFleetsFleetIdWingsSquad) o;
    return Objects.equals(this.name, getFleetsFleetIdWingsSquad.name) &&
        Objects.equals(this.id, getFleetsFleetIdWingsSquad.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFleetsFleetIdWingsSquad {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

