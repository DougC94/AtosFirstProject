package ParkingTicket;

public class ParkingTicket {

	private String regno;
	private int hours, mins, hours2, mins2;
	private boolean prepaid;

	public void parkingTicket(String regno, int hours, int hours2, int mins, int mins2, boolean prepaid) {
		this.regno = regno;
		this.hours = hours;
		this.mins = mins;
		this.hours2 = hours2;
		this.mins2 = mins2;
		this.prepaid = prepaid;

	}

	public String registrationNumber() {

		return regno;
	}

	public int arrivalTime() {

		return hours;
	}

	public int arrivalMinutes() {

		return mins;
	}

	public boolean prePaidTicket() {

		return prepaid;
	}

	public int latestLeaveHour() {
		return hours2;
	}

	public int latestLeaveMin() {
		return mins2;
	}

}
