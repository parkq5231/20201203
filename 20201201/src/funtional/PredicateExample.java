package funtional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//boolean 타입으로 리턴해주는 함수가 predicate
//람다함수 5번째
public class PredicateExample {
	static List<String> list = Arrays.asList("Hong", "Hwang", "Kim"); // 매개값을 넣으면 알아서 컬랙션을 만들어줌

	public static void getName(Predicate<String> pred) {
		for (String name : list) {
			if (pred.test(name)) {// test의 반환타입은 boolean으로 정해져 있음
				System.out.println(name);
			}
		}
	}// end of getName

	public static void main(String[] args) {
		getName((t) -> t.length() > 3);

	}// end of main
}// end of class
