package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.beans.Camp;
import com.bw.beans.Hero;
import com.bw.service.HeroService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class HeroController {

	@Resource
	private HeroService heroService;
	@RequestMapping("queryAll")
	public String querryAll(@RequestParam(defaultValue="1") Integer pageNum,Model model ,Integer cid,
			Integer status,Double startPrice,Double endPrice){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("cid", cid);
		map.put("status", status);
		map.put("startPrice", startPrice);
		map.put("endPrice", endPrice);
		
		PageHelper.startPage(pageNum,3);
		List<Hero> list = heroService.queryAll(map);
		PageInfo<Hero> page = new PageInfo<Hero>(list);
		model.addAttribute("page", page);
		 
		List<Camp> camp = heroService.queryCamp();
		model.addAttribute("campList",camp);
		
		model.addAttribute("map",map);
		return "list";
		
	}
	@RequestMapping("add")
	public String add(Hero hero){
		heroService.add(hero);
		return "redirect:queryAll";
		
	}
//	@RequestMapping("buy")
	//public String buy(Integer id,Model model){
		//heroService.buy(id);
		//model.addAttribute(arg0, arg1)
		//return null;
		
	//}
}
