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
import io.swagger.client.eve.model.GetIndustrySystemsCostIndice;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T21:17:18.195+01:00")
public class GetIndustrySystems200Ok {
  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  @SerializedName("cost_indices")
  private List<GetIndustrySystemsCostIndice> costIndices = new ArrayList<GetIndustrySystemsCostIndice>();

  public GetIndustrySystems200Ok solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * solar_system_id integer
   * @return solarSystemId
  **/
  @ApiModelProperty(required = true, value = "solar_system_id integer")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetIndustrySystems200Ok costIndices(List<GetIndustrySystemsCostIndice> costIndices) {
    this.costIndices = costIndices;
    return this;
  }

  public GetIndustrySystems200Ok addCostIndicesItem(GetIndustrySystemsCostIndice costIndicesItem) {
    this.costIndices.add(costIndicesItem);
    return this;
  }

   /**
   * cost_indices array
   * @return costIndices
  **/
  @ApiModelProperty(required = true, value = "cost_indices array")
  public List<GetIndustrySystemsCostIndice> getCostIndices() {
    return costIndices;
  }

  public void setCostIndices(List<GetIndustrySystemsCostIndice> costIndices) {
    this.costIndices = costIndices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIndustrySystems200Ok getIndustrySystems200Ok = (GetIndustrySystems200Ok) o;
    return Objects.equals(this.solarSystemId, getIndustrySystems200Ok.solarSystemId) &&
        Objects.equals(this.costIndices, getIndustrySystems200Ok.costIndices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solarSystemId, costIndices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIndustrySystems200Ok {\n");
    
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    costIndices: ").append(toIndentedString(costIndices)).append("\n");
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

