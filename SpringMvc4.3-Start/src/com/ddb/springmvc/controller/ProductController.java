package com.ddb.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ddb.springmvc.form.ProductForm;
import com.ddb.springmvc.service.ProductService;

@Controller
public class ProductController {
	private static final Logger logger = Logger.getLogger(ProductController.class);
	// 自动注入向后端数据库写数据的组件
	@Autowired
	private ProductService productService;
	@RequestMapping(value="/product_input")
	public String inputProduct(){
		logger.info("inputProduct被调用！");
		return "ProductForm";
	}
	@RequestMapping(value="/product_save",method=RequestMethod.POST)
	public String saveProduct(ProductForm productForm,RedirectAttributes redirectAttributes){
		logger.info("saveProduct被调用");
	}
}
