package com.model;

import javax.persistence.*;

@Entity
@Table(name = "Passenger_Details")
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Passenger_id")
	private int passengerId;

	@Column(name = "Passenger_name")
	private String passengerName;

	@Column(name = "Passenger_dob")
	private String passengerDob;

	@Column(name = "Passenger_phone")
	private String passengerPhone;

	@Column(name = "Passenger_email")
	private String passengerEmail;

	// Getters and setters

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerDob() {
		return passengerDob;
	}

	public void setPassengerDob(String passengerDob) {
		this.passengerDob = passengerDob;
	}

	public String getPassengerPhone() {
		return passengerPhone;
	}

	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	@Override
	public String toString() {
		return "Passenger{" + "passengerId=" + passengerId + ", passengerName='" + passengerName + '\''
				+ ", passengerDob='" + passengerDob + '\'' + ", passengerPhone='" + passengerPhone + '\''
				+ ", passengerEmail='" + passengerEmail + '\'' + '}';
	}
}
