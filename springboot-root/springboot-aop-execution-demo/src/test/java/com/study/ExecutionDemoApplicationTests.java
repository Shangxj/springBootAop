package com.study;

import com.study.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExecutionDemoApplicationTests {

	@Autowired
	ProductService productService;

	@Autowired
	com.study.service.sub.SubService subService;

	@Autowired
	com.study.log.LogService logService;

	@Test
	public void test() {
		System.out.println("###begin test###");
		productService.findById(1L);
		productService.findByTwoArgs(1L,"hello");
		productService.getName();
		subService.demo();
		try {
			productService.exDemo();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		logService.log();
		productService.log();
		logService.annoArg(new com.study.bean.Product());
	}

}
