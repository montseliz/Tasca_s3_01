package s3_t1_niv2_ex1_implementations;

import java.util.HashMap;

import s3_t1_niv2_ex1_interfaces.Telephone;

public class USATelephone implements Telephone {
	
	public static HashMap<String, String> listTelephoneUSA = new HashMap<>(); 
	private static final String PREFIX = "+1"; 
	
	public USATelephone() {
	}
	
	@Override
	public void findTelephone(String user) {
		System.out.println(listTelephoneUSA.get(user) + "\r\n");
	}

	@Override
	public void addTelephone(String user, String phone) {
		listTelephoneUSA.put(user, PREFIX + " " + phone); 
	}

	@Override
	public void deleteTelephone(String user) {
		System.out.println(listTelephoneUSA.remove(user)); 
		
	}

}
