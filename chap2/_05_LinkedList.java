package chap_5;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {

	public static void main(String[] args) {
		// LinkedList
		LinkedList<String> list = new LinkedList<>();
		// 데이터 추가
		list.add("유재석");
		list.add("김종국");
		list.add("강호동");
		list.add("박명수");
		//데이터 조회
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println("-----------------------");
		//추가
		list.addFirst("서장훈"); // 제일 첫 인덱스에 추가
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-----------------------");
		list.addLast("김희철");  // 제일 마지막 인덱스에 추가 
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-----------------------");
		System.out.println("추가 전: (index1)"+list.get(1));
		list.add(1,"김영철");   // 데이터 중간에 추가하기
		System.out.println("추가 후: (index1)"+list.get(1));
		System.out.println("추가 후: (index2) "+list.get(2));
		System.out.println("-----------------------");
		// 삭제
		System.out.println("남은 학생 수 (제외 전) : "+list.size());
		list.remove(list.size() - 1); 
		System.out.println("남은 학생 수 (제외 후) : "+list.size());
		System.out.println("-----------------------");
		list.removeFirst(); //처음 
		list.removeLast();//마지막
		System.out.println("남은 학생 수 (제외 후) : "+list.size());
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-----------------------");
		//데이터 변경 
		list.set(0,"이수근");
		System.out.println(list.get(0));
		//확인
		System.out.println(list.indexOf("김종국"));  // 인덱스 번호 
		
		if (list.contains("김종국")) {
			System.out.println("남아 있음 ");
		}else {
			System.out.println("없음");
		}
		
		list.clear();  // 전체 삭제 
		if (list.isEmpty()) {
			System.out.println("데이터가 없습니다.");
		}
		
		System.out.println("-----------------------");
		list.add("유재석");
		list.add("김종국");
		list.add("강호동");
		list.add("박명수");
		Collections.sort(list);   // 정렬 
		for (String s : list) {
			System.out.println(s);   // ㄱㄴㄷ순 정렬 
		}
	}
}
