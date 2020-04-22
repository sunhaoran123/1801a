package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.beans.Camp;
import com.bw.beans.Hero;
import com.bw.mapper.HeroMapper;


@Service
public class HeroServiceImpl implements HeroService{
	@Resource
	private HeroMapper heroMapper;
	public List<Hero> queryAll(Map<String,Object> map) {
		// TODO Auto-generated method stub
		List<Hero> queryAll = heroMapper.queryAll(map);
		return queryAll;
	}
	public List<Camp> queryCamp() {
		// TODO Auto-generated method stub
		return heroMapper.queryCamp();
	}
	public void add(Hero hero) {
		// TODO Auto-generated method stub
		heroMapper.add(hero);
	}
	public void buy(Integer id) {
		// TODO Auto-generated method stub
		heroMapper.buy(id);
		
	}

}
