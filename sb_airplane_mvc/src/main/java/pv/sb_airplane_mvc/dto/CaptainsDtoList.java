package pv.sb_airplane_mvc.dto;

import java.util.ArrayList;
import java.util.List;

public class CaptainsDtoList {
	
	private List<CaptainDto> captainsDtoList;

	public CaptainsDtoList() {
		super();
		this.captainsDtoList = new ArrayList<>();
	}

	public List<CaptainDto> getCaptainsDtoList() {
		return captainsDtoList;
	}

	public void setCaptainsDtoList(List<CaptainDto> captainsDtoList) {
		this.captainsDtoList = captainsDtoList;
	}
	
	public void addCaptainDto(CaptainDto captainDto) {
		this.captainsDtoList.add(captainDto);
	}
	
	
	@Override
	public String toString() {
		return "CaptainsDtoList [captainsDtoList=" + captainsDtoList + "]";
	}
	
	

}
