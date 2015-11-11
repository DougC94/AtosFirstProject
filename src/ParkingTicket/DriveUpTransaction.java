package ParkingTicket;

public class DriveUpTransaction {

	private double weekprice, weekendprice;
	private ParkingTicket ticket;

	public DriveUpTransaction(ParkingTicket ticket) {
		this.ticket = ticket;
	}

	public void setWeekParking() {

		if (this.ticket.getLengthofStayHours() == 1) {
			this.weekprice = 4.70;
		} else if (this.ticket.getLengthofStayHours() == 2) {
			this.weekprice = 7.40;
		} else if (this.ticket.getLengthofStayHours() > 2 && this.ticket.getLengthofStayHours() <= 4) {
			this.weekprice = 10.30;
		} else if (this.ticket.getLengthofStayHours() > 4 && this.ticket.getLengthofStayHours() <= 6) {
			this.weekprice = 14.80;
		} else if (this.ticket.getLengthofStayHours() > 6 && this.ticket.getLengthofStayHours() <= 9) {
			this.weekprice = 17.80;
		} else if (this.ticket.getLengthofStayHours() > 9 && this.ticket.getLengthofStayHours() <= 12) {
			this.weekprice = 20.20;
		} else if (this.ticket.getLengthofStayHours() > 12 && this.ticket.getLengthofStayHours() <= 24) {
			this.weekprice = 23.70;
		}

	}

	public double getWeekPrice() {
		return weekprice;
	}

	public void setWeekendParking() {

		if (this.ticket.getLengthofStayHours() == 1) {
			this.weekprice = 3.70;
		} else if (this.ticket.getLengthofStayHours() == 2) {
			this.weekprice = 6.40;
		} else if (this.ticket.getLengthofStayHours() > 2 && this.ticket.getLengthofStayHours() <= 4) {
			this.weekprice = 9.30;
		} else if (this.ticket.getLengthofStayHours() > 4 && this.ticket.getLengthofStayHours() <= 6) {
			this.weekprice = 13.80;
		} else if (this.ticket.getLengthofStayHours() > 6 && this.ticket.getLengthofStayHours() <= 9) {
			this.weekprice = 16.80;
		} else if (this.ticket.getLengthofStayHours() > 9 && this.ticket.getLengthofStayHours() <= 12) {
			this.weekprice = 18.20;
		} else if (this.ticket.getLengthofStayHours() > 12 && this.ticket.getLengthofStayHours() <= 24) {
			this.weekprice = 21.70;

		}
	}

	public double getWeekendPrice() {
		return weekendprice;

	}

}
