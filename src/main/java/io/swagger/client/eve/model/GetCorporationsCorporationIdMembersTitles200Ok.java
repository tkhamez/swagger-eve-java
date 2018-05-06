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
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")

public class GetCorporationsCorporationIdMembersTitles200Ok {
  @SerializedName("character_id")
  private Integer characterId = null;

  @SerializedName("titles")
  private List<Integer> titles = new ArrayList<Integer>();

  public GetCorporationsCorporationIdMembersTitles200Ok characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * character_id integer
   * @return characterId
  **/
  @ApiModelProperty(required = true, value = "character_id integer")
  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetCorporationsCorporationIdMembersTitles200Ok titles(List<Integer> titles) {
    this.titles = titles;
    return this;
  }

  public GetCorporationsCorporationIdMembersTitles200Ok addTitlesItem(Integer titlesItem) {
    this.titles.add(titlesItem);
    return this;
  }

   /**
   * A list of title_id
   * @return titles
  **/
  @ApiModelProperty(required = true, value = "A list of title_id")
  public List<Integer> getTitles() {
    return titles;
  }

  public void setTitles(List<Integer> titles) {
    this.titles = titles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdMembersTitles200Ok getCorporationsCorporationIdMembersTitles200Ok = (GetCorporationsCorporationIdMembersTitles200Ok) o;
    return Objects.equals(this.characterId, getCorporationsCorporationIdMembersTitles200Ok.characterId) &&
        Objects.equals(this.titles, getCorporationsCorporationIdMembersTitles200Ok.titles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterId, titles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdMembersTitles200Ok {\n");
    
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
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

