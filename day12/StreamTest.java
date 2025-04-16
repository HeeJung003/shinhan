package com.shinhan.day12;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
		f19();
	}

	private static void f19() {
		StringTest_ShinhanStudent[] arr = { new StringTest_ShinhanStudent("A", 100),
				new StringTest_ShinhanStudent("B", 200), new StringTest_ShinhanStudent("C", 60) };
		List<StringTest_ShinhanStudent> data = Arrays.asList(arr);
		
		List<StringTest_ShinhanStudent> data2 = data.stream().filter(s -> s.getScore()>=100).toList();
		System.out.println(data2);
		
	}

	private static void f18() {
		List<Integer> alist = new ArrayList<Integer>();
		alist.add(10);
		alist.add(20);
		
		
	}

	private static void f17() {
		int[] arr = { 3, 2, 1, 5, 4 };

		long count = Arrays.stream(arr).filter(s -> s >= 4).count(); // 4 이상인거 몇 개 있어?
		OptionalDouble avg = Arrays.stream(arr).average();
		if (avg.isPresent()) {
			avg.getAsDouble();
		}

		int result = Arrays.stream(arr).max().orElse(0); // max 뽑아줘. 없으면 0
		System.out.println(result);
		System.out.println(count);
		System.out.println(avg);
	}

	private static void f16() {
		int[] arr = { 3, 2, 1, 5, 4 };
		boolean result = Arrays.stream(arr).allMatch(score -> score >= 2);
		boolean result2 = Arrays.stream(arr).anyMatch(score -> score >= 2);
		boolean result3 = Arrays.stream(arr).noneMatch(score -> score < 0);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);

	}

	private static void f15() {
		int[] arr = { 3, 2, 1, 4, 5 };
		int result = Arrays.stream(arr).peek(s -> System.out.println(s)) // 중간 -> 결과출력 X
				.sum();
		System.out.println("result " + result);

//		Arrays.stream(arr) //오리지날 stream 원래 stream
//		.forEach(s->System.out.println(s)); //최종
	}

	private static void f14() {
		StringTest_ShinhanStudent[] arr = { new StringTest_ShinhanStudent("A", 100),
				new StringTest_ShinhanStudent("B", 200), new StringTest_ShinhanStudent("C", 60) };
		List<StringTest_ShinhanStudent> data = Arrays.asList(arr);

		data.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(s -> System.out.println(s));
	}

	private static void f13() {
		// 문자 -> 숫자
		List<String> alist = Arrays.asList("10, 30, 20", "40, 50");

		alist.stream().flatMapToInt(s -> {
			String[] strArr = s.split(" ");
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		}).forEach(a -> System.out.println(a + 1));
	}

	private static void f12() {
		List<String> alist = new ArrayList<String>();
		alist.add("this tis java");
		alist.add("thid dis python");

		alist.stream().flatMap(st -> Arrays.stream(st.split(" "))).forEach(word -> {
			System.out.println(word);
		});
	}

	private static void f11() {
		int arr[] = { 1, 2, 3, 4, 5 };
		Arrays.stream(arr).boxed() // -> Integer로 바꿔줌 -> 기능 쓸 수 있음
				.forEach(i -> {
					System.out.println(i.doubleValue());
				});
	}

	private static void f10() {
		StringTest_ShinhanStudent[] arr = { new StringTest_ShinhanStudent("A", 100),
				new StringTest_ShinhanStudent("B", 200), new StringTest_ShinhanStudent("C", 60) };
		List<StringTest_ShinhanStudent> data = Arrays.asList(arr);

		data.stream().mapToInt(st -> st.getScore()) // 정수만 뽑고싶어
				.filter(st -> st >= 80).forEach(st -> {
					System.out.println(st);
				});
	}

	private static void f9() {
		List<Integer> alist = List.of(10, 10, 10, 40, 30, 50);

		// 30점 이상만 원해
		alist.stream() // List를 stream으로 바꿈
				.distinct() // 중복은 제거해줘
				.filter(s -> s >= 30) // 30보다 큰 수만 출력해줘
				// 람다표형식을 모르면 코드가 길어짐.
				.filter(new Predicate<Integer>() {

					@Override
					public boolean test(Integer t) {
						return t >= 30;
					}

				}).forEach(s -> System.out.println(s));
	}

	private static void f8() {
		List<String> alist = List.of("1월", "1화", "2수", "2목", "3금", "3금", "3금");

		alist.stream().distinct() // 중복을 제거해줘
				.filter(s -> s.startsWith("2")) // 2만 뽑고싶어
				.forEach(s -> {
					System.out.println(s);
				});

	}

	private static void f() {
		// 파일 안에 있는 내용 읽기
		// getResource()는 bin에 접근.

		Class cls = StreamTest.class;
		// Path path= Paths.get(cls.getResource("data.txt").toURI());
		// Stream<String> st = Files.lines(path);
		// st.forEach(s -> {System.out.println(s);});
	}

	static int sum = 0; // 필드 -> 접근 가능 -> static이니까 static으로 맞춤

	private static void f6() {
		// 1부터 10까지 돌아라. 합계도

		IntStream.rangeClosed(1, 10).forEach(i -> {
			// 람다 = 익명구현클래스 -> 내부클래스에서 local 변수를 사용할 수 없음. 접근만 가능. 메서드 내의 class = local
			// class (final)
			System.out.println(i);
			sum += i;
		});
		System.out.println(sum);
	}

	private static void f5() {
		StringTest_ShinhanStudent[] arr = { new StringTest_ShinhanStudent("A", 100),
				new StringTest_ShinhanStudent("B", 200), new StringTest_ShinhanStudent("C", 60) };
		List<StringTest_ShinhanStudent> data = Arrays.asList(arr);
		// 내부반복자 이용할거면 stream
		// 점수만 빼서 평균
		double avg = data.stream().mapToInt(st -> st.getScore()).average().getAsDouble();

		System.out.println(avg);

	}

	private static void f4() {
		List<String> alist = List.of("월", "화", "수", "목", "금", "토", "일"); // 하나하나 다 add 안 해도 되는데 수정불가
		alist.stream().forEach(s -> {
			System.out.println(Thread.currentThread().getName() + " : " + s);
		});

		alist.parallelStream().forEach(s -> { // 병렬처리
			System.out.println(Thread.currentThread().getName() + " : " + s);
		});
	}

	private static void f3() {
		String[] arr = { "q", "s" };
		Arrays.stream(arr).forEach(s -> System.out.println(s)); // stream으로 출력한 것임
	}

	private static void f2() {
		// 내부 스트림 (내부 반복자)
		int[] arr = { 2, 2, 3, 3, 4 };
		// 내부 반복자를 쓰려면 string으로 바꿔야 됨

		// IntStream is = (a)->{}; //a가 들어가면 소비함

		// IntConsumer ic = i->{};
		Arrays.stream(arr).forEach(i -> System.out.println(i));

	}

	private static void f1() {
		int arr[] = { 1, 2, 3, 4, 5 };
		// 외부반복자 사용 -> 비효율적
		for (int a : arr) {
			System.out.println(a);
		}

	}
}
