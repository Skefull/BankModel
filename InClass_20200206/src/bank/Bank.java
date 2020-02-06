package bank;

/***
 * Model a bank corporation like Fifth-Third
 * 
 * @author kelly2rb
 *
 */
public class Bank {
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String toString() {
		return "Company Name: " + companyName;
	}
}
