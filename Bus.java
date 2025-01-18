package bussystem;

public class Bus {
	private String company;
	private String source;
	private String destination;
	private String type;
	private int cost;
	private String serviceNo;
	
	public Bus(String company, String source, String destination, String type, int cost, String serviceNo) 
	{
		super();
		this.company = company;
		this.source = source;
		this.destination = destination;
		this.type = type;
		this.cost = cost;
		this.serviceNo = serviceNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCompany() {
		return company;
	}

	public String getType() {
		return type;
	}

	public int getCost() {
		return cost;
	}

	public String getServiceNo() {
		return serviceNo;
	}

	@Override
	public String toString() {
		return "Bus from company=" + company + ",will be start at source=" + source + ",and arrives at a destination=" + destination + ", type of bus service=" + type
				+ ",and the cost of the ticket is=" + cost + ",the serviceNo=" + serviceNo + "";
	}
	

}
