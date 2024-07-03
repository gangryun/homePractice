package com.min.edu.model;

import java.util.Map;

import com.min.edu.vo.UserVo;

public interface IUserDao {

	public UserVo getLogin(Map<String, Object> map);
	
	public int registUSer(UserVo vo);
	
	public int duplicateId(String id);
	
	public int modifyInfo(Map<String, Object> map);
	
	public String findId(UserVo vo);
	
}
