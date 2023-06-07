package chap_9;

public class _02_Output {

	public static void main(String[] args) {
		//System.out.format();
		// System.out.printf();
		System.out.println("----------정수---------");
		System.out.printf("%d%n",1);   // 1 
		System.out.printf("%d %d %d %n",1 ,2 ,3);  // 1 2 3
		System.out.printf("%d%n",1234);   // 1234
		System.out.printf("%12d%n",1234);// ________1234   // 12자리의 공간을 확보하고 1234 출력
		System.out.printf("%012d%n",1234);  // 000000001234  (12자리의 공간 확보 후 1234 출력하는데 빈 공간은 0으로채움)
		System.out.printf("%6d%n",-1234); // _-1234 
		System.out.printf("%+6d%n",1234); // _+1234 (기호표시)
		System.out.printf("%,15d%n",1231231231); // __1,231,231,231 (세자리마다 콤마로 구분)
		System.out.printf("%-6d%n",1234);  //1234__  (6자리 공간 확보후 왼쪽 정렬 1234)
		
		System.out.println("----------실수---------");
		System.out.printf("%f%n",Math.PI); //3.141593 
		System.out.printf("%.2f%n",Math.PI); //3.14     (자리수 지정 )
		System.out.printf("%6.2f%n",Math.PI);  // __3.14 (6자리 확보후 지정한 자리 수 만큼 출력)
		System.out.printf("%-6.2f%n",Math.PI);  // 3.14__ (6자리 확보후 지정한 자리 수 만큼 왼쪽 정렬 후 출력)
		System.out.printf("%06.2f%n",Math.PI); // 003.14 (빈공간은 0으로 채움) 
		System.out.printf("%+6.2f%n",Math.PI); // _+3.14  (항상 +- 기호 표시)
		
		System.out.println("----------문자열---------");
		System.out.printf("%s%n","Java"); //Java  (일반 출력)
		System.out.printf("%6s%n","Java"); //__Java  (6자리 공간 확보하고 우측정렬)
		System.out.printf("%-6s%n","Java"); //Java__ (6자리 공간 확보하고 좌측정렬)
		System.out.printf("%6.2s%n","Java"); // ____Ja (6자리 공간 확보하고 우측 정렬후 2글자 출력)
		System.out.printf("%-6.2s%n","Java"); // Ja____ (6자리 공간 확보하고 좌측 정렬후 2글자 출력)
		
		System.out.println("----------응용1---------");
		System.out.println("이름 영어 수학 평균");
		System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0);  // 강백호 90 80 85.0
		System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0); // 서태웅 100 100 100.0
		System.out.println("김태수 " + 95+ " " + 100+ " " + 97.5);  // 김태수 95 100 97.5
		
		System.out.println("----------응용2---------");
		System.out.println("이름      영어   수학   평균");  // 공백이 각각 6,3,3 칸으로 구분 
		System.out.printf("%-6s %4d %4d %6.1f%n","강백호",90,80,85.0 );
		System.out.printf("%-6s %4d %4d %6.1f%n","서태웅",100,100,100.0 );
		System.out.printf("%-6s %4d %4d %6.1f%n","김태수",95,100,97.5 );
		
		System.out.println("--------- 참고 ---------");
		System.out.println("ABCDRFG");
		System.out.println("가나다라마바사");
	}

}
