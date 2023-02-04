package s3_t1_niv2_ex1_implementations;

import java.util.HashMap;

import s3_t1_niv2_ex1_interfaces.Address;

public class AustraliaAddress implements Address {
	
	public static HashMap<String, String> listAddressAustralia = new HashMap<>();
	private static final String COUNTRY = "Australia"; 
	
	public AustraliaAddress() {
	}

	@Override
	public void findAddress(String user) {
		System.out.println(listAddressAustralia.get(user) + "\r\n");
	}

	@Override
	public void addAddress(String user, String address) {
		listAddressAustralia.put(user, address + ", " + COUNTRY);
	}

	@Override
	public void deleteAddress(String user) {
		System.out.println(listAddressAustralia.remove(user)); 
	}

}
