package com.tedu.sp03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient			//主程序启用服务注册发现客户端
@SpringBootApplication
public class Sp03UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp03UserserviceApplication.class, args);
	}

}
