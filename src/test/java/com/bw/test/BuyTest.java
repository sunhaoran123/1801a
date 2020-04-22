package com.bw.test;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.beans.Hero;
import com.bw.service.HeroServiceImpl;

public class BuyTest {

	@Test
	public void main(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroServiceImpl bean = ac.getBean("heroServiceImpl",HeroServiceImpl.class);
		int id=1;
		bean.buy(id);
		
		
	}
}
