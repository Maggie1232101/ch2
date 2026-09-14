public class time{
	public static void main(String[] args){
		int hour = 14;
		int minute = 36;
		System.out.println("Time since midnight: " + hour + "h" + minute + "m");
		System.out.print("Seconds since midnight: ");
		System.out.println((hour*60*60) + (minute*60));
		System.out.print("Time left in day: ");
		System.out.print(24-hour + "h");
		System.out.println(60-minute + "m");
		System.out.print("Percent of day complete: ");
		System.out.println((hour*60+minute)*100/1440 + "%");
		
	
	
	
	}

}
