/*
 * package com.shinhan.day08;
 * 
 * //이 패키지 안에서만 쓸 수 있음 class outerClass { //클래스의 구성요소: 필드, 생성자, 메소드, 블록, "이너클래스"
 * //class = 변수 + 함수
 * 
 * int outerInstanceVar = 1; //인스턴스 변수 static int outerStaticVar = 2; //static
 * 변수
 * 
 * void outerInstancMethod() { System.out.println("outerInstanceVar: " +
 * outerInstanceVar); System.out.println("outerStaticVar: " + outerStaticVar); }
 * static void outerStaticMethod() { //System.out.println("outerInstanceVar: " +
 * outerInstanceVar + "인스턴스 메소드에서 인스턴스 변수 접근 가능"); -> 접근 불가
 * System.out.println("outerStaticVar: " + outerStaticVar +
 * "인스턴스 메소드에서 인스턴스 변수 접근 가능"); }
 * 
 * //이름이 충돌된 경우 int score = 100;
 * 
 * class InstanceInnerClass {//outerClass 안에 들어있는 class -> outerclass 변수 다 쓸 수
 * 있음 int score = 200; int innerInstanceVar = 3; //인스턴스 변수 static int
 * innerStaticVar = 4; //static 변수
 * 
 * void innerInstanceMethod() { int score = 300;
 * System.out.println("outerInstanceVar: " + outerInstanceVar);
 * System.out.println("outerStaticVar: " + outerStaticVar);
 * System.out.println("innerInstanceVar: " + innerInstanceVar);
 * System.out.println("innerStaticVar: " + innerStaticVar );
 * System.out.println("local score : " + score); //가장 가까운 ㄱ쪽을 씀
 * System.out.println("field score : " + this.score); //innerClass
 * System.out.println("outer field score : " + outerClass.this.score); //밖에 있는
 * 변수 접근 } static void outerStaticMethod() {
 * System.out.println("outerStaticVar: " + outerStaticVar);
 * //System.out.println("innerInstanceVar: " + innerInstanceVar);
 * System.out.println("innerStaticVar: " + innerStaticVar); } } }
 * 
 * public class InnerClassTest { public static void main(String[] args) { f1();
 * }
 * 
 * private static void f1() { outerClass.innerInstanceMethod(); } }
 * 
 */