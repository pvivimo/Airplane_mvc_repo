package pv.sb_airplane_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pv.sb_airplane_mvc.dto.FlightsDtoList;
import pv.sb_airplane_mvc.service.AppService;

@Controller
public class AppController {
	
	private AppService service;
	
	@Autowired
	public AppController(AppService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/flights")
	public String showAllFlights(Model model) {
		
		FlightsDtoList flightsDtoList  = service.getAllFlights();
		model.addAttribute("flightsdtolist", flightsDtoList);
		
		return "flights.html";
	}
	

}
