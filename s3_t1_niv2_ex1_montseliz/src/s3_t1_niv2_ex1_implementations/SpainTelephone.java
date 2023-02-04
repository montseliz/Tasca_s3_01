package s3_t1_niv2_ex1_implementations;

import java.util.HashMap;

import s3_t1_niv2_ex1_interfaces.Telephone;

public class SpainTelephone implements Telephone {

	public static HashMap<String, String> listTelephoneSpain = new HashMap<>();  
	private static final String PREFIX = "+34"; 
	
	public SpainTelephone() {
	}
	
	@Override
	public void findTelephone(String user) {
		System.out.println(listTelephoneSpain.get(user) + "\r\n");
	}

	@Override
	public void addTelephone(String user, String phone) {
		listTelephoneSpain.put(user, PREFIX + " " + phone); 
	}

	@Override
	public void deleteTelephone(String user) {
		System.out.println(listTelephoneSpain.remove(user));
	}

}
