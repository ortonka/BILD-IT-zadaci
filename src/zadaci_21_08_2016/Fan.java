package zadaci_21_08_2016;

/*
 * (The Fan class) Design a class named Fan to represent a fan. 
 * 
A method named toString() that returns a string description for the fan. If
the fan is on, the method returns the fan speed, color, and radius in one combined
string. If the fan is not on, the method returns the fan color and radius
along with the string “fan is off” in one combined string.

 */

public class Fan {

	// Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3
	// to denote the fan speed.
	public static final int SLOW = 1, MEDIUM = 2, FAST = 3;

	// Private int data field named speed that specifies the speed of the fan
	// (the default is SLOW)
	private int speed_ = SLOW;

	// Private boolean data field named on that specifies whether the fan is
	// on (the default is false)
	private boolean on_ = false;

	// Private double data field named radius that specifies the radius of the
	// fan (the default is 5)
	private double radius_ = 5;

	// A string data field named color that specifies the color of the fan (the
	// default is blue)
	String color_ = "blue";

	// getter for speed_
	public int getSpeed_() {
		return speed_;
	}

	// setter for speed_
	public void setSpeed_(int speed_) {
		this.speed_ = speed_;
	}

	// getter for on_
	public boolean isOn_() {
		return on_;
	}

	// setter for on_
	public void setOn_(boolean on_) {
		this.on_ = on_;
	}

	// getter for radius_
	public double getRadius_() {
		return radius_;
	}

	// setter for radius_
	public void setRadius_(double radius_) {
		this.radius_ = radius_;
	}

	// getter for color_
	public String getColor_() {
		return color_;
	}

	// setter for color_
	public void setColor_(String color_) {
		this.color_ = color_;
	}

	// No args ctor
	public Fan() {

	}

	// toString method
	@Override
	public String toString() {
		if (isOn_())
			return "[radius=" + getRadius_() + ", color=" + getColor_() + ", speed=" + getSpeed_() + "]";
		else
			return "[radius=" + getRadius_() + ", color=" + getColor_() + ", fan is off" + "]";
	}

}
