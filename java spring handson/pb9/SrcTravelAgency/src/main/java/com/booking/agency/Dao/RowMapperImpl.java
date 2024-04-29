package com.booking.agency.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.booking.agency.model.Passenger_Details;

public class RowMapperImpl implements RowMapper<Passenger_Details>{

	@Override
	public Passenger_Details mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Passenger_Details passenger_Details = new Passenger_Details();
		
		       passenger_Details.setPassenger_id(rs.getInt(1));
		       passenger_Details.setPassenger_name(rs.getString(2));
		       passenger_Details.setPassenger_dob(rs.getDate(3).toLocalDate());
		       passenger_Details.setPassenger_phone(rs.getLong(4));
		       passenger_Details.setPassenger_email(rs.getString(5));
		return passenger_Details;
	}

}
