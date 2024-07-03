package com.min.edu.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.min.edu.model.IUserDao;
import com.min.edu.vo.UserVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

	private final IUserDao dao;
	
	@Override
	public UserVo getLogin(Map<String, Object> map) {
		log.info("UserServiceImpl getLogin");
		return dao.getLogin(map);
	}

	@Override
	public int registUSer(UserVo vo) {
		log.info("UserServiceImpl registUSer");
		return dao.registUSer(vo);
	}

	@Override
	public int duplicateId(String id) {
		log.info("UserServiceImpl duplicateId");
		return dao.duplicateId(id);
	}

	@Override
	public int modifyInfo(Map<String, Object> map) {
		log.info("UserServiceImpl modifyInfo");
		return dao.modifyInfo(map);
	}

	@Override
	public String findId(UserVo vo) {
		log.info("UserServiceImpl findId");
		return dao.findId(vo);
	}
	
	
	
}
