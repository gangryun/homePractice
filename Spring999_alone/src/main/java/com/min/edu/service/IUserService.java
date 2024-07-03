package com.min.edu.service;

import java.util.Map;

import com.min.edu.vo.UserVo;

public interface IUserService {

	public UserVo getLogin(Map<String, Object> map);
	
	public int registUSer(UserVo vo);
	
	public int duplicateId(String id);
	
	public int modifyInfo(Map<String, Object> map);
	
	public String findId(UserVo vo);
}
