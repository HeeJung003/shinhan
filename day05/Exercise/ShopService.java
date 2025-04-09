package com.shinhan.day05.Exercise;

public class ShopService {
	static ShopService shop = new ShopService();	
	
	private ShopService() {
		
	}
	
	//static을 해야 접근 가능
	public static ShopService getInstance() {
		return shop;
	}
}
