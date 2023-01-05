
public class Attraction {
	private double siteX,siteY;
	
	public Attraction(double x,double y) {
		siteX = x;
		siteY = y;
	}
	
	public static double getDistanceFromLatLonInKm(double lat1,double lon1,double lat2,double lon2) {
	    int R = 6371; // Radius of the earth in k
	    double dLat = Math.toRadians(lat2-lat1);  // deg2rad below
	    double dLon = Math.toRadians(lon2-lon1); 
	    double a = 
	      Math.sin(dLat/2) * Math.sin(dLat/2) +
	      Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * 
	      Math.sin(dLon/2) * Math.sin(dLon/2)
	      ; 
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
	    double d = R * c; // Distance in km
	    return d;
	  }

	public double getSiteX() {
		return siteX;
	}

	public double getSiteY() {
		return siteY;
	}
}
