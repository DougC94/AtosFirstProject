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

		o.getIsItOverstayed();
		if (o.getIsItOverstayed() == true) {
			System.out.println("You have overstayed your pre-paid parking duration. You have been parked an extra"
					+ o.getOverstayedHours() + " hours and " + o.getOverstayedMins() + " minutes.");
			System.out.println("You are due £" + o.getOverstayedPrice() + ". Please insert a credit card.");

		} else {

			System.out.println("You have no overstayed charges. Have a good day and drive safely.");
		}

	}

}
