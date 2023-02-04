package s3_t1_niv1_ex1_montseliz;

import java.util.ArrayList;

public class Undo {
	
	private static ArrayList<String> listOrders; 
	
	private Undo() {
	}
	
	public static ArrayList<String> getInstance() {
		if (listOrders == null) {
			listOrders = new ArrayList<String>(); 
		}
		return listOrders;
	}
	
	public static void saveOrders (String order) {
		
		listOrders.add(order); 
		
		//System.out.println(listOrders);
	}
	
	public static void removeOrders () {
		
		listOrders.remove(listOrders.size()-1);

		//System.out.println(listOrders);
	}
	
	public static void historyOrders() {
		listOrders.stream()
				.limit(3)
				.forEach(System.out::println); 
	}
	
	
	
}