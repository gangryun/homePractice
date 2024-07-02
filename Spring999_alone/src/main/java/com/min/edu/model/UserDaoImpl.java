package com.min.edu.model;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.min.edu.vo.UserVo;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserDaoImpl implements IUserDao {

	private final SqlSessionTemplate session;
	private final String NS = "com.min.edu.model.UserDaoImpl.";
	
	
	@Override
	public UserVo getLogin(Map<String, Object> map) {
		
		return session.selectOne(NS+"getLogin", map);
	}

	@Override
	public int registUSer(UserVo vo) {
		
		return session.update(NS+"registUSer", vo);
	}

	@Override
	public int duplicateId(String id) {
		
		return session.selectOne(NS+"duplicateId", id);
	}

	@Override
	public int modifyInfo(Map<String, Object> map) {
		
		return session.update(NS+"modifyInfo", map);
	}

}
