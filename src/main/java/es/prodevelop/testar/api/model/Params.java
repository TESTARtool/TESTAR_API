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
 * Params
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-05T15:16:04.078Z")

public class Params   {
  @JsonProperty("see")
  private String see = null;

  @JsonProperty("mode")
  private String mode = null;

  @JsonProperty("sequences")
  private Integer sequences = null;

  @JsonProperty("sequenceLength")
  private Integer sequenceLength = null;

  @JsonProperty("sequenceFileName")
  private String sequenceFileName = null;

  @JsonProperty("testCaseName")
  private String testCaseName = null;

  @JsonProperty("suspiciousTitles")
  private String suspiciousTitles = null;

  public Params see(String see) {
    this.see = see;
    return this;
  }

  /**
   * Indicates to TESTAR the protocol to be executed
   * @return see
  **/
  @ApiModelProperty(example = "web_generic", value = "Indicates to TESTAR the protocol to be executed")


  public String getSee() {
    return see;
  }

  public void setSee(String see) {
    this.see = see;
  }

  public Params mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Execution mode in TESTAR (Spy, Generate, GenerateManual, Replay)
   * @return mode
  **/
  @ApiModelProperty(example = "Replay", required = true, value = "Execution mode in TESTAR (Spy, Generate, GenerateManual, Replay)")
  @NotNull


  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public Params sequences(Integer sequences) {
    this.sequences = sequences;
    return this;
  }

  /**
   * Number of sequences to generate
   * @return sequences
  **/
  @ApiModelProperty(example = "5", value = "Number of sequences to generate")


  public Integer getSequences() {
    return sequences;
  }

  public void setSequences(Integer sequences) {
    this.sequences = sequences;
  }

  public Params sequenceLength(Integer sequenceLength) {
    this.sequenceLength = sequenceLength;
    return this;
  }

  /**
   * Number of actions to generate on each sequence
   * @return sequenceLength
  **/
  @ApiModelProperty(example = "50", value = "Number of actions to generate on each sequence")


  public Integer getSequenceLength() {
    return sequenceLength;
  }

  public void setSequenceLength(Integer sequenceLength) {
    this.sequenceLength = sequenceLength;
  }

  public Params sequenceFileName(String sequenceFileName) {
    this.sequenceFileName = sequenceFileName;
    return this;
  }

  /**
   * In case of using RELAY mode filename of the sequence
   * @return sequenceFileName
  **/
  @ApiModelProperty(example = "sequence-testapp", value = "In case of using RELAY mode filename of the sequence")


  public String getSequenceFileName() {
    return sequenceFileName;
  }

  public void setSequenceFileName(String sequenceFileName) {
    this.sequenceFileName = sequenceFileName;
  }

  public Params testCaseName(String testCaseName) {
    this.testCaseName = testCaseName;
    return this;
  }

  /**
   * Name of the testcase to be inserted in internal TESTAR logs for further analysis
   * @return testCaseName
  **/
  @ApiModelProperty(example = "Anp-publicDomain", required = true, value = "Name of the testcase to be inserted in internal TESTAR logs for further analysis")
  @NotNull


  public String getTestCaseName() {
    return testCaseName;
  }

  public void setTestCaseName(String testCaseName) {
    this.testCaseName = testCaseName;
  }

  public Params suspiciousTitles(String suspiciousTitles) {
    this.suspiciousTitles = suspiciousTitles;
    return this;
  }

  /**
   * Indicate the suspicious Strings that TESTAR should look for in the interface
   * @return suspiciousTitles
  **/
  @ApiModelProperty(example = ".*[eE]rror.*|.*[eE]xception.*|.*[wW]arning.*", value = "Indicate the suspicious Strings that TESTAR should look for in the interface")


  public String getSuspiciousTitles() {
    return suspiciousTitles;
  }

  public void setSuspiciousTitles(String suspiciousTitles) {
    this.suspiciousTitles = suspiciousTitles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Params params = (Params) o;
    return Objects.equals(this.see, params.see) &&
        Objects.equals(this.mode, params.mode) &&
        Objects.equals(this.sequences, params.sequences) &&
        Objects.equals(this.sequenceLength, params.sequenceLength) &&
        Objects.equals(this.sequenceFileName, params.sequenceFileName) &&
        Objects.equals(this.testCaseName, params.testCaseName) &&
        Objects.equals(this.suspiciousTitles, params.suspiciousTitles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(see, mode, sequences, sequenceLength, sequenceFileName, testCaseName, suspiciousTitles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Params {\n");
    
    sb.append("    see: ").append(toIndentedString(see)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
    sb.append("    sequenceLength: ").append(toIndentedString(sequenceLength)).append("\n");
    sb.append("    sequenceFileName: ").append(toIndentedString(sequenceFileName)).append("\n");
    sb.append("    testCaseName: ").append(toIndentedString(testCaseName)).append("\n");
    sb.append("    suspiciousTitles: ").append(toIndentedString(suspiciousTitles)).append("\n");
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

