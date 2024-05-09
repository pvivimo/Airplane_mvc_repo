package pv.sb_airplane_mvc.dto;

import java.time.LocalDateTime;


public class FlightsDto {
	
private String departureCity;
	
	private LocalDateTime departureDate;
	private String arrivalCity;
	private LocalDateTime arrivalDate;
	private String flightNumber;
	private String captain;
	
	
	public FlightsDto(String departureCity, LocalDateTime departureDate, String arrivalCity, LocalDateTime arrivalDate,
			String flightNumber, String captain) {
		super();
		this.departureCity = departureCity;
		this.departureDate = departureDate;
		this.arrivalCity = arrivalCity;
		this.arrivalDate = arrivalDate;
		this.flightNumber = flightNumber;
		this.captain = captain;
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


	@Override
	public String toString() {
		return "FlightsDto [departureCity=" + departureCity + ", departureDate=" + departureDate + ", arrivalCity="
				+ arrivalCity + ", arrivalDate=" + arrivalDate + ", flightNumber=" + flightNumber + ", captain="
				+ captain + "]";
	}
	
	

}
