public class WallClock {
	int hour;
	int minute;
	int seconds;
	public WallClock(int hour, int minute, int seconds) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}
    //override
	public boolean equals(Object args)
	{
		WallClock ref = (WallClock)args;
		return this.hour==ref.hour && this.minute==ref.minute && this.seconds==ref.seconds;
	}
	public static void main(String[] args) 
	{
		WallClock w = new WallClock(2,34, 56);
		WallClock w1 = new WallClock(2,34, 57);
		System.out.println(w.equals(w1));
	}
	
}
