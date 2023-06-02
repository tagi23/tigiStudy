package chap_5;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {

	public static void main(String[] args) {
		// set   중복을 허용 x    순서 보장 x 
		HashSet<String> set = new HashSet<>();
		//데이터 추가
		set.add("삼겹살");
		set.add("쌈장");
		set.add("음료");
		set.add("소금");
		set.add("후추");
		set.add("삼겹살");
		set.add("삼겹살");
		set.add("김");
		System.out.println("총 구매 상품 수 : " + set.size());
		
		//순회
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		
		//확인 
		if(set.contains("삼겹살")) {
			System.out.println("삼겹살 보유");
		}
		System.out.println("-------------------");
		
		//삭제 
		System.out.println("삼겹살 구매 전" + set.size());
		set.remove("삼겹살");
		System.out.println("삼겹살 구매 후" + set.size());
		System.out.println("-------------------");
		//전체 삭제
		set.clear();
		if(set.isEmpty()) {
			System.out.println("상품 수 : "  + set.size() );
			System.out.println("없습니다,");
		}
		System.out.println("-------------------");
		
		HashSet<Integer> intset = new LinkedHashSet<>();  //Linked를 붙으면 순서보장됨 
		intset.add(4);
		intset.add(19);
		intset.add(86);
		intset.add(5);
		for (int s : intset) {
			System.out.println(s);
		}
	}
}
