package ParkingTicket;

public class Payment {
	private int cardnumber;
	private int month, year;

	public void CreditCardNumber(int cardnumber) {

		this.cardnumber = cardnumber;
		;
	}

	public int getCardNumber() {

		return cardnumber;
	}

	public void CardExpiryDate(int month, int year) {

		this.month = month;
		this.year = year;
	}

	public int getExpiryMonth() {

		return month;
	}

	public int getExpiryYear() {

		return year;
	}
}
