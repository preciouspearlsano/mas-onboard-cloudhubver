package mas.onboard.dto;

import java.util.List;



/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */

public class Onboard {
	/**
	 * @return the submissionId
	 */
	public String getSubmissionId() {
		return submissionId;
	}
	/**
	 * @param submissionId the submissionId to set
	 */
	public void setSubmissionId(String submissionId) {
		this.submissionId = submissionId;
	}
	/**
	 * @return the officerAcctId
	 */
	public String getOfficerAcctId() {
		return officerAcctId;
	}
	/**
	 * @param officerAcctId the officerAcctId to set
	 */
	public void setOfficerAcctId(String officerAcctId) {
		this.officerAcctId = officerAcctId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the submissionDate
	 */
	public String getSubmissionDate() {
		return submissionDate;
	}
	/**
	 * @param submissionDate the submissionDate to set
	 */
	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}
	/**
	 * @return the docs
	 */
	public List<Doc> getDocs() {
		return docs;
	}
	/**
	 * @param docs the docs to set
	 */
	public void setDocs(List<Doc> docs) {
		this.docs = docs;
	}
	private String submissionId;
	private String officerAcctId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String status;
	private String submissionDate;
	private List<Doc> docs;
}
