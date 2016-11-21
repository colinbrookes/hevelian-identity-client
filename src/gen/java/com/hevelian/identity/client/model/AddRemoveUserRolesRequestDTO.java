/**
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.hevelian.identity.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * AddRemoveUserRolesRequestDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-21T06:58:56.984+01:00")
public class AddRemoveUserRolesRequestDTO   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("newRoles")
  private List<String> newRoles = new ArrayList<String>();

  @SerializedName("removedRoles")
  private List<String> removedRoles = new ArrayList<String>();

  public AddRemoveUserRolesRequestDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddRemoveUserRolesRequestDTO newRoles(List<String> newRoles) {
    this.newRoles = newRoles;
    return this;
  }

  public AddRemoveUserRolesRequestDTO addNewRolesItem(String newRolesItem) {
    this.newRoles.add(newRolesItem);
    return this;
  }

   /**
   * Get newRoles
   * @return newRoles
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getNewRoles() {
    return newRoles;
  }

  public void setNewRoles(List<String> newRoles) {
    this.newRoles = newRoles;
  }

  public AddRemoveUserRolesRequestDTO removedRoles(List<String> removedRoles) {
    this.removedRoles = removedRoles;
    return this;
  }

  public AddRemoveUserRolesRequestDTO addRemovedRolesItem(String removedRolesItem) {
    this.removedRoles.add(removedRolesItem);
    return this;
  }

   /**
   * Get removedRoles
   * @return removedRoles
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getRemovedRoles() {
    return removedRoles;
  }

  public void setRemovedRoles(List<String> removedRoles) {
    this.removedRoles = removedRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRemoveUserRolesRequestDTO addRemoveUserRolesRequestDTO = (AddRemoveUserRolesRequestDTO) o;
    return Objects.equals(this.name, addRemoveUserRolesRequestDTO.name) &&
        Objects.equals(this.newRoles, addRemoveUserRolesRequestDTO.newRoles) &&
        Objects.equals(this.removedRoles, addRemoveUserRolesRequestDTO.removedRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newRoles, removedRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRemoveUserRolesRequestDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newRoles: ").append(toIndentedString(newRoles)).append("\n");
    sb.append("    removedRoles: ").append(toIndentedString(removedRoles)).append("\n");
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

