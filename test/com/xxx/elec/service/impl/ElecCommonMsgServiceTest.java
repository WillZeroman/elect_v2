package com.xxx.elec.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xxx.elec.po.ElecCommonMsg;
import com.xxx.elec.service.ElecCommonMsgService;
/**
 * 单元测试，无sql语句打印
 * @author 321
 *
 */
public class ElecCommonMsgServiceTest {

	private ApplicationContext atx = null;
	
	@Before
	public void before(){
		String[] config = {"classpath:spring/applicationContext-dao.xml","classpath:spring/applicationContext-service.xml","classpath:spring/applicationContext-transaction.xml"};
		atx = new ClassPathXmlApplicationContext(config);
	}
	
	@Test
	public void testFindById() {
		ElecCommonMsgService impl = (ElecCommonMsgService) atx.getBean(ElecCommonMsgService.SERVICE_NAME);
		//ElecCommonMsgService impl = (ElecCommonMsgService) atx.getBean("com.xxx.elec.service.impl.ElecCommonMsgServiceImpl");
		
		System.out.println(impl);
		ElecCommonMsg po = impl.findById("1");
		System.out.println(po);
		System.out.println(po.getCreatedate());
	}

}
