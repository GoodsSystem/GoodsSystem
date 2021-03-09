package com.newer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newer.bean.Store;
import com.newer.service.StoreService;
@Controller
public class StoreController {
	
	@Autowired
	StoreService storeService;

	@GetMapping("passstore")
	@ResponseBody
	public List<Store> passStore() {
		return storeService.selStore();
	}

	@GetMapping("nopassstore")
	@ResponseBody
	public List<Store> npstore() {
		return storeService.noPassStore();
	}

	@GetMapping("delstore")
	@ResponseBody
	public Boolean delStore(int stoid) {
		return storeService.delStore(stoid);
	}

	@GetMapping("detstore")
	@ResponseBody
	public Store detStore(String stoid) {
		Integer id= Integer.parseInt(stoid.split(",")[1]);
		return storeService.detStore(id);
	}

	@GetMapping("fuzzyquery")
	@ResponseBody
	public List<Store> fuquery(String str1) {
		return storeService.fuzzyQuery(str1);
	}
	@GetMapping("upstore")
	@ResponseBody
	public Boolean upd(String stoid) {
		Integer id=Integer.parseInt(stoid);
		Store s= new Store();
		s.setStoid(id);
		s.setStostate(1);
		return storeService.upStore(s);
	}
	@GetMapping("refusestore")
	@ResponseBody
	public Boolean upda(String stoid,String storeason) {
		System.out.println(storeason);
		Integer id=Integer.parseInt(stoid);
		Store s= new Store();
		s.setStoid(id);
		s.setStostate(2);
		s.setStoreason(storeason);
		return storeService.refuseStore(s);
	}
}
