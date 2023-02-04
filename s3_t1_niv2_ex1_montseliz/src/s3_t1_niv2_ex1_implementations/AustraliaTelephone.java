package s3_t1_niv2_ex1_implementations;

import java.util.HashMap;

import s3_t1_niv2_ex1_interfaces.Telephone;

public class AustraliaTelephone implements Telephone {

	public static HashMap<String, String> listTelephoneAustralia = new HashMap<>();
	private static final String PREFIX = "+61"; 
	
	public AustraliaTelephone() {
	}
	
	@Override
	public void findTelephone(String user) {
		System.out.println(listTelephoneAustralia.get(user) + "\r\n");
	}

	@Override
	public void addTelephone(String user, String phone) {
		listTelephoneAustralia.put(user, PREFIX + " " + phone); 
	}

	@Override
	public void deleteTelephone(String user) {
		System.out.println(listTelephoneAustralia.remove(user)); 
	}

}
