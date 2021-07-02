package flightsql;

public class Travels {
	private String name,age,flightName,from,to,startTime,endTime,price;
	
	

	public Travels(String name, String age, String flightName, String from, String to, String startTime, String endTime,
			String price) {
		super();
		this.name = name;
		this.age = age;
		this.flightName = flightName;
		this.from = from;
		this.to = to;
		this.startTime = startTime;
		this.endTime = endTime;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Journey [name=" + name + ", age=" + age + ", flightName=" + flightName + ", from=" + from + ", to=" + to
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", price=" + price + "]";
	}






	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public String getFlightName() {
		return flightName;
	}



	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}



	public String getFrom() {
		return from;
	}



	public void setFrom(String from) {
		this.from = from;
	}



	public String getTo() {
		return to;
	}



	public void setTo(String to) {
		this.to = to;
	}



	public String getStartTime() {
		return startTime;
	}



	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}



	public String getEndTime() {
		return endTime;
	}



	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}

	
	
}