package chap_7;

public class _03_Throw {

	public static void main(String[] args) {
		int age = 17;
		
		try {
			if(age<19) {
				// System.out.println("19세 미만 판매 x ");
				throw new Exception("19세 미만 판매 x");     //의도적 예외 발생
			}else {
				System.out.println("주문하신 상품입니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
