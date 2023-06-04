package chap_7;

public class _Quiz_11 {
	//문제 : 인기가 많은 상품이 선착순으로 판매되는 온라인 쇼핑물에서 발생할 수 있는 문제를 처리하는 프로그램 작성 
	//조건 : 발생 가능 문제의 2가지 조건 : 상품 구매 가능 시간 , 상품 매진
	// 각 문제에 대한 사용자 정의 예외 클래스 작성 
	// 에러 코드에 따른 의도적 예외 발생 및 예외 처리
	// 모든 클래스는 하나의 파일에 정의
	
	//에러 코드에 따른 메시지 
	// 에러코드 0 : 의미 없음 , 예외 객체 생성 메시지 :  (상품 구매를 완료하였습니다.) , 예외 처리 메시지 : -
	// 에러코드 1 : 판매 시간 아님 , 예외 객체 생성 메시지 :  상품 구매 가능 시간이 아닙니다. , 예외 처리 메시지 : 상품 구매는 20시 부터 가능합니다.
	// 에러코드 2 : 매진 , 예외 객체 생성 메시지 :  해당 상품은 매진 되었습니다. , 예외 처리 메시지 : 다음 기외에 이용해주세요
	
	// 에러코드 0 : 상품 구매를 완료 하였습니다. 
	// 에러코드 1  :	상품 구매 가능 시간이 아닙니다.  , 상품 구매는 20시 부터 가능합니다.
	// 에러코드 2 : 해당 상품은 매진 되었습니다. 다음 기회에 이용해주세요. 

	public static void main(String[] args) {
		new errorCode(0);
		System.out.println("----------------------");
		new errorCode(1);
		System.out.println("----------------------");
		new errorCode(2);
		System.out.println("----------------------");
		new errorCode(3);
	}
}

class errorCode {
	public errorCode(int errorcode) {
		errorCodeReasons(errorcode);
	}
	
	public void errorCodeReasons(int error) {
		if(error == 0) {    // 0번 에러
			errorCodeZero();
		}else if (error==1) {  //1번에러
			errorCodeOne();
		}else if (error==2) {  //2번에러
			errorCodeTwo();
		}else {  //엉뚱한 에러
			errorCodeOther();
		}
	}
	public void errorCodeZero(){
		try {
			System.out.println("상품 구매를 완료 하였습니다.");
		} catch (Exception e) {
			System.out.println("에러입니다.");
		}
	}
	public void errorCodeOne(){
		try {
			System.out.println("상품 구매 가능 시간이 아닙니다.");
			throw new Exception("상품 구매는 20시부터 가능합니다");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void errorCodeTwo(){
		try {
			System.out.println("해당 상품은 매진 되었습니다.");
			throw new Exception("다음 기회를 이용해주세요.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void errorCodeOther(){
		System.out.println("없는 에러 코드 입니다.");
	}
	
}
