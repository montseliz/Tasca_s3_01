package s3_t1_niv2_ex1_montseliz;

import s3_t1_niv2_ex1_interfaces.Agenda;

public class ChooseFactory {
	
	public static Agenda getFactory (String typeFactory) {
		
		if (typeFactory.equalsIgnoreCase("address")) {
			return new AddressFactory(); 
		} else if (typeFactory.equalsIgnoreCase("telephone")) {
			return new TelephoneFactory(); 
		}
		return null; 
	}

}
