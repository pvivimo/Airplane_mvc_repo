package pv.sb_airplane_mvc.dto;

import java.util.ArrayList;
import java.util.List;

public class FlightsDtoList {
	
	private List<FlightDto> flightsDtoList;
	
	public FlightsDtoList() {
		this.flightsDtoList = new ArrayList<>();
	}							

	public List<FlightDto> getFlightsDtoList() {
		return flightsDtoList;
	}

	public void setFlightsDtoList(List<FlightDto> flightsDtoList) {
		this.flightsDtoList = flightsDtoList;
	}

	public void addFlightDto(FlightDto flightDto) {
		this.flightsDtoList.add(flightDto);
		
	}
	
	
	
	public void sortByDepartureDate() {
		
		for(int currentIndex = 0; currentIndex < flightsDtoList.size(); currentIndex++) {
			
			FlightDto currentFlightDto = this.flightsDtoList.get(currentIndex);
			for(int nextIndex = currentIndex+1; nextIndex < this.flightsDtoList.size(); nextIndex++) {
				
				FlightDto nextFlightDto = this.flightsDtoList.get(nextIndex);
				
				if(currentFlightDto.getDepartureDate().compareTo(nextFlightDto.getDepartureDate()) > 0) {
					
					this.flightsDtoList.set(currentIndex, nextFlightDto);
					this.flightsDtoList.set(nextIndex, currentFlightDto);
					currentIndex--;
					break;
				}
			}
		}
	}

	
	
	

}
