package pv.sb_airplane_mvc.service;

import org.hibernate.boot.model.relational.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pv.sb_airplane_mvc.dto.FlightsDtoList;

@Service
public class AppService {
	
	private Database db;

	@Autowired
	public AppService(Database db) {
		super();
		this.db = db;
	}

	public FlightsDtoList getAllFlights() {
		
		return null;
	}
	
	

}
