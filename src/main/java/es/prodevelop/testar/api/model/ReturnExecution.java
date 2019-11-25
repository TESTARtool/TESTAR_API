package es.prodevelop.testar.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReturnExecution
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-05T15:16:04.078Z")

public class ReturnExecution   {
  @JsonProperty("message")
  private String message = null;

  @JsonProperty("sequences")
  @Valid
  private List<String> sequences = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  public ReturnExecution message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "replay mode on, create sequence1 ...", value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ReturnExecution sequences(List<String> sequences) {
    this.sequences = sequences;
    return this;
  }

  public ReturnExecution addSequencesItem(String sequencesItem) {
    if (this.sequences == null) {
      this.sequences = new ArrayList<String>();
    }
    this.sequences.add(sequencesItem);
    return this;
  }

  /**
   * Get sequences
   * @return sequences
  **/
  @ApiModelProperty(value = "")


  public List<String> getSequences() {
    return sequences;
  }

  public void setSequences(List<String> sequences) {
    this.sequences = sequences;
  }

  public ReturnExecution startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "2018-11-27T09:12:33.001Z", value = "")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ReturnExecution endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "2018-11-27T09:12:55.027Z", value = "")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnExecution returnExecution = (ReturnExecution) o;
    return Objects.equals(this.message, returnExecution.message) &&
        Objects.equals(this.sequences, returnExecution.sequences) &&
        Objects.equals(this.startDate, returnExecution.startDate) &&
        Objects.equals(this.endDate, returnExecution.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, sequences, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnExecution {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

