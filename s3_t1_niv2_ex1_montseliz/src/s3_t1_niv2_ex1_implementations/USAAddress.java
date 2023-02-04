package s3_t1_niv2_ex1_implementations;

import java.util.HashMap;

import s3_t1_niv2_ex1_interfaces.Address;

public class USAAddress implements Address {

	public static HashMap<String, String> listAddressUSA = new HashMap<>(); 
	private static final String COUNTRY = "USA"; 
	
	public USAAddress() {
	}

	@Override
	public void findAddress(String user) {
		System.out.println(listAddressUSA.get(user) + "\r\n");
	}

	@Override
	public void addAddress(String user, String address) {
		listAddressUSA.put(user, address + ", " + COUNTRY); 
	}

	@Override
	public void deleteAddress(String user) {
		System.out.println(listAddressUSA.remove(user)); 
	}

}
