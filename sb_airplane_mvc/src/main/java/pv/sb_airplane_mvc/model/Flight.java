package pv.sb_airplane_mvc.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="flights")
public class Flight {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="departureCity")
	private String departureCity;
	
	@Column(name="departuredate")
	private LocalDateTime departureDate;
	
	@Column(name="arrivalcity")
	private String arrivalCity;
	
	@Column(name="arrivalDate")
	private LocalDateTime arrivalDate;
	
	@Column(name="flightnumber")
	private String flightNumber;
	
	@Column(name="captain")
	private String captain;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Flight [id=" + id + ", departureCity=" + departureCity + ", departureDate=" + departureDate
				+ ", arrivalCity=" + arrivalCity + ", arrivalDate=" + arrivalDate + ", flightNumber=" + flightNumber
				+ ", captain=" + captain + "]";
	}
	
	
	
	

}
