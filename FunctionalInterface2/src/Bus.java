
public class Bus {
	private int bid;
	private String travelName;
	private String passName;
	private int seats;
	private double amount;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int bid, String travelName, String passName, int seats, double amount) {
		super();
		this.bid = bid;
		this.travelName = travelName;
		this.passName = passName;
		this.seats = seats;
		this.amount = amount;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTravelName() {
		return travelName;
	}
	public void setTravelName(String travelName) {
		this.travelName = travelName;
	}
	public String getPassName() {
		return passName;
	}
	public void setPassName(String passName) {
		this.passName = passName;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Bus [bid=" + bid + ", travelName=" + travelName + ", passName=" + passName + ", seats=" + seats
				+ ", amount=" + amount + "]";
	}
	
}
