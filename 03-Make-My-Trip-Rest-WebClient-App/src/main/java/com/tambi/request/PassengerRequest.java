package com.tambi.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassengerRequest {
	
	private String name;
	private Integer age;
	private String gendar;
	private String source;
	private String destination;
	private Integer trainNo;
	private Integer seatNo;
	private Long mobileNo;
	

}
