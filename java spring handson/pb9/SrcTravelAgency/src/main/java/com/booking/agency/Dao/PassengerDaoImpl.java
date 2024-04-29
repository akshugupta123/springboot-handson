package com.booking.agency.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.booking.agency.model.Passenger_Details;





public class PassengerDaoImpl implements PassengerDao{
	
	private JdbcTemplate jdbcTemplate;
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Passenger_Details passenger_Details) {
		
		    String query =" insert into passenger_Details (Passenger_id, Passenger_name, Passenger_dob, Passenger_phone, Passenger_email)VALUES(?,?,?,?,?)";

		     int r = jdbcTemplate.update(query,passenger_Details.getPassenger_id(),passenger_Details.getPassenger_name(),passenger_Details.getPassenger_dob(),passenger_Details.getPassenger_phone(),passenger_Details.getPassenger_email());
		      return r;
	}

	@Override
	public int update(Passenger_Details passenger_Details) {
		String query ="update passenger_Details set Passenger_name =?, Passenger_email=? where Passenger_id=?";
		    int r =  jdbcTemplate.update(query,passenger_Details.getPassenger_name(),passenger_Details.getPassenger_email(),passenger_Details.getPassenger_id());
		return r;
	}

	@Override
	public int delete(int passenger_id) {
		 String   query = "delete from passenger_details where Passenger_id=?";
		          int r    =    jdbcTemplate.update(query,passenger_id);
		return r;
	}
     @Override
	public  List<Passenger_Details> getAllPassengers() {
		         String query = "select * from passenger_Details";
		List<Passenger_Details> passenger_Details =  jdbcTemplate.query(query,new RowMapperImpl());
		return  passenger_Details;
	}

}
