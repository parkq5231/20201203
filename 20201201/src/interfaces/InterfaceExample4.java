package interfaces;

public class InterfaceExample4 {
	public static void main(String[] args) {
		MyInterface aa = null;
		// 매개값의 합
		aa = (a, b) -> a + b;
		int result = aa.run(10, 20);
		System.out.println("첫번째 결과값: " + result);

		aa = (a, b) -> a * b;
		result = aa.run(5, 10);
		System.out.println("두번째 결과값: " + result);

		// 두개의 변수(직사각형의 가로 ,세로)->넓이 구하는 기능 구현

		aa = (a, b) -> a * b;
		result = aa.run(10, 25);
		System.out.println("결과값:" + result);
		
		
		
		
	}// end of main
}// end of class