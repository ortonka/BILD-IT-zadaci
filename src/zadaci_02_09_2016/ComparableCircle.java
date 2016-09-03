package zadaci_02_09_2016;

public class ComparableCircle extends Circle{
	
	public ComparableCircle(){
		super();
	}
	
	public ComparableCircle(double r){
		super(r);
	}
	
	//compareTo method
		public int compareTo(ComparableCircle o) {
			if (this.getArea() > o.getArea())
				return 1;
			else if (this.getArea() < o.getArea())
				return -1;
			else
				return 0;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "ComparableCircle [poluprecnik = " + getR() + " ]";
		}
		
	

}
