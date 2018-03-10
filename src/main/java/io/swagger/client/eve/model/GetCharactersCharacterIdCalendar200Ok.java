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
import org.threeten.bp.OffsetDateTime;

/**
 * event
 */
@ApiModel(description = "event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T21:17:18.195+01:00")
public class GetCharactersCharacterIdCalendar200Ok {
  @SerializedName("event_id")
  private Integer eventId = null;

  @SerializedName("event_date")
  private OffsetDateTime eventDate = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("importance")
  private Integer importance = null;

  /**
   * event_response string
   */
  @JsonAdapter(EventResponseEnum.Adapter.class)
  public enum EventResponseEnum {
    DECLINED("declined"),
    
    NOT_RESPONDED("not_responded"),
    
    ACCEPTED("accepted"),
    
    TENTATIVE("tentative");

    private String value;

    EventResponseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventResponseEnum fromValue(String text) {
      for (EventResponseEnum b : EventResponseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EventResponseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventResponseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventResponseEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EventResponseEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("event_response")
  private EventResponseEnum eventResponse = null;

  public GetCharactersCharacterIdCalendar200Ok eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * event_id integer
   * @return eventId
  **/
  @ApiModelProperty(value = "event_id integer")
  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public GetCharactersCharacterIdCalendar200Ok eventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * event_date string
   * @return eventDate
  **/
  @ApiModelProperty(value = "event_date string")
  public OffsetDateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }

  public GetCharactersCharacterIdCalendar200Ok title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title string
   * @return title
  **/
  @ApiModelProperty(value = "title string")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GetCharactersCharacterIdCalendar200Ok importance(Integer importance) {
    this.importance = importance;
    return this;
  }

   /**
   * importance integer
   * @return importance
  **/
  @ApiModelProperty(value = "importance integer")
  public Integer getImportance() {
    return importance;
  }

  public void setImportance(Integer importance) {
    this.importance = importance;
  }

  public GetCharactersCharacterIdCalendar200Ok eventResponse(EventResponseEnum eventResponse) {
    this.eventResponse = eventResponse;
    return this;
  }

   /**
   * event_response string
   * @return eventResponse
  **/
  @ApiModelProperty(value = "event_response string")
  public EventResponseEnum getEventResponse() {
    return eventResponse;
  }

  public void setEventResponse(EventResponseEnum eventResponse) {
    this.eventResponse = eventResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdCalendar200Ok getCharactersCharacterIdCalendar200Ok = (GetCharactersCharacterIdCalendar200Ok) o;
    return Objects.equals(this.eventId, getCharactersCharacterIdCalendar200Ok.eventId) &&
        Objects.equals(this.eventDate, getCharactersCharacterIdCalendar200Ok.eventDate) &&
        Objects.equals(this.title, getCharactersCharacterIdCalendar200Ok.title) &&
        Objects.equals(this.importance, getCharactersCharacterIdCalendar200Ok.importance) &&
        Objects.equals(this.eventResponse, getCharactersCharacterIdCalendar200Ok.eventResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDate, title, importance, eventResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdCalendar200Ok {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
    sb.append("    eventResponse: ").append(toIndentedString(eventResponse)).append("\n");
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

