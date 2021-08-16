package myStringHashMap;

public class Main {

	public static void main(String[] args) {

		myStringHashMap cities = new myStringHashMap();
		cities.put("Türkiye", "Ankara");
		cities.put("Almanya", "Berlin");
		cities.put("İngiltere", "Londra");
//
//		System.out.println(cities.get("Almanya"));
//		System.out.println(cities.get("Türkiye"));
		
		System.out.println(cities.get("İngiltere"));
		
		cities.remove("İngiltere");
		
		for (String city : cities.getData()) {
			System.out.println(city);
		}
		
		

	}

}
