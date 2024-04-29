package com.booking.agency;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.booking.agency.Dao.PassengerDao;
import com.booking.agency.Dao.PassengerDaoImpl;
import com.booking.agency.model.Passenger_Details;
import com.booking.agency.service.PassengerService;
import com.booking.agency.service.PassengerServiceImpl;

@SpringBootApplication
public class SrcTravelAgencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrcTravelAgencyApplication.class, args);
		 ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		 
		 
		 PassengerService passengerService = context.getBean("passengerService",PassengerService.class);
		 
		 Passenger_Details passenger_Details  = new Passenger_Details();
		 
		
		 
		 Scanner scanner = new Scanner(System.in);
	        String continueChoice;

	        do {
	            displayMenu();
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                	System.out.println(" Insert Passenger details ");
	                	
	                    
	                   
	                    System.out.println(" Enter Passenger id ");
	                    int id = scanner.nextInt();
	                    
	                    System.out.println(" Enter Passenger name ");
	                    String name = scanner.nextLine();
	                    
	                    System.out.println(" Enter Passenger dob " );
	                    
	                    System.out.println(" Enter Passenger phone  ");
	                    Long phone = scanner.nextLong();
	                    
	                    System.out.println(" Enter Passenger email ");
	                    String email = scanner.nextLine();
	                    
	                    
	                    
	                    passenger_Details.setPassenger_id(id);
	                    passenger_Details.setPassenger_name(name);
	                    passenger_Details.setPassenger_dob(LocalDate.of(1998,11,30));
	                    passenger_Details.setPassenger_phone(phone);
	                    passenger_Details.setPassenger_email(email);
	                  
	                    passengerService.insert(passenger_Details);
	                    
	                    System.out.println("--------------Inserted Record sucessfully---------------");
	              
	                    break;
	                case 2:
	                	System.out.println("Enter Passenger id whose details has to be updated");
	                	
	                	 int updatedid = scanner.nextInt();
	                	 
	                	 System.out.println("Enter Passenger name to be updated");
		                    String updatedname = scanner.nextLine();
		                    
		                 System.out.println("Enter Passenger email to be updated");
		                    String updatedemail = scanner.nextLine();   
		                    
		                    passenger_Details.setPassenger_id(updatedid);
		                    passenger_Details.setPassenger_name(updatedname);
		                    passenger_Details.setPassenger_email(updatedemail);
	                	
	                	 passengerService.update(passenger_Details);
	                	 

			                System.out.println("--------------Update 1 Record---------------");
	                   
	                    break;
	                case 3:
	                	System.out.println("Retrieve Passenger details");
		                System.out.println("--------------Fetch All Records---------------");
		                
		                List<Passenger_Details> allPassengers = passengerService.getAllPassengers();
                        
		                         for(Passenger_Details pd : allPassengers) {
		                         	 System.out.println(pd);
		                          }
	                    break;
	                    
	                case 4:
	                	System.out.println("Enter Passenger id whose details has to be deleted");
	                	
	                	int deleteid = scanner.nextInt();
	                	passengerService.delete(deleteid);
	                	 System.out.println("--------------Record "+deleteid+" Deleted---------------");
	                	break;
	                case 5:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	                    break;
	            }

	            System.out.print("Do you want to continue? (y/n): ");
	            continueChoice = scanner.next();
	        } while (continueChoice.equalsIgnoreCase("y"));

	        System.out.println("Exiting...");
	        scanner.close();
	    }

	    private static void displayMenu() {
	    	 System.out.println("--------------Bus Booking System---------------");
             System.out.println("Press 1 for insert");
             System.out.println("Press 2 for update");
             System.out.println("Press 3 for retrive");
             System.out.println("Press 4 for delete");
             System.out.println("Press 5 for Quit");
             System.out.println("Make Your Choice");
       
	    }

	   
}
