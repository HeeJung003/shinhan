package com.shinhan.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AutoSaveThreadTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		call2();
		// autoSave();
		System.out.println("main저장");
	}


	//threadpool 사용법 2
	private static void call4() throws InterruptedException, ExecutionException {
		List<Future<Integer>> arr = new ArrayList<>();
		
		ExecutorService exService = Executors.newFixedThreadPool(5);
		
		for (int i = 1; i <= 100; i++) {
			int index = i;
			Future<Integer> result = exService.submit((new Callable<Integer>(){

				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int su = 1; su <= index; su++) {
						sum += su;
					}System.out.println(Thread.currentThread().getName() + " ->" + index + " 까지의 합계는 = " + sum);
					return sum;
				}
				
			}));
			//System.out.println("Future로 받은 result 값 : " + result.get()); //-> get때문에 순서대로 실행됨
			arr.add(result);
			
		}
		for(Future<Integer> f : arr) {
			System.out.println("?? " + f.get());
		}
		exService.shutdown();
	}
	
	//threadpool 사용법 1_1
	private static void call3() { //call2를 간단하게 람다표현식을 써서 표현할 수 있음
		ExecutorService exService = Executors.newFixedThreadPool(5);
		for(int i = 0; i <=100; i++) {
			int index = i;
			Runnable r1 =() -> {
				int sum = 0;
				for (int su = 1; su <= index; su++) {
					sum += su;
				}
				System.out.println(Thread.currentThread().getName() + " ->" + index + " 까지의 합계는 = " + sum);
			};
			exService.execute(r1);
		}
		exService.shutdown();
		
	}

	//threadpool 사용법 1
	private static void call2() {
		//threadPool 몇 개 쓸건지 정의
		//100번 돌릴거야
		ExecutorService exService = Executors.newFixedThreadPool(5); //thread 5개만 쓸거야
		for (int i = 1; i <= 100; i++) {
			// 정해진 개수(thread 5개) 내 실행
			int index = i;
			exService.execute(new Runnable() { // 익명으로 만들고 싶음
				@Override
				public void run() {
					int sum = 0;
					for (int su = 1; su <= index; su++) {
						sum += su;
					}
					System.out.println(Thread.currentThread().getName() + " ->" + index + " 까지의 합계는 = " + sum);

				}
			});
		}
		exService.shutdown();
	}

	private static void call() {
		// Thread1~100까지 loop
		// 1~1, 1~2, 1~3 ... 1~100 -> thread "100개" 만들기 -> 무의미, 비효율 -> 실행 시에 만들자 = 익명 구현
		// 클래스 => how? runnable인터페이스를 thread 안에 넣음

		for (int i = 1; i <= 100; i++) {
			int index = i;
			Thread t1 = new Thread(new Runnable() { // 익명으로 만들고 싶음

				@Override
				public void run() {
					int sum = 0;
					// 익명 구현 클래스 = local class에서 local 변수를 이용하면 final => for문에서 i를 사용할 수 없음 -> 변수
					// 선언(int index = i;)
					for (int su = 1; su <= index; su++) {
						sum += su;
					}
					System.out.println(Thread.currentThread().getName() + " ->" + index + " 까지의 합계는 = " + sum);

				}
			});
			t1.start();
		}

	}

	private static void autoSave() {
		AutoSaveThread t1 = new AutoSaveThread();
		t1.setDaemon(true); // 데몬으로 지정 : main이 끝나면 daemom도 끝남
		t1.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("autosave함수 종료");
	}

}
