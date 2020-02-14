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

	@JsonProperty("sutConnector")
	private String sutConnector = null;

	@JsonProperty("sutConnectorValue")
	private String sutConnectorValue = null;

	@JsonProperty("sequences")
	private Integer sequences = null;

	@JsonProperty("sequenceLength")
	private Integer sequenceLength = null;

	@JsonProperty("suspiciousTitles")
	private String suspiciousTitles = null;

	@JsonProperty("clickFilter")
	private String clickFilter = null;

	@JsonProperty("sequenceFileName")
	private String sequenceFileName = null;

	@JsonProperty("applicationName")
	private String applicationName = null;

	@JsonProperty("applicationVersion")
	private String applicationVersion = null;

	@JsonProperty("loginUsername")
	private String loginUsername = null;

	@JsonProperty("loginPassword")
	private String loginPassword = null;

	@JsonProperty("topWidgetsState")
	private boolean topWidgetsState = true;

	/**
	 * Indicates to TESTAR the protocol to be executed
	 * @return sse
	 **/
	@ApiModelProperty(example = "desktop_generic", required = true, value = "Indicates to TESTAR the protocol to be executed")
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
	@ApiModelProperty(example = "Generate", required = true, value = "Execution mode in TESTAR (Spy, Generate, GenerateManual, Replay)")
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
	 * @return sutConnector
	 */
	@ApiModelProperty(example = "COMMAND_LINE", required = true, value = "How you want to connect to the SUT (COMMAND_LINE, SUT_WINDOW_TITLE, SUT_PROCESS_NAME, WEB_DRIVER)")
	@NotNull

	public String getSutConnector() {
		return sutConnector;
	}

	public void setSutConnector(String sutConnector) {
		this.sutConnector = sutConnector;
	}

	public Params sutConnector(String sutConnector) {
		this.sutConnector = sutConnector;
		return this;
	}

	/**
	 * Indicate the location of the SUT
	 * @return sutConnectorValue
	 */
	@ApiModelProperty(example = "c:\\windows\\system32\\notepad.exe", required = true, value = "How you want to connect to the SUT (COMMAND_LINE, SUT_WINDOW_TITLE, SUT_PROCESS_NAME, WEB_DRIVER)")
	@NotNull

	public String getSutConnectorValue() {
		return sutConnectorValue;
	}

	public void setSutConnectorValue(String sutConnectorValue) {
		this.sutConnectorValue = sutConnectorValue;
	}

	public Params sutConnectorValue(String sutConnectorValue) {
		this.sutConnectorValue = sutConnectorValue;
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
	 * In case of using REPLAY mode filename of the sequence
	 * @return sequenceFileName
	 **/
	@ApiModelProperty(example = "sequence-number", value = "In case of using REPLAY mode filename of the sequence")

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
	 * Name of the application run that we are executing
	 * @return applicationName
	 **/
	@ApiModelProperty(example = "Notepad", value = "Name of the application run that we are executing")
	@NotNull

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public Params applicationName(String applicationName) {
		this.applicationName = applicationName;
		return this;
	}

	/**
	 * Number of the version run that we are executing
	 * @return applicationVersion
	 **/
	@ApiModelProperty(example = "1.0.0", value = "Number of the version run that we are executing")
	@NotNull

	public String getApplicationVersion() {
		return applicationVersion;
	}

	public void setApplicationVersion(String applicationVersion) {
		this.applicationVersion = applicationVersion;
	}

	public Params applicationVersion(String applicationVersion) {
		this.applicationVersion = applicationVersion;
		return this;
	}

	/**
	 * Username credential to use in the beginSequence method of the protocol
	 * @return loginUsername
	 **/
	@ApiModelProperty(example = "username", value = "Username credential to use in the beginSequence method of the protocol")
	@NotNull

	public String getLoginUsername() {
		return loginUsername;
	}

	public void setLoginUsername(String loginUsername) {
		this.loginUsername = loginUsername;
	}

	public Params loginUsername(String loginUsername) {
		this.loginUsername = loginUsername;
		return this;
	}

	/**
	 * Password credential to use in the beginSequence method of the protocol
	 * @return loginPassword
	 **/
	@ApiModelProperty(example = "password", value = "Password credential to use in the beginSequence method of the protocol")
	@NotNull

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Params loginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
		return this;
	}

	/**
	 * Derive TESTAR Actions with the Top Widgets Of the State
	 * @return topWidgetsState
	 **/
	@ApiModelProperty(example = "true", value = "Derive TESTAR Actions with the Top Widgets Of the State")
	@NotNull

	public boolean getTopWidgetsState() {
		return topWidgetsState;
	}

	public void setTopWidgetsState(boolean topWidgetsState) {
		this.topWidgetsState = topWidgetsState;
	}

	public Params topWidgetsState(boolean topWidgetsState) {
		this.topWidgetsState = topWidgetsState;
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
				Objects.equals(this.sutConnector, params.sutConnector) &&
				Objects.equals(this.sutConnectorValue, params.sutConnectorValue) &&
				Objects.equals(this.sequences, params.sequences) &&
				Objects.equals(this.sequenceLength, params.sequenceLength) &&
				Objects.equals(this.suspiciousTitles, params.suspiciousTitles) &&
				Objects.equals(this.clickFilter, params.clickFilter) &&
				Objects.equals(this.sequenceFileName, params.sequenceFileName) &&
				Objects.equals(this.applicationName, params.applicationName) &&
				Objects.equals(this.applicationVersion, params.applicationVersion) &&
				Objects.equals(this.loginUsername, params.loginUsername) &&
				Objects.equals(this.loginPassword, params.loginPassword) &&
				Objects.equals(this.topWidgetsState, params.topWidgetsState);
	}

	@Override
	public int hashCode() {
		return Objects.hash(
				sse,
				mode,
				sutConnector,
				sutConnectorValue,
				sequences,
				sequenceLength,
				suspiciousTitles,
				clickFilter,
				sequenceFileName,
				applicationName,
				applicationVersion,
				loginUsername,
				loginPassword,
				topWidgetsState);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Params {\n");

		sb.append("    sse: ").append(toIndentedString(sse)).append("\n");
		sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
		sb.append("    sutConnector: ").append(toIndentedString(sutConnector)).append("\n");
		sb.append("    sutConnectorValue: ").append(toIndentedString(sutConnectorValue)).append("\n");
		sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
		sb.append("    sequenceLength: ").append(toIndentedString(sequenceLength)).append("\n");
		sb.append("    suspiciousTitles: ").append(toIndentedString(suspiciousTitles)).append("\n");
		sb.append("    clickFilter: ").append(toIndentedString(clickFilter)).append("\n");
		sb.append("    sequenceFileName: ").append(toIndentedString(sequenceFileName)).append("\n");
		sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
		sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
		sb.append("    loginUsername: ").append(toIndentedString(loginUsername)).append("\n");
		sb.append("    loginPassword: ").append(toIndentedString(loginPassword)).append("\n");
		sb.append("    topWidgetsState: ").append(toIndentedString(topWidgetsState)).append("\n");

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

