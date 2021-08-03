package com.tambi.srest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tambi.request.PassengerRequest;
import com.tambi.response.IrctcResponse;
import com.tambi.service.MakeMyTripService;

@RestController
public class MakeMytripRest {
	
	@Autowired
	private MakeMyTripService service;
	
	@PostMapping(value="/bookticket",
			     consumes={"application/json"},
				 produces= {"application/json"})
	public IrctcResponse bookTicket(@RequestBody PassengerRequest request) {
		
		return service.getResponse(request);
	}

}
