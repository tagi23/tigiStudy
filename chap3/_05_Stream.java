package chap_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {

	public static void main(String[] args) {
		// 스트림  = 데이터가 흐른다(필터링).    데이터 가공이 편리함    컬렉션 프레임워크 , 배열 , 파일 등 여러가지로 만들 수 있음
		
		//스트림 생성 
		//Arrays.stream() 을 활용하여 만들기
		int[] scores = {100,90,85,70,97,98,93};
		IntStream scorestream =  Arrays.stream(scores);  
		
		String[] langs = {"파이썬","자바","자바스크립트","c","c++","c#"};
		Stream<String> langsstream =  Arrays.stream(langs);  
		
		//Collection.stream()을 활용하여 만들기
		List<String> langList = new ArrayList<>();
		langList = Arrays.asList("파이썬","자바","자바스크립트","c","c++","c#");      //asList를 사용하여 리스트를 만듬
		System.out.println(langList.size());
		Stream<String> langListStream = langList.stream();
		
		//Stream.of()을 활용하여 만들기
		Stream<String>langListOfStream =  Stream.of("파이썬","자바","자바스크립트","c");     
		
		//스트림 사용 
		//중간 연산(Intermediate Operation) :  제한없이 계속 사용 가능 (filter , map , sorted , distinct , skip ,....)
		//최종 연산(Terminal Operation) : 최종적으로 나와지는 결과물 한번만 사용 가능 (count , min , max , forEach , anyMatct , allMatch)
		System.out.println("-----------------");
		//90 점 이상인 점수만 출력
		Arrays.stream(scores).filter(x -> x>=90).forEach(x -> System.out.println(x));  //람다식
		// Arrays.stream(scores).filter(x -> x>=90).forEach(System.out::println);
		System.out.println("-----------------");
		
		// 90 점 이상인 사람의 수
		int count = (int)Arrays.stream(scores).filter(x -> x>=90).count();
		System.out.println(count);
		System.out.println("-----------------");
		
		// 90 점 이상인 점수들의 합
		int Sum = Arrays.stream(scores).filter(x -> x>=90).sum();
		System.out.println(Sum);
		System.out.println("--------------------");
		
		//90점 이상인 점수들을 정렬  (오름차순)
		Arrays.stream(scores).filter(x -> x>=90).sorted().forEach(System.out::println);
		System.out.println("--------------------");
		
		
		//"파이썬","자바","자바스크립트","c"
		// c 로 시작하는 프로그래밍 어너
		Arrays.stream(langs).filter( x-> x.startsWith("c")).forEach(System.out::println);
		System.out.println("---------------------");
		
		//자바 라는 글자를 포함하는 언어
		Arrays.stream(langs).filter( x-> x.contains("자바")).forEach(System.out::println);
		System.out.println("---------------------");
		
		//4 글자 이하의 언어를 정렬해서 출력
		langList.stream().filter(x->x.length() <=4).sorted().forEach(System.out::println);
		System.out.println("---------------------");
		//4 글자 이하의 언어 중에서 자바라는 글자를 포함하는 언어
		langList.stream()
		.filter(x-> x.length() <=4)
		.filter(x->x.contains("자바"))
		.forEach(System.out::println);
		System.out.println("---------------------");
		
		// 4글자 이하의 언어 중에서 c라는 글자를 포함하는 단어가 하나라도 있는지 여부
		boolean anymatch = langList
				.stream()
				.filter(x-> x.length() <= 4)
				.anyMatch(x -> x.contains("c"));
		System.out.println(anymatch);
		System.out.println("---------------------");
		// 4글자 이하의 언어들은 c 라는 글자를 포함하는지 여부
		boolean allmatch = langList
				.stream()
				.filter(x-> x.length() <= 4)
				.allMatch(x -> x.contains("c"));
		System.out.println(allmatch);
		System.out.println("---------------------");
		
		// 1글자 이하의 언어들은 c 라는 글자를 포함하는지 여부
		allmatch = langList
				.stream()
				.filter(x-> x.length() <= 1)
				.allMatch(x -> x.contains("c"));
		System.out.println(allmatch);
		System.out.println("---------------------");
		
		//4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
		//map
		langList.stream()
		.filter(x-> x.length() <= 4)
		.filter(x -> x.contains("c"))
		.map(x->x+" (어려워요)")
		.forEach(System.out::println);
		System.out.println("---------------------");
		
		//c 라는 글자를 포함하는 언어를 대문자로 출력
		langList.stream()
		.filter(x -> x.contains("c"))
		.map(String::toUpperCase)
		.forEach(System.out::println);
		System.out.println("---------------------");
		
		// c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
		List<String> langListStringWithC = langList.stream()
				.filter(x -> x.contains("c"))
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		langListStringWithC.stream().forEach(System.out::println);
		
		
	}
}
