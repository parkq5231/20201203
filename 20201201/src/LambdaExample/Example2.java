package LambdaExample;

import java.util.function.ToIntFunction;

import funtional.Student;

public class Example2 {

	private static Student[] students = { new Student("길동", 90, 96), new Student("용권", 95, 93) };

	public static double avg(ToIntFunction<Student> avg) {
		double result = 0, sum = 0;
		for (Student student : students) {
		//	result = avg.applyAsDouble(student);			
		}

		return 5.3;
	}

	public static void main(String[] args) {

	}// end of main
}// end of class