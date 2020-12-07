package funtional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//책 700p
//람다는 리턴 구문이 1개인 경우에만 사용하는거
public class PredicateExample2 {
	//
	private static List<Student2> list = Arrays.asList(new Student2("홍길동", "남", 90), new Student2("김순희", "여", 90),
			new Student2("김자바", "남", 95), new Student2("박한나", "여", 92));

	public static double avg(Predicate<Student2> predicate) {
		int count = 0, sum = 0;
		for (Student2 student : list) {
			if (predicate.test(student)) {// student값이 참인경우?
				sum += student.getScore();
				count++;
			}
		}
		return (double) sum / count;
	}

	public static void main(String[] args) {
		double maleAvg = avg(new Predicate<Student2>() {
			@Override
			public boolean test(Student2 t) {
				return t.getSex().equals("남"); //이럴경우 avg메소드로 가서 하는거
			}
		});
		System.out.println("남자평균점수: " + maleAvg);

		double femaleAvg = avg((t) -> t.getSex().equals("여"));
		System.out.println("여자평균점수: " + femaleAvg);

	}// end of main
}// end of class