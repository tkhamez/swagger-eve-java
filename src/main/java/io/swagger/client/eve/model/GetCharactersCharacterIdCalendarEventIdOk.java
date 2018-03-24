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
import org.threeten.bp.OffsetDateTime;

/**
 * Full details of a specific event
 */
@ApiModel(description = "Full details of a specific event")

public class GetCharactersCharacterIdCalendarEventIdOk {
  @SerializedName("event_id")
  private Integer eventId = null;

  @SerializedName("owner_id")
  private Integer ownerId = null;

  @SerializedName("owner_name")
  private String ownerName = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("importance")
  private Integer importance = null;

  @SerializedName("response")
  private String response = null;

  @SerializedName("text")
  private String text = null;

  /**
   * owner_type string
   */
  @JsonAdapter(OwnerTypeEnum.Adapter.class)
  public enum OwnerTypeEnum {
    EVE_SERVER("eve_server"),
    
    CORPORATION("corporation"),
    
    FACTION("faction"),
    
    CHARACTER("character"),
    
    ALLIANCE("alliance");

    private String value;

    OwnerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OwnerTypeEnum fromValue(String text) {
      for (OwnerTypeEnum b : OwnerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OwnerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OwnerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OwnerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OwnerTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("owner_type")
  private OwnerTypeEnum ownerType = null;

  public GetCharactersCharacterIdCalendarEventIdOk eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * event_id integer
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "event_id integer")
  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public GetCharactersCharacterIdCalendarEventIdOk ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * owner_id integer
   * @return ownerId
  **/
  @ApiModelProperty(required = true, value = "owner_id integer")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public GetCharactersCharacterIdCalendarEventIdOk ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * owner_name string
   * @return ownerName
  **/
  @ApiModelProperty(required = true, value = "owner_name string")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public GetCharactersCharacterIdCalendarEventIdOk date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * date string
   * @return date
  **/
  @ApiModelProperty(required = true, value = "date string")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public GetCharactersCharacterIdCalendarEventIdOk title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title string
   * @return title
  **/
  @ApiModelProperty(required = true, value = "title string")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GetCharactersCharacterIdCalendarEventIdOk duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Length in minutes
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "Length in minutes")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public GetCharactersCharacterIdCalendarEventIdOk importance(Integer importance) {
    this.importance = importance;
    return this;
  }

   /**
   * importance integer
   * @return importance
  **/
  @ApiModelProperty(required = true, value = "importance integer")
  public Integer getImportance() {
    return importance;
  }

  public void setImportance(Integer importance) {
    this.importance = importance;
  }

  public GetCharactersCharacterIdCalendarEventIdOk response(String response) {
    this.response = response;
    return this;
  }

   /**
   * response string
   * @return response
  **/
  @ApiModelProperty(required = true, value = "response string")
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public GetCharactersCharacterIdCalendarEventIdOk text(String text) {
    this.text = text;
    return this;
  }

   /**
   * text string
   * @return text
  **/
  @ApiModelProperty(required = true, value = "text string")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public GetCharactersCharacterIdCalendarEventIdOk ownerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
    return this;
  }

   /**
   * owner_type string
   * @return ownerType
  **/
  @ApiModelProperty(required = true, value = "owner_type string")
  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdCalendarEventIdOk getCharactersCharacterIdCalendarEventIdOk = (GetCharactersCharacterIdCalendarEventIdOk) o;
    return Objects.equals(this.eventId, getCharactersCharacterIdCalendarEventIdOk.eventId) &&
        Objects.equals(this.ownerId, getCharactersCharacterIdCalendarEventIdOk.ownerId) &&
        Objects.equals(this.ownerName, getCharactersCharacterIdCalendarEventIdOk.ownerName) &&
        Objects.equals(this.date, getCharactersCharacterIdCalendarEventIdOk.date) &&
        Objects.equals(this.title, getCharactersCharacterIdCalendarEventIdOk.title) &&
        Objects.equals(this.duration, getCharactersCharacterIdCalendarEventIdOk.duration) &&
        Objects.equals(this.importance, getCharactersCharacterIdCalendarEventIdOk.importance) &&
        Objects.equals(this.response, getCharactersCharacterIdCalendarEventIdOk.response) &&
        Objects.equals(this.text, getCharactersCharacterIdCalendarEventIdOk.text) &&
        Objects.equals(this.ownerType, getCharactersCharacterIdCalendarEventIdOk.ownerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, ownerId, ownerName, date, title, duration, importance, response, text, ownerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdCalendarEventIdOk {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
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

