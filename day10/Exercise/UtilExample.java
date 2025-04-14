package com.shinhan.day10.Exercise;

class Util{
	//파라메타로 받은 첫번째 값이 pair만 되도록 함. Pair<K,V>, Pair<K,V>의 하위도 가능 (상위 = 하위)
	//Util.getKey로 들어가니까 static으로 util안에.
	//<K,V>제너릭 메서드를 쓸거야
	//V로 리턴할거야
	//getValue는 함수 이름이야
	//나는 Pair pair, K key를 받을건데
	//Pair는 제너릭으로 <K,V>을 받아
	
	static <K,V> V getValue(Pair<K, V> pair, K key) {
		if(pair.getKey().equals(key)) {
			return pair.getValue();
		}
		return null;
	}
	
	//P pair, K key를 받을건데 P는 Pair를 상속받아야 돼
	//P는 상속(extends)할건데 <K, V>를 받아
	static <P extends Pair<K,V>, K,V> V getValue2(P pair, K key) {
		if(pair.getKey().equals(key)) {
			return pair.getValue();
		}
		return null;
	}
}

 class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

 class ChildPair<K, V> extends Pair<K, V> {
	public ChildPair(K k, V v) {
		super(k, v);
	}
}

 class OtherPair<K, V> {
	private K key;
	private V value;

	public OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);

		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);
	}
}
