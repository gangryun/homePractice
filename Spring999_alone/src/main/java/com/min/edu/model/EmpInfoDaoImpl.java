package com.min.edu.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.edu.vo.EmpInfoVo;

@Repository
public class EmpInfoDaoImpl implements IEmpInfoDao {

	private final String NS = "com.min.edu.model.EmpInfoDaoImpl.";
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public List<EmpInfoVo> selectAllInfo() {
		return sessionTemplate.selectList(NS+"selectAllInfo");
	}

}
