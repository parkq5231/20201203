package example1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class hash {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();// list라는 컬랙션에 스트링 타입의 list변수 선언 /인스턴스 만들어씅ㅁ
		list.add(new String("Hello"));
		list.add(new String("Hello"));
		list.add("Welcome");// 원래는 new 로 생성자 호출해야되는데 스트링타입만 이거 안쓰고 가능

		list.get(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------");
		for (String str : list) {
			System.out.println(str);
		}

		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Welcome");
		set.add("Hello");

		set.iterator();

		Iterator<String> iter = set.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		for (String str : set) {
			System.out.println(str);
		}
		System.out.println("========================");
		Set<Fruit> fruits = new HashSet<>();
		fruits.add(new Fruit("Apple", 1000));
		fruits.add(new Fruit("Banana", 1500));
		fruits.add(new Fruit("Orange", 1500));
		fruits.add(new Fruit("Bpple", 1000));// 인스턴스가 다르기 때문에 나오는거

		fruits.iterator();

		Iterator<Fruit> fiter = fruits.iterator();

		while (fiter.hasNext()) {
			Fruit fruit = fiter.next();
			System.out.println(fruit.getName() + "-" + fruit.getPrice());
		}
		
		System.out.println("Hello".hashCode());
		System.out.println("Hello".hashCode());
		
		
	}// end of main
}
