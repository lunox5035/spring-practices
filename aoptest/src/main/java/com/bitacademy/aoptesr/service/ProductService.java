package com.bitacademy.aoptesr.service;

import org.springframework.stereotype.Service;

import com.bitacademy.aoptesr.vo.ProductVo;

@Service

public class ProductService {
	public ProductVo find(String name) {
		System.out.println("[ProductService] finding...");
		
//		if(1-1 == 0 ) {
//		throw new RuntimeException("Find Excepion");
//		}
		return new ProductVo(name);
	}	
		
}
