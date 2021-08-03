package com.tambi.response;

import lombok.Data;

@Data
public class IrctcResponse {
	
	private String name;
	private Integer age;
	private String gendar;
	private String source;
	private String destination;
	private Integer trainNo;
	private Integer seatNo;
	private Long mobileNo;
	
	private String status;
	private Double price;

}
