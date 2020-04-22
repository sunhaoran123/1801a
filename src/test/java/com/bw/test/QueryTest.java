package com.bw.test;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.beans.Hero;
import com.bw.service.HeroServiceImpl;

public class QueryTest {

	@Test
	public void main(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroServiceImpl bean = ac.getBean("heroServiceImpl",HeroServiceImpl.class);
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("cid",1);
		map.put("status",0);
		map.put("startPrice",1);
		map.put("endPrice",100000);
		List<Hero> list = bean.queryAll(map);
		for (Hero hero : list) {
			System.out.println(hero);
		}
		
	}
}
