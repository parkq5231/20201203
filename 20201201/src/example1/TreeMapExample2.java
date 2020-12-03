package example1;

import java.util.HashSet;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();

		scores.put(87, "HONG");
		scores.put(98, "HWANG");
		scores.put(75, "CHOI");
		scores.put(95, "PARK");
		scores.put(80, "KIM");
		scores.firstEntry();

		System.out.println("scores의 첫번째:" + scores.firstEntry().getKey());
		NavigableMap<Integer, String> navigableMap = scores.descendingMap();// map타입의 내림차순으로 결과값?

		navigableMap.firstEntry();
		System.out.println("navigableMap의 첫번째:" + navigableMap.firstEntry().getKey());

		NavigableSet<Integer> nSet = scores.descendingKeySet();

		System.out.println("Scores:첫번째 키" + scores.firstKey());
		System.out.println("nSet:첫번째 키" + nSet.first());

		// 배열 선언하기 {34,55,26,48,77}오름차순 정렬하는 프로그램 만들어보기

		System.out.println("==================");
		int[] intAry = { 34, 55, 26, 48, 77 };
		TreeSet<Integer> aa = new TreeSet<>();
		for (int i = 0; i < intAry.length; i++) {
			aa.add(intAry[i]);
		}
		System.out.println(aa);
		System.out.println("==============");
		Set<Integer> bb = new HashSet<>();
		for (int i = 0; i < intAry.length; i++) {
			bb.add(intAry[i]);
		}
		System.out.println(bb);

		for (int i = 0; i < aa.size(); i++) {
			intAry[i] = aa.pollFirst();
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}

	}// end of main
}// end of class
