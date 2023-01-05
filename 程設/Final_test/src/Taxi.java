
public class Taxi extends Transportation{
	private String name;
	private double costPerKm,speed,cost;
	
	public Taxi(String name,double spend,double speed) {
		super(name,spend,speed);
		cost = 0;
		costPerKm = 5;
	}
	
	public double calCost(double distance) {
		if(distance -1.25>0) {
			cost = (distance - 1.25)*costPerKm + 70;
		}
		else {
			cost = 70;
		}
		return cost;
	}
}
