package chap_7;

public class _06_CustomException {

	public static void main(String[] args) {
		// 사용자 정의 예외
		int age = 17;
		try {
			if(age<19) {
				// System.out.println("19세 미만 판매 x ");
				throw new  AgeLessThan19Exception("모든 예외를 처리합니다.");
			}else {
				System.out.println("주문하신 상품입니다.");
			}
		}catch (AgeLessThan19Exception e) {
			System.out.println("조금 더 성장하세요");
		}
		
		catch (Exception e) {
			System.out.println("모든 예외를 처리합니다.");
		}
		
	}
}

class AgeLessThan19Exception extends Exception{ //Exception을 상속

	public AgeLessThan19Exception(String message) {   //생성자 호출 
		super(message);
	}    
	
}
