package mas.onboard.dto;

import java.util.List;

import lombok.Data;

/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */
@Data
public class StatusRequestView {
	private List<Onboard> onboards;
	private int total;
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
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
}

