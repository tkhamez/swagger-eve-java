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
 * Unprocessable entity
 */
@ApiModel(description = "Unprocessable entity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T21:17:18.195+01:00")
public class PostUiOpenwindowNewmailUnprocessableEntity {
  @SerializedName("error")
  private String error = null;

  public PostUiOpenwindowNewmailUnprocessableEntity error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Unprocessable entity message
   * @return error
  **/
  @ApiModelProperty(value = "Unprocessable entity message")
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
    PostUiOpenwindowNewmailUnprocessableEntity postUiOpenwindowNewmailUnprocessableEntity = (PostUiOpenwindowNewmailUnprocessableEntity) o;
    return Objects.equals(this.error, postUiOpenwindowNewmailUnprocessableEntity.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUiOpenwindowNewmailUnprocessableEntity {\n");
    
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

