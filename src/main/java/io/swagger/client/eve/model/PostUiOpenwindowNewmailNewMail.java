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
import java.util.ArrayList;
import java.util.List;

/**
 * new_mail object
 */
@ApiModel(description = "new_mail object")

public class PostUiOpenwindowNewmailNewMail {
  @SerializedName("subject")
  private String subject = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("recipients")
  private List<Integer> recipients = new ArrayList<Integer>();

  @SerializedName("to_mailing_list_id")
  private Integer toMailingListId = null;

  @SerializedName("to_corp_or_alliance_id")
  private Integer toCorpOrAllianceId = null;

  public PostUiOpenwindowNewmailNewMail subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * subject string
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "subject string")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public PostUiOpenwindowNewmailNewMail body(String body) {
    this.body = body;
    return this;
  }

   /**
   * body string
   * @return body
  **/
  @ApiModelProperty(required = true, value = "body string")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public PostUiOpenwindowNewmailNewMail recipients(List<Integer> recipients) {
    this.recipients = recipients;
    return this;
  }

  public PostUiOpenwindowNewmailNewMail addRecipientsItem(Integer recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * recipients array
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "recipients array")
  public List<Integer> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Integer> recipients) {
    this.recipients = recipients;
  }

  public PostUiOpenwindowNewmailNewMail toMailingListId(Integer toMailingListId) {
    this.toMailingListId = toMailingListId;
    return this;
  }

   /**
   * Corporations, alliances and mailing lists are all types of mailing groups. You may only send to one mailing group, at a time, so you may fill out either this field or the to_corp_or_alliance_ids field
   * @return toMailingListId
  **/
  @ApiModelProperty(value = "Corporations, alliances and mailing lists are all types of mailing groups. You may only send to one mailing group, at a time, so you may fill out either this field or the to_corp_or_alliance_ids field")
  public Integer getToMailingListId() {
    return toMailingListId;
  }

  public void setToMailingListId(Integer toMailingListId) {
    this.toMailingListId = toMailingListId;
  }

  public PostUiOpenwindowNewmailNewMail toCorpOrAllianceId(Integer toCorpOrAllianceId) {
    this.toCorpOrAllianceId = toCorpOrAllianceId;
    return this;
  }

   /**
   * to_corp_or_alliance_id integer
   * @return toCorpOrAllianceId
  **/
  @ApiModelProperty(value = "to_corp_or_alliance_id integer")
  public Integer getToCorpOrAllianceId() {
    return toCorpOrAllianceId;
  }

  public void setToCorpOrAllianceId(Integer toCorpOrAllianceId) {
    this.toCorpOrAllianceId = toCorpOrAllianceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUiOpenwindowNewmailNewMail postUiOpenwindowNewmailNewMail = (PostUiOpenwindowNewmailNewMail) o;
    return Objects.equals(this.subject, postUiOpenwindowNewmailNewMail.subject) &&
        Objects.equals(this.body, postUiOpenwindowNewmailNewMail.body) &&
        Objects.equals(this.recipients, postUiOpenwindowNewmailNewMail.recipients) &&
        Objects.equals(this.toMailingListId, postUiOpenwindowNewmailNewMail.toMailingListId) &&
        Objects.equals(this.toCorpOrAllianceId, postUiOpenwindowNewmailNewMail.toCorpOrAllianceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, body, recipients, toMailingListId, toCorpOrAllianceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUiOpenwindowNewmailNewMail {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    toMailingListId: ").append(toIndentedString(toMailingListId)).append("\n");
    sb.append("    toCorpOrAllianceId: ").append(toIndentedString(toCorpOrAllianceId)).append("\n");
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

