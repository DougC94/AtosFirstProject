package ParkingTicket;

import java.util.Calendar;

public class Main {
	public static void main(String args[]) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(2015, 10, 20);

		if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
				&& calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {

		}

	}
}
