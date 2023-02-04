package s3_t1_niv2_ex1_montseliz;

import s3_t1_niv2_ex1_interfaces.Address;
import s3_t1_niv2_ex1_interfaces.Agenda;
import s3_t1_niv2_ex1_interfaces.Telephone;

public class Method {

	public static void addAddressMenu(String user, String country, String address) {
		Agenda factoryA = ChooseFactory.getFactory("address");
		
		if(country.equalsIgnoreCase("Spain")) {
			Address addressF = factoryA.getAddress("Spain");
			addressF.addAddress(user, address);
			System.out.println("Spain address added.\r\n");
			
		} else if (country.equalsIgnoreCase("USA")) {
			Address addressF = factoryA.getAddress("USA"); 
			addressF.addAddress(user, address);
			System.out.println("USA address added.\r\n");
			
		} else if (country.equalsIgnoreCase("Australia")) {
			Address addressF = factoryA.getAddress("Australia");
			addressF.addAddress(user, address);
			System.out.println("Australia address added.\r\n");
			
		} else {
			System.out.println("Error. You have to introduce a valid country.");
		}
	}
	
	public static void deleteAddressMenu(String country, String user) {
		Agenda factoryA = ChooseFactory.getFactory("address");
		
		if(country.equalsIgnoreCase("Spain")) {
			Address addressF = factoryA.getAddress("Spain");
			addressF.deleteAddress(user);
			System.out.println("Spain address deleted.\r\n");
			
		} else if (country.equalsIgnoreCase("USA")) {
			Address addressF = factoryA.getAddress("USA"); 
			addressF.deleteAddress(user);
			System.out.println("USA address deleted.\r\n");
			
		} else if (country.equalsIgnoreCase("Australia")) {
			Address addressF = factoryA.getAddress("Australia");
			addressF.deleteAddress(user);
			System.out.println("Australia address deleted.\r\n");
			
		} else {
			System.out.println("Error. You have to introduce a valid country.");
		}
	}
	
	public static void findAddressMenu(String country, String user) {
		Agenda factoryA = ChooseFactory.getFactory("address");
		
		if(country.equalsIgnoreCase("Spain")) {
			Address addressF = factoryA.getAddress("Spain");
			addressF.findAddress(user);
			
		} else if (country.equalsIgnoreCase("USA")) {
			Address addressF = factoryA.getAddress("USA"); 
			addressF.findAddress(user);
			
		} else if (country.equalsIgnoreCase("Australia")) {
			Address addressF = factoryA.getAddress("Australia"); 
			addressF.findAddress(user);
			
		} else {
			System.out.println("Error. You have to introduce a valid country.");
		}
	}
	
	public static void addPhoneMenu(String user, String country, String telephone) {
		Agenda factoryT = ChooseFactory.getFactory("telephone");
		
		if(country.equalsIgnoreCase("Spain")) {
			Telephone phoneF = factoryT.getTelephone("Spain");
			phoneF.addTelephone(user, telephone);
			System.out.println("Spain telephone added.\r\n");
			
		} else if (country.equalsIgnoreCase("USA")) {
			Telephone phoneF = factoryT.getTelephone("USA"); 
			phoneF.addTelephone(user, telephone);
			System.out.println("USA telephone added.\r\n");
			
		} else if (country.equalsIgnoreCase("Australia")) {
			Telephone phoneF = factoryT.getTelephone("Australia");
			phoneF.addTelephone(user, telephone);
			System.out.println("Australia telephone added.\r\n");
			
		} else {
			System.out.println("Error. You have to introduce a valid country.");
		}
	}
	
	public static void deletePhoneMenu(String country, String user) {
		Agenda factoryT = ChooseFactory.getFactory("telephone");
		
		if(country.equalsIgnoreCase("Spain")) {
			Telephone phoneF = factoryT.getTelephone("Spain");
			phoneF.deleteTelephone(user);
			System.out.println("Spain telephone deleted.\r\n");
			
		} else if (country.equalsIgnoreCase("USA")) {
			Telephone phoneF = factoryT.getTelephone("USA"); 
			phoneF.deleteTelephone(user);
			System.out.println("USA telephone deleted.\r\n");
			
		} else if (country.equalsIgnoreCase("Australia")) {
			Telephone phoneF = factoryT.getTelephone("Australia");
			phoneF.deleteTelephone(user);
			System.out.println("Australia telephone deleted.\r\n");
			
		} else {
			System.out.println("Error. You have to introduce a valid country.");
		}
	}
	
	public static void findPhoneMenu(String country, String user) {
		Agenda factoryT = ChooseFactory.getFactory("telephone");
		
		if(country.equalsIgnoreCase("Spain")) {
			Telephone phoneF = factoryT.getTelephone("Spain");
			phoneF.findTelephone(user);
			
		} else if (country.equalsIgnoreCase("USA")) {
			Telephone phoneF = factoryT.getTelephone("USA"); 
			phoneF.findTelephone(user);
			
		} else if (country.equalsIgnoreCase("Australia")) {
			Telephone phoneF = factoryT.getTelephone("Australia");
			phoneF.findTelephone(user);
			
		} else {
			System.out.println("Error. You have to introduce a valid country.");
		}
	}
}
