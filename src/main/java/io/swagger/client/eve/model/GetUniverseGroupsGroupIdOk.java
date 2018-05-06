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

public class GetUniverseGroupsGroupIdOk {
  @SerializedName("category_id")
  private Integer categoryId = null;

  @SerializedName("group_id")
  private Integer groupId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("types")
  private List<Integer> types = new ArrayList<Integer>();

  public GetUniverseGroupsGroupIdOk categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * category_id integer
   * @return categoryId
  **/
  @ApiModelProperty(required = true, value = "category_id integer")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public GetUniverseGroupsGroupIdOk groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * group_id integer
   * @return groupId
  **/
  @ApiModelProperty(required = true, value = "group_id integer")
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public GetUniverseGroupsGroupIdOk name(String name) {
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

  public GetUniverseGroupsGroupIdOk published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * published boolean
   * @return published
  **/
  @ApiModelProperty(required = true, value = "published boolean")
  public Boolean isPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public GetUniverseGroupsGroupIdOk types(List<Integer> types) {
    this.types = types;
    return this;
  }

  public GetUniverseGroupsGroupIdOk addTypesItem(Integer typesItem) {
    this.types.add(typesItem);
    return this;
  }

   /**
   * types array
   * @return types
  **/
  @ApiModelProperty(required = true, value = "types array")
  public List<Integer> getTypes() {
    return types;
  }

  public void setTypes(List<Integer> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseGroupsGroupIdOk getUniverseGroupsGroupIdOk = (GetUniverseGroupsGroupIdOk) o;
    return Objects.equals(this.categoryId, getUniverseGroupsGroupIdOk.categoryId) &&
        Objects.equals(this.groupId, getUniverseGroupsGroupIdOk.groupId) &&
        Objects.equals(this.name, getUniverseGroupsGroupIdOk.name) &&
        Objects.equals(this.published, getUniverseGroupsGroupIdOk.published) &&
        Objects.equals(this.types, getUniverseGroupsGroupIdOk.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, groupId, name, published, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseGroupsGroupIdOk {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

