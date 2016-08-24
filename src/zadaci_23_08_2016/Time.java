package zadaci_23_08_2016;


public class Time {
	// The data fields hour, minute, and second that represent a time.
	private long hour;
	private long minute;
	private long second;

	// A no-arg constructor that creates a Time object for the current time.
	// The values of the data fields will represent the current time.
	public Time() {
		this.hour = ((System.currentTimeMillis() / 1000 / 60 / 60) + 2) % 24;
		this.minute = (System.currentTimeMillis() / 1000 / 60) % 60;
		this.second = (System.currentTimeMillis() / 1000) % 60;

	}

	// A constructor that constructs a Time object with a specified elapsed time
	// since midnight, January 1, 1970, in milliseconds.(The values of the data
	// fields will represent this time.)
	public Time(long milliSeconds) {
		setTime(milliSeconds);

	}

	// A constructor that constructs a Time object with the specified hour,
	// minute, and second
	public Time(long hour_, long minute_, long second_) {
		this.hour = hour_;
		this.minute = minute_;
		this.second = second_;

	}

	// GETTERS
	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	// A method named setTime(long elapseTime) that sets a new time for the
	// object using the elapsed time.
	public void setTime(long elapseTime) {
		this.hour = ((elapseTime / 1000 / 60 / 60) % 24);
		this.minute = (elapseTime / 1000 / 60) % 60;
		this.second = (elapseTime / 1000) % 60;
	}

}
