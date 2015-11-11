package ParkingTicket;

import java.util.Random;

public class Payment {
	private String cardnumber;
	private int month, year;

	public void setCreditCardNumber() {

		String numeric = "0123456789";

		StringBuilder sb = new StringBuilder();
		Random r = new Random();

		for (int i = 0; i < 16; i++)
			sb.append(numeric.charAt(r.nextInt(numeric.length())));

		this.cardnumber = sb.toString();
	}

	public String getCardNumber() {

		return cardnumber;
	}

	public void CardExpiryDate() {
		Random r = new Random();
		this.month = r.nextInt(12);
		this.year = 14 + r.nextInt(30);
	}

	public int getExpiryMonth() {

		return month;
	}

	public int getExpiryYear() {

		return year;
	}
}
