/*
 * Influx OSS API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

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
 * ShardOwner
 */

public class ShardOwner {
  public static final String SERIALIZED_NAME_NODE_I_D = "nodeID";
  @SerializedName(SERIALIZED_NAME_NODE_I_D)
  private Long nodeID;

  public ShardOwner nodeID(Long nodeID) {
    this.nodeID = nodeID;
    return this;
  }

   /**
   * ID of the node that owns a shard.
   * @return nodeID
  **/
  @ApiModelProperty(required = true, value = "ID of the node that owns a shard.")
  public Long getNodeID() {
    return nodeID;
  }

  public void setNodeID(Long nodeID) {
    this.nodeID = nodeID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShardOwner shardOwner = (ShardOwner) o;
    return Objects.equals(this.nodeID, shardOwner.nodeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShardOwner {\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
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
