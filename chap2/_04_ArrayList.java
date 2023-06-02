package chap_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _04_ArrayList {

	public static void main(String[] args) {
		// 컬렉션 프레임워크 (List[ArrayList , LinkedList] , set , Map)
		ArrayList<String> list = new ArrayList<>();
		//데이터 추가 
		list.add("유재석");
		list.add("김종국");
		list.add("강호동");
		list.add("박명수");
		
		//데이터 조회 (인덱스)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println("----------------------------");
		//데이터 삭제
		System.out.println("학생 수 : "+list.size());
		list.remove("김종국");
		System.out.println("학생 수 : "+list.size());
		System.out.println("----------------------");
		System.out.println("남은 학생 수 (제외 전) : " + list.size());
		list.remove(list.size()-1); // 가장 마지막 인덱스 삭제
		System.out.println("남은 학생 수 (제외 후) : " + list.size());
		System.out.println("----------------------");
		
		//순회 
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("----------------------");
		//데이터 변경
		System.out.println(list.get(0));
		list.set(0,"이수근");
		System.out.println(list.get(0));
		System.out.println("----------------------");
		//인덱스 번호 
		System.out.println(list.indexOf("강호동")); 
		//포함 여부
		if (list.contains("이수근")) {
			System.out.println("수강 신청 성공");
		}else {
			System.out.println("수강 신청 실패");
		}
		System.out.println("----------------------");
		// 전체 삭제
		list.clear();
		if (list.isEmpty()) {
			System.out.println("리스트 수 : "+ list.size());
			System.out.println("리스트가 비었습니다.");
		}
		
		// 리스트에 새로운 데이터 추가
		list.add("유재석");
		list.add("김종국");
		list.add("강호동");
		list.add("박명수");
		//정렬 
		Collections.sort(list);  //ㄱㄴㄷ , 123 ,abc 순으로 정렬 
		for (String s : list) {
			System.out.println(s);
		}
		
	}
}
