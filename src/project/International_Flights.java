package project;

public class International_Flights {
	
	//Following are the variables of International flights class
	private String From_City;
	private String To_City;
	private String Duration_Time;
	private String Date;
	private String Economy_Seat;
	private String Bussiness_Seat;
	
	//Creating parameterized constructor of International flights class
	public International_Flights(String from_City, String to_City, String duration_Time, String date,
			 String economy_Seat, String bussiness_Seat) {
		From_City = from_City;
		To_City = to_City;
		Duration_Time=duration_Time;
		Date = date;
		this.Economy_Seat = economy_Seat;
		this.Bussiness_Seat = bussiness_Seat;
	}
	public String getFrom_City() {
		return From_City;
	}
	public void setFrom_City(String from_City) {
		From_City = from_City;
	}
	public String getTo_City() {
		return To_City;
	}
	public void setTo_City(String to_City) {
		To_City = to_City;
	}
	public String getDuration_Time() {
		return Duration_Time;
	}
	public void setDuration_Time(String duration_Time) {
		Duration_Time = duration_Time;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getEconomy_Seat() {
		return Economy_Seat;
	}
	public void setEconomy_Seat(String economy_Seat) {
		Economy_Seat = economy_Seat;
	}
	public String getBussiness_Seat() {
		return Bussiness_Seat;
	}
	public void setBussiness_Seat(String bussiness_Seat) {
		Bussiness_Seat = bussiness_Seat;
	}
		
}



