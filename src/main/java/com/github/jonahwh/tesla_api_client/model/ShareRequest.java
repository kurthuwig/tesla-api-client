/*
 * Tesla Model S JSON API
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.jonahwh.tesla_api_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.jonahwh.tesla_api_client.model.ShareRequestValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ShareRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-25T22:27:26.641-07:00")
public class ShareRequest {
  @SerializedName("type")
  private String type = "share_ext_content_raw";

  @SerializedName("value")
  private ShareRequestValue value = null;

  public ShareRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Change to \&quot;share_dest_content_coords\&quot; if using lat/long
   * @return type
  **/
  @ApiModelProperty(example = "share_ext_content_raw", value = "Change to \"share_dest_content_coords\" if using lat/long")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ShareRequest value(ShareRequestValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public ShareRequestValue getValue() {
    return value;
  }

  public void setValue(ShareRequestValue value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareRequest shareRequest = (ShareRequest) o;
    return Objects.equals(this.type, shareRequest.type) &&
        Objects.equals(this.value, shareRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

