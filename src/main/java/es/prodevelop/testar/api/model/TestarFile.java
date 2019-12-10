package es.prodevelop.testar.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TestarFile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-06T15:38:51.885Z")

public class TestarFile   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("content")
  private String content = null;

  public TestarFile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the file
   * @return name
  **/
  @ApiModelProperty(example = "sequence1.log", value = "Name of the file")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestarFile content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestarFile testarFile = (TestarFile) o;
    return Objects.equals(this.name, testarFile.name) &&
        Objects.equals(this.content, testarFile.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestarFile {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

