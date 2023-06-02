package chap_5;

import java.util.ArrayList;

public class _01_Generics {

	public static void main(String[] args) {
		//제네릭스 : 다양한 타입의 객체를 지원하는 클래스나 인터페이스 또는 메소드를 정의하는 방법 
	 //	int -> Integer.parseInt();    //  wrapper 클래스
	 //	double -> Double.toString();    // wrapper 클래스 
     //String.valueOf();     //String는 wrapper 클래스 아님
		
		Integer[] iArray = {1,2,3,4,5};
		Double[] dArray = {1.0,2.0,3.0,4.0};
		String[] sArray = {"A","B","C"};
		
		printIntArray(iArray);
		printdoubleArray(dArray);
		printStringArray(sArray);
		System.out.println("-----------------");
		
		printAnyArray(iArray);
		printAnyArray(dArray);      //int 나 double은 wrapper 클래스를 사용해야함 
		printAnyArray(sArray);      //제네릭스는 객체를 지원하는건 객체이다  ex:String.. 등등
	}  	                                               
	
	private static <T> void printAnyArray(T[] array) {   //제네릭스 생성 <T> = 타입을 의미 (명은 아무거나 써도 상관x) 일반적으로    ex: T,K,V
		for (T t : array) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
	
	private static void printStringArray(String[] sArray) {
		for (String i : sArray) {
			System.out.print(i+" ");
		}
		System.out.println();		
	}
	private static void printdoubleArray(Double[] dArray) {
		for (double i : dArray) {
			System.out.print(i+" ");
		}
		System.out.println();		
	}			
	private static void printIntArray(Integer[] iArray) {
		for (int i : iArray) {
			System.out.print(i+" ");
		}
		System.out.println();		
	}
	
	
	
}
