package com.tambi.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.tambi.request.PassengerRequest;
import com.tambi.response.IrctcResponse;

@Service
public class MakeMyTripService {
	
	public IrctcResponse getResponse(PassengerRequest request) {
		
		String endpointUrl="http://localhost:9797/book";
		
		WebClient webClient = WebClient.create();
		IrctcResponse irctcResponse = webClient.post()
					.uri(endpointUrl)
					.contentType(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON)
					.bodyValue(request)
					.retrieve()
					.bodyToMono(IrctcResponse.class)
					.block();
		
		return irctcResponse;
	}

}
