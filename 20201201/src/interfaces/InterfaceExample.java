package interfaces;

interface Runnable {// 첫글자만 대문자로
	public void run();
}

class AutoRun implements Runnable {
	@Override
	public void run() {
		System.out.println("자동실행.");
	}
}

class NewRun implements Runnable {
	@Override
	public void run() {
		System.out.println("새로운실행.");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Runnable runnable = new AutoRun();
		runnable.run();

		runnable = new NewRun();
		runnable.run();

		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("익명실행");
			}
		};
		runnable.run();

		runnable = () -> System.out.println("또다른 익명 실행");//()안의 매개변수값을 받아서 실행시키겠다

		runnable.run();

		
		
		
		
		
		
		
		
		
		
		
		
	}// end of main
}// end of class