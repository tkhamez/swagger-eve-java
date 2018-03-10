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
 * item object
 */
@ApiModel(description = "item object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T21:17:18.195+01:00")
public class PostCharactersCharacterIdFittingsItem {
  @SerializedName("type_id")
  private Integer typeId = null;

  @SerializedName("flag")
  private Integer flag = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public PostCharactersCharacterIdFittingsItem typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * type_id integer
   * @return typeId
  **/
  @ApiModelProperty(required = true, value = "type_id integer")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public PostCharactersCharacterIdFittingsItem flag(Integer flag) {
    this.flag = flag;
    return this;
  }

   /**
   * flag integer
   * @return flag
  **/
  @ApiModelProperty(required = true, value = "flag integer")
  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public PostCharactersCharacterIdFittingsItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity integer
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "quantity integer")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersCharacterIdFittingsItem postCharactersCharacterIdFittingsItem = (PostCharactersCharacterIdFittingsItem) o;
    return Objects.equals(this.typeId, postCharactersCharacterIdFittingsItem.typeId) &&
        Objects.equals(this.flag, postCharactersCharacterIdFittingsItem.flag) &&
        Objects.equals(this.quantity, postCharactersCharacterIdFittingsItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, flag, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdFittingsItem {\n");
    
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

