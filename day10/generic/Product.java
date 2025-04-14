package com.shinhan.day10.generic;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//public class Product<A,b> {	
	//상품마다 string, int 등 다르면 아래처럼 정의하면 안됨 
	//String model;
	//String size;
	//int price;
	
	//그러면 쓸 때 결정하자

@NoArgsConstructor
@Setter
@Getter

public class Product<A,B> {	
	A model;
	B size;
	int price;
	
	public Product(A model, B size, int price) {
		super();
		this.model = model;
		this.size = size;
		this.price = price;
	}


	public A getModel() {
		return model;
	}


	public void setModel(A model) {
		this.model = model;
	}


	public B getSize() {
		return size;
	}


	public void setSize(B size) {
		this.size = size;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [model=" + model + ", size=" + size + ", price=" + price + "]";
	}
	
	
	
}
