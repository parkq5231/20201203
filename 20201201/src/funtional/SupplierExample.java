package funtional;

import java.util.IntSummaryStatistics;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		// 매개값 X -> 반환값 O
		Supplier<String> supp = null;
		supp = new Supplier<String>() {

			@Override
			public String get() {
				return "Hello";
			}
		};
		System.out.println(supp.get());

		Supplier<Integer> intSup = new Supplier<Integer>() {
			@Override
			public Integer get() {
				int result = 35 * 20;
				return null;
			}
		};
		intSup.get();

		IntSupplier intSupp = () -> (int) (Math.random() * 6) + 1;
		System.out.println(intSupp.getAsInt());

	}// end of main
}// end of class