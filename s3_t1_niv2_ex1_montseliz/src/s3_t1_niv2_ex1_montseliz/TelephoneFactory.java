package s3_t1_niv2_ex1_montseliz;

import s3_t1_niv2_ex1_implementations.AustraliaTelephone;
import s3_t1_niv2_ex1_implementations.SpainTelephone;
import s3_t1_niv2_ex1_implementations.USATelephone;
import s3_t1_niv2_ex1_interfaces.Address;
import s3_t1_niv2_ex1_interfaces.Agenda;
import s3_t1_niv2_ex1_interfaces.Telephone;

public class TelephoneFactory implements Agenda {

	@Override
	public Address getAddress(String country) {
		return null;
	}

	@Override
	public Telephone getTelephone(String country) {
		if (country.equalsIgnoreCase("Australia")) {
			return new AustraliaTelephone(); 
		} else if (country.equalsIgnoreCase("Spain")) {
			return new SpainTelephone(); 
		} else if (country.equalsIgnoreCase("USA")) {
			return new USATelephone(); 
		} else {
			return null;
		}
	}

}
