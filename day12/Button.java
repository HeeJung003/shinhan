package com.shinhan.day12;

public class Button {
	
	//인터페이스가 class 안에 있음 ; inner interface
	public static interface ClickListener {
		void onClick();
	}
	
	private ClickListener clickListener;
	
	//ClickLister clickListener가 private이니까 set 필요
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	//이 버튼의 동작(Listener)을 구현class에서 정함
	//클릭하면 click()에서 그 동작을 호출
	public void click() {
		this.clickListener.onClick();
	}
}
