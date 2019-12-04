package com.gonghanxun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("test")
	public String test() {
		return "test";
	}
	/**
	 * 创建maven项目    
	 * 创建controller层
	 * 创建jsp页面
	 * 跳进jsp页面
	 * 配置相应文件
	 * 进行清理
	 * 进行测试
	 * 进行安装到本地仓库
	 * 进行编译
	 * 
	 * 
	 * */
}
