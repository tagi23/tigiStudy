package chap_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class _08_iterater {

	public static void main(String[] args) {
		//이터레이터     컬렉션 프레임워크 (list , set , map)을 순회하는것
       // 데이터를 확인을 하면서 수정이나 삭제도 가능 
		List<String> list = new ArrayList<>();  // List는 인터페이스로  사용가능
		list.add("유재석");
		list.add("(알 수 없음)");
		list.add("김종국");
		list.add("(알 수 없음)");
		list.add("강호동");
		list.add("(알 수 없음)");
		list.add("박명수");
		
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("------------------------");
		// 커서를 한칸씩 이동 
		Iterator<String> it = list.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		System.out.println("------------------------");
		 it = list.iterator();  //커서를 처음 위치로 이동
		 while (it.hasNext()) {   //다음에 가져올 데이터가 있는지 있으면 true 없으면 false
			System.out.println(it.next());
		}
		 System.out.println("------------------------");
		 
		 it = list.iterator();  //커서를 처음 위치로 이동 
		 while(it.hasNext()) {
			 String s = it.next(); 
			 if(s.contains("(알 수 없음)")) {   //s 라는 데이터 속에 (알 수 없음) 이 있으면 true
				 it.remove();     //삭제
			 }			 
		 }
		 it = list.iterator();  //커서를 처음 위치로 이동
		 while (it.hasNext()) {   
			System.out.println(it.next());
		}
		 
		 System.out.println("------------------------");
		 
		 
		 
		 HashSet<String>set = new HashSet<>();
		 set.add("유재석");
		 set.add("박명수");
		 Iterator<String> itset = set.iterator();
		 
		 while (itset.hasNext()) {  
			System.out.println(itset.next());
		}
		 System.out.println("------------------------");
		 
		 HashMap<String, Integer> map = new HashMap<>();
		 map.put("유재석", 10);
		 map.put("박명수",5);
		 Iterator<String> itmap = map.keySet().iterator();  // key 값을 순회하라   
		 while (itmap.hasNext()) {  
				System.out.println(itmap.next());
			}
		 System.out.println("------------------------");
		 Iterator<Integer> itval = map.values().iterator();  // key 값을 순회하라   
		 while (itval.hasNext()) {  
				System.out.println(itval.next());
			}
		 System.out.println("------------------------");
		 
		 Iterator<Map.Entry<String, Integer>> itmapval = map.entrySet().iterator();
		 while (itmapval.hasNext()) {  
				System.out.println(itmapval.next());
			}
	}
}
