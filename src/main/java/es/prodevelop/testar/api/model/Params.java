package es.prodevelop.testar.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;

/**
 * Params
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-05T15:16:04.078Z")

public class Params   {
	@JsonProperty("sse")
	private String sse = null;

	@JsonProperty("mode")
	private String mode = null;

	@JsonProperty("SUTConnector")
	private String SUTConnector = null;

	@JsonProperty("SUTConnectorValue")
	private String SUTConnectorValue = null;

	@JsonProperty("sequences")
	private Integer sequences = null;

	@JsonProperty("sequenceLength")
	private Integer sequenceLength = null;

	@JsonProperty("suspiciousTitles")
	private String suspiciousTitles = null;

	@JsonProperty("clickFilter")
	private String clickFilter = null;

	@JsonProperty("showVisualSettingsDialogOnStartup")
	private String showVisualSettingsDialogOnStartup = null;

	@JsonProperty("sequenceFileName")
	private String sequenceFileName = null;

	@JsonProperty("testCaseName")
	private String testCaseName = null;

	/**
	 * Indicates to TESTAR the protocol to be executed
	 * @return sse
	 **/
	@ApiModelProperty(example = "web_generic", required = true, value = "Indicates to TESTAR the protocol to be executed")
	@NotNull

	public String getSse() {
		return sse;
	}

	public void setSse(String sse) {
		this.sse = sse;
	}

	public Params sse(String sse) {
		this.sse = sse;
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

	public Params mode(String mode) {
		this.mode = mode;
		return this;
	}

	/**
	 * How you want to connect to the SUT (COMMAND_LINE, SUT_WINDOW_TITLE, SUT_PROCESS_NAME, WEB_DRIVER)
	 * @return SUTConnector
	 */
	@ApiModelProperty(example = "COMMAND_LINE", required = true, value = "How you want to connect to the SUT (COMMAND_LINE, SUT_WINDOW_TITLE, SUT_PROCESS_NAME, WEB_DRIVER)")
	@NotNull

	public String getSUTConnector() {
		return SUTConnector;
	}

	public void setSUTConnector(String SUTConnector) {
		this.SUTConnector = SUTConnector;
	}

	public Params SUTConnector(String SUTConnector) {
		this.SUTConnector = SUTConnector;
		return this;
	}
	
	/**
	 * Indicate the location of the SUT
	 * @return SUTConnectorValue
	 */
	@ApiModelProperty(example = "c:\\windows\\system32\\notepad.exe", required = true, value = "How you want to connect to the SUT (COMMAND_LINE, SUT_WINDOW_TITLE, SUT_PROCESS_NAME, WEB_DRIVER)")
	@NotNull

	public String getSUTConnectorValue() {
		return SUTConnectorValue;
	}

	public void setSUTConnectorValue(String SUTConnectorValue) {
		this.SUTConnectorValue = SUTConnectorValue;
	}
	
	public Params SUTConnectorValue(String SUTConnectorValue) {
		this.SUTConnectorValue = SUTConnectorValue;
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

	public Params sequences(Integer sequences) {
		this.sequences = sequences;
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

	public Params sequenceLength(Integer sequenceLength) {
		this.sequenceLength = sequenceLength;
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

	public Params suspiciousTitles(String suspiciousTitles) {
		this.suspiciousTitles = suspiciousTitles;
		return this;
	}
	
	/**
	 * Regular expression to filter non desired widgets
	 * @return ClickFilter
	 */
	@ApiModelProperty(example = ".*[cC]lose.*|.*[sS]alir.*|.*[eE]xit.*|.*[mM]inimizar.*|.*[mM]inimi[zs]e.*", value = "Regular expression to filter non desired widgets")
	
	public String getClickFilter() {
		return clickFilter;
	}

	public void setClickFilter(String clickFilter) {
		this.clickFilter = clickFilter;
	}
	
	public Params clickFilter(String clickFilter) {
		this.clickFilter = clickFilter;
		return this;
	}
	
	/**
	 * Enable or Disable TESTAR GUI
	 * @return ShowVisualSettingsDialogOnStartup
	 */
	@ApiModelProperty(example = "false", required = true, value = "Enable or Disable TESTAR GUI")
	@NotNull
	
	public String getShowVisualSettingsDialogOnStartup() {
		return showVisualSettingsDialogOnStartup;
	}

	public void setShowVisualSettingsDialogOnStartup(String showVisualSettingsDialogOnStartup) {
		this.showVisualSettingsDialogOnStartup = showVisualSettingsDialogOnStartup;
	}
	
	public Params showVisualSettingsDialogOnStartup(String showVisualSettingsDialogOnStartup) {
		this.showVisualSettingsDialogOnStartup = showVisualSettingsDialogOnStartup;
		return this;
	}

	/**
	 * In case of using REPLAY mode filename of the sequence
	 * @return sequenceFileName
	 **/
	@ApiModelProperty(example = "sequence-testapp", value = "In case of using REPLAY mode filename of the sequence")

	public String getSequenceFileName() {
		return sequenceFileName;
	}

	public void setSequenceFileName(String sequenceFileName) {
		this.sequenceFileName = sequenceFileName;
	}

	public Params sequenceFileName(String sequenceFileName) {
		this.sequenceFileName = sequenceFileName;
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

	public Params testCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
		return this;
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
		return Objects.equals(this.sse, params.sse) &&
				Objects.equals(this.mode, params.mode) &&
				Objects.equals(this.SUTConnector, params.SUTConnector) &&
				Objects.equals(this.SUTConnectorValue, params.SUTConnectorValue) &&
				Objects.equals(this.sequences, params.sequences) &&
				Objects.equals(this.sequenceLength, params.sequenceLength) &&
				Objects.equals(this.suspiciousTitles, params.suspiciousTitles) &&
				Objects.equals(this.clickFilter, params.clickFilter) &&
				Objects.equals(this.showVisualSettingsDialogOnStartup, params.showVisualSettingsDialogOnStartup) &&
				Objects.equals(this.sequenceFileName, params.sequenceFileName) &&
				Objects.equals(this.testCaseName, params.testCaseName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sse, mode, SUTConnector, SUTConnectorValue, sequences, sequenceLength, suspiciousTitles, clickFilter, showVisualSettingsDialogOnStartup, sequenceFileName, testCaseName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Params {\n");

		sb.append("    sse: ").append(toIndentedString(sse)).append("\n");
		sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
		sb.append("    SUTConnector: ").append(toIndentedString(SUTConnector)).append("\n");
		sb.append("    SUTConnectorValue: ").append(toIndentedString(SUTConnectorValue)).append("\n");
		sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
		sb.append("    sequenceLength: ").append(toIndentedString(sequenceLength)).append("\n");
		sb.append("    suspiciousTitles: ").append(toIndentedString(suspiciousTitles)).append("\n");
		sb.append("    clickFilter: ").append(toIndentedString(clickFilter)).append("\n");
		sb.append("    showVisualSettingsDialogOnStartup: ").append(toIndentedString(showVisualSettingsDialogOnStartup)).append("\n");
		sb.append("    sequenceFileName: ").append(toIndentedString(sequenceFileName)).append("\n");
		sb.append("    testCaseName: ").append(toIndentedString(testCaseName)).append("\n");
		
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

