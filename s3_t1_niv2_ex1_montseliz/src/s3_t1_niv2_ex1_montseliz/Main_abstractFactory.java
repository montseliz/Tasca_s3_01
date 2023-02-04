package s3_t1_niv2_ex1_montseliz;

import java.util.Scanner;

public class Main_abstractFactory {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int menu = 0; 
		String country = ""; 
		String address = ""; 
		String user = ""; 
		String answer = ""; 
		String telephone = ""; 
	
		do {
			System.out.println("Choose between address or telephone to enter in its agenda, or exit if you want to leave the application:");
			answer = input.next();
			
			if(answer.equalsIgnoreCase("address")) {
				
				do {
					System.out.println("Choose which option do you want:\r\n"
							+ "1. Add a new address.\r\n" 
							+ "2. Delete an address added before.\r\n"
							+ "3. Find an address in the agenda.\r\n"
							+ "0. Back to main menu.\r\n"
							+ "Choose (0-3):");
					
					menu = input.nextInt(); 
					
					switch (menu) {
					case 0: 
						System.out.println("Goodbye! See you next time!");
						break; 
					case 1: 
						System.out.println("Enter the name of the country (Australia, USA or Spain):"); 
						input.nextLine();
						country = input.nextLine();
						System.out.println("Enter your user name:");
						user = input.nextLine(); 
						System.out.println("Enter the address:");  
						address = input.nextLine();
						Method.addAddressMenu(user, country, address); 
						break;
					case 2: 
						System.out.println("Enter the name of the country (Australia, USA or Spain):"); 
						input.nextLine();
						country = input.nextLine();
						System.out.println("Enter your user name to delete an address added before:"); 
						user = input.nextLine();
						Method.deleteAddressMenu(country, user); 
						break; 
					case 3: 
						System.out.println("Enter the name of the country (Australia, USA or Spain):"); 
						input.nextLine();
						country = input.nextLine();
						System.out.println("Enter your user name to find an address in the agenda:"); 
						user = input.nextLine();
						Method.findAddressMenu(country, user); 
						break; 
					default: 
						System.out.println("Error. Enter a correct number from 0 to 3.\r\n");
					}
				} while (menu != 0); 
				
			} else if (answer.equalsIgnoreCase("telephone")) {
				
				do {
					System.out.println("Choose which option do you want:\r\n"
							+ "1. Add a new telephone.\r\n" 
							+ "2. Delete a telephone added before.\r\n"
							+ "3. Find a telephone in the agenda.\r\n"
							+ "0. Back to main menu.\r\n"
							+ "Choose (0-3):");
					
					menu = input.nextInt(); 
					
					switch (menu) {
					case 0: 
						System.out.println("Goodbye! See you next time!");
						break; 
					case 1: 
						System.out.println("Enter the name of the country (Australia, USA or Spain):"); 
						input.nextLine();
						country = input.nextLine();
						System.out.println("Enter your user name:");
						user = input.nextLine(); 
						System.out.println("Enter the telephone:");  
						telephone = input.nextLine();
						Method.addPhoneMenu(user, country, telephone);  
						break;
					case 2: 
						System.out.println("Enter the name of the country (Australia, USA or Spain):"); 
						input.nextLine();
						country = input.nextLine();
						System.out.println("Enter your user name to delete a telephone added before:"); 
						user = input.nextLine();
						Method.deletePhoneMenu(country, user); 
						break; 
					case 3: 
						System.out.println("Enter the name of the country (Australia, USA or Spain):"); 
						input.nextLine();
						country = input.nextLine();
						System.out.println("Enter your user name to find a telephone in the agenda:"); 
						user = input.nextLine();
						Method.findPhoneMenu(country, user); 
						break; 
					default: 
						System.out.println("Error. Enter a correct number from 0 to 3.\r\n");
					}
				} while (menu != 0); 
			
			} else {
				if (answer.equalsIgnoreCase("exit")) {
					System.out.println("Goodbye! See you next time!");
				} else {
					System.out.println("Error. Introduce a correct word. Write address or telephone.");	
				}
			}
				
		} while (!answer.equalsIgnoreCase("exit")); 
		
		input.close();
		
	}

}
		

	/*
		
		Agenda factoryA = ChooseFactory.getFactory("address");
		Address address = factoryA.getAddress("Spain");
		Address address1 = factoryA.getAddress("USA"); 
		Address address2 = factoryA.getAddress("Australia"); 
		Address address3 = factoryA.getAddress("Spain");
		Address address4 = factoryA.getAddress("USA"); 
		Address address5 = factoryA.getAddress("Australia");
		Address address6 = factoryA.getAddress("Spain");
		Address address7 = factoryA.getAddress("USA"); 
		Address address8 = factoryA.getAddress("Australia");
		
		address.addAddress(0, "Gran Via de les Corts Catalanes, 500, 4º, 1ª, 08018, Barcelona,");
		address1.addAddress(1, "2112 E Cesar E Chavez Ave, Los Angeles, CA 90033,");
		address2.addAddress(2, "46 Grantham St, Wembley WA 6014,");
		address3.addAddress(3, "C/ Palomar, 23, 2º, 3ª, 08030, Barcelona,");
		address4.addAddress(4, "145 Brooklyn Ave, Brooklyn, NY 11213,");
		address5.addAddress(5, "Grey Street &, Melbourne St, South Brisbane QLD 4101,");
		address6.addAddress(6, "C/ Canalejas, 8, 3º, 4ª, 08028, Barcelona,");
		address7.addAddress(7, "445 Columbus Ave, New York, NY 10024,");
		address8.addAddress(8, "24 Auburn Rd, Berala NSW 2141,");
		
		address2.findAddress(2); 
		address5.findAddress(5);
		address7.findAddress(7); 
		address2.deleteAddress(2); 
		address2.findAddress(2); 
		
		System.out.println("------------------------");
				
		Agenda factoryT = ChooseFactory.getFactory("telephone"); 
		Telephone phone = factoryT.getTelephone("Spain"); 
		Telephone phone1 = factoryT.getTelephone("Australia"); 
		Telephone phone2 = factoryT.getTelephone("USA"); 
		Telephone phone3 = factoryT.getTelephone("Spain"); 

		phone.addTelephone(0, "933451128");
		phone1.addTelephone(1, "862151000");
		phone2.addTelephone(2, "4157537080"); 
		phone3.addTelephone(3, "674352332"); 
		
		phone2.findTelephone(2); 
		phone2.deleteTelephone(2); 
		phone2.findTelephone(2); 
		phone3.findTelephone(3); 

		*/
		
