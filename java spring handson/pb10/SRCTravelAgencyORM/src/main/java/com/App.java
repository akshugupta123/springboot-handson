package com;

import com.model.Passenger;
import com.service.PassengerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PassengerService passengerService = context.getBean(PassengerService.class);

		Scanner scanner = new Scanner(System.in);
		char choice;

		do {
			System.out.println("-- Bus Booking System --");
			System.out.println("Press 1 for Insert");
			System.out.println("Press 2 for Update");
			System.out.println("Press 3 for Retrieve");
			System.out.println("Press 4 for Delete");
			System.out.println("Press 5 to Quit");

			choice = scanner.next().charAt(0);

			switch (choice) {
			case '1':
				// Insert operation
				scanner.nextLine(); // Consume newline
				System.out.println("Enter Passenger Name:");
				String name = scanner.nextLine();
				System.out.println("Enter Passenger DOB (yyyy-MM-dd):");
				String dob = scanner.next();
				System.out.println("Enter Passenger Phone:");
				String phone = scanner.next();
				System.out.println("Enter Passenger Email:");
				String email = scanner.next();

				Passenger newPassenger = new Passenger();
				newPassenger.setPassengerName(name);
				newPassenger.setPassengerDob(dob);
				newPassenger.setPassengerPhone(phone);
				newPassenger.setPassengerEmail(email);

				passengerService.savePassenger(newPassenger);
				System.out.println("Passenger added successfully!");
				break;

			case '2':
				// Update operation
				System.out.println("Enter Passenger ID to update:");
				int updateId = scanner.nextInt();

				Passenger passengerToUpdate = passengerService.getPassengerById(updateId);
				if (passengerToUpdate != null) {
					scanner.nextLine(); // Consume newline
					System.out.println("Enter new Passenger Name:");
					String updatedName = scanner.nextLine();
					System.out.println("Enter new Passenger DOB (yyyy-MM-dd):");
					String updatedDob = scanner.next();
					System.out.println("Enter new Passenger Phone:");
					String updatedPhone = scanner.next();
					System.out.println("Enter new Passenger Email:");
					String updatedEmail = scanner.next();

					passengerToUpdate.setPassengerName(updatedName);
					passengerToUpdate.setPassengerDob(updatedDob);
					passengerToUpdate.setPassengerPhone(updatedPhone);
					passengerToUpdate.setPassengerEmail(updatedEmail);

					passengerService.updatePassenger(passengerToUpdate);
					System.out.println("Passenger updated successfully!");
				} else {
					System.out.println("Passenger not found!");
				}
				break;

			case '3':
				// Retrieve operation
				List<Passenger> passengers = passengerService.getAllPassengers();
				System.out.println("Passenger Details:");
				System.out.printf("%-15s%-20s%-15s%-15s%-30s%n", "Passenger_id", "Passenger_name", "dob", "Phone",
						"Email");
				for (Passenger passenger : passengers) {
					System.out.printf("%-15s%-20s%-15s%-15s%-30s%n", passenger.getPassengerId(),
							passenger.getPassengerName(), passenger.getPassengerDob(), passenger.getPassengerPhone(),
							passenger.getPassengerEmail());
				}
				break;

			case '4':
				// Delete operation
				System.out.println("Enter Passenger ID to delete:");
				int deleteId = scanner.nextInt();
				passengerService.deletePassenger(deleteId);
				System.out.println("Passenger deleted successfully!");
				break;

			case '5':
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}

			System.out.println("Do you want to continue? (y/n)");
			choice = scanner.next().charAt(0);
		} while (choice == 'y');

		System.out.println("Thank you for using the Bus Booking System!");
		scanner.close();
	}
}
