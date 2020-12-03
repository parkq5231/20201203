package funtional;

//리턴 타입이 없는 consumer의 예제
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		// 맨 처음 안됐던 이유가 필수 매소드가 필요했기 때문
		Consumer<String> consumer = null; // 나중엔 매개값으로 옴

		consumer = t -> System.out.println("안녕 " + t);

		consumer.accept("홍씨");
		consumer.accept("황씨");

		BiConsumer<String, Integer> biCon = null;

		biCon = (String t, Integer u) -> System.out.println("이름은: " + t + "나이는: " + u);
		biCon.accept("김김", 10);

		ObjIntConsumer<String> objIntCon = null;

		objIntCon = (t, value) -> System.out.println("이름은: " + t + "정수는: " + value);
		objIntCon.accept("이이", 20);

		// override는 재정의
	}// end of main
}// end of class