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
 * SetTempsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-08T14:31:36.738-07:00")
public class SetTempsRequest {
  @SerializedName("driver_temp")
  private Double driverTemp = null;

  @SerializedName("passenger_temp")
  private Double passengerTemp = null;

  public SetTempsRequest driverTemp(Double driverTemp) {
    this.driverTemp = driverTemp;
    return this;
  }

   /**
   * The desired temperature on the driver&#39;s side in celcius.
   * @return driverTemp
  **/
  @ApiModelProperty(value = "The desired temperature on the driver's side in celcius.")
  public Double getDriverTemp() {
    return driverTemp;
  }

  public void setDriverTemp(Double driverTemp) {
    this.driverTemp = driverTemp;
  }

  public SetTempsRequest passengerTemp(Double passengerTemp) {
    this.passengerTemp = passengerTemp;
    return this;
  }

   /**
   * The desired temperature on the passenger&#39;s side in celcius.
   * @return passengerTemp
  **/
  @ApiModelProperty(value = "The desired temperature on the passenger's side in celcius.")
  public Double getPassengerTemp() {
    return passengerTemp;
  }

  public void setPassengerTemp(Double passengerTemp) {
    this.passengerTemp = passengerTemp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetTempsRequest setTempsRequest = (SetTempsRequest) o;
    return Objects.equals(this.driverTemp, setTempsRequest.driverTemp) &&
        Objects.equals(this.passengerTemp, setTempsRequest.passengerTemp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverTemp, passengerTemp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetTempsRequest {\n");
    
    sb.append("    driverTemp: ").append(toIndentedString(driverTemp)).append("\n");
    sb.append("    passengerTemp: ").append(toIndentedString(passengerTemp)).append("\n");
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

