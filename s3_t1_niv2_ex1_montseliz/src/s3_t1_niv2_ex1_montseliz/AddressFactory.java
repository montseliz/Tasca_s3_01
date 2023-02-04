package s3_t1_niv2_ex1_montseliz;

import s3_t1_niv2_ex1_implementations.AustraliaAddress;
import s3_t1_niv2_ex1_implementations.SpainAddress;
import s3_t1_niv2_ex1_implementations.USAAddress;
import s3_t1_niv2_ex1_interfaces.Address;
import s3_t1_niv2_ex1_interfaces.Agenda;
import s3_t1_niv2_ex1_interfaces.Telephone;

public class AddressFactory implements Agenda{

	@Override
	public Address getAddress(String country) {

		if (country.equalsIgnoreCase("Australia")) {
			return new AustraliaAddress(); 
		} else if (country.equalsIgnoreCase("Spain")) {
			return new SpainAddress(); 
		} else if (country.equalsIgnoreCase("USA")) {
			return new USAAddress(); 
		} else {
			return null;
		}
	}

	@Override
	public Telephone getTelephone(String country) {
		return null;
	}

}
