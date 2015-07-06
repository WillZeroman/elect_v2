package com.xxx.elec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxx.elec.po.ElecCommonMsg;
import com.xxx.elec.service.ElecCommonMsgService;


@Controller
@RequestMapping("/commonMsg")
public class ElecCommonMsgController {
	
	@Autowired
	private ElecCommonMsgService elecCommonMsgService;
	
	
	@RequestMapping("/edit")
	public @ResponseBody ElecCommonMsg editCommonMsg(String id) {
		ElecCommonMsg po = elecCommonMsgService.findById(id);
		return po;
	}
}
