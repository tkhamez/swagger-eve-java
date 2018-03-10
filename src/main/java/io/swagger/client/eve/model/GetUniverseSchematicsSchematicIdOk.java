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

public class GetUniverseSchematicsSchematicIdOk {
  @SerializedName("schematic_name")
  private String schematicName = null;

  @SerializedName("cycle_time")
  private Integer cycleTime = null;

  public GetUniverseSchematicsSchematicIdOk schematicName(String schematicName) {
    this.schematicName = schematicName;
    return this;
  }

   /**
   * schematic_name string
   * @return schematicName
  **/
  @ApiModelProperty(required = true, value = "schematic_name string")
  public String getSchematicName() {
    return schematicName;
  }

  public void setSchematicName(String schematicName) {
    this.schematicName = schematicName;
  }

  public GetUniverseSchematicsSchematicIdOk cycleTime(Integer cycleTime) {
    this.cycleTime = cycleTime;
    return this;
  }

   /**
   * Time in seconds to process a run
   * @return cycleTime
  **/
  @ApiModelProperty(required = true, value = "Time in seconds to process a run")
  public Integer getCycleTime() {
    return cycleTime;
  }

  public void setCycleTime(Integer cycleTime) {
    this.cycleTime = cycleTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseSchematicsSchematicIdOk getUniverseSchematicsSchematicIdOk = (GetUniverseSchematicsSchematicIdOk) o;
    return Objects.equals(this.schematicName, getUniverseSchematicsSchematicIdOk.schematicName) &&
        Objects.equals(this.cycleTime, getUniverseSchematicsSchematicIdOk.cycleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schematicName, cycleTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseSchematicsSchematicIdOk {\n");
    
    sb.append("    schematicName: ").append(toIndentedString(schematicName)).append("\n");
    sb.append("    cycleTime: ").append(toIndentedString(cycleTime)).append("\n");
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

