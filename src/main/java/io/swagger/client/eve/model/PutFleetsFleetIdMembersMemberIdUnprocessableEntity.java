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

/**
 * 422 unprocessable entity object
 */
@ApiModel(description = "422 unprocessable entity object")

public class PutFleetsFleetIdMembersMemberIdUnprocessableEntity {
  @SerializedName("error")
  private String error = null;

  public PutFleetsFleetIdMembersMemberIdUnprocessableEntity error(String error) {
    this.error = error;
    return this;
  }

   /**
   * error message
   * @return error
  **/
  @ApiModelProperty(value = "error message")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutFleetsFleetIdMembersMemberIdUnprocessableEntity putFleetsFleetIdMembersMemberIdUnprocessableEntity = (PutFleetsFleetIdMembersMemberIdUnprocessableEntity) o;
    return Objects.equals(this.error, putFleetsFleetIdMembersMemberIdUnprocessableEntity.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutFleetsFleetIdMembersMemberIdUnprocessableEntity {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

