package io.mosip.authentication.core.dto.indauth;

import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class give the info of individual with match strategy and match value.
 *
 * @author Rakesh Roshan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalIdentityDTO {

	/**
	 * msPri(Match Strategy)Valid value is “E” (Exact match) and “P” (Partial Match)
	 * in Primary language
	 */
	@Pattern(regexp="^([E|P])")
	private String msPri;

	/** Name of the Resident in the primary language */
	private String namePri;

	/** Name of the Resident in the Secondary language */
	private String nameSec;

	/**
	 * mtPri(Match Threshold or MatchValue) in Primary language. Valid value is 1 to
	 * 100 and it is used only when matching strategy (ms attribute) is “P” (Partial
	 * match).
	 */
	@Pattern(regexp = "^([0-9]?[1-9]$ | ^(100)$")
	private Integer mtPri;

	/**
	 * mtSec(Match Threshold or MatchValue) in Secondary or Local language. Valid
	 * value is 1 to 100 and it is used only when matching strategy (ms attribute)
	 * is “P” (Partial match).
	 */
	@Pattern(regexp = "^([0-9]?[1-9]$ | ^(100)$")
	private Integer mtSec;

	/** Gender acceptable values are M- Male, F-Female, T- Transgender */
	private String gender;

	/** Date of Birth of the individual. */
	private String dob;

	/** dobType */
	private String dobType; // TODO

	/** Age of the individual. Should be rounded to the nearest whole number. */
	private Integer age;

	/** phone */
	private String phone; // TODO

	/** Registered e-mail ID of the individual */
	@Pattern(regexp = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
	private String email;

}
