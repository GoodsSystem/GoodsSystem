package com.newer.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.ognl.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newer.bean.LoginLog;
import com.newer.bean.Users;
import com.newer.service.LoginLogService;
import com.newer.service.UsersService;

@Controller
public class UsersController {

	@Autowired
	UsersService usersService;
	LoginLogService loginlogService;
	LoginLog loginLog;

	@PostMapping("login")
	public String setUsers(HttpServletRequest req, Users u, String vcode) {
		HttpSession s = req.getSession();
		System.out.println(u.getUname() + "~~~~" + u.getUpassword());
		Users user = usersService.userslogin(u);
		// 获取时间
//		LoginLog lg=new LoginLog();
//		lg.setUid(user.getUid());
//		boolean f = loginlogService.LoginLogsave(lg);
		if (user != null ) {
			s.setAttribute("u", user);
		}
		return user != null ? "../static/index" : "../static/login";
	}
	
	
	@RequestMapping("getall")
	@ResponseBody
	public List<Users> alluser() {
		List<Users> list =usersService.usersserch();
		return list ;
	}
	
	
	@RequestMapping("getone")
	@ResponseBody
	public Users oneuser(HttpServletRequest req) {
		HttpSession s = req.getSession();
		Users b= (Users) s.getAttribute("u");
		Users u =usersService.usersearch(b.getUid());
		return u ;
	}
	
	@RequestMapping("getstate")
	@ResponseBody
	public Users state(HttpServletRequest req,@RequestParam("uname") String uname,@RequestParam("uemail") String uemail) {
		HttpSession s = req.getSession();
		Users b= (Users) s.getAttribute("u");
		System.out.println(uemail+"~~~~~~~~~~");
		b.setUname(uname);
		b.setUemail(uemail);
		b.setUroot(0);
		boolean l= usersService.change(b);
		
		if(l) {
			b.setUroot(1);
		}
		
		return b;
	}
	
			@RequestMapping("repassword")
			@ResponseBody
			public int password(HttpServletRequest req,@RequestParam("oldpassword") String oldpassword,@RequestParam("newpassword") String newpassword) {
				
				HttpSession s = req.getSession();
				Users u=(Users) s.getAttribute("u");
				System.out.println(oldpassword+"~~~"+newpassword);
				u.setUpassword(newpassword);
				System.out.println(u.getUid()+"!!"+u.getUpassword());
				boolean f=usersService.changepwd(u);
				System.out.println(f);
				Integer i =0;
//				if(b!=null) {
//					System.out.println(b.getUpassword());
//					b.setUid(u.getUid());
//					
//					b.setUpassword(newpassword);
//					System.out.println(b.getUpassword());
//					System.out.println(b.getUname());
//					boolean f=usersService.changepwd(b);
//					
//				}
				
				return i;
				
			}
			@PostMapping
			@RequestMapping("changestate")
			@ResponseBody
			public int changestate(@RequestParam("uid") String  uid,@RequestParam("ustate") String ustate) {
				Integer	 i=Integer.parseInt(uid);
				Integer n=Integer.parseInt(ustate);
				System.out.println(i+"!!!!"+n);
				Users u=new Users();
				u.setUid(i);
				if(n==1) {
				u.setUstate(0);
				
				}else if(n==0) {
					u.setUstate(1);
				}
				
				boolean b=usersService.changes(u);
				return 1;
				
			}
	 	
	
	
	
	

}
