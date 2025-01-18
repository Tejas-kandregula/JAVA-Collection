package packagebank;

public class Account {
	private String name;
	private long mobileNo;
	private String mailId;
	private String branch;
	private double balance;
	
	public Account(String name, long mobileNo, String mailId, String branch,double balance) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.mailId = mailId;
		this.branch = branch;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account details are name=" + name + ", mobileNo=" + mobileNo + ", mailId=" + mailId + ", balance = " + balance+ " ,branch=" + branch +"." ;
	}
	
}

