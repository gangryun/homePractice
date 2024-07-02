package com.min.edu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {

	private String id;
	private String password;
	private String name;
	private String email;
	private String phone;
	private String joindate;
	private String delflag;
	private String auth;

}
