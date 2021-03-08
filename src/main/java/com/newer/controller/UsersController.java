package com.newer.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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
		LoginLog lg=new LoginLog();
		lg.setUid(user.getUid());
//		boolean f = loginlogService.LoginLogsave(lg);
		if (user != null ) {
			s.setAttribute("u", user);
		}
		return user != null ? "../static/index" : "../static/login";
	}

}
