public class time{
	public static void main(String[] args){
		
		int hour = 14;
		int minute = 36;
		int second = 22;
		
		System.out.println("Time since midnight: " + hour + "h" + minute + "m" + second + "s");
		System.out.print("Seconds since midnight: ");
		System.out.println((hour*60*60) + (minute*60) + second);
		System.out.print("Time left in day: ");
		System.out.print(24-hour + "h");
		System.out.print(60-minute + "m");
		System.out.println(60-second + "s");
		System.out.print("Percent of day complete: ");
		System.out.println((hour*60+minute)*100/1440 + "%");

		hour = 14;
		minute = 44;
		second = 31;
		System.out.print("Elapsed Time: " + ((hour*60*60+minute*60 + second)-(14*60*60 + 36*60 + 22))+ "seconds");
	
	
	
	}

}
