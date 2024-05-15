package pv.sb_airplane_mvc.dto;

public class CaptainDto {
	
	private String captainName;
	private Long flightTime;
	private List<FlightDto> flights;
	
		
	
	public CaptainDto() {
		super();
		this.flights = new ArrayList<>();
	}


	public CaptainDto(String captainName, Long flightTime) {
		super();
		this.captainName = captainName;
		this.flightTime = flightTime;
	}


	public String getCaptainName() {
		return captainName;
	}


	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public Long getFlightTime() {
		return flightTime;
	}


	public void setFlightTime(Long flightTime) {
		this.flightTime = flightTime;
	}
	
	public void addTotalFlightTime(Long flightTime) { //az összes repült időt a már meglévőhöz adjuk
		if(flightTime != null) {
			this.flightTime += flightTime;
		}
		
	}

	public boolean hasRouteToStartCityWithTransfer() {
		
		boolean result = false;
		
		for(int index = 0; index < flights.size(); index++) {
			
			FlightDto currentFlightDto = flights.get(index);
			
			for(int nextIndex = index+1; nextIndex < flights.size(); nextIndex++) {
				
				FlightDto nextFlightDto = flights.get(nextIndex);
				
				if(currentFlightDto.getArrivalDate().isBefore(nextFlightDto.getDepartureDate())){
					
					if(currentFlightDto.getArrivalCity().equals(nextFlightDto.getDepartureCity())) {
						
						result = true;
					}
					
				}
			}
		}
		
		return result;
		
	}



	@Override
	public String toString() {
		return "CaptainDto [captainName=" + captainName + ", flightTime=" + flightTime + "]";
	}
	
	



	
	

}
