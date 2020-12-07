package LambdaExample;

//718p
import java.util.function.IntBinaryOperator;

public class Example1 {
	// field
	private static int[] scores = { 10, 50, 3 };

	// method
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			// System.out.println(result+"-"+score+"여기까지");
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	// main
	public static void main(String[] args) {
		// 최대값
		int max = maxOrMin((left, right) -> left > right ? left : right);
		System.out.println("최대값: " + max);
		// 최소값
		int min = maxOrMin(new IntBinaryOperator() {// IBO라는 인터페이스의 기능을 정의하겠다
			@Override
			public int applyAsInt(int left, int right) {
				System.out.println(left + "-" + right);
				return left < right ? left : right;
			}
		});
		System.out.println("최소값: " + min);

	}// end of main
}// end of class