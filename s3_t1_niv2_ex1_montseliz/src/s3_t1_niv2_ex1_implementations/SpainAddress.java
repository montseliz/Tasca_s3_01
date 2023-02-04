package s3_t1_niv2_ex1_implementations;

import java.util.HashMap;

import s3_t1_niv2_ex1_interfaces.Address;

public class SpainAddress implements Address {

	public static HashMap<String, String> listAddressSpain = new HashMap<>(); 
	private static final String COUNTRY = "Spain"; 
	
	public SpainAddress() {
	}
	
	@Override
	public void findAddress(String user) {
		System.out.println(listAddressSpain.get(user) + "\r\n");
	}

	@Override
	public void addAddress(String user, String address) {
		listAddressSpain.put(user, address + ", " + COUNTRY);
	}

	@Override
	public void deleteAddress(String user) {
		System.out.println(listAddressSpain.remove(user)); 
	}

}
