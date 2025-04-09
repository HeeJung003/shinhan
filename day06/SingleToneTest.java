package com.shinhan.day06;

import com.shinhan.day05.Exercise.ShopService;

public class SingleToneTest {

	public static void main(String[] args) {
		//LoginServlet a = new LoninServlet();
		//LoginServlet b = new LoninServlet();
		
		//System.out.println(a == b);
		
		LoginServlet c = LoginServlet.getInstance();
		LoginServlet d = LoginServlet.getInstance();
		
		System.out.println(c == d);
		
		ShopService e = ShopService.getInstance();

	}

}
