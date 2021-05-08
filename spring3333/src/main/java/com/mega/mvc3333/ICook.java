package com.mega.mvc3333;

public interface ICook {
	//인터페이스를 implements해서 구현한 클래스에게 자신의 모든 메서드를 강제적으로 구현하도록 한다.
	//be able to~
	public void makeRice();
	public void makeSoup();
	public void makeSalad();
	public void makeSource();
}
