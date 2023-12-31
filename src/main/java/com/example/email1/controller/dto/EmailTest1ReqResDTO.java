package com.example.email1.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class EmailTest1ReqResDTO {

	private String mailAddress;
	
	private String mailTitle;
	
	private String maillMessage;
	
}
