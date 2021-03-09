package com.newer.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.newer.bean.CategorySlogan;
import com.newer.bean.Slogan;
import com.newer.dao.CategorySloganDao;
import com.newer.dao.SloganDao;
import com.newer.service.CategorySloganService;
import com.newer.service.SloganService;

@Controller
public class SloganCotroller {
	@Autowired 
	SloganService sloganService;
	@Autowired
	CategorySloganService categoryService;
//	@Autowired
	Slogan slogan=new Slogan();
//	@Autowired
	CategorySlogan categorySlogan=new CategorySlogan();
	
	
	@GetMapping("ad")
	@ResponseBody
	public List<Slogan> alls() {
		List<Slogan> list=new ArrayList<>();
		Slogan slogan=new Slogan();
		list.add(slogan);
		return sloganService.allSlogan();
	}
	
	@PostMapping("add")
	@ResponseBody
	public String addAd(MultipartFile file,String radio,String opt,String size,String link) {
		Integer hd;
		boolean b = false;
		Integer state=Integer.parseInt(radio);
		slogan.setSlink(link);
		slogan.setSsize(size);
		slogan.setSstate(state);
		slogan.setSimg(file.getOriginalFilename());
		if(sloganService.addslo(slogan)>0) {
			Integer id=sloganService.selectId();
			categorySlogan.setSloname(opt);
			categorySlogan.setSid(id);
			
			hd=categoryService.addslocate(categorySlogan);
			if(hd>0) {
				b=true;
				File f1=new File("D:/Github/GoodsSystem/src/main/resources/static/images/"+file.getOriginalFilename());
				try {
					file.transferTo(f1);
				} catch (IllegalStateException | IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(radio+opt+size+link);
		return b?"添加成功":"添加失败";
	}
	
	@PostMapping("up")
	@ResponseBody
	public String upad(MultipartFile file,String sid,String size,String link,String state,String cate) {
		boolean b = false;
		Integer id=Integer.parseInt(sid);
		Integer sstate=Integer.parseInt(state);
		String simg=file.getOriginalFilename();
		Integer pd=sloganService.upad(sstate, simg, size, link, cate, id);
		if(pd>0) {
			b=true;
			File f1=new File("D://"+file.getOriginalFilename());
			try {
				file.transferTo(f1);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("sid:"+sid+" 尺寸:"+size+" 连接:"+link+" 状态:"+state+" 分类:"+cate);
		return b?"修改成功":"修改失败";
	}
	
	@GetMapping("del")
	@ResponseBody
	public String dele(String sid) {
		boolean b = false;
		Integer id=Integer.parseInt(sid);
		Integer pd=sloganService.del(id);
		if(pd>0) {
			b=true;
		}
		return b?"删除成功":"删除失败";
	}
	
	@GetMapping("manger")
	@ResponseBody
	public String mang(String id,String state) {
		System.out.println(id+state);
		boolean b = false;
		Integer sid=Integer.parseInt(id);
		Integer sstate=Integer.parseInt(state);
		
		Integer pd=sloganService.uostate(sid, sstate);
		if(pd>0) {
			b=true;
		}
		return b?"修改成功":"修改失败";
	}

}
