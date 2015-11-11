package ParkingTicket;

import java.util.Calendar;

public class Main {
	public static void main(String args[]) {
		ParkingTicket p = new ParkingTicket();

		OverstayedPrePaid o = new OverstayedPrePaid();
		Payment c = new Payment();
		Calendar day = Calendar.getInstance();

		p.setRegNumber();
		p.setTransactionNumber();
		p.setLengthOfStayHours();
		p.setLengthOfStayMins();
		p.setPrePaidTicket();

		PrePaidTransaction t = new PrePaidTransaction(p);
		DriveUpTransaction d = new DriveUpTransaction(p);
		d.setWeekParking();
		d.setWeekendParking();

		if (day.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || day.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			System.out.println(p.terminalDisplay() + d.getWeekendPrice());
		} else {
			System.out.println(p.terminalDisplay() + d.getWeekPrice());
		}

	}

}
