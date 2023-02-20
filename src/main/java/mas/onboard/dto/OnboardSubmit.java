package mas.onboard.dto;



/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */

public class OnboardSubmit {
	private String submissionId;
	private String status;
	private String submissionDate;
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
}
