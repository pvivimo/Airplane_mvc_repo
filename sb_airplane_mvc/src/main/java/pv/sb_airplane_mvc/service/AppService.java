package pv.sb_airplane_mvc.service;


import java.time.temporal.ChronoUnit;
import java.util.List;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pv.sb_airplane_mvc.db.Database;
import pv.sb_airplane_mvc.dto.CaptainDto;
import pv.sb_airplane_mvc.dto.CaptainsDtoList;
import pv.sb_airplane_mvc.dto.FlightDto;
import pv.sb_airplane_mvc.dto.FlightsDtoList;
import pv.sb_airplane_mvc.model.Flight;

@Service
public class AppService {
	
	private Database db;

	@Autowired
	public AppService(Database db) {
		super();
		this.db = db;
	}

	public FlightsDtoList getAllFlights() {
		
		FlightsDtoList flightsDtoList = new FlightsDtoList();
		
		List<Flight> flights = db.getAllFlights();	
		
		convertFlightToFlightDto(flightsDtoList, flights);
		
		flightsDtoList.sortByDepartureDate();
		
		return flightsDtoList;
	}

	private void convertFlightToFlightDto(FlightsDtoList flightsDtoList, List<Flight> flights) {
		
		
		for(int index = 0; index < flights.size(); index++) {
			
			Flight currentFlight = flights.get(index);
			FlightDto flightDto = new FlightDto(
					currentFlight.getDepartureCity(),
					currentFlight.getDepartureDate(),
					currentFlight.getArrivalCity(),
					currentFlight.getArrivalDate(),
					currentFlight.getFlightNumber(),
					currentFlight.getCaptain(),
					currentFlight.getFlightNumber()
					);
			
			flightsDtoList.addFlightDto(flightDto);
		}
	}

	public CaptainsDtoList getCaptainsTime() {
		
		CaptainsDtoList captainsDtoList = new CaptainsDtoList();
		
		List<Flight> flights = db.getAllFlights();
		
		for(int index = 0; index < flights.size(); index++) {
			
			Flight flight = flights.get(index);
			String captainName = flight.getCaptain();
			Long flightTime = ChronoUnit.MINUTES.between(flight.getArrivalDate(), flight.getArrivalDate());
			
			
			//Ell, hogy a kapitány szerepel-e már a listánkban
			
			boolean isFound = false;
			for(int ListIndex = 0; ListIndex < captainsDtoList.getCaptainsDtoList().size(); ListIndex++) {
				
				CaptainDto captainDto = captainsDtoList.getCaptainsDtoList().get(ListIndex);
				
				if(captainDto.getCaptainName().equals(captainName)) {
					
					captainDto.addTotalFlightTime(flightTime);
					isFound = true;
					break;
				}
				
				
			}
			//Ha a kapitány még nem szerepel a listában, akkor hozzáadjuk
			if(isFound == false) {
				
				CaptainDto newCaptainDto = new CaptainDto(captainName, flightTime);
				newCaptainDto.setFlightTime(flightTime);
				captainsDtoList.addCaptainDto(newCaptainDto);
				
			}
		
		}
		return captainsDtoList;
	}

	public CaptainsDtoList getCaptainBackToArrivalCity() {
		
		CaptainsDtoList captainsDtoList = new CaptainsDtoList();
		
		List<Flight> flights = db.getAllFlights();
		for(int index = 0; index < flights.size(); index++){
			
			Flight currentFlight = flights.get(index);
			String captainName = currentFlight.getCaptain();
			
			//Ell. hogy van-e átszállással visszatérő útvonal
			boolean hasRoute = false;
			
			List<FlightDto> captainFlights = new ArrayList<>();
				for(int index = 0; index < flights.size(); index++){	

					Flight currentFlight = flights.get(index);
					if(currentFlight.getCaptain().equals(CaptainName)){
				
						FlightDto flightDto = new FlightDto(
							currentFlight.getDepartureCity(),
							currentFlight.getDepartureDate(),
							currentFlight.getArrivalCity(),
							currentFlight.getArrivalDate (),
							currentFlight.getFlightNumber(),
							currentFlight.getCaptain(),
							currentFlight.getFlightTime(),
							));
						captainFlights.add(flightDto);			
					}
							
				}
			//Útvonalak ellenőrzése
			if(captainFlights.size() >= 2){

			for(int index = 0; index  captainFlights.size()-1; index++){

				FlightDto currentFlight = captainFlights.get(index);
				for(int nextIndex = 0; nextIndex < captainFlights.size(); nextIndex++){	

					FlightDto nextFlight = captainFlights.get(nextIndex);
					if(currentFlight.getDepartureCity().eqals(nextFlight.getArrivalCity())){
	
						hasRoute = true;
						break;
					}
				}

			}
			//megfelelő útvonal esetén kapitánylistához adjuk
			if(hasRoute == true){
				CaptainDto captainDto = new CaptainDto(captainName, null); //repülési idő most nem releváns számunkra
	
					captainDto.setFlights(captainFlights);
					captainDtoList.addCaptainDto(captainDto);
			}
		
		return captainsDtoList;
	}

}
