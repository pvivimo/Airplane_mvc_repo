package pv.sb_airplane_mvc.dto;

public class CaptainDto {
	
	private String captainName;
	private Long flightTime;
	
		
	
	public CaptainDto() {
		super();
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



	@Override
	public String toString() {
		return "CaptainDto [captainName=" + captainName + ", flightTime=" + flightTime + "]";
	}
	
	



	
	

}
