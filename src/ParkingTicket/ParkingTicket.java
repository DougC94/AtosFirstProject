package ParkingTicket;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class ParkingTicket {

	private String regno;
	private int hours, mins, hours2, mins2, transactionnumber, hours3, mins3, hours4, mins4;
	private boolean prepaid;

	public void parkingTicket(int hours2, int mins2) {

		this.hours2 = hours2;
		this.mins2 = mins2;

	}

	public void setRegNumber() {
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numeric = "0123456789";

		StringBuilder sb = new StringBuilder();
		Random r = new Random();

		for (int i = 0; i < 2; i++)
			sb.append(alpha.charAt(r.nextInt(alpha.length())));
		for (int i = 0; i < 2; i++)
			sb.append(numeric.charAt(r.nextInt(numeric.length())));

		sb.append(" ");

		for (int i = 0; i < 3; i++)
			sb.append(alpha.charAt(r.nextInt(alpha.length())));

		this.regno = sb.toString();
	}

	public String getRegNumber() {

		return regno;
	}

	public void setArrivalHour() {
		DateFormat dateformat = new SimpleDateFormat();
		Calendar cal = Calendar.getInstance();
		this.hours = cal.HOUR_OF_DAY;
	}

	public int getArrivalHour() {
		return hours;
	}

	public void setArrivalMinutes() {
		DateFormat dateformat = new SimpleDateFormat();
		Calendar cal = Calendar.getInstance();
		this.mins = cal.MINUTE;

	}

	public int getArrivalMins() {
		return mins;
	}

	public void setPrePaidTicket() {

		this.prepaid = Math.random() < 1;
		if (Math.random() < 0.5) {
			this.prepaid = false;
		} else {
			this.prepaid = true;
		}
	}

	public boolean prePaidTicket() {

		return prepaid;
	}

	public void setLatestLeaveHour() {
		Random r = new Random();
		this.hours2 = r.nextInt(24);

	}

	public int getLatestLeaveHour() {
		return hours2;
	}

	public void setLatestLeaveMin() {
		Random r = new Random();
		this.mins2 = r.nextInt(59);
	}

	public int getLatestLeaveMins() {
		return mins2;
	}

	public void setTransactionNumber() {
		Random r = new Random();
		transactionnumber = r.nextInt(999);
	}

	public int getTransNumber() {

		return transactionnumber;
	}

	public void setLengthOfStayMins() {
		Random r = new Random();
		this.mins3 = r.nextInt(59);

	}

	public int getLengthOfStayMins() {
		return this.mins3;
	}

	public void setLengthOfStayHours() {
		Random r = new Random();
		hours3 = r.nextInt(24);
		if (this.mins3 > 0) {
			this.hours3++;
		}
	}

	public int getLengthofStayHours() {
		return hours3;
	}

	public void setLeaveTime() {

		this.hours4 = hours3 + hours;
		this.mins4 = mins3 + mins;
	}

	public int getLeaveHour() {
		return hours4;
	}

	public int getLeaveMins() {
		return mins4;
	}

	public String terminalDisplay() {

		return "Transaction " + transactionnumber + ", Registration " + regno + ", Length of stay " + hours3 + " hours "
				+ mins3 + " mins" + ", amount due £";
	}

}
