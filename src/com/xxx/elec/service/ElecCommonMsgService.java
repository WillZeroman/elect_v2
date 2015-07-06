package com.xxx.elec.service;

import com.xxx.elec.po.ElecCommonMsg;

public interface ElecCommonMsgService {
	public final static String SERVICE_NAME ="com.xxx.elec.service.impl.ElecCommonMsgService";
	ElecCommonMsg findById(String id);
	
}
