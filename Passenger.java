package bussystem;

public class Passenger {
	private String name;
	private long mobileNo;
	private String mailId;
	private int age;
	private char gender;
	
	public Passenger(String name, long mobileNo, String mailId, int age, char gender) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.mailId = mailId;
		this.age = age;
		this.gender = gender;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", mobileNo=" + mobileNo + ", mailId=" + mailId + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	

}
