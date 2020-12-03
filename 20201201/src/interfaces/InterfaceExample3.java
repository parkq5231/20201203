package interfaces;

//함수적 인터페이스
interface MyFunctionalInterface {
	public void run(int radius);
}

interface Triangle {
	public void aa(int a, int b);
}

public class InterfaceExample3 {
	public static void main(String[] args) {
		MyFunctionalInterface math = null;
		// 1. 화면출력(원의 넓이를 구하는 기능 구현)
		math = (num1) -> {
			double result = num1 * num1 * Math.PI;// 3.14대신 math.pi
			System.out.println("원의 넓이: " + result);
		};
		math.run(5);
		// 2. 화면출력(밑변으로 가지는 삼각형의 넓이 구하는 기능)
		math = (num1) -> {
			double result = 1.73 / 4 * num1 * num1;
			System.out.println("삼각형의 넓이: " + result);
		};
		math.run(5);
		// 3. 화면출력( 정사각형의 넓이를 구하는 기능 구현)
		math = (num1) -> {
			int result = num1 * num1;
			System.out.println("정사각형의 넓이: " + result);
		};
		math.run(5);
	}// end of main
}// end of class