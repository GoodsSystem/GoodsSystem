package com.newer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newer.bean.LoginLog;
import com.newer.bean.Users;
import com.newer.service.UsersService;
import com.newer.service.impl.LoginLogService;

@Controller
public class UsersController {
	// 获取service层对象
	@Autowired
	UsersService usersService;
	LoginLogService loginlogService;
	LoginLog loginLog;

	@RequestMapping("login")
	@ResponseBody
	public int setUsers(HttpServletRequest req, @RequestParam("uname") String uname,
			@RequestParam("upassword") String upassword) {
		HttpSession s = req.getSession();
		Users u = new Users();
		u.setUname(uname);
		u.setUpassword(upassword);
		Users user = usersService.userslogin(u);
		Integer i = 0;
		if (user != null) {
			Integer f = user.getUstate();
			if (f == 1) {
				i = 1;
				s.setAttribute("u", user);
				System.out.println(user.getUid());
			}
		} else {
			i = 2;
		}
		return i;
	}

	@RequestMapping("getall")
	@ResponseBody
	public List<Users> alluser() {
		List<Users> list = usersService.usersserch();
		return list;
	}

	@RequestMapping("getone")
	@ResponseBody
	public Users oneuser(HttpServletRequest req) {
		HttpSession s = req.getSession();
		Users b = (Users) s.getAttribute("u");
		Users u = usersService.usersearch(b.getUid());
		return u;
	}

	@RequestMapping("getstate")
	@ResponseBody
	public Users state(HttpServletRequest req, @RequestParam("uname") String uname,
			@RequestParam("uemail") String uemail) {
		HttpSession s = req.getSession();
		Users b = (Users) s.getAttribute("u");
		System.out.println(uemail + "~~~~~~~~~~");
		b.setUname(uname);
		b.setUemail(uemail);
		b.setUroot(0);
		boolean l = usersService.change(b);
		if (l) {
			b.setUroot(1);
		}
		return b;
	}

	@RequestMapping("repassword")
	@ResponseBody
	public int password(HttpServletRequest req, @RequestParam("oldpassword") String oldpassword,
			@RequestParam("newpassword") String newpassword) {
		HttpSession s = req.getSession();
		Users u = (Users) s.getAttribute("u");
		u.setUpassword(newpassword);
		System.out.println(u.getUid() + "!!" + u.getUpassword());
		boolean f = usersService.changepwd(u);
		System.out.println(f);
		Integer i = 0;
		return i;
	}

	@RequestMapping("changestate")
	@ResponseBody
	public int changestate(@RequestParam("uid") String uid, @RequestParam("ustate") String ustate) {
		Integer i = Integer.parseInt(uid);
		Integer n = Integer.parseInt(ustate);
		System.out.println(i + "!!!!" + n);
		Users u = new Users();
		u.setUid(i);
		if (n == 1) {
			u.setUstate(0);
		} else if (n == 0) {
			u.setUstate(1);
		}
		boolean b = usersService.changes(u);
		return 1;

	}

	// -------------------------------------
	/**
	 * 接收用户数据
	 * 
	 * @param md
	 * @return
	 */
	@GetMapping("list")
	@ResponseBody
	public List<Users> login() {
		return usersService.queryAll();
	}

	/**
	 * 根据ID查找数据
	 */
	@GetMapping("findById")
	@ResponseBody
	public Users findById(String uid) {

		Integer id = Integer.parseInt(uid);
		Users u = new Users();
		u.setUid(id);
		return usersService.queryById(u);

	}

	/**
	 * 更新用户状态码
	 */
	@GetMapping("upstate")
	@ResponseBody
	public int upstate(String uid, String state) {
		Integer id = Integer.parseInt(uid);
		Integer s = Integer.parseInt(state);
		Users u = new Users();
		u.setUid(id);
		u.setUstate(s);
		return usersService.updateState(u);
	}

	/**
	 * 删除用户单条数据
	 */
	@GetMapping("deluser")
	@ResponseBody
	public int deluser(String uid) {
		Integer id = Integer.parseInt(uid);
		return usersService.delusers(id);
	}

	/**
	 * 更新用户数据
	 */
	@PostMapping("upuser")
	public String upuser(Users user) {
		usersService.aluser(user);
		return "../static/user_list";
	}

	/**
	 * 模糊查询
	 */
	@GetMapping("dim")
	@ResponseBody
	public List<Users> dim(String n) {

		return usersService.queryLike(n);
	}

	@GetMapping("getseuser")
	@ResponseBody
	public Users getuser(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		Users u = (Users) session.getAttribute("u");
		return u;

	}
	@GetMapping("delse")
	public String del(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		session.removeAttribute("u");
		return "../static/login";

	}
}
