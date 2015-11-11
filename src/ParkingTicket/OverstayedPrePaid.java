package ParkingTicket;

public class OverstayedPrePaid {

	private boolean overstayed;
	private double extraPrice;
	private int hours, mins;
	private ParkingTicket ticket;
	private PrePaidTransaction prepaid;

	public void setIsItOverstayed(ParkingTicket ticket) {

		this.ticket = ticket;

		if ((this.ticket.getLeaveHour() > this.ticket.getLatestLeaveHour())
				|| (this.ticket.getLeaveHour() == this.ticket.getLatestLeaveHour())
						&& (this.ticket.getLeaveMins() > this.ticket.getLatestLeaveMins())) {

			this.overstayed = true;
		} else {
			this.overstayed = false;
		}
	}

	public boolean getIsItOverstayed() {
		return overstayed;
	}

	public void setOverstayedTime(ParkingTicket ticket) {

		this.ticket = ticket;

		this.hours = this.ticket.getLeaveHour() - this.ticket.getLatestLeaveHour();
		this.mins = this.ticket.getLeaveMins() - this.ticket.getLatestLeaveMins();

		if (this.mins > 0) {
			this.hours++;
		}

	}

	public int getOverstayedHours() {
		return hours;
	}

	public int getOverstayedMins() {
		return mins;

	}

	public void setOverstayedPriceNotPrePaid(PrePaidTransaction prepaid) {
		this.prepaid = prepaid;

		if (this.prepaid.getIsItPrepaid() == false) {
			if (this.overstayed = true) {
				if (this.hours == 1) {
					this.extraPrice = 4.70;
				} else if (this.hours == 2) {
					this.extraPrice = 7.40;
				} else if (this.hours == 4) {
					this.extraPrice = 10.30;
				} else if (this.hours == 6) {
					this.extraPrice = 14.80;
				} else if (this.hours == 9) {
					this.extraPrice = 17.80;
				} else if (this.hours == 12) {
					this.extraPrice = 20.20;
				} else if (this.hours == 24) {
					this.extraPrice = 23.70;
				}

			}
		}
	}

	public void setOverstayedPricePrePaid() {

		if (this.prepaid.getIsItPrepaid() == true) {
			if (this.overstayed = true) {
				if (this.hours == 1) {
					this.extraPrice = 4.23;
				} else if (this.hours == 2) {
					this.extraPrice = 6.66;
				} else if (this.hours == 4) {
					this.extraPrice = 9.27;
				} else if (this.hours == 6) {
					this.extraPrice = 13.32;
				} else if (this.hours == 9) {
					this.extraPrice = 16.02;
				} else if (this.hours == 12) {
					this.extraPrice = 18.18;
				} else if (this.hours == 24) {
					this.extraPrice = 21.33;
				}

			}
		}
	}

	public double getOverstayedPrice() {
		return extraPrice;
	}

}
