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
import com.github.jonahwh.tesla_api_client.model.DestinationCharger;
import com.github.jonahwh.tesla_api_client.model.Supercharger;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * NearbyChargerResponseResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-07T18:40:25.601-07:00")
public class NearbyChargerResponseResponse {
  @SerializedName("congestion_sync_time_utc_secs")
  private BigDecimal congestionSyncTimeUtcSecs = null;

  @SerializedName("destination_charging")
  private List<DestinationCharger> destinationCharging = null;

  @SerializedName("superchargers")
  private List<Supercharger> superchargers = null;

  public NearbyChargerResponseResponse congestionSyncTimeUtcSecs(BigDecimal congestionSyncTimeUtcSecs) {
    this.congestionSyncTimeUtcSecs = congestionSyncTimeUtcSecs;
    return this;
  }

   /**
   * Get congestionSyncTimeUtcSecs
   * @return congestionSyncTimeUtcSecs
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCongestionSyncTimeUtcSecs() {
    return congestionSyncTimeUtcSecs;
  }

  public void setCongestionSyncTimeUtcSecs(BigDecimal congestionSyncTimeUtcSecs) {
    this.congestionSyncTimeUtcSecs = congestionSyncTimeUtcSecs;
  }

  public NearbyChargerResponseResponse destinationCharging(List<DestinationCharger> destinationCharging) {
    this.destinationCharging = destinationCharging;
    return this;
  }

  public NearbyChargerResponseResponse addDestinationChargingItem(DestinationCharger destinationChargingItem) {
    if (this.destinationCharging == null) {
      this.destinationCharging = new ArrayList<DestinationCharger>();
    }
    this.destinationCharging.add(destinationChargingItem);
    return this;
  }

   /**
   * Get destinationCharging
   * @return destinationCharging
  **/
  @ApiModelProperty(value = "")
  public List<DestinationCharger> getDestinationCharging() {
    return destinationCharging;
  }

  public void setDestinationCharging(List<DestinationCharger> destinationCharging) {
    this.destinationCharging = destinationCharging;
  }

  public NearbyChargerResponseResponse superchargers(List<Supercharger> superchargers) {
    this.superchargers = superchargers;
    return this;
  }

  public NearbyChargerResponseResponse addSuperchargersItem(Supercharger superchargersItem) {
    if (this.superchargers == null) {
      this.superchargers = new ArrayList<Supercharger>();
    }
    this.superchargers.add(superchargersItem);
    return this;
  }

   /**
   * Get superchargers
   * @return superchargers
  **/
  @ApiModelProperty(value = "")
  public List<Supercharger> getSuperchargers() {
    return superchargers;
  }

  public void setSuperchargers(List<Supercharger> superchargers) {
    this.superchargers = superchargers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearbyChargerResponseResponse nearbyChargerResponseResponse = (NearbyChargerResponseResponse) o;
    return Objects.equals(this.congestionSyncTimeUtcSecs, nearbyChargerResponseResponse.congestionSyncTimeUtcSecs) &&
        Objects.equals(this.destinationCharging, nearbyChargerResponseResponse.destinationCharging) &&
        Objects.equals(this.superchargers, nearbyChargerResponseResponse.superchargers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(congestionSyncTimeUtcSecs, destinationCharging, superchargers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearbyChargerResponseResponse {\n");
    
    sb.append("    congestionSyncTimeUtcSecs: ").append(toIndentedString(congestionSyncTimeUtcSecs)).append("\n");
    sb.append("    destinationCharging: ").append(toIndentedString(destinationCharging)).append("\n");
    sb.append("    superchargers: ").append(toIndentedString(superchargers)).append("\n");
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

