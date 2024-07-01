package com.min.edu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmpInfoVo {

	private String id                  ;
	private String password            ;
	private String name                ;
	private String phone               ;
	private String enable              ;
	private String auth                ;
	private String photo_storedname    ;
	
	
}
