package week03.datetime;

public class CustomDate {
	private int month;
	private int day;
	private int year;
	private boolean isLeap;
	CustomDate(){
		
	}
	CustomDate(int month, int day, int year){
		if(year<0) {
			System.err.println("Please enter a posivite year");
			return;
		} else {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			    isLeap = true;
			} else {
			    isLeap = false;
			}
		}
		if (month<1 || month > 12) {
			System.err.println("Please enter a valid month");
			return;
		} else {
			this.month=month;
		}
		
		if (day<1 || day>31) {
			System.err.println("Please enter a valid day");
			return;
		} else {
			switch (this.month) {
			case 1:
				this.day=day;
				break;
			case 2:
				if(isLeap) {
					if(day>29) {
						System.err.println("Please enter a valid day");
						return;
						
					}
				} else {
					if(day>28) {
						System.err.println("Please enter a valid day");
						return;
						
					}
				}
				this.day=day;
				break;
			case 3:
				this.day=day;
				break;
			case 4:
				if(day>30) {
					System.err.println("Please enter a valid day");
					return;
					
				}
				this.day=day;
				break;
			case 5:
				this.day=day;
				break;
			case 6:
				if(day>30) {
					System.err.println("Please enter a valid day");
					return;
					
				}
				this.day=day;
				break;
			case 7:
				this.day=day;
				break;
			case 8:
				this.day=day;
				break;
			case 9:
				if(day>30) {
					System.err.println("Please enter a valid day");
					return;
					
				}
				this.day=day;
				break;
			case 10:
				this.day=day;
				break;
			case 11:
				if(day>30) {
					System.err.println("Please enter a valid day");
					return;
					
				}
				this.day=day;
				break;
			case 12:
				this.day=day;
				break;
			}
		}
		
	}
}
