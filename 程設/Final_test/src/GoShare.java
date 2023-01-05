
public class GoShare extends Transportation {
	private String name;
	private double costPerKm,speed,cost;
	
	public GoShare(String name,double spend,double speed) {
		super(name, spend,speed);
		cost = 0;
		costPerKm = 2.5;
	}
	
	public double calCost(double distance) {
		if(time(distance)/60 - 6 > 0) {
			cost = 15 + (time(distance)/60 -6 ) * costPerKm;
		}
		else {
			cost = 15;
		}
		return cost;
	}
}
