package mas.onboard.dto;

import java.util.List;


/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */

public class StatusRequest {
	private String officerAcctId;
	private List<Onboard> onboards;
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
	 * @return the onboards
	 */
	public List<Onboard> getOnboards() {
		return onboards;
	}
	/**
	 * @param onboards the onboards to set
	 */
	public void setOnboards(List<Onboard> onboards) {
		this.onboards = onboards;
	}
}
