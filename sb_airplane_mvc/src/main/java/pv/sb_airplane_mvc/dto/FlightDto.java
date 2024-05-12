package pv.sb_airplane_mvc.dto;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class FlightDto {
	
	private String departureCity;
	private LocalDateTime departureDate;
	private String arrivalCity;
	private LocalDateTime arrivalDate;
	private String flightNumber;
	private String captain;
	private String flightTime;
	
	
	public FlightDto(String departureCity, LocalDateTime departureDate, String arrivalCity, LocalDateTime arrivalDate,
			String flightNumber, String captain, String flightTime) {
		super();
		this.departureCity = departureCity;
		this.departureDate = departureDate;
		this.arrivalCity = arrivalCity;
		this.arrivalDate = arrivalDate;
		this.flightNumber = flightNumber;
		this.captain = captain;
		this.flightTime = flightTime;
	}
	

	public String getDepartureCity() {
		return departureCity;
	}


	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}


	public LocalDateTime getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDateTime departureDate) {
		this.departureDate = departureDate;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public LocalDateTime getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDateTime arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public String getFlightTime() {
		
		String flightTime = "";
		long minutes = ChronoUnit.MINUTES.between(departureDate, arrivalDate);
		flightTime = minutes + "";
		
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	@Override
	public String toString() {
		return "FlightDto [departureCity=" + departureCity + ", departureDate=" + departureDate + ", arrivalCity="
				+ arrivalCity + ", arrivalDate=" + arrivalDate + ", flightNumber=" + flightNumber + ", captain="
				+ captain + ", flightTime=" + flightTime + "]";
	}
	
	


	
	

}
