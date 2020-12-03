package funtional;

import java.util.function.IntBinaryOperator;

public class OperatorExample {// 필드선언한거
	static int[] scores = { 92, 95, 87 };// 클래스가 사용될 때 읽히려고 static사용한거 //메인에서 바로 호출 시 static

	static int maxOrMin(IntBinaryOperator oper) {// 따로 선언 안하면 디폴트값으로 선언됨
		int result = 0;
		for (int number : scores) {
			result = oper.applyAsInt(result, number);
		}
		return result;
	}

	public static void main(String[] args) {
		int maxValue = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + "right: " + right);// 진행방향을 알고 싶을 때 이런식으로
				return left > right ? left : right;// left값이 right값보다 크냐고 ?로 묻고 맞으면 left 아니면 right출력한다는 식
			}
		});
		System.out.println("가장 큰 값: " + maxValue);

		int minValue = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				// System.out.println(left + "-" + right);
				return left != 0 && left < right ? left : right;
			}
		});
		System.out.println("가장 작은 값: " + minValue);

	}// end of main
}// end of class