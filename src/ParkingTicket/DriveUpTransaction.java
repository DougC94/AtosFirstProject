package ParkingTicket;

public class DriveUpTransaction {

	private int hours;
	private double price;

	public double WeekParking() {

		if (this.hours == 1) {

			this.price = 4.70;
		} else if (this.hours == 2) {
			this.price = 7.40;
		} else if (this.hours == 4) {
			this.price = 10.30;
		} else if (this.hours == 6) {
			this.price = 14.80;
		} else if (this.hours == 9) {
			this.price = 17.80;
		} else if (this.hours == 12) {
			this.price = 20.20;
		} else if (this.hours == 24) {
			this.price = 23.70;
		}

		return this.price;
	}

	public double WeekendParking(){
		
		if (this.hours == 2){
			this.price = 4.40;
		}else if (this.hours == ){
			this.price = 7.40; 
		}else if (this.hours == ){
			this.price = 12.00;
		}
	}

}
