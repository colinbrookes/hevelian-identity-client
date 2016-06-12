package com.hevelian.identity.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-12T08:23:42.221+02:00")
public class PrimitiveResultboolean   {
  
  private Boolean result = null;

  
  /**
   **/
  public PrimitiveResultboolean result(Boolean result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("result")
  public Boolean getResult() {
    return result;
  }
  public void setResult(Boolean result) {
    this.result = result;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimitiveResultboolean primitiveResultboolean = (PrimitiveResultboolean) o;
    return Objects.equals(this.result, primitiveResultboolean.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimitiveResultboolean {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

