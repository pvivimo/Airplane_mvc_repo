package pv.sb_airplane_mvc.dto;

import java.util.ArrayList;
import java.util.List;

public class FlightsDtoList {
	
	private List<FlightsDto> flightsDtoList;
	
	public FlightsDtoList() {
		this.flightsDtoList = new ArrayList<>();
	}							

	public List<FlightsDto> getFlightsDtoList() {
		return flightsDtoList;
	}

	public void setFlightsDtoList(List<FlightsDto> flightsDtoList) {
		this.flightsDtoList = flightsDtoList;
	}
	
	

	
	
	

}
