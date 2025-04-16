package com.shinhan.day12;

import com.shinhan.day12.Button.ClickListener;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOK = new Button();
		
		//1. 구현클래스 -> button_save
		Button b = new Button();
		Button_SaveListener lisn = new Button_SaveListener();
		b.setClickListener(lisn);
		lisn.onClick();
		
		//2. 익명
		ClickListener cl = new ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("익명");
			}
		}; 
		cl.onClick();
		
		Button okButton = new Button();
		Button.ClickListener listener2 = new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("익명");
			}
		}; 
		okButton.setClickListener(listener2);
		okButton.click();
		
		//3. 람다
		ClickListener cl2 = ()->{
			System.out.println("람다");
		};
		cl2.onClick();
		
		Button.ClickListener listener3= ()->{
			System.out.println("람다");
		};
		listener3.onClick();
	}
	
	public static void work(Button.ClickListener listener) {
		//1. 버튼을 listener에 넣는다.
		//button을 클릭한다.
		Button b1 = new Button();
		b1.setClickListener(listener);
		b1.click();
		
	}
	

	
	


}
