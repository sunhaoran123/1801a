package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.beans.Camp;
import com.bw.beans.Hero;

public interface HeroService {
	public List<Hero> queryAll(Map<String,Object> map);
	public List<Camp> queryCamp();
	public void add(Hero hero);
	public void buy(Integer id);
}
