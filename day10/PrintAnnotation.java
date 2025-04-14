package com.shinhan.day10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //method에만 쓸 수 있음 
@Retention(RetentionPolicy.RUNTIME) //runtime시 실행

//annotation 만듦
public @interface PrintAnnotation {
	//PrintAnnotation의 기본값 정의
	String value() default "-";
	int number() default 7;
	int number2() default 10;
}
