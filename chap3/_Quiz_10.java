package chap_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _Quiz_10 {

	public static void main(String[] args) {
		//문제 : 스트림을 이용하여 미술관 방문 손님에게 입장료를 안내하는 프로그램
		//조건 :  입장료는 1인당 5000원으로 고정 , 20세 이상 손님들에게만 입장료 부과(그 이외에는 무료),모든 클래스는 하나의 파일에 정의
//    결과		
//		챈들러	5000원
//		레이첼	5000원
//		모니카	5000원
//		벤자민	무료
//		제임스	무료
		List<Customer> custom = new ArrayList<>();
		custom.add(new Customer("챈들러",50));
		custom.add(new Customer("레이첼",42));
		custom.add(new Customer("모니카",21));
		custom.add(new Customer("벤자민",18));
		custom.add(new Customer("제임스",5));
		
		
		Stream<Customer>cu = custom.stream();
		System.out.println("미술관 입장료");
		System.out.println("---------------------------");
		//필터는 값을 제거함 (필터링)
		cu.map(x -> x.age() >= 20 ? x.name+"	"+"5000원": x.name+"	"+"무료") //map은 다양한 형태로 데이터 가공가능 (삼항 연산자를 통해 20세 미만도 데이터를 살림) 
			.forEach(System.out::println);
		
	}
}

class Customer{
	String name;
	int age;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int age() {
		return this.age;
	}
}
