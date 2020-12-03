package funtional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

//리턴값,입력값 둘 다 존재
//apply 는 무조건 구현해줘야함
public class FunctionExample {// 매개값을 인스턴스에 선언하여 그걸 list에 담는다
	public static List<Student> list = Arrays.asList(new Student("Hong", 90, 96), new Student("Hwang", 95, 93));

	public static void printString(Function<Student, String> func) {
		for (Student student : list) {
			System.out.println(func.apply(student));
		}
	}

	//
	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}

	public static double avg(ToDoubleFunction<Student> func) {
		double result = 0, sum = 0;
		for (Student student : list) {
			result = func.applyAsDouble(student);
			sum += result;
		}
		return sum / list.size();
	}

	public static void main(String[] args) {
		Function<String, Integer> func = null;

		func = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		System.out.println(func.apply("Hello"));

		System.out.println("[학생이름,수학점수]");
		BiFunction<String, String, Integer> biFunc = null;
		printString(t -> t.getName() + "-" + t.getMathScore());

		System.out.println("[영어점수]");
		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
		});

		System.out.println("[합계점수]");
		printInt(value -> value.getEngScore() + value.getMathScore());

		System.out.println("[영어평균]");
		double avg = avg(new ToDoubleFunction<Student>() {
			@Override
			public double applyAsDouble(Student value) {
				return value.getEngScore(); // int->double로 해줌 자동 형변환
			}
		});
		System.out.println(avg);

	}// end of main
}// end of class
