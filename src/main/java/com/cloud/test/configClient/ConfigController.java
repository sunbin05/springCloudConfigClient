package com.cloud.test.configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${name}")
	private String name;
	@Value("${age}")
	private String age;
	@Value("${version}")
	private String version;
	
	@RequestMapping("/index")
	public String index(){
		return this.name+","+this.age+","+this.version;
	}
	
	@RequestMapping("/abc")
	public String abc(){
		return "abc";
	}
}
