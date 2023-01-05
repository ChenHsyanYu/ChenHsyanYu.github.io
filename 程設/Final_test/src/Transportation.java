
public class Transportation {
	private String name;
	private double costPerKm,speed,cost,time;
	
	public Transportation(String name,double spend,double speed) {
		this.name = name;
		this.costPerKm = spend;
		this.speed = speed;
	}
	
	public boolean cost(int budget,double distance) {
		if(budget>=cost) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double time(double distance) {
		time = distance/speed;
		return time;
	}
	
	public double calCost(double distance) {
		cost = distance*costPerKm;
		return cost;
	}
	
	public String getInfo() {
		return String.format("by all %s	→ cost: %.0f NTD/time: %.1f hours",name,cost,time);
	}
	
	
	
}
