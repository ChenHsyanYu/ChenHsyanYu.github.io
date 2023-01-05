import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Site oneZeroOne = new Site("101",100,20);
		Site exhibition = new Site("南港展覽館", 200,400);
		Site amusementPark = new Site("兒童新樂園",500,20);
		Site CKSmemorialHall = new Site("中正紀念堂",30,200);
		Site zoo = new Site("木柵動物園", 15,70);
		Site nightMarket = new Site("士林夜市",20,100);
		
		ArrayList<Double>distance = new ArrayList<Double>();
		ArrayList<Site>sites = new ArrayList<Site>();
		Scanner sc = new Scanner(System.in);
		
		sites.add(oneZeroOne);
		sites.add(exhibition);
		sites.add(amusementPark);
		sites.add(CKSmemorialHall);
		sites.add(zoo);
		sites.add(nightMarket);
		
		System.out.println("Please choose four sites from these sites below, your schedule will be the same as your input order:");
		String site = "";
		for(Site s:sites) {
			if(sites.indexOf(s)==0) {
				site += (sites.indexOf(s)+1)+")"+s.getName();
			}
			else {
				site += " "+(sites.indexOf(s)+1)+")"+s.getName();
			}
		}
		System.out.println(site);
		System.out.print("Your choice (input the number of the site):");
		int start = sc.nextInt();
		int op1 = sc.nextInt();
		int op2 = sc.nextInt();
		int op3 = sc.nextInt();
		System.out.print("Please input your budget(must be a positive number):");
		int budget = sc.nextInt();
		
		while(budget<=0) {
			System.out.print("Please input a positive number:");
			budget = sc.nextInt();
		}
		
		Taxi taxi = new Taxi("Taxi",5,30);
		GoShare goShare = new GoShare("goShare",20,40);
		
		ArrayList<Site>picked = new ArrayList<Site>();
		picked.add(sites.get(start-1));
		picked.add(sites.get(op1-1));
		picked.add(sites.get(op2-1));
		picked.add(sites.get(op3-1));
		
		double totalDistance = 0;
		for(Site dis:picked) {
			if(picked.indexOf(dis)<3) {
				totalDistance += dis.getDistanceFromLatLonInKm(picked.get(picked.indexOf(dis)).getSiteX(),picked.get(picked.indexOf(dis)).getSiteY(),picked.get(picked.indexOf(dis)+1).getSiteX(),picked.get(picked.indexOf(dis)+1).getSiteY());
			}
		}
		
		taxi.calCost(totalDistance);
		taxi.time(totalDistance);
		goShare.calCost(totalDistance);
		goShare.time(totalDistance);
		
		System.out.print(taxi.getInfo());
		if(taxi.cost(budget, totalDistance)) {
			System.out.println("  在預算內");
		}
		
		else {
			System.out.println("  超出預算");
		}
		System.out.print(goShare.getInfo());
		if(goShare.cost(budget, totalDistance)) {
			System.out.println("  在預算內");
		}
		
		else {
			System.out.println("  超出預算");
		}
		
		for(Site p:picked) {
			if(picked.indexOf(p)==0) {
				System.out.print("Your schedule: "+p.getName());
			}
			else {
				System.out.print(" "+p.getName());
			}
		}
	}

}
