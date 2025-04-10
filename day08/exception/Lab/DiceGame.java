package com.shinhan.day08.exception.Lab;

public class DiceGame {

	public static void main(String[] args) {
		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);

	}

	int countSameEye(int n) {
		Dice num1 = new Dice(8);
		Dice num2 = new Dice(8);
		int count = 0;

		try {
			if (n < 0) {
				//throw new IllegalArgumentException("던지는 횟수는 음수불가"); // 강제 발생
			}
		} catch (IllegalArgumentException a) {
			System.out.println(a.getMessage());
			return 0;
		}

		for (int i = 0; i < n; i++) {
			if (num1.play() == num2.play()) {
				count++;
			}
		}
		return count;
	}
}
