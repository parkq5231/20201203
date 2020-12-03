package example1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();

		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");

		Map.Entry<Integer, String> entry = null;

		entry = scores.firstEntry();
		System.out.println("가장낮은점수: " + entry.getKey() + "-" + entry.getValue());

		entry = scores.lastEntry();
		System.out.println("가장높은점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

		entry = scores.lowerEntry(95);
		System.out.println("95점 아래 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

		entry = scores.higherEntry(95);
		System.out.println("95점 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

		entry = scores.floorEntry(95);
		System.out.println("95점 이거나 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

		entry = scores.ceilingEntry(85);
		System.out.println("85점 이거나 바로 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

		while (!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "남은 객체수:" + scores.size());
		}

//		scores.put(87, "HONG");
//		scores.put(98, "HWANG");
//		scores.put(75, "CHOI");
//		scores.put(95, "PARK");
//		scores.put(80, "KIM");
//
//		

//		Set<Integer> set = scores.keySet();
//
//		for (Integer num : set) {
//			System.out.println(num);
//		}
//
//		for (Map.Entry<Integer, String> ent : scores.entrySet()) {
//			System.out.println(ent.getKey() + ent.getValue());
//		}
//
//		Map.Entry<Integer, String> ent = scores.firstEntry();
//		ent.getKey();
//		ent.getValue();
//
//		ent = scores.lastEntry();
//		ent.getKey();
//		ent.getValue();
//		

	}// end of main
}// end of class