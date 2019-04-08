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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VehicleStateMediaState
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-07T18:40:25.601-07:00")
public class VehicleStateMediaState {
  @SerializedName("remote_control_enabled")
  private Boolean remoteControlEnabled = null;

  public VehicleStateMediaState remoteControlEnabled(Boolean remoteControlEnabled) {
    this.remoteControlEnabled = remoteControlEnabled;
    return this;
  }

   /**
   * Get remoteControlEnabled
   * @return remoteControlEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isRemoteControlEnabled() {
    return remoteControlEnabled;
  }

  public void setRemoteControlEnabled(Boolean remoteControlEnabled) {
    this.remoteControlEnabled = remoteControlEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleStateMediaState vehicleStateMediaState = (VehicleStateMediaState) o;
    return Objects.equals(this.remoteControlEnabled, vehicleStateMediaState.remoteControlEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteControlEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleStateMediaState {\n");
    
    sb.append("    remoteControlEnabled: ").append(toIndentedString(remoteControlEnabled)).append("\n");
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

