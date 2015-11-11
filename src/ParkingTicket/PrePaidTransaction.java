package ParkingTicket;

public class PrePaidTransaction {

	private boolean prepaid;
	private ParkingTicket ticket;

	public PrePaidTransaction(ParkingTicket ticket) {
		this.ticket = ticket;
		if (this.ticket.getPrePaidTicket() == true) {
			System.out.println("User has Prepaid.");
			this.prepaid = true;
		} else {

			System.out.println("User has not Prepaid. Please insert credit card.");
			this.prepaid = false;
		}

	}

	public boolean getIsItPrepaid() {

		return this.prepaid;
	}

}
