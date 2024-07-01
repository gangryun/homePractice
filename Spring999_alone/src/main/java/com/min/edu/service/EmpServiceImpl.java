package com.min.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.model.IEmpInfoDao;
import com.min.edu.vo.EmpInfoVo;

@Service
public class EmpServiceImpl implements IEmpService {
	
	@Autowired
	private IEmpInfoDao dao;
	
	@Override
	public List<EmpInfoVo> selectAllInfo() {
		return dao.selectAllInfo();
	}

}
