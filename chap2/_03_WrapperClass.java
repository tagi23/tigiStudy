package chap_5;

public class _03_WrapperClass {

	public static void main(String[] args) {
		// 래퍼 (Wrapper) 클래스
		// int double float char     == 기본 자료형 > 객체 형태로 만든거 
		//  int  > Integer    double > Double   .... 
		Integer i = 123;   //int 
		Double d = 1.0; // double
		Character c = 'A';   // char
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(c);
		
		System.out.println("---------------------");
		
		System.out.println(i.intValue());
		System.out.println(d.intValue());   //인트(정수)로 변환
		System.out.println(c.charValue());
		
		System.out.println("---------------------");
		String s = i.toString();  // 스트링으로 변환 
		System.out.println(s);
	}
}
