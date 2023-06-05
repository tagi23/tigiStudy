package chap_7;

public class _01_TryCatch {

	public static void main(String[] args) {
		// 예외 처리
		//오류 : 컴파일 오류(코드에 오류가 있어 실행 자체도 안됨) , 런타임 오류 (컴파일은 되지만 실행하는 과정에서 안됨)
		//런타임 오류 (에러 error : 수습이 불가 (ex: 메모리 부족 , StackOverFlow), 예외 exception : 수습이 가능)
		try {	
			Object obj = "test";
			System.out.println((int)obj);
		} catch (Exception e) {
			System.out.println("이런 문제가 발생했습니다 =>"+e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
		
	}
}
