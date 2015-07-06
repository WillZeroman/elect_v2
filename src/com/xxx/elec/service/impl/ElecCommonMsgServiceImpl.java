package com.xxx.elec.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.elec.mapper.ElecCommonMsgMapper;
import com.xxx.elec.po.ElecCommonMsg;
import com.xxx.elec.service.ElecCommonMsgService;

@Service(ElecCommonMsgService.SERVICE_NAME)
public class ElecCommonMsgServiceImpl implements ElecCommonMsgService {
	
	@Autowired
	private ElecCommonMsgMapper elecCommonMsgMapper;
	
	
	@Override
	public ElecCommonMsg findById(String id){
		ElecCommonMsg elecCommonMsg = elecCommonMsgMapper.selectByPrimaryKey(id);
		return elecCommonMsg;
	}

}
