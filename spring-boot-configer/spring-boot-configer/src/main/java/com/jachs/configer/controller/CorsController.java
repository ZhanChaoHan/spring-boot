package com.jachs.configer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jachs.configer.config.UserConfig;

/***
 * 使用注解 @CrossOrigin
 * @author zhanchaohan
 *
 */
@Controller
@RequestMapping("/cors")
//@CrossOrigin(origins = "*")
//@CrossOrigin(value = "http://localhost:8081") //指定具体ip允许跨域
public class CorsController {
	
	@RequestMapping("/getUser")
	@ResponseBody
	public UserConfig testCors() {
		return new UserConfig("jachs", 0, "mkcjcy@kic.com");
	}
}
